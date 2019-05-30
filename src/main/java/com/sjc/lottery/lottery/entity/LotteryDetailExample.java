package com.sjc.lottery.lottery.entity;

import java.util.ArrayList;
import java.util.List;

public class LotteryDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryDetailExample() {
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

        public Criteria andLotteryDetailIdIsNull() {
            addCriterion("LOTTERY_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLotteryDetailIdIsNotNull() {
            addCriterion("LOTTERY_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryDetailIdEqualTo(Integer value) {
            addCriterion("LOTTERY_DETAIL_ID =", value, "lotteryDetailId");
            return (Criteria) this;
        }

        public Criteria andLotteryDetailIdNotEqualTo(Integer value) {
            addCriterion("LOTTERY_DETAIL_ID <>", value, "lotteryDetailId");
            return (Criteria) this;
        }

        public Criteria andLotteryDetailIdGreaterThan(Integer value) {
            addCriterion("LOTTERY_DETAIL_ID >", value, "lotteryDetailId");
            return (Criteria) this;
        }

        public Criteria andLotteryDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOTTERY_DETAIL_ID >=", value, "lotteryDetailId");
            return (Criteria) this;
        }

        public Criteria andLotteryDetailIdLessThan(Integer value) {
            addCriterion("LOTTERY_DETAIL_ID <", value, "lotteryDetailId");
            return (Criteria) this;
        }

        public Criteria andLotteryDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("LOTTERY_DETAIL_ID <=", value, "lotteryDetailId");
            return (Criteria) this;
        }

        public Criteria andLotteryDetailIdIn(List<Integer> values) {
            addCriterion("LOTTERY_DETAIL_ID in", values, "lotteryDetailId");
            return (Criteria) this;
        }

        public Criteria andLotteryDetailIdNotIn(List<Integer> values) {
            addCriterion("LOTTERY_DETAIL_ID not in", values, "lotteryDetailId");
            return (Criteria) this;
        }

        public Criteria andLotteryDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("LOTTERY_DETAIL_ID between", value1, value2, "lotteryDetailId");
            return (Criteria) this;
        }

        public Criteria andLotteryDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LOTTERY_DETAIL_ID not between", value1, value2, "lotteryDetailId");
            return (Criteria) this;
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

        public Criteria andGradeTypeIsNull() {
            addCriterion("GRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIsNotNull() {
            addCriterion("GRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeEqualTo(String value) {
            addCriterion("GRADE_TYPE =", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotEqualTo(String value) {
            addCriterion("GRADE_TYPE <>", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeGreaterThan(String value) {
            addCriterion("GRADE_TYPE >", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_TYPE >=", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLessThan(String value) {
            addCriterion("GRADE_TYPE <", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLessThanOrEqualTo(String value) {
            addCriterion("GRADE_TYPE <=", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIn(List<String> values) {
            addCriterion("GRADE_TYPE in", values, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotIn(List<String> values) {
            addCriterion("GRADE_TYPE not in", values, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeBetween(String value1, String value2) {
            addCriterion("GRADE_TYPE between", value1, value2, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotBetween(String value1, String value2) {
            addCriterion("GRADE_TYPE not between", value1, value2, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeNumberIsNull() {
            addCriterion("GRADE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andGradeNumberIsNotNull() {
            addCriterion("GRADE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNumberEqualTo(Integer value) {
            addCriterion("GRADE_NUMBER =", value, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberNotEqualTo(Integer value) {
            addCriterion("GRADE_NUMBER <>", value, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberGreaterThan(Integer value) {
            addCriterion("GRADE_NUMBER >", value, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRADE_NUMBER >=", value, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberLessThan(Integer value) {
            addCriterion("GRADE_NUMBER <", value, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("GRADE_NUMBER <=", value, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberIn(List<Integer> values) {
            addCriterion("GRADE_NUMBER in", values, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberNotIn(List<Integer> values) {
            addCriterion("GRADE_NUMBER not in", values, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_NUMBER between", value1, value2, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_NUMBER not between", value1, value2, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeMoneyIsNull() {
            addCriterion("GRADE_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andGradeMoneyIsNotNull() {
            addCriterion("GRADE_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andGradeMoneyEqualTo(Integer value) {
            addCriterion("GRADE_MONEY =", value, "gradeMoney");
            return (Criteria) this;
        }

        public Criteria andGradeMoneyNotEqualTo(Integer value) {
            addCriterion("GRADE_MONEY <>", value, "gradeMoney");
            return (Criteria) this;
        }

        public Criteria andGradeMoneyGreaterThan(Integer value) {
            addCriterion("GRADE_MONEY >", value, "gradeMoney");
            return (Criteria) this;
        }

        public Criteria andGradeMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRADE_MONEY >=", value, "gradeMoney");
            return (Criteria) this;
        }

        public Criteria andGradeMoneyLessThan(Integer value) {
            addCriterion("GRADE_MONEY <", value, "gradeMoney");
            return (Criteria) this;
        }

        public Criteria andGradeMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("GRADE_MONEY <=", value, "gradeMoney");
            return (Criteria) this;
        }

        public Criteria andGradeMoneyIn(List<Integer> values) {
            addCriterion("GRADE_MONEY in", values, "gradeMoney");
            return (Criteria) this;
        }

        public Criteria andGradeMoneyNotIn(List<Integer> values) {
            addCriterion("GRADE_MONEY not in", values, "gradeMoney");
            return (Criteria) this;
        }

        public Criteria andGradeMoneyBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_MONEY between", value1, value2, "gradeMoney");
            return (Criteria) this;
        }

        public Criteria andGradeMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_MONEY not between", value1, value2, "gradeMoney");
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
