package com.sjc.lottery.lottery;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sjc.lottery.common.Msg;
import com.sjc.lottery.common.syslog.SysLog;
import com.sjc.lottery.lottery.entity.Lottery;
import com.sjc.lottery.lottery.service.ILotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: lottery
 * Created by s on 2019/5/18 16:35
 */
@RestController
@RequestMapping("/doubleBall")
@CrossOrigin
public class LotteryController {

    @Autowired
    private ILotteryService lotteryService;


    @SysLog("查询彩票信息")
    @GetMapping("/selBallInfo")
    public ResponseEntity selBallInfo(Lottery lottery, HttpServletRequest request, HttpServletResponse response,@RequestParam(value = "page", defaultValue = "1") Integer page,@RequestParam(value = "rows", defaultValue = "10") Integer rows) {
        PageHelper.startPage(page, rows);
        List<Lottery> lotteryList=lotteryService.selBallInfo(lottery);
        PageInfo pageInfo = new PageInfo(lotteryList);
        Msg msg = Msg.success();
        msg.add("result",pageInfo);
        return new ResponseEntity(msg, HttpStatus.OK);
    }


    @GetMapping("/insertDoubleBall")
    public ResponseEntity insertDoubleBall(HttpServletRequest request, HttpServletResponse response) {
        lotteryService.insertDoubleBall();
        return new ResponseEntity("yes", HttpStatus.OK);
    }
}
