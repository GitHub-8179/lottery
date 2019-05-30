package com.sjc.lottery.lottery;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Description: lottery
 * Created by s on 2019/5/25 9:30
 */
public class RequestTest {
//    static String urlPath = "http://www.cwl.gov.cn/kjxx/ssq/kjgg/";
//    static String urlPath = "http://www.cwl.gov.cn/cwl_admin/kjxx/findDrawNotice?name=ssq&issueCount=30";
    static private String urlPath = "http://www.cwl.gov.cn/cwl_admin/kjxx/findDrawNotice?name=qlc&issueCount=30";
//      static private String urlPath = "http://www.cwl.gov.cn/cwl_admin/findDrawNotice?name=qlc&issueCount=100";


    public static void main1(String[] args) throws Exception{

        //建立连接
        URL url=new URL(urlPath);
        HttpURLConnection httpConn=(HttpURLConnection)url.openConnection();
        //设置参数
        httpConn.setDoOutput(true);   //需要输出
        httpConn.setDoInput(true);   //需要输入
        httpConn.setUseCaches(false);  //不允许缓存
        httpConn.setRequestMethod("GET");   //设置POST方式连接
        //设置请求属性"Content-Type"是数据类型 "application/octet-stream"
//    httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");//文本信息
//        httpConn.setRequestProperty("Content-Type", "application/octet-stream");//流信息 可以传输图片音频等信息
//        httpConn.setRequestProperty("Connection", "Keep-Alive");// 维持长连接
//        httpConn.setRequestProperty("Charset", "UTF-8");
//        httpConn.setRequestProperty("GET", "/cwl_admin/kjxx/findDrawNotice?name=ssq&issueCount=50 HTTP/1.1");//文本信息
//        httpConn.setRequestProperty("Host", "www.cwl.gov.cn");//文本信息
//        httpConn.setRequestProperty("Connection", "keep-alive");//文本信息
//        httpConn.setRequestProperty("Accept", "application/json, text/javascript, */*; q=0.01");//文本信息
//        httpConn.setRequestProperty("X-Requested-With", "XMLHttpRequest");//文本信息
//        httpConn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");//文本信息
//        httpConn.setRequestProperty("Referer", "http://www.cwl.gov.cn/kjxx/ssq/kjgg/");//文本信息
//        httpConn.setRequestProperty("Accept-Encoding", "gzip, deflate");//文本信息
//        httpConn.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.9");//文本信息
//        httpConn.setRequestProperty("Cookie", "Sites=_21; UniqueID=7Dr7Lel9hb8qJQep1558747834707; _ga=GA1.3.1215786926.1558070416; _gid=GA1.3.798536534.1558704466; td_cookie=1209872362; 21_vq=36");//文本信息
        //连接,也可以不用明文connect，使用下面的httpConn.getOutputStream()会自动connect
        httpConn.setRequestProperty("GET", "/cwl_admin/kjxx/findDrawNotice?name=3d&issueCount=30 HTTP/1.1");//文本信息
        httpConn.setRequestProperty("Host", "www.cwl.gov.cn");//文本信息
        httpConn.setRequestProperty("Connection", "keep-alive");//文本信息
        httpConn.setRequestProperty("Accept", "application/json, text/javascript, */*; q=0.01");//文本信息
        httpConn.setRequestProperty("X-Requested-With", "XMLHttpRequest");//文本信息
        httpConn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");//文本信息
        httpConn.setRequestProperty("Referer", "http://www.cwl.gov.cn/kjxx/fc3d/kjgg/");//文本信息
        httpConn.setRequestProperty("Accept-Encoding", "gzip, deflate");//文本信息
        httpConn.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.9");//文本信息
        httpConn.setRequestProperty("Cookie", "Sites=_21; UniqueID=7Dr7Lel9hb8qJQep1558747834707; _ga=GA1.3.1215786926.1558070416; _gid=GA1.3.798536534.1558704466; td_cookie=1209872362; 21_vq=36");//文本信息


        httpConn.connect();
        //建立输入流，向指向的URL传入参数
//    DataOutputStream dos=new DataOutputStream(httpConn.getOutputStream());
        OutputStream dos = httpConn.getOutputStream();
//    dos.write(param.getBytes());
//        FileInputStream fis = new FileInputStream("E:/upload2/2202");
//        byte[] b =new byte[fis.available()];
//        fis.read(b);
//        dos.write(b);
//        dos.flush();
//        dos.close();
        //获得响应状态
        int resultCode=httpConn.getResponseCode();
        if(HttpURLConnection.HTTP_OK==resultCode){
            StringBuffer sb=new StringBuffer();
            String readLine=new String();
            BufferedReader responseReader=new BufferedReader(new InputStreamReader(httpConn.getInputStream(),"UTF-8"));
            while((readLine=responseReader.readLine())!=null){
                sb.append(readLine).append("\n");
            }
            responseReader.close();
            System.out.println(sb.toString());
        }
    }
}
