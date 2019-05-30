package com.sjc.lottery.lottery.service;

import com.sjc.lottery.lottery.entity.Lottery;

import java.util.List;
import java.util.Map;

/**
 * Description: lottery
 * Created by s on 2019/5/18 16:46
 */
public interface ILotteryService {
    Map insertDoubleBall();

    /**
     * 查询信息
     * @param lottery
     * @return
     */
    List selBallInfo(Lottery lottery);

}
