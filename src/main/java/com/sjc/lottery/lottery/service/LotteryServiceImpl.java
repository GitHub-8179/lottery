package com.sjc.lottery.lottery.service;

import com.sjc.lottery.lottery.dao.LotteryDetailMapper;
import com.sjc.lottery.lottery.dao.LotteryMapper;
import com.sjc.lottery.lottery.entity.Lottery;
import com.sjc.lottery.task.DoubleBallTask;
import com.sjc.lottery.task.QLCTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Description: lottery
 * Created by s on 2019/5/18 16:47
 */
@Service
public class LotteryServiceImpl implements ILotteryService {

    @Resource
//    @Autowired
    private LotteryDetailMapper lotteryDetailMapper;
    @Resource
//    @Autowired
   private LotteryMapper lotteryMapper;
    @Autowired
    private DoubleBallTask doubleBallTask;
    @Autowired
    private com.sjc.lottery.task.FC3DTask fC3DTask;
    @Autowired
    private QLCTask qLCTask;

    @Override
    public Map insertDoubleBall() {
        try {
            fC3DTask.insertDoubleBall();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            qLCTask.insertDoubleBall();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
             doubleBallTask.insertDoubleBall();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List selBallInfo(Lottery lottery) {
        return lotteryMapper.selBallInfo(lottery);
    }
}
