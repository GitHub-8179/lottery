package com.sjc.lottery.lottery.dao;

import com.sjc.lottery.lottery.entity.LotteryDetail;
import com.sjc.lottery.lottery.entity.LotteryDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LotteryDetailMapper {
    int insert(LotteryDetail record);

    int insertSelective(LotteryDetail record);

    List<LotteryDetail> selectByExample(LotteryDetailExample example);

    int updateByExampleSelective(@Param("record") LotteryDetail record, @Param("example") LotteryDetailExample example);

    int updateByExample(@Param("record") LotteryDetail record, @Param("example") LotteryDetailExample example);
}
