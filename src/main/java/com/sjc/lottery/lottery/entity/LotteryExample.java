package com.sjc.lottery.lottery.entity;

import java.util.ArrayList;
import java.util.List;

public class LotteryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andLotteryIdIsNull() {
            addCriterion("LOTTERY_ID is null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIsNotNull() {
            addCriterion("LOTTERY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdEqualTo(Integer value) {
            addCriterion("LOTTERY_ID =", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotEqualTo(Integer value) {
            addCriterion("LOTTERY_ID <>", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThan(Integer value) {
            addCriterion("LOTTERY_ID >", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOTTERY_ID >=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThan(Integer value) {
            addCriterion("LOTTERY_ID <", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThanOrEqualTo(Integer value) {
            addCriterion("LOTTERY_ID <=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIn(List<Integer> values) {
            addCriterion("LOTTERY_ID in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotIn(List<Integer> values) {
            addCriterion("LOTTERY_ID not in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdBetween(Integer value1, Integer value2) {
            addCriterion("LOTTERY_ID between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LOTTERY_ID not between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodIsNull() {
            addCriterion("LOTTERY_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodIsNotNull() {
            addCriterion("LOTTERY_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodEqualTo(String value) {
            addCriterion("LOTTERY_PERIOD =", value, "lotteryPeriod");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodNotEqualTo(String value) {
            addCriterion("LOTTERY_PERIOD <>", value, "lotteryPeriod");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodGreaterThan(String value) {
            addCriterion("LOTTERY_PERIOD >", value, "lotteryPeriod");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTERY_PERIOD >=", value, "lotteryPeriod");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodLessThan(String value) {
            addCriterion("LOTTERY_PERIOD <", value, "lotteryPeriod");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodLessThanOrEqualTo(String value) {
            addCriterion("LOTTERY_PERIOD <=", value, "lotteryPeriod");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodLike(String value) {
            addCriterion("LOTTERY_PERIOD like", value, "lotteryPeriod");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodNotLike(String value) {
            addCriterion("LOTTERY_PERIOD not like", value, "lotteryPeriod");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodIn(List<String> values) {
            addCriterion("LOTTERY_PERIOD in", values, "lotteryPeriod");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodNotIn(List<String> values) {
            addCriterion("LOTTERY_PERIOD not in", values, "lotteryPeriod");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodBetween(String value1, String value2) {
            addCriterion("LOTTERY_PERIOD between", value1, value2, "lotteryPeriod");
            return (Criteria) this;
        }

        public Criteria andLotteryPeriodNotBetween(String value1, String value2) {
            addCriterion("LOTTERY_PERIOD not between", value1, value2, "lotteryPeriod");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIsNull() {
            addCriterion("LOTTERY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIsNotNull() {
            addCriterion("LOTTERY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeEqualTo(String value) {
            addCriterion("LOTTERY_TYPE =", value, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNotEqualTo(String value) {
            addCriterion("LOTTERY_TYPE <>", value, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeGreaterThan(String value) {
            addCriterion("LOTTERY_TYPE >", value, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTERY_TYPE >=", value, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeLessThan(String value) {
            addCriterion("LOTTERY_TYPE <", value, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeLessThanOrEqualTo(String value) {
            addCriterion("LOTTERY_TYPE <=", value, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIn(List<String> values) {
            addCriterion("LOTTERY_TYPE in", values, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNotIn(List<String> values) {
            addCriterion("LOTTERY_TYPE not in", values, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeBetween(String value1, String value2) {
            addCriterion("LOTTERY_TYPE between", value1, value2, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNotBetween(String value1, String value2) {
            addCriterion("LOTTERY_TYPE not between", value1, value2, "lotteryType");
            return (Criteria) this;
        }

        public Criteria andPeriodDateIsNull() {
            addCriterion("PERIOD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPeriodDateIsNotNull() {
            addCriterion("PERIOD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodDateEqualTo(String value) {
            addCriterion("PERIOD_DATE =", value, "periodDate");
            return (Criteria) this;
        }

        public Criteria andPeriodDateNotEqualTo(String value) {
            addCriterion("PERIOD_DATE <>", value, "periodDate");
            return (Criteria) this;
        }

        public Criteria andPeriodDateGreaterThan(String value) {
            addCriterion("PERIOD_DATE >", value, "periodDate");
            return (Criteria) this;
        }

        public Criteria andPeriodDateGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_DATE >=", value, "periodDate");
            return (Criteria) this;
        }

        public Criteria andPeriodDateLessThan(String value) {
            addCriterion("PERIOD_DATE <", value, "periodDate");
            return (Criteria) this;
        }

        public Criteria andPeriodDateLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_DATE <=", value, "periodDate");
            return (Criteria) this;
        }

        public Criteria andPeriodDateLike(String value) {
            addCriterion("PERIOD_DATE like", value, "periodDate");
            return (Criteria) this;
        }

        public Criteria andPeriodDateNotLike(String value) {
            addCriterion("PERIOD_DATE not like", value, "periodDate");
            return (Criteria) this;
        }

        public Criteria andPeriodDateIn(List<String> values) {
            addCriterion("PERIOD_DATE in", values, "periodDate");
            return (Criteria) this;
        }

        public Criteria andPeriodDateNotIn(List<String> values) {
            addCriterion("PERIOD_DATE not in", values, "periodDate");
            return (Criteria) this;
        }

        public Criteria andPeriodDateBetween(String value1, String value2) {
            addCriterion("PERIOD_DATE between", value1, value2, "periodDate");
            return (Criteria) this;
        }

        public Criteria andPeriodDateNotBetween(String value1, String value2) {
            addCriterion("PERIOD_DATE not between", value1, value2, "periodDate");
            return (Criteria) this;
        }

        public Criteria andRedBall1IsNull() {
            addCriterion("RED_BALL1 is null");
            return (Criteria) this;
        }

        public Criteria andRedBall1IsNotNull() {
            addCriterion("RED_BALL1 is not null");
            return (Criteria) this;
        }

        public Criteria andRedBall1EqualTo(String value) {
            addCriterion("RED_BALL1 =", value, "redBall1");
            return (Criteria) this;
        }

        public Criteria andRedBall1NotEqualTo(String value) {
            addCriterion("RED_BALL1 <>", value, "redBall1");
            return (Criteria) this;
        }

        public Criteria andRedBall1GreaterThan(String value) {
            addCriterion("RED_BALL1 >", value, "redBall1");
            return (Criteria) this;
        }

        public Criteria andRedBall1GreaterThanOrEqualTo(String value) {
            addCriterion("RED_BALL1 >=", value, "redBall1");
            return (Criteria) this;
        }

        public Criteria andRedBall1LessThan(String value) {
            addCriterion("RED_BALL1 <", value, "redBall1");
            return (Criteria) this;
        }

        public Criteria andRedBall1LessThanOrEqualTo(String value) {
            addCriterion("RED_BALL1 <=", value, "redBall1");
            return (Criteria) this;
        }

        public Criteria andRedBall1Like(String value) {
            addCriterion("RED_BALL1 like", value, "redBall1");
            return (Criteria) this;
        }

        public Criteria andRedBall1NotLike(String value) {
            addCriterion("RED_BALL1 not like", value, "redBall1");
            return (Criteria) this;
        }

        public Criteria andRedBall1In(List<String> values) {
            addCriterion("RED_BALL1 in", values, "redBall1");
            return (Criteria) this;
        }

        public Criteria andRedBall1NotIn(List<String> values) {
            addCriterion("RED_BALL1 not in", values, "redBall1");
            return (Criteria) this;
        }

        public Criteria andRedBall1Between(String value1, String value2) {
            addCriterion("RED_BALL1 between", value1, value2, "redBall1");
            return (Criteria) this;
        }

        public Criteria andRedBall1NotBetween(String value1, String value2) {
            addCriterion("RED_BALL1 not between", value1, value2, "redBall1");
            return (Criteria) this;
        }

        public Criteria andRedBall2IsNull() {
            addCriterion("RED_BALL2 is null");
            return (Criteria) this;
        }

        public Criteria andRedBall2IsNotNull() {
            addCriterion("RED_BALL2 is not null");
            return (Criteria) this;
        }

        public Criteria andRedBall2EqualTo(String value) {
            addCriterion("RED_BALL2 =", value, "redBall2");
            return (Criteria) this;
        }

        public Criteria andRedBall2NotEqualTo(String value) {
            addCriterion("RED_BALL2 <>", value, "redBall2");
            return (Criteria) this;
        }

        public Criteria andRedBall2GreaterThan(String value) {
            addCriterion("RED_BALL2 >", value, "redBall2");
            return (Criteria) this;
        }

        public Criteria andRedBall2GreaterThanOrEqualTo(String value) {
            addCriterion("RED_BALL2 >=", value, "redBall2");
            return (Criteria) this;
        }

        public Criteria andRedBall2LessThan(String value) {
            addCriterion("RED_BALL2 <", value, "redBall2");
            return (Criteria) this;
        }

        public Criteria andRedBall2LessThanOrEqualTo(String value) {
            addCriterion("RED_BALL2 <=", value, "redBall2");
            return (Criteria) this;
        }

        public Criteria andRedBall2Like(String value) {
            addCriterion("RED_BALL2 like", value, "redBall2");
            return (Criteria) this;
        }

        public Criteria andRedBall2NotLike(String value) {
            addCriterion("RED_BALL2 not like", value, "redBall2");
            return (Criteria) this;
        }

        public Criteria andRedBall2In(List<String> values) {
            addCriterion("RED_BALL2 in", values, "redBall2");
            return (Criteria) this;
        }

        public Criteria andRedBall2NotIn(List<String> values) {
            addCriterion("RED_BALL2 not in", values, "redBall2");
            return (Criteria) this;
        }

        public Criteria andRedBall2Between(String value1, String value2) {
            addCriterion("RED_BALL2 between", value1, value2, "redBall2");
            return (Criteria) this;
        }

        public Criteria andRedBall2NotBetween(String value1, String value2) {
            addCriterion("RED_BALL2 not between", value1, value2, "redBall2");
            return (Criteria) this;
        }

        public Criteria andRedBall3IsNull() {
            addCriterion("RED_BALL3 is null");
            return (Criteria) this;
        }

        public Criteria andRedBall3IsNotNull() {
            addCriterion("RED_BALL3 is not null");
            return (Criteria) this;
        }

        public Criteria andRedBall3EqualTo(String value) {
            addCriterion("RED_BALL3 =", value, "redBall3");
            return (Criteria) this;
        }

        public Criteria andRedBall3NotEqualTo(String value) {
            addCriterion("RED_BALL3 <>", value, "redBall3");
            return (Criteria) this;
        }

        public Criteria andRedBall3GreaterThan(String value) {
            addCriterion("RED_BALL3 >", value, "redBall3");
            return (Criteria) this;
        }

        public Criteria andRedBall3GreaterThanOrEqualTo(String value) {
            addCriterion("RED_BALL3 >=", value, "redBall3");
            return (Criteria) this;
        }

        public Criteria andRedBall3LessThan(String value) {
            addCriterion("RED_BALL3 <", value, "redBall3");
            return (Criteria) this;
        }

        public Criteria andRedBall3LessThanOrEqualTo(String value) {
            addCriterion("RED_BALL3 <=", value, "redBall3");
            return (Criteria) this;
        }

        public Criteria andRedBall3Like(String value) {
            addCriterion("RED_BALL3 like", value, "redBall3");
            return (Criteria) this;
        }

        public Criteria andRedBall3NotLike(String value) {
            addCriterion("RED_BALL3 not like", value, "redBall3");
            return (Criteria) this;
        }

        public Criteria andRedBall3In(List<String> values) {
            addCriterion("RED_BALL3 in", values, "redBall3");
            return (Criteria) this;
        }

        public Criteria andRedBall3NotIn(List<String> values) {
            addCriterion("RED_BALL3 not in", values, "redBall3");
            return (Criteria) this;
        }

        public Criteria andRedBall3Between(String value1, String value2) {
            addCriterion("RED_BALL3 between", value1, value2, "redBall3");
            return (Criteria) this;
        }

        public Criteria andRedBall3NotBetween(String value1, String value2) {
            addCriterion("RED_BALL3 not between", value1, value2, "redBall3");
            return (Criteria) this;
        }

        public Criteria andRedBall4IsNull() {
            addCriterion("RED_BALL4 is null");
            return (Criteria) this;
        }

        public Criteria andRedBall4IsNotNull() {
            addCriterion("RED_BALL4 is not null");
            return (Criteria) this;
        }

        public Criteria andRedBall4EqualTo(String value) {
            addCriterion("RED_BALL4 =", value, "redBall4");
            return (Criteria) this;
        }

        public Criteria andRedBall4NotEqualTo(String value) {
            addCriterion("RED_BALL4 <>", value, "redBall4");
            return (Criteria) this;
        }

        public Criteria andRedBall4GreaterThan(String value) {
            addCriterion("RED_BALL4 >", value, "redBall4");
            return (Criteria) this;
        }

        public Criteria andRedBall4GreaterThanOrEqualTo(String value) {
            addCriterion("RED_BALL4 >=", value, "redBall4");
            return (Criteria) this;
        }

        public Criteria andRedBall4LessThan(String value) {
            addCriterion("RED_BALL4 <", value, "redBall4");
            return (Criteria) this;
        }

        public Criteria andRedBall4LessThanOrEqualTo(String value) {
            addCriterion("RED_BALL4 <=", value, "redBall4");
            return (Criteria) this;
        }

        public Criteria andRedBall4Like(String value) {
            addCriterion("RED_BALL4 like", value, "redBall4");
            return (Criteria) this;
        }

        public Criteria andRedBall4NotLike(String value) {
            addCriterion("RED_BALL4 not like", value, "redBall4");
            return (Criteria) this;
        }

        public Criteria andRedBall4In(List<String> values) {
            addCriterion("RED_BALL4 in", values, "redBall4");
            return (Criteria) this;
        }

        public Criteria andRedBall4NotIn(List<String> values) {
            addCriterion("RED_BALL4 not in", values, "redBall4");
            return (Criteria) this;
        }

        public Criteria andRedBall4Between(String value1, String value2) {
            addCriterion("RED_BALL4 between", value1, value2, "redBall4");
            return (Criteria) this;
        }

        public Criteria andRedBall4NotBetween(String value1, String value2) {
            addCriterion("RED_BALL4 not between", value1, value2, "redBall4");
            return (Criteria) this;
        }

        public Criteria andRedBall5IsNull() {
            addCriterion("RED_BALL5 is null");
            return (Criteria) this;
        }

        public Criteria andRedBall5IsNotNull() {
            addCriterion("RED_BALL5 is not null");
            return (Criteria) this;
        }

        public Criteria andRedBall5EqualTo(String value) {
            addCriterion("RED_BALL5 =", value, "redBall5");
            return (Criteria) this;
        }

        public Criteria andRedBall5NotEqualTo(String value) {
            addCriterion("RED_BALL5 <>", value, "redBall5");
            return (Criteria) this;
        }

        public Criteria andRedBall5GreaterThan(String value) {
            addCriterion("RED_BALL5 >", value, "redBall5");
            return (Criteria) this;
        }

        public Criteria andRedBall5GreaterThanOrEqualTo(String value) {
            addCriterion("RED_BALL5 >=", value, "redBall5");
            return (Criteria) this;
        }

        public Criteria andRedBall5LessThan(String value) {
            addCriterion("RED_BALL5 <", value, "redBall5");
            return (Criteria) this;
        }

        public Criteria andRedBall5LessThanOrEqualTo(String value) {
            addCriterion("RED_BALL5 <=", value, "redBall5");
            return (Criteria) this;
        }

        public Criteria andRedBall5Like(String value) {
            addCriterion("RED_BALL5 like", value, "redBall5");
            return (Criteria) this;
        }

        public Criteria andRedBall5NotLike(String value) {
            addCriterion("RED_BALL5 not like", value, "redBall5");
            return (Criteria) this;
        }

        public Criteria andRedBall5In(List<String> values) {
            addCriterion("RED_BALL5 in", values, "redBall5");
            return (Criteria) this;
        }

        public Criteria andRedBall5NotIn(List<String> values) {
            addCriterion("RED_BALL5 not in", values, "redBall5");
            return (Criteria) this;
        }

        public Criteria andRedBall5Between(String value1, String value2) {
            addCriterion("RED_BALL5 between", value1, value2, "redBall5");
            return (Criteria) this;
        }

        public Criteria andRedBall5NotBetween(String value1, String value2) {
            addCriterion("RED_BALL5 not between", value1, value2, "redBall5");
            return (Criteria) this;
        }

        public Criteria andRedBall6IsNull() {
            addCriterion("RED_BALL6 is null");
            return (Criteria) this;
        }

        public Criteria andRedBall6IsNotNull() {
            addCriterion("RED_BALL6 is not null");
            return (Criteria) this;
        }

        public Criteria andRedBall6EqualTo(String value) {
            addCriterion("RED_BALL6 =", value, "redBall6");
            return (Criteria) this;
        }

        public Criteria andRedBall6NotEqualTo(String value) {
            addCriterion("RED_BALL6 <>", value, "redBall6");
            return (Criteria) this;
        }

        public Criteria andRedBall6GreaterThan(String value) {
            addCriterion("RED_BALL6 >", value, "redBall6");
            return (Criteria) this;
        }

        public Criteria andRedBall6GreaterThanOrEqualTo(String value) {
            addCriterion("RED_BALL6 >=", value, "redBall6");
            return (Criteria) this;
        }

        public Criteria andRedBall6LessThan(String value) {
            addCriterion("RED_BALL6 <", value, "redBall6");
            return (Criteria) this;
        }

        public Criteria andRedBall6LessThanOrEqualTo(String value) {
            addCriterion("RED_BALL6 <=", value, "redBall6");
            return (Criteria) this;
        }

        public Criteria andRedBall6Like(String value) {
            addCriterion("RED_BALL6 like", value, "redBall6");
            return (Criteria) this;
        }

        public Criteria andRedBall6NotLike(String value) {
            addCriterion("RED_BALL6 not like", value, "redBall6");
            return (Criteria) this;
        }

        public Criteria andRedBall6In(List<String> values) {
            addCriterion("RED_BALL6 in", values, "redBall6");
            return (Criteria) this;
        }

        public Criteria andRedBall6NotIn(List<String> values) {
            addCriterion("RED_BALL6 not in", values, "redBall6");
            return (Criteria) this;
        }

        public Criteria andRedBall6Between(String value1, String value2) {
            addCriterion("RED_BALL6 between", value1, value2, "redBall6");
            return (Criteria) this;
        }

        public Criteria andRedBall6NotBetween(String value1, String value2) {
            addCriterion("RED_BALL6 not between", value1, value2, "redBall6");
            return (Criteria) this;
        }

        public Criteria andRedBall7IsNull() {
            addCriterion("RED_BALL7 is null");
            return (Criteria) this;
        }

        public Criteria andRedBall7IsNotNull() {
            addCriterion("RED_BALL7 is not null");
            return (Criteria) this;
        }

        public Criteria andRedBall7EqualTo(String value) {
            addCriterion("RED_BALL7 =", value, "redBall7");
            return (Criteria) this;
        }

        public Criteria andRedBall7NotEqualTo(String value) {
            addCriterion("RED_BALL7 <>", value, "redBall7");
            return (Criteria) this;
        }

        public Criteria andRedBall7GreaterThan(String value) {
            addCriterion("RED_BALL7 >", value, "redBall7");
            return (Criteria) this;
        }

        public Criteria andRedBall7GreaterThanOrEqualTo(String value) {
            addCriterion("RED_BALL7 >=", value, "redBall7");
            return (Criteria) this;
        }

        public Criteria andRedBall7LessThan(String value) {
            addCriterion("RED_BALL7 <", value, "redBall7");
            return (Criteria) this;
        }

        public Criteria andRedBall7LessThanOrEqualTo(String value) {
            addCriterion("RED_BALL7 <=", value, "redBall7");
            return (Criteria) this;
        }

        public Criteria andRedBall7Like(String value) {
            addCriterion("RED_BALL7 like", value, "redBall7");
            return (Criteria) this;
        }

        public Criteria andRedBall7NotLike(String value) {
            addCriterion("RED_BALL7 not like", value, "redBall7");
            return (Criteria) this;
        }

        public Criteria andRedBall7In(List<String> values) {
            addCriterion("RED_BALL7 in", values, "redBall7");
            return (Criteria) this;
        }

        public Criteria andRedBall7NotIn(List<String> values) {
            addCriterion("RED_BALL7 not in", values, "redBall7");
            return (Criteria) this;
        }

        public Criteria andRedBall7Between(String value1, String value2) {
            addCriterion("RED_BALL7 between", value1, value2, "redBall7");
            return (Criteria) this;
        }

        public Criteria andRedBall7NotBetween(String value1, String value2) {
            addCriterion("RED_BALL7 not between", value1, value2, "redBall7");
            return (Criteria) this;
        }

        public Criteria andBlueBallIsNull() {
            addCriterion("BLUE_BALL is null");
            return (Criteria) this;
        }

        public Criteria andBlueBallIsNotNull() {
            addCriterion("BLUE_BALL is not null");
            return (Criteria) this;
        }

        public Criteria andBlueBallEqualTo(String value) {
            addCriterion("BLUE_BALL =", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallNotEqualTo(String value) {
            addCriterion("BLUE_BALL <>", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallGreaterThan(String value) {
            addCriterion("BLUE_BALL >", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallGreaterThanOrEqualTo(String value) {
            addCriterion("BLUE_BALL >=", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallLessThan(String value) {
            addCriterion("BLUE_BALL <", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallLessThanOrEqualTo(String value) {
            addCriterion("BLUE_BALL <=", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallLike(String value) {
            addCriterion("BLUE_BALL like", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallNotLike(String value) {
            addCriterion("BLUE_BALL not like", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallIn(List<String> values) {
            addCriterion("BLUE_BALL in", values, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallNotIn(List<String> values) {
            addCriterion("BLUE_BALL not in", values, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallBetween(String value1, String value2) {
            addCriterion("BLUE_BALL between", value1, value2, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallNotBetween(String value1, String value2) {
            addCriterion("BLUE_BALL not between", value1, value2, "blueBall");
            return (Criteria) this;
        }

        public Criteria andNowPeriodMoneyIsNull() {
            addCriterion("NOW_PERIOD_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andNowPeriodMoneyIsNotNull() {
            addCriterion("NOW_PERIOD_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andNowPeriodMoneyEqualTo(Integer value) {
            addCriterion("NOW_PERIOD_MONEY =", value, "nowPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNowPeriodMoneyNotEqualTo(Integer value) {
            addCriterion("NOW_PERIOD_MONEY <>", value, "nowPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNowPeriodMoneyGreaterThan(Integer value) {
            addCriterion("NOW_PERIOD_MONEY >", value, "nowPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNowPeriodMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOW_PERIOD_MONEY >=", value, "nowPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNowPeriodMoneyLessThan(Integer value) {
            addCriterion("NOW_PERIOD_MONEY <", value, "nowPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNowPeriodMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("NOW_PERIOD_MONEY <=", value, "nowPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNowPeriodMoneyIn(List<Integer> values) {
            addCriterion("NOW_PERIOD_MONEY in", values, "nowPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNowPeriodMoneyNotIn(List<Integer> values) {
            addCriterion("NOW_PERIOD_MONEY not in", values, "nowPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNowPeriodMoneyBetween(Integer value1, Integer value2) {
            addCriterion("NOW_PERIOD_MONEY between", value1, value2, "nowPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNowPeriodMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("NOW_PERIOD_MONEY not between", value1, value2, "nowPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNextPeriodMoneyIsNull() {
            addCriterion("NEXT_PERIOD_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andNextPeriodMoneyIsNotNull() {
            addCriterion("NEXT_PERIOD_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andNextPeriodMoneyEqualTo(Integer value) {
            addCriterion("NEXT_PERIOD_MONEY =", value, "nextPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNextPeriodMoneyNotEqualTo(Integer value) {
            addCriterion("NEXT_PERIOD_MONEY <>", value, "nextPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNextPeriodMoneyGreaterThan(Integer value) {
            addCriterion("NEXT_PERIOD_MONEY >", value, "nextPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNextPeriodMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEXT_PERIOD_MONEY >=", value, "nextPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNextPeriodMoneyLessThan(Integer value) {
            addCriterion("NEXT_PERIOD_MONEY <", value, "nextPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNextPeriodMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("NEXT_PERIOD_MONEY <=", value, "nextPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNextPeriodMoneyIn(List<Integer> values) {
            addCriterion("NEXT_PERIOD_MONEY in", values, "nextPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNextPeriodMoneyNotIn(List<Integer> values) {
            addCriterion("NEXT_PERIOD_MONEY not in", values, "nextPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNextPeriodMoneyBetween(Integer value1, Integer value2) {
            addCriterion("NEXT_PERIOD_MONEY between", value1, value2, "nextPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andNextPeriodMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("NEXT_PERIOD_MONEY not between", value1, value2, "nextPeriodMoney");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
