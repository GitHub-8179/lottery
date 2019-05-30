package com.sjc.lottery.lottery.dao;

import com.sjc.lottery.lottery.entity.Lottery;
import com.sjc.lottery.lottery.entity.LotteryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LotteryMapper {
    int insert(Lottery record);

    int insertSelective(Lottery record);

    List<Lottery> selectByExample(LotteryExample example);
    List<Lottery> selBallInfo(Lottery lottery);

    int updateLottery(@Param("record") Lottery record);

    int updateByExampleSelective(@Param("record") Lottery record, @Param("example") LotteryExample example);

    int updateByExample(@Param("record") Lottery record, @Param("example") LotteryExample example);
}
