package com.sjc.lottery.lottery.entity;

import java.io.Serializable;

public class LotteryDetail implements Serializable {
    private Integer lotteryDetailId;

    private Integer lotteryId;

    private String gradeType;

    private Integer gradeNumber;

    private Integer gradeMoney;

    public Integer getLotteryDetailId() {
        return lotteryDetailId;
    }

    public void setLotteryDetailId(Integer lotteryDetailId) {
        this.lotteryDetailId = lotteryDetailId;
    }

    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public String getGradeType() {
        return gradeType;
    }

    public void setGradeType(String gradeType) {
        this.gradeType = gradeType;
    }

    public Integer getGradeNumber() {
        return gradeNumber;
    }

    public void setGradeNumber(Integer gradeNumber) {
        this.gradeNumber = gradeNumber;
    }

    public Integer getGradeMoney() {
        return gradeMoney;
    }

    public void setGradeMoney(Integer gradeMoney) {
        this.gradeMoney = gradeMoney;
    }
}
