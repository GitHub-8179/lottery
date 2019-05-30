package com.sjc.lottery.task;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sjc.lottery.lottery.dao.LotteryDetailMapper;
import com.sjc.lottery.lottery.dao.LotteryMapper;
import com.sjc.lottery.lottery.entity.Lottery;
import com.sjc.lottery.lottery.entity.LotteryDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Description: lottery
 * Created by s on 2019/5/24 17:26
 * 双色球
 * 每周二、四、日 21:15开奖
 */
@Service
@Configuration//配置类
@EnableScheduling//支持定时任务类
public class DoubleBallTask {

    @Resource
//    @Autowired
    private LotteryDetailMapper lotteryDetailMapper;
    @Resource
//    @Autowired
    private LotteryMapper lotteryMapper;

    private String num = "1";
    private String ssqUrlPath = "http://www.cwl.gov.cn/cwl_admin/kjxx/findDrawNotice?name=ssq&issueCount="+num;


    @Scheduled(cron = "0 59 21 * * 2,4,7")
    public Map insertDoubleBall() {
        String json =   requestDoubleBall(ssqUrlPath);
        if(json.length()>0) {

            JSONObject jsonobj = JSON.parseObject(json);
            JSONArray resultJson = jsonobj.getJSONArray("result");

            Lottery lottery = null;
            String lotteryPeriod = null;
            String lotteryType = null;
            String periodDate = null;
            String[] redBall = null;
            String blueBall = null;
            Integer nowPeriodMoney = null;
            Integer nextPeriodMoney = null;
            String content = null;
            Integer lotteryId = 0;

            LotteryDetail lotteryDetail =null;
            String gradeType = null;
            Integer gradeNumber = null;
            Integer gradeMoney = null;
            int redBallNum = 0;

            for (int i = 0, num = resultJson.size(); i < num; i++) {
                lottery = new Lottery();
                JSONObject result = resultJson.getJSONObject(i);
                lotteryPeriod = result.getString("code");
                lotteryType = "1";
                periodDate = result.getString("date");
                redBall = result.getString("red").split(",");
                redBallNum= redBall.length;
                blueBall = result.getString("blue");
                nowPeriodMoney = result.getInteger("sales");
                nextPeriodMoney = result.getInteger("poolmoney");
                content = result.getString("content");

                lottery.setLotteryPeriod(lotteryPeriod);
                lottery.setLotteryType(lotteryType);
                lottery.setPeriodDate(periodDate.substring(0,10));
                lottery.setRedBall1(redBall[0]);
                lottery.setRedBall2(redBall[1]);
                lottery.setRedBall3(redBall[2]);
                lottery.setRedBall4(redBall[3]);
                lottery.setRedBall5(redBall[4]);
                lottery.setRedBall6(redBall[5]);
                lottery.setBlueBall(blueBall);
                lottery.setNextPeriodMoney(nextPeriodMoney);
                lottery.setNowPeriodMoney(nowPeriodMoney);
                lottery.setContent(content);

                lotteryMapper.insert(lottery);
                lotteryId = lottery.getLotteryId();

                JSONArray prizegradesJSONArray = result.getJSONArray("prizegrades");
                for (int k = 0, numk = prizegradesJSONArray.size(); k < numk; k++) {
                    JSONObject prizegrades = prizegradesJSONArray.getJSONObject(k);
                    gradeType = prizegrades.getString("type");
                    gradeNumber = prizegrades.getInteger("typenum");
                    gradeMoney = prizegrades.getInteger("typemoney");

                    if(gradeMoney==null){
                        continue;
                    }
                    lotteryDetail = new LotteryDetail();

                    lotteryDetail.setLotteryId(lotteryId);
                    lotteryDetail.setGradeType(gradeType);
                    lotteryDetail.setGradeNumber(gradeNumber);
                    lotteryDetail.setGradeMoney(gradeMoney);

                    lotteryDetailMapper.insert(lotteryDetail);
                }
            }
        }
        return null;
    }

    public String requestDoubleBall(String urlPath) {
        BufferedReader responseReader = null;
        InputStreamReader inputStreamReader = null;
        StringBuffer sb = new StringBuffer();
        try {
            //建立连接
            URL url = new URL(urlPath);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            //设置参数
            httpConn.setDoOutput(true);   //需要输出
            httpConn.setDoInput(true);   //需要输入
            httpConn.setUseCaches(false);  //不允许缓存
            httpConn.setRequestMethod("GET");   //设置POST方式连接
            httpConn.setRequestProperty("GET", "/cwl_admin/kjxx/findDrawNotice?name=ssq&issueCount="+num+" HTTP/1.1");//文本信息
            httpConn.setRequestProperty("Host", "www.cwl.gov.cn");//文本信息
            httpConn.setRequestProperty("Connection", "keep-alive");//文本信息
            httpConn.setRequestProperty("Accept", "application/json, text/javascript, */*; q=0.01");//文本信息
            httpConn.setRequestProperty("X-Requested-With", "XMLHttpRequest");//文本信息
            httpConn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");//文本信息
            httpConn.setRequestProperty("Referer", "http://www.cwl.gov.cn/kjxx/ssq/kjgg/");//文本信息
            httpConn.setRequestProperty("Accept-Encoding", "gzip, deflate");//文本信息
            httpConn.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.9");//文本信息
            httpConn.setRequestProperty("Cookie", "Sites=_21; UniqueID=7Dr7Lel9hb8qJQep1558747834707; _ga=GA1.3.1215786926.1558070416; _gid=GA1.3.798536534.1558704466; td_cookie=1209872362; 21_vq=36");//文本信息
            //连接,也可以不用明文connect，使用下面的httpConn.getOutputStream()会自动connect
            httpConn.connect();
            //建立输入流，向指向的URL传入参数
            //获得响应状态
            int resultCode = httpConn.getResponseCode();
            if (HttpURLConnection.HTTP_OK == resultCode) {
                String readLine = new String();
                inputStreamReader = new InputStreamReader(httpConn.getInputStream(), "UTF-8");
                responseReader = new BufferedReader(inputStreamReader);
                while ((readLine = responseReader.readLine()) != null) {
                    sb.append(readLine).append("\n");
                }

//                System.out.println(sb.toString());
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return sb.toString();
        }finally {
            try {
                if(inputStreamReader!=null){
                    inputStreamReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(responseReader!=null){responseReader.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
