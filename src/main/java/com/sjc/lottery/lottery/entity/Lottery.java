package com.sjc.lottery.lottery.entity;

import java.io.Serializable;

public class Lottery implements Serializable {
    private Integer lotteryId;

    private String lotteryPeriod;

    private String lotteryType;

    private String week;

    private String periodDate;

    private String redBall1;

    private String redBall2;

    private String redBall3;

    private String redBall4;

    private String redBall5;

    private String redBall6;

    private String redBall7;

    private String blueBall;

    private Integer nowPeriodMoney;

    private Integer nextPeriodMoney;

    private String content;

    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public String getLotteryPeriod() {
        return lotteryPeriod;
    }

    public void setLotteryPeriod(String lotteryPeriod) {
        this.lotteryPeriod = lotteryPeriod == null ? null : lotteryPeriod.trim();
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getLotteryType() {
        return lotteryType;
    }

    public void setLotteryType(String lotteryType) {
        this.lotteryType = lotteryType;
    }

    public String getPeriodDate() {
        return periodDate;
    }

    public void setPeriodDate(String periodDate) {
        this.periodDate = periodDate == null ? null : periodDate.trim();
    }

    public String getRedBall1() {
        return redBall1;
    }

    public void setRedBall1(String redBall1) {
        this.redBall1 = redBall1 == null ? null : redBall1.trim();
    }

    public String getRedBall2() {
        return redBall2;
    }

    public void setRedBall2(String redBall2) {
        this.redBall2 = redBall2 == null ? null : redBall2.trim();
    }

    public String getRedBall3() {
        return redBall3;
    }

    public void setRedBall3(String redBall3) {
        this.redBall3 = redBall3 == null ? null : redBall3.trim();
    }

    public String getRedBall4() {
        return redBall4;
    }

    public void setRedBall4(String redBall4) {
        this.redBall4 = redBall4 == null ? null : redBall4.trim();
    }

    public String getRedBall5() {
        return redBall5;
    }

    public void setRedBall5(String redBall5) {
        this.redBall5 = redBall5 == null ? null : redBall5.trim();
    }

    public String getRedBall6() {
        return redBall6;
    }

    public void setRedBall6(String redBall6) {
        this.redBall6 = redBall6 == null ? null : redBall6.trim();
    }

    public String getRedBall7() {
        return redBall7;
    }

    public void setRedBall7(String redBall7) {
        this.redBall7 = redBall7 == null ? null : redBall7.trim();
    }

    public String getBlueBall() {
        return blueBall;
    }

    public void setBlueBall(String blueBall) {
        this.blueBall = blueBall == null ? null : blueBall.trim();
    }

    public Integer getNowPeriodMoney() {
        return nowPeriodMoney;
    }

    public void setNowPeriodMoney(Integer nowPeriodMoney) {
        this.nowPeriodMoney = nowPeriodMoney;
    }

    public Integer getNextPeriodMoney() {
        return nextPeriodMoney;
    }

    public void setNextPeriodMoney(Integer nextPeriodMoney) {
        this.nextPeriodMoney = nextPeriodMoney;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
