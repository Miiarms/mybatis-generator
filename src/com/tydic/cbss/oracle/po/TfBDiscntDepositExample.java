package com.tydic.cbss.oracle.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TfBDiscntDepositExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfBDiscntDepositExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andActionEventIdIsNull() {
            addCriterion("ACTION_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andActionEventIdIsNotNull() {
            addCriterion("ACTION_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActionEventIdEqualTo(Long value) {
            addCriterion("ACTION_EVENT_ID =", value, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdNotEqualTo(Long value) {
            addCriterion("ACTION_EVENT_ID <>", value, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdGreaterThan(Long value) {
            addCriterion("ACTION_EVENT_ID >", value, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTION_EVENT_ID >=", value, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdLessThan(Long value) {
            addCriterion("ACTION_EVENT_ID <", value, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdLessThanOrEqualTo(Long value) {
            addCriterion("ACTION_EVENT_ID <=", value, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdIn(List<Long> values) {
            addCriterion("ACTION_EVENT_ID in", values, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdNotIn(List<Long> values) {
            addCriterion("ACTION_EVENT_ID not in", values, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdBetween(Long value1, Long value2) {
            addCriterion("ACTION_EVENT_ID between", value1, value2, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andActionEventIdNotBetween(Long value1, Long value2) {
            addCriterion("ACTION_EVENT_ID not between", value1, value2, "actionEventId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdIsNull() {
            addCriterion("PARTITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartitionIdIsNotNull() {
            addCriterion("PARTITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartitionIdEqualTo(Integer value) {
            addCriterion("PARTITION_ID =", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotEqualTo(Integer value) {
            addCriterion("PARTITION_ID <>", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdGreaterThan(Integer value) {
            addCriterion("PARTITION_ID >", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARTITION_ID >=", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdLessThan(Integer value) {
            addCriterion("PARTITION_ID <", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARTITION_ID <=", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdIn(List<Integer> values) {
            addCriterion("PARTITION_ID in", values, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotIn(List<Integer> values) {
            addCriterion("PARTITION_ID not in", values, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdBetween(Integer value1, Integer value2) {
            addCriterion("PARTITION_ID between", value1, value2, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARTITION_ID not between", value1, value2, "partitionId");
            return (Criteria) this;
        }

        public Criteria andActionRuleIdIsNull() {
            addCriterion("ACTION_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andActionRuleIdIsNotNull() {
            addCriterion("ACTION_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActionRuleIdEqualTo(Integer value) {
            addCriterion("ACTION_RULE_ID =", value, "actionRuleId");
            return (Criteria) this;
        }

        public Criteria andActionRuleIdNotEqualTo(Integer value) {
            addCriterion("ACTION_RULE_ID <>", value, "actionRuleId");
            return (Criteria) this;
        }

        public Criteria andActionRuleIdGreaterThan(Integer value) {
            addCriterion("ACTION_RULE_ID >", value, "actionRuleId");
            return (Criteria) this;
        }

        public Criteria andActionRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTION_RULE_ID >=", value, "actionRuleId");
            return (Criteria) this;
        }

        public Criteria andActionRuleIdLessThan(Integer value) {
            addCriterion("ACTION_RULE_ID <", value, "actionRuleId");
            return (Criteria) this;
        }

        public Criteria andActionRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("ACTION_RULE_ID <=", value, "actionRuleId");
            return (Criteria) this;
        }

        public Criteria andActionRuleIdIn(List<Integer> values) {
            addCriterion("ACTION_RULE_ID in", values, "actionRuleId");
            return (Criteria) this;
        }

        public Criteria andActionRuleIdNotIn(List<Integer> values) {
            addCriterion("ACTION_RULE_ID not in", values, "actionRuleId");
            return (Criteria) this;
        }

        public Criteria andActionRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("ACTION_RULE_ID between", value1, value2, "actionRuleId");
            return (Criteria) this;
        }

        public Criteria andActionRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTION_RULE_ID not between", value1, value2, "actionRuleId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNull() {
            addCriterion("CHARGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNotNull() {
            addCriterion("CHARGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChargeIdEqualTo(Long value) {
            addCriterion("CHARGE_ID =", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotEqualTo(Long value) {
            addCriterion("CHARGE_ID <>", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThan(Long value) {
            addCriterion("CHARGE_ID >", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHARGE_ID >=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThan(Long value) {
            addCriterion("CHARGE_ID <", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThanOrEqualTo(Long value) {
            addCriterion("CHARGE_ID <=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIn(List<Long> values) {
            addCriterion("CHARGE_ID in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotIn(List<Long> values) {
            addCriterion("CHARGE_ID not in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdBetween(Long value1, Long value2) {
            addCriterion("CHARGE_ID between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotBetween(Long value1, Long value2) {
            addCriterion("CHARGE_ID not between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeIsNull() {
            addCriterion("EPARCHY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeIsNotNull() {
            addCriterion("EPARCHY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeEqualTo(String value) {
            addCriterion("EPARCHY_CODE =", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeNotEqualTo(String value) {
            addCriterion("EPARCHY_CODE <>", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeGreaterThan(String value) {
            addCriterion("EPARCHY_CODE >", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EPARCHY_CODE >=", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeLessThan(String value) {
            addCriterion("EPARCHY_CODE <", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeLessThanOrEqualTo(String value) {
            addCriterion("EPARCHY_CODE <=", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeLike(String value) {
            addCriterion("EPARCHY_CODE like", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeNotLike(String value) {
            addCriterion("EPARCHY_CODE not like", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeIn(List<String> values) {
            addCriterion("EPARCHY_CODE in", values, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeNotIn(List<String> values) {
            addCriterion("EPARCHY_CODE not in", values, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeBetween(String value1, String value2) {
            addCriterion("EPARCHY_CODE between", value1, value2, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeNotBetween(String value1, String value2) {
            addCriterion("EPARCHY_CODE not between", value1, value2, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andAcctBalanceIdIsNull() {
            addCriterion("ACCT_BALANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAcctBalanceIdIsNotNull() {
            addCriterion("ACCT_BALANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAcctBalanceIdEqualTo(Long value) {
            addCriterion("ACCT_BALANCE_ID =", value, "acctBalanceId");
            return (Criteria) this;
        }

        public Criteria andAcctBalanceIdNotEqualTo(Long value) {
            addCriterion("ACCT_BALANCE_ID <>", value, "acctBalanceId");
            return (Criteria) this;
        }

        public Criteria andAcctBalanceIdGreaterThan(Long value) {
            addCriterion("ACCT_BALANCE_ID >", value, "acctBalanceId");
            return (Criteria) this;
        }

        public Criteria andAcctBalanceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCT_BALANCE_ID >=", value, "acctBalanceId");
            return (Criteria) this;
        }

        public Criteria andAcctBalanceIdLessThan(Long value) {
            addCriterion("ACCT_BALANCE_ID <", value, "acctBalanceId");
            return (Criteria) this;
        }

        public Criteria andAcctBalanceIdLessThanOrEqualTo(Long value) {
            addCriterion("ACCT_BALANCE_ID <=", value, "acctBalanceId");
            return (Criteria) this;
        }

        public Criteria andAcctBalanceIdIn(List<Long> values) {
            addCriterion("ACCT_BALANCE_ID in", values, "acctBalanceId");
            return (Criteria) this;
        }

        public Criteria andAcctBalanceIdNotIn(List<Long> values) {
            addCriterion("ACCT_BALANCE_ID not in", values, "acctBalanceId");
            return (Criteria) this;
        }

        public Criteria andAcctBalanceIdBetween(Long value1, Long value2) {
            addCriterion("ACCT_BALANCE_ID between", value1, value2, "acctBalanceId");
            return (Criteria) this;
        }

        public Criteria andAcctBalanceIdNotBetween(Long value1, Long value2) {
            addCriterion("ACCT_BALANCE_ID not between", value1, value2, "acctBalanceId");
            return (Criteria) this;
        }

        public Criteria andActionCodeIsNull() {
            addCriterion("ACTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andActionCodeIsNotNull() {
            addCriterion("ACTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andActionCodeEqualTo(Integer value) {
            addCriterion("ACTION_CODE =", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeNotEqualTo(Integer value) {
            addCriterion("ACTION_CODE <>", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeGreaterThan(Integer value) {
            addCriterion("ACTION_CODE >", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTION_CODE >=", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeLessThan(Integer value) {
            addCriterion("ACTION_CODE <", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeLessThanOrEqualTo(Integer value) {
            addCriterion("ACTION_CODE <=", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeIn(List<Integer> values) {
            addCriterion("ACTION_CODE in", values, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeNotIn(List<Integer> values) {
            addCriterion("ACTION_CODE not in", values, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeBetween(Integer value1, Integer value2) {
            addCriterion("ACTION_CODE between", value1, value2, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTION_CODE not between", value1, value2, "actionCode");
            return (Criteria) this;
        }

        public Criteria andCondIdIsNull() {
            addCriterion("COND_ID is null");
            return (Criteria) this;
        }

        public Criteria andCondIdIsNotNull() {
            addCriterion("COND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCondIdEqualTo(Integer value) {
            addCriterion("COND_ID =", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdNotEqualTo(Integer value) {
            addCriterion("COND_ID <>", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdGreaterThan(Integer value) {
            addCriterion("COND_ID >", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COND_ID >=", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdLessThan(Integer value) {
            addCriterion("COND_ID <", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdLessThanOrEqualTo(Integer value) {
            addCriterion("COND_ID <=", value, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdIn(List<Integer> values) {
            addCriterion("COND_ID in", values, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdNotIn(List<Integer> values) {
            addCriterion("COND_ID not in", values, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdBetween(Integer value1, Integer value2) {
            addCriterion("COND_ID between", value1, value2, "condId");
            return (Criteria) this;
        }

        public Criteria andCondIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COND_ID not between", value1, value2, "condId");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdIsNull() {
            addCriterion("OUTER_TRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdIsNotNull() {
            addCriterion("OUTER_TRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdEqualTo(String value) {
            addCriterion("OUTER_TRADE_ID =", value, "outerTradeId");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdNotEqualTo(String value) {
            addCriterion("OUTER_TRADE_ID <>", value, "outerTradeId");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdGreaterThan(String value) {
            addCriterion("OUTER_TRADE_ID >", value, "outerTradeId");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("OUTER_TRADE_ID >=", value, "outerTradeId");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdLessThan(String value) {
            addCriterion("OUTER_TRADE_ID <", value, "outerTradeId");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdLessThanOrEqualTo(String value) {
            addCriterion("OUTER_TRADE_ID <=", value, "outerTradeId");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdLike(String value) {
            addCriterion("OUTER_TRADE_ID like", value, "outerTradeId");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdNotLike(String value) {
            addCriterion("OUTER_TRADE_ID not like", value, "outerTradeId");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdIn(List<String> values) {
            addCriterion("OUTER_TRADE_ID in", values, "outerTradeId");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdNotIn(List<String> values) {
            addCriterion("OUTER_TRADE_ID not in", values, "outerTradeId");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdBetween(String value1, String value2) {
            addCriterion("OUTER_TRADE_ID between", value1, value2, "outerTradeId");
            return (Criteria) this;
        }

        public Criteria andOuterTradeIdNotBetween(String value1, String value2) {
            addCriterion("OUTER_TRADE_ID not between", value1, value2, "outerTradeId");
            return (Criteria) this;
        }

        public Criteria andAcctIdIsNull() {
            addCriterion("ACCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAcctIdIsNotNull() {
            addCriterion("ACCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAcctIdEqualTo(Long value) {
            addCriterion("ACCT_ID =", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotEqualTo(Long value) {
            addCriterion("ACCT_ID <>", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdGreaterThan(Long value) {
            addCriterion("ACCT_ID >", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCT_ID >=", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLessThan(Long value) {
            addCriterion("ACCT_ID <", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLessThanOrEqualTo(Long value) {
            addCriterion("ACCT_ID <=", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdIn(List<Long> values) {
            addCriterion("ACCT_ID in", values, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotIn(List<Long> values) {
            addCriterion("ACCT_ID not in", values, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdBetween(Long value1, Long value2) {
            addCriterion("ACCT_ID between", value1, value2, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotBetween(Long value1, Long value2) {
            addCriterion("ACCT_ID not between", value1, value2, "acctId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeIsNull() {
            addCriterion("DISCNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeIsNotNull() {
            addCriterion("DISCNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeEqualTo(String value) {
            addCriterion("DISCNT_TYPE =", value, "discntType");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeNotEqualTo(String value) {
            addCriterion("DISCNT_TYPE <>", value, "discntType");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeGreaterThan(String value) {
            addCriterion("DISCNT_TYPE >", value, "discntType");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DISCNT_TYPE >=", value, "discntType");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeLessThan(String value) {
            addCriterion("DISCNT_TYPE <", value, "discntType");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeLessThanOrEqualTo(String value) {
            addCriterion("DISCNT_TYPE <=", value, "discntType");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeLike(String value) {
            addCriterion("DISCNT_TYPE like", value, "discntType");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeNotLike(String value) {
            addCriterion("DISCNT_TYPE not like", value, "discntType");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeIn(List<String> values) {
            addCriterion("DISCNT_TYPE in", values, "discntType");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeNotIn(List<String> values) {
            addCriterion("DISCNT_TYPE not in", values, "discntType");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeBetween(String value1, String value2) {
            addCriterion("DISCNT_TYPE between", value1, value2, "discntType");
            return (Criteria) this;
        }

        public Criteria andDiscntTypeNotBetween(String value1, String value2) {
            addCriterion("DISCNT_TYPE not between", value1, value2, "discntType");
            return (Criteria) this;
        }

        public Criteria andDiscntItemIdIsNull() {
            addCriterion("DISCNT_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiscntItemIdIsNotNull() {
            addCriterion("DISCNT_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiscntItemIdEqualTo(Integer value) {
            addCriterion("DISCNT_ITEM_ID =", value, "discntItemId");
            return (Criteria) this;
        }

        public Criteria andDiscntItemIdNotEqualTo(Integer value) {
            addCriterion("DISCNT_ITEM_ID <>", value, "discntItemId");
            return (Criteria) this;
        }

        public Criteria andDiscntItemIdGreaterThan(Integer value) {
            addCriterion("DISCNT_ITEM_ID >", value, "discntItemId");
            return (Criteria) this;
        }

        public Criteria andDiscntItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DISCNT_ITEM_ID >=", value, "discntItemId");
            return (Criteria) this;
        }

        public Criteria andDiscntItemIdLessThan(Integer value) {
            addCriterion("DISCNT_ITEM_ID <", value, "discntItemId");
            return (Criteria) this;
        }

        public Criteria andDiscntItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("DISCNT_ITEM_ID <=", value, "discntItemId");
            return (Criteria) this;
        }

        public Criteria andDiscntItemIdIn(List<Integer> values) {
            addCriterion("DISCNT_ITEM_ID in", values, "discntItemId");
            return (Criteria) this;
        }

        public Criteria andDiscntItemIdNotIn(List<Integer> values) {
            addCriterion("DISCNT_ITEM_ID not in", values, "discntItemId");
            return (Criteria) this;
        }

        public Criteria andDiscntItemIdBetween(Integer value1, Integer value2) {
            addCriterion("DISCNT_ITEM_ID between", value1, value2, "discntItemId");
            return (Criteria) this;
        }

        public Criteria andDiscntItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DISCNT_ITEM_ID not between", value1, value2, "discntItemId");
            return (Criteria) this;
        }

        public Criteria andDiscntModeIsNull() {
            addCriterion("DISCNT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andDiscntModeIsNotNull() {
            addCriterion("DISCNT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscntModeEqualTo(String value) {
            addCriterion("DISCNT_MODE =", value, "discntMode");
            return (Criteria) this;
        }

        public Criteria andDiscntModeNotEqualTo(String value) {
            addCriterion("DISCNT_MODE <>", value, "discntMode");
            return (Criteria) this;
        }

        public Criteria andDiscntModeGreaterThan(String value) {
            addCriterion("DISCNT_MODE >", value, "discntMode");
            return (Criteria) this;
        }

        public Criteria andDiscntModeGreaterThanOrEqualTo(String value) {
            addCriterion("DISCNT_MODE >=", value, "discntMode");
            return (Criteria) this;
        }

        public Criteria andDiscntModeLessThan(String value) {
            addCriterion("DISCNT_MODE <", value, "discntMode");
            return (Criteria) this;
        }

        public Criteria andDiscntModeLessThanOrEqualTo(String value) {
            addCriterion("DISCNT_MODE <=", value, "discntMode");
            return (Criteria) this;
        }

        public Criteria andDiscntModeLike(String value) {
            addCriterion("DISCNT_MODE like", value, "discntMode");
            return (Criteria) this;
        }

        public Criteria andDiscntModeNotLike(String value) {
            addCriterion("DISCNT_MODE not like", value, "discntMode");
            return (Criteria) this;
        }

        public Criteria andDiscntModeIn(List<String> values) {
            addCriterion("DISCNT_MODE in", values, "discntMode");
            return (Criteria) this;
        }

        public Criteria andDiscntModeNotIn(List<String> values) {
            addCriterion("DISCNT_MODE not in", values, "discntMode");
            return (Criteria) this;
        }

        public Criteria andDiscntModeBetween(String value1, String value2) {
            addCriterion("DISCNT_MODE between", value1, value2, "discntMode");
            return (Criteria) this;
        }

        public Criteria andDiscntModeNotBetween(String value1, String value2) {
            addCriterion("DISCNT_MODE not between", value1, value2, "discntMode");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Long value) {
            addCriterion("MONEY =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Long value) {
            addCriterion("MONEY <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Long value) {
            addCriterion("MONEY >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("MONEY >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Long value) {
            addCriterion("MONEY <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Long value) {
            addCriterion("MONEY <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Long> values) {
            addCriterion("MONEY in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Long> values) {
            addCriterion("MONEY not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Long value1, Long value2) {
            addCriterion("MONEY between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Long value1, Long value2) {
            addCriterion("MONEY not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andLeftMoneyIsNull() {
            addCriterion("LEFT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andLeftMoneyIsNotNull() {
            addCriterion("LEFT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andLeftMoneyEqualTo(Long value) {
            addCriterion("LEFT_MONEY =", value, "leftMoney");
            return (Criteria) this;
        }

        public Criteria andLeftMoneyNotEqualTo(Long value) {
            addCriterion("LEFT_MONEY <>", value, "leftMoney");
            return (Criteria) this;
        }

        public Criteria andLeftMoneyGreaterThan(Long value) {
            addCriterion("LEFT_MONEY >", value, "leftMoney");
            return (Criteria) this;
        }

        public Criteria andLeftMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("LEFT_MONEY >=", value, "leftMoney");
            return (Criteria) this;
        }

        public Criteria andLeftMoneyLessThan(Long value) {
            addCriterion("LEFT_MONEY <", value, "leftMoney");
            return (Criteria) this;
        }

        public Criteria andLeftMoneyLessThanOrEqualTo(Long value) {
            addCriterion("LEFT_MONEY <=", value, "leftMoney");
            return (Criteria) this;
        }

        public Criteria andLeftMoneyIn(List<Long> values) {
            addCriterion("LEFT_MONEY in", values, "leftMoney");
            return (Criteria) this;
        }

        public Criteria andLeftMoneyNotIn(List<Long> values) {
            addCriterion("LEFT_MONEY not in", values, "leftMoney");
            return (Criteria) this;
        }

        public Criteria andLeftMoneyBetween(Long value1, Long value2) {
            addCriterion("LEFT_MONEY between", value1, value2, "leftMoney");
            return (Criteria) this;
        }

        public Criteria andLeftMoneyNotBetween(Long value1, Long value2) {
            addCriterion("LEFT_MONEY not between", value1, value2, "leftMoney");
            return (Criteria) this;
        }

        public Criteria andMonthsIsNull() {
            addCriterion("MONTHS is null");
            return (Criteria) this;
        }

        public Criteria andMonthsIsNotNull() {
            addCriterion("MONTHS is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsEqualTo(Short value) {
            addCriterion("MONTHS =", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotEqualTo(Short value) {
            addCriterion("MONTHS <>", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsGreaterThan(Short value) {
            addCriterion("MONTHS >", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsGreaterThanOrEqualTo(Short value) {
            addCriterion("MONTHS >=", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsLessThan(Short value) {
            addCriterion("MONTHS <", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsLessThanOrEqualTo(Short value) {
            addCriterion("MONTHS <=", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsIn(List<Short> values) {
            addCriterion("MONTHS in", values, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotIn(List<Short> values) {
            addCriterion("MONTHS not in", values, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsBetween(Short value1, Short value2) {
            addCriterion("MONTHS between", value1, value2, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotBetween(Short value1, Short value2) {
            addCriterion("MONTHS not between", value1, value2, "months");
            return (Criteria) this;
        }

        public Criteria andLimitModeIsNull() {
            addCriterion("LIMIT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andLimitModeIsNotNull() {
            addCriterion("LIMIT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andLimitModeEqualTo(String value) {
            addCriterion("LIMIT_MODE =", value, "limitMode");
            return (Criteria) this;
        }

        public Criteria andLimitModeNotEqualTo(String value) {
            addCriterion("LIMIT_MODE <>", value, "limitMode");
            return (Criteria) this;
        }

        public Criteria andLimitModeGreaterThan(String value) {
            addCriterion("LIMIT_MODE >", value, "limitMode");
            return (Criteria) this;
        }

        public Criteria andLimitModeGreaterThanOrEqualTo(String value) {
            addCriterion("LIMIT_MODE >=", value, "limitMode");
            return (Criteria) this;
        }

        public Criteria andLimitModeLessThan(String value) {
            addCriterion("LIMIT_MODE <", value, "limitMode");
            return (Criteria) this;
        }

        public Criteria andLimitModeLessThanOrEqualTo(String value) {
            addCriterion("LIMIT_MODE <=", value, "limitMode");
            return (Criteria) this;
        }

        public Criteria andLimitModeLike(String value) {
            addCriterion("LIMIT_MODE like", value, "limitMode");
            return (Criteria) this;
        }

        public Criteria andLimitModeNotLike(String value) {
            addCriterion("LIMIT_MODE not like", value, "limitMode");
            return (Criteria) this;
        }

        public Criteria andLimitModeIn(List<String> values) {
            addCriterion("LIMIT_MODE in", values, "limitMode");
            return (Criteria) this;
        }

        public Criteria andLimitModeNotIn(List<String> values) {
            addCriterion("LIMIT_MODE not in", values, "limitMode");
            return (Criteria) this;
        }

        public Criteria andLimitModeBetween(String value1, String value2) {
            addCriterion("LIMIT_MODE between", value1, value2, "limitMode");
            return (Criteria) this;
        }

        public Criteria andLimitModeNotBetween(String value1, String value2) {
            addCriterion("LIMIT_MODE not between", value1, value2, "limitMode");
            return (Criteria) this;
        }

        public Criteria andSplitMethodIsNull() {
            addCriterion("SPLIT_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andSplitMethodIsNotNull() {
            addCriterion("SPLIT_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andSplitMethodEqualTo(String value) {
            addCriterion("SPLIT_METHOD =", value, "splitMethod");
            return (Criteria) this;
        }

        public Criteria andSplitMethodNotEqualTo(String value) {
            addCriterion("SPLIT_METHOD <>", value, "splitMethod");
            return (Criteria) this;
        }

        public Criteria andSplitMethodGreaterThan(String value) {
            addCriterion("SPLIT_METHOD >", value, "splitMethod");
            return (Criteria) this;
        }

        public Criteria andSplitMethodGreaterThanOrEqualTo(String value) {
            addCriterion("SPLIT_METHOD >=", value, "splitMethod");
            return (Criteria) this;
        }

        public Criteria andSplitMethodLessThan(String value) {
            addCriterion("SPLIT_METHOD <", value, "splitMethod");
            return (Criteria) this;
        }

        public Criteria andSplitMethodLessThanOrEqualTo(String value) {
            addCriterion("SPLIT_METHOD <=", value, "splitMethod");
            return (Criteria) this;
        }

        public Criteria andSplitMethodLike(String value) {
            addCriterion("SPLIT_METHOD like", value, "splitMethod");
            return (Criteria) this;
        }

        public Criteria andSplitMethodNotLike(String value) {
            addCriterion("SPLIT_METHOD not like", value, "splitMethod");
            return (Criteria) this;
        }

        public Criteria andSplitMethodIn(List<String> values) {
            addCriterion("SPLIT_METHOD in", values, "splitMethod");
            return (Criteria) this;
        }

        public Criteria andSplitMethodNotIn(List<String> values) {
            addCriterion("SPLIT_METHOD not in", values, "splitMethod");
            return (Criteria) this;
        }

        public Criteria andSplitMethodBetween(String value1, String value2) {
            addCriterion("SPLIT_METHOD between", value1, value2, "splitMethod");
            return (Criteria) this;
        }

        public Criteria andSplitMethodNotBetween(String value1, String value2) {
            addCriterion("SPLIT_METHOD not between", value1, value2, "splitMethod");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyIsNull() {
            addCriterion("LIMIT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyIsNotNull() {
            addCriterion("LIMIT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyEqualTo(Long value) {
            addCriterion("LIMIT_MONEY =", value, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyNotEqualTo(Long value) {
            addCriterion("LIMIT_MONEY <>", value, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyGreaterThan(Long value) {
            addCriterion("LIMIT_MONEY >", value, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("LIMIT_MONEY >=", value, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyLessThan(Long value) {
            addCriterion("LIMIT_MONEY <", value, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyLessThanOrEqualTo(Long value) {
            addCriterion("LIMIT_MONEY <=", value, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyIn(List<Long> values) {
            addCriterion("LIMIT_MONEY in", values, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyNotIn(List<Long> values) {
            addCriterion("LIMIT_MONEY not in", values, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyBetween(Long value1, Long value2) {
            addCriterion("LIMIT_MONEY between", value1, value2, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyNotBetween(Long value1, Long value2) {
            addCriterion("LIMIT_MONEY not between", value1, value2, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andDelayTagIsNull() {
            addCriterion("DELAY_TAG is null");
            return (Criteria) this;
        }

        public Criteria andDelayTagIsNotNull() {
            addCriterion("DELAY_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelayTagEqualTo(String value) {
            addCriterion("DELAY_TAG =", value, "delayTag");
            return (Criteria) this;
        }

        public Criteria andDelayTagNotEqualTo(String value) {
            addCriterion("DELAY_TAG <>", value, "delayTag");
            return (Criteria) this;
        }

        public Criteria andDelayTagGreaterThan(String value) {
            addCriterion("DELAY_TAG >", value, "delayTag");
            return (Criteria) this;
        }

        public Criteria andDelayTagGreaterThanOrEqualTo(String value) {
            addCriterion("DELAY_TAG >=", value, "delayTag");
            return (Criteria) this;
        }

        public Criteria andDelayTagLessThan(String value) {
            addCriterion("DELAY_TAG <", value, "delayTag");
            return (Criteria) this;
        }

        public Criteria andDelayTagLessThanOrEqualTo(String value) {
            addCriterion("DELAY_TAG <=", value, "delayTag");
            return (Criteria) this;
        }

        public Criteria andDelayTagLike(String value) {
            addCriterion("DELAY_TAG like", value, "delayTag");
            return (Criteria) this;
        }

        public Criteria andDelayTagNotLike(String value) {
            addCriterion("DELAY_TAG not like", value, "delayTag");
            return (Criteria) this;
        }

        public Criteria andDelayTagIn(List<String> values) {
            addCriterion("DELAY_TAG in", values, "delayTag");
            return (Criteria) this;
        }

        public Criteria andDelayTagNotIn(List<String> values) {
            addCriterion("DELAY_TAG not in", values, "delayTag");
            return (Criteria) this;
        }

        public Criteria andDelayTagBetween(String value1, String value2) {
            addCriterion("DELAY_TAG between", value1, value2, "delayTag");
            return (Criteria) this;
        }

        public Criteria andDelayTagNotBetween(String value1, String value2) {
            addCriterion("DELAY_TAG not between", value1, value2, "delayTag");
            return (Criteria) this;
        }

        public Criteria andStartCycleIdIsNull() {
            addCriterion("START_CYCLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStartCycleIdIsNotNull() {
            addCriterion("START_CYCLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStartCycleIdEqualTo(Integer value) {
            addCriterion("START_CYCLE_ID =", value, "startCycleId");
            return (Criteria) this;
        }

        public Criteria andStartCycleIdNotEqualTo(Integer value) {
            addCriterion("START_CYCLE_ID <>", value, "startCycleId");
            return (Criteria) this;
        }

        public Criteria andStartCycleIdGreaterThan(Integer value) {
            addCriterion("START_CYCLE_ID >", value, "startCycleId");
            return (Criteria) this;
        }

        public Criteria andStartCycleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("START_CYCLE_ID >=", value, "startCycleId");
            return (Criteria) this;
        }

        public Criteria andStartCycleIdLessThan(Integer value) {
            addCriterion("START_CYCLE_ID <", value, "startCycleId");
            return (Criteria) this;
        }

        public Criteria andStartCycleIdLessThanOrEqualTo(Integer value) {
            addCriterion("START_CYCLE_ID <=", value, "startCycleId");
            return (Criteria) this;
        }

        public Criteria andStartCycleIdIn(List<Integer> values) {
            addCriterion("START_CYCLE_ID in", values, "startCycleId");
            return (Criteria) this;
        }

        public Criteria andStartCycleIdNotIn(List<Integer> values) {
            addCriterion("START_CYCLE_ID not in", values, "startCycleId");
            return (Criteria) this;
        }

        public Criteria andStartCycleIdBetween(Integer value1, Integer value2) {
            addCriterion("START_CYCLE_ID between", value1, value2, "startCycleId");
            return (Criteria) this;
        }

        public Criteria andStartCycleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("START_CYCLE_ID not between", value1, value2, "startCycleId");
            return (Criteria) this;
        }

        public Criteria andEndCycleIdIsNull() {
            addCriterion("END_CYCLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEndCycleIdIsNotNull() {
            addCriterion("END_CYCLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEndCycleIdEqualTo(Integer value) {
            addCriterion("END_CYCLE_ID =", value, "endCycleId");
            return (Criteria) this;
        }

        public Criteria andEndCycleIdNotEqualTo(Integer value) {
            addCriterion("END_CYCLE_ID <>", value, "endCycleId");
            return (Criteria) this;
        }

        public Criteria andEndCycleIdGreaterThan(Integer value) {
            addCriterion("END_CYCLE_ID >", value, "endCycleId");
            return (Criteria) this;
        }

        public Criteria andEndCycleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("END_CYCLE_ID >=", value, "endCycleId");
            return (Criteria) this;
        }

        public Criteria andEndCycleIdLessThan(Integer value) {
            addCriterion("END_CYCLE_ID <", value, "endCycleId");
            return (Criteria) this;
        }

        public Criteria andEndCycleIdLessThanOrEqualTo(Integer value) {
            addCriterion("END_CYCLE_ID <=", value, "endCycleId");
            return (Criteria) this;
        }

        public Criteria andEndCycleIdIn(List<Integer> values) {
            addCriterion("END_CYCLE_ID in", values, "endCycleId");
            return (Criteria) this;
        }

        public Criteria andEndCycleIdNotIn(List<Integer> values) {
            addCriterion("END_CYCLE_ID not in", values, "endCycleId");
            return (Criteria) this;
        }

        public Criteria andEndCycleIdBetween(Integer value1, Integer value2) {
            addCriterion("END_CYCLE_ID between", value1, value2, "endCycleId");
            return (Criteria) this;
        }

        public Criteria andEndCycleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("END_CYCLE_ID not between", value1, value2, "endCycleId");
            return (Criteria) this;
        }

        public Criteria andTimerTypeIsNull() {
            addCriterion("TIMER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTimerTypeIsNotNull() {
            addCriterion("TIMER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTimerTypeEqualTo(String value) {
            addCriterion("TIMER_TYPE =", value, "timerType");
            return (Criteria) this;
        }

        public Criteria andTimerTypeNotEqualTo(String value) {
            addCriterion("TIMER_TYPE <>", value, "timerType");
            return (Criteria) this;
        }

        public Criteria andTimerTypeGreaterThan(String value) {
            addCriterion("TIMER_TYPE >", value, "timerType");
            return (Criteria) this;
        }

        public Criteria andTimerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TIMER_TYPE >=", value, "timerType");
            return (Criteria) this;
        }

        public Criteria andTimerTypeLessThan(String value) {
            addCriterion("TIMER_TYPE <", value, "timerType");
            return (Criteria) this;
        }

        public Criteria andTimerTypeLessThanOrEqualTo(String value) {
            addCriterion("TIMER_TYPE <=", value, "timerType");
            return (Criteria) this;
        }

        public Criteria andTimerTypeLike(String value) {
            addCriterion("TIMER_TYPE like", value, "timerType");
            return (Criteria) this;
        }

        public Criteria andTimerTypeNotLike(String value) {
            addCriterion("TIMER_TYPE not like", value, "timerType");
            return (Criteria) this;
        }

        public Criteria andTimerTypeIn(List<String> values) {
            addCriterion("TIMER_TYPE in", values, "timerType");
            return (Criteria) this;
        }

        public Criteria andTimerTypeNotIn(List<String> values) {
            addCriterion("TIMER_TYPE not in", values, "timerType");
            return (Criteria) this;
        }

        public Criteria andTimerTypeBetween(String value1, String value2) {
            addCriterion("TIMER_TYPE between", value1, value2, "timerType");
            return (Criteria) this;
        }

        public Criteria andTimerTypeNotBetween(String value1, String value2) {
            addCriterion("TIMER_TYPE not between", value1, value2, "timerType");
            return (Criteria) this;
        }

        public Criteria andItemGrpIdIsNull() {
            addCriterion("ITEM_GRP_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemGrpIdIsNotNull() {
            addCriterion("ITEM_GRP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemGrpIdEqualTo(Integer value) {
            addCriterion("ITEM_GRP_ID =", value, "itemGrpId");
            return (Criteria) this;
        }

        public Criteria andItemGrpIdNotEqualTo(Integer value) {
            addCriterion("ITEM_GRP_ID <>", value, "itemGrpId");
            return (Criteria) this;
        }

        public Criteria andItemGrpIdGreaterThan(Integer value) {
            addCriterion("ITEM_GRP_ID >", value, "itemGrpId");
            return (Criteria) this;
        }

        public Criteria andItemGrpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEM_GRP_ID >=", value, "itemGrpId");
            return (Criteria) this;
        }

        public Criteria andItemGrpIdLessThan(Integer value) {
            addCriterion("ITEM_GRP_ID <", value, "itemGrpId");
            return (Criteria) this;
        }

        public Criteria andItemGrpIdLessThanOrEqualTo(Integer value) {
            addCriterion("ITEM_GRP_ID <=", value, "itemGrpId");
            return (Criteria) this;
        }

        public Criteria andItemGrpIdIn(List<Integer> values) {
            addCriterion("ITEM_GRP_ID in", values, "itemGrpId");
            return (Criteria) this;
        }

        public Criteria andItemGrpIdNotIn(List<Integer> values) {
            addCriterion("ITEM_GRP_ID not in", values, "itemGrpId");
            return (Criteria) this;
        }

        public Criteria andItemGrpIdBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_GRP_ID between", value1, value2, "itemGrpId");
            return (Criteria) this;
        }

        public Criteria andItemGrpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_GRP_ID not between", value1, value2, "itemGrpId");
            return (Criteria) this;
        }

        public Criteria andDesDepositCodeIsNull() {
            addCriterion("DES_DEPOSIT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDesDepositCodeIsNotNull() {
            addCriterion("DES_DEPOSIT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDesDepositCodeEqualTo(Integer value) {
            addCriterion("DES_DEPOSIT_CODE =", value, "desDepositCode");
            return (Criteria) this;
        }

        public Criteria andDesDepositCodeNotEqualTo(Integer value) {
            addCriterion("DES_DEPOSIT_CODE <>", value, "desDepositCode");
            return (Criteria) this;
        }

        public Criteria andDesDepositCodeGreaterThan(Integer value) {
            addCriterion("DES_DEPOSIT_CODE >", value, "desDepositCode");
            return (Criteria) this;
        }

        public Criteria andDesDepositCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DES_DEPOSIT_CODE >=", value, "desDepositCode");
            return (Criteria) this;
        }

        public Criteria andDesDepositCodeLessThan(Integer value) {
            addCriterion("DES_DEPOSIT_CODE <", value, "desDepositCode");
            return (Criteria) this;
        }

        public Criteria andDesDepositCodeLessThanOrEqualTo(Integer value) {
            addCriterion("DES_DEPOSIT_CODE <=", value, "desDepositCode");
            return (Criteria) this;
        }

        public Criteria andDesDepositCodeIn(List<Integer> values) {
            addCriterion("DES_DEPOSIT_CODE in", values, "desDepositCode");
            return (Criteria) this;
        }

        public Criteria andDesDepositCodeNotIn(List<Integer> values) {
            addCriterion("DES_DEPOSIT_CODE not in", values, "desDepositCode");
            return (Criteria) this;
        }

        public Criteria andDesDepositCodeBetween(Integer value1, Integer value2) {
            addCriterion("DES_DEPOSIT_CODE between", value1, value2, "desDepositCode");
            return (Criteria) this;
        }

        public Criteria andDesDepositCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("DES_DEPOSIT_CODE not between", value1, value2, "desDepositCode");
            return (Criteria) this;
        }

        public Criteria andPerSmsIdIsNull() {
            addCriterion("PER_SMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPerSmsIdIsNotNull() {
            addCriterion("PER_SMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPerSmsIdEqualTo(Integer value) {
            addCriterion("PER_SMS_ID =", value, "perSmsId");
            return (Criteria) this;
        }

        public Criteria andPerSmsIdNotEqualTo(Integer value) {
            addCriterion("PER_SMS_ID <>", value, "perSmsId");
            return (Criteria) this;
        }

        public Criteria andPerSmsIdGreaterThan(Integer value) {
            addCriterion("PER_SMS_ID >", value, "perSmsId");
            return (Criteria) this;
        }

        public Criteria andPerSmsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PER_SMS_ID >=", value, "perSmsId");
            return (Criteria) this;
        }

        public Criteria andPerSmsIdLessThan(Integer value) {
            addCriterion("PER_SMS_ID <", value, "perSmsId");
            return (Criteria) this;
        }

        public Criteria andPerSmsIdLessThanOrEqualTo(Integer value) {
            addCriterion("PER_SMS_ID <=", value, "perSmsId");
            return (Criteria) this;
        }

        public Criteria andPerSmsIdIn(List<Integer> values) {
            addCriterion("PER_SMS_ID in", values, "perSmsId");
            return (Criteria) this;
        }

        public Criteria andPerSmsIdNotIn(List<Integer> values) {
            addCriterion("PER_SMS_ID not in", values, "perSmsId");
            return (Criteria) this;
        }

        public Criteria andPerSmsIdBetween(Integer value1, Integer value2) {
            addCriterion("PER_SMS_ID between", value1, value2, "perSmsId");
            return (Criteria) this;
        }

        public Criteria andPerSmsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PER_SMS_ID not between", value1, value2, "perSmsId");
            return (Criteria) this;
        }

        public Criteria andLastSmsIdIsNull() {
            addCriterion("LAST_SMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastSmsIdIsNotNull() {
            addCriterion("LAST_SMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastSmsIdEqualTo(Integer value) {
            addCriterion("LAST_SMS_ID =", value, "lastSmsId");
            return (Criteria) this;
        }

        public Criteria andLastSmsIdNotEqualTo(Integer value) {
            addCriterion("LAST_SMS_ID <>", value, "lastSmsId");
            return (Criteria) this;
        }

        public Criteria andLastSmsIdGreaterThan(Integer value) {
            addCriterion("LAST_SMS_ID >", value, "lastSmsId");
            return (Criteria) this;
        }

        public Criteria andLastSmsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_SMS_ID >=", value, "lastSmsId");
            return (Criteria) this;
        }

        public Criteria andLastSmsIdLessThan(Integer value) {
            addCriterion("LAST_SMS_ID <", value, "lastSmsId");
            return (Criteria) this;
        }

        public Criteria andLastSmsIdLessThanOrEqualTo(Integer value) {
            addCriterion("LAST_SMS_ID <=", value, "lastSmsId");
            return (Criteria) this;
        }

        public Criteria andLastSmsIdIn(List<Integer> values) {
            addCriterion("LAST_SMS_ID in", values, "lastSmsId");
            return (Criteria) this;
        }

        public Criteria andLastSmsIdNotIn(List<Integer> values) {
            addCriterion("LAST_SMS_ID not in", values, "lastSmsId");
            return (Criteria) this;
        }

        public Criteria andLastSmsIdBetween(Integer value1, Integer value2) {
            addCriterion("LAST_SMS_ID between", value1, value2, "lastSmsId");
            return (Criteria) this;
        }

        public Criteria andLastSmsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_SMS_ID not between", value1, value2, "lastSmsId");
            return (Criteria) this;
        }

        public Criteria andFireDayIsNull() {
            addCriterion("FIRE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andFireDayIsNotNull() {
            addCriterion("FIRE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andFireDayEqualTo(Short value) {
            addCriterion("FIRE_DAY =", value, "fireDay");
            return (Criteria) this;
        }

        public Criteria andFireDayNotEqualTo(Short value) {
            addCriterion("FIRE_DAY <>", value, "fireDay");
            return (Criteria) this;
        }

        public Criteria andFireDayGreaterThan(Short value) {
            addCriterion("FIRE_DAY >", value, "fireDay");
            return (Criteria) this;
        }

        public Criteria andFireDayGreaterThanOrEqualTo(Short value) {
            addCriterion("FIRE_DAY >=", value, "fireDay");
            return (Criteria) this;
        }

        public Criteria andFireDayLessThan(Short value) {
            addCriterion("FIRE_DAY <", value, "fireDay");
            return (Criteria) this;
        }

        public Criteria andFireDayLessThanOrEqualTo(Short value) {
            addCriterion("FIRE_DAY <=", value, "fireDay");
            return (Criteria) this;
        }

        public Criteria andFireDayIn(List<Short> values) {
            addCriterion("FIRE_DAY in", values, "fireDay");
            return (Criteria) this;
        }

        public Criteria andFireDayNotIn(List<Short> values) {
            addCriterion("FIRE_DAY not in", values, "fireDay");
            return (Criteria) this;
        }

        public Criteria andFireDayBetween(Short value1, Short value2) {
            addCriterion("FIRE_DAY between", value1, value2, "fireDay");
            return (Criteria) this;
        }

        public Criteria andFireDayNotBetween(Short value1, Short value2) {
            addCriterion("FIRE_DAY not between", value1, value2, "fireDay");
            return (Criteria) this;
        }

        public Criteria andFiredMonthIsNull() {
            addCriterion("FIRED_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andFiredMonthIsNotNull() {
            addCriterion("FIRED_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andFiredMonthEqualTo(Integer value) {
            addCriterion("FIRED_MONTH =", value, "firedMonth");
            return (Criteria) this;
        }

        public Criteria andFiredMonthNotEqualTo(Integer value) {
            addCriterion("FIRED_MONTH <>", value, "firedMonth");
            return (Criteria) this;
        }

        public Criteria andFiredMonthGreaterThan(Integer value) {
            addCriterion("FIRED_MONTH >", value, "firedMonth");
            return (Criteria) this;
        }

        public Criteria andFiredMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIRED_MONTH >=", value, "firedMonth");
            return (Criteria) this;
        }

        public Criteria andFiredMonthLessThan(Integer value) {
            addCriterion("FIRED_MONTH <", value, "firedMonth");
            return (Criteria) this;
        }

        public Criteria andFiredMonthLessThanOrEqualTo(Integer value) {
            addCriterion("FIRED_MONTH <=", value, "firedMonth");
            return (Criteria) this;
        }

        public Criteria andFiredMonthIn(List<Integer> values) {
            addCriterion("FIRED_MONTH in", values, "firedMonth");
            return (Criteria) this;
        }

        public Criteria andFiredMonthNotIn(List<Integer> values) {
            addCriterion("FIRED_MONTH not in", values, "firedMonth");
            return (Criteria) this;
        }

        public Criteria andFiredMonthBetween(Integer value1, Integer value2) {
            addCriterion("FIRED_MONTH between", value1, value2, "firedMonth");
            return (Criteria) this;
        }

        public Criteria andFiredMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("FIRED_MONTH not between", value1, value2, "firedMonth");
            return (Criteria) this;
        }

        public Criteria andIfTransIsNull() {
            addCriterion("IF_TRANS is null");
            return (Criteria) this;
        }

        public Criteria andIfTransIsNotNull() {
            addCriterion("IF_TRANS is not null");
            return (Criteria) this;
        }

        public Criteria andIfTransEqualTo(String value) {
            addCriterion("IF_TRANS =", value, "ifTrans");
            return (Criteria) this;
        }

        public Criteria andIfTransNotEqualTo(String value) {
            addCriterion("IF_TRANS <>", value, "ifTrans");
            return (Criteria) this;
        }

        public Criteria andIfTransGreaterThan(String value) {
            addCriterion("IF_TRANS >", value, "ifTrans");
            return (Criteria) this;
        }

        public Criteria andIfTransGreaterThanOrEqualTo(String value) {
            addCriterion("IF_TRANS >=", value, "ifTrans");
            return (Criteria) this;
        }

        public Criteria andIfTransLessThan(String value) {
            addCriterion("IF_TRANS <", value, "ifTrans");
            return (Criteria) this;
        }

        public Criteria andIfTransLessThanOrEqualTo(String value) {
            addCriterion("IF_TRANS <=", value, "ifTrans");
            return (Criteria) this;
        }

        public Criteria andIfTransLike(String value) {
            addCriterion("IF_TRANS like", value, "ifTrans");
            return (Criteria) this;
        }

        public Criteria andIfTransNotLike(String value) {
            addCriterion("IF_TRANS not like", value, "ifTrans");
            return (Criteria) this;
        }

        public Criteria andIfTransIn(List<String> values) {
            addCriterion("IF_TRANS in", values, "ifTrans");
            return (Criteria) this;
        }

        public Criteria andIfTransNotIn(List<String> values) {
            addCriterion("IF_TRANS not in", values, "ifTrans");
            return (Criteria) this;
        }

        public Criteria andIfTransBetween(String value1, String value2) {
            addCriterion("IF_TRANS between", value1, value2, "ifTrans");
            return (Criteria) this;
        }

        public Criteria andIfTransNotBetween(String value1, String value2) {
            addCriterion("IF_TRANS not between", value1, value2, "ifTrans");
            return (Criteria) this;
        }

        public Criteria andRelActionEventIdIsNull() {
            addCriterion("REL_ACTION_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelActionEventIdIsNotNull() {
            addCriterion("REL_ACTION_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelActionEventIdEqualTo(Long value) {
            addCriterion("REL_ACTION_EVENT_ID =", value, "relActionEventId");
            return (Criteria) this;
        }

        public Criteria andRelActionEventIdNotEqualTo(Long value) {
            addCriterion("REL_ACTION_EVENT_ID <>", value, "relActionEventId");
            return (Criteria) this;
        }

        public Criteria andRelActionEventIdGreaterThan(Long value) {
            addCriterion("REL_ACTION_EVENT_ID >", value, "relActionEventId");
            return (Criteria) this;
        }

        public Criteria andRelActionEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REL_ACTION_EVENT_ID >=", value, "relActionEventId");
            return (Criteria) this;
        }

        public Criteria andRelActionEventIdLessThan(Long value) {
            addCriterion("REL_ACTION_EVENT_ID <", value, "relActionEventId");
            return (Criteria) this;
        }

        public Criteria andRelActionEventIdLessThanOrEqualTo(Long value) {
            addCriterion("REL_ACTION_EVENT_ID <=", value, "relActionEventId");
            return (Criteria) this;
        }

        public Criteria andRelActionEventIdIn(List<Long> values) {
            addCriterion("REL_ACTION_EVENT_ID in", values, "relActionEventId");
            return (Criteria) this;
        }

        public Criteria andRelActionEventIdNotIn(List<Long> values) {
            addCriterion("REL_ACTION_EVENT_ID not in", values, "relActionEventId");
            return (Criteria) this;
        }

        public Criteria andRelActionEventIdBetween(Long value1, Long value2) {
            addCriterion("REL_ACTION_EVENT_ID between", value1, value2, "relActionEventId");
            return (Criteria) this;
        }

        public Criteria andRelActionEventIdNotBetween(Long value1, Long value2) {
            addCriterion("REL_ACTION_EVENT_ID not between", value1, value2, "relActionEventId");
            return (Criteria) this;
        }

        public Criteria andRecvTimeIsNull() {
            addCriterion("RECV_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecvTimeIsNotNull() {
            addCriterion("RECV_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecvTimeEqualTo(Date value) {
            addCriterionForJDBCDate("RECV_TIME =", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("RECV_TIME <>", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("RECV_TIME >", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECV_TIME >=", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeLessThan(Date value) {
            addCriterionForJDBCDate("RECV_TIME <", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECV_TIME <=", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeIn(List<Date> values) {
            addCriterionForJDBCDate("RECV_TIME in", values, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("RECV_TIME not in", values, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECV_TIME between", value1, value2, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECV_TIME not between", value1, value2, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeIsNull() {
            addCriterion("RECV_EPARCHY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeIsNotNull() {
            addCriterion("RECV_EPARCHY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeEqualTo(String value) {
            addCriterion("RECV_EPARCHY_CODE =", value, "recvEparchyCode");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeNotEqualTo(String value) {
            addCriterion("RECV_EPARCHY_CODE <>", value, "recvEparchyCode");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeGreaterThan(String value) {
            addCriterion("RECV_EPARCHY_CODE >", value, "recvEparchyCode");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RECV_EPARCHY_CODE >=", value, "recvEparchyCode");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeLessThan(String value) {
            addCriterion("RECV_EPARCHY_CODE <", value, "recvEparchyCode");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeLessThanOrEqualTo(String value) {
            addCriterion("RECV_EPARCHY_CODE <=", value, "recvEparchyCode");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeLike(String value) {
            addCriterion("RECV_EPARCHY_CODE like", value, "recvEparchyCode");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeNotLike(String value) {
            addCriterion("RECV_EPARCHY_CODE not like", value, "recvEparchyCode");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeIn(List<String> values) {
            addCriterion("RECV_EPARCHY_CODE in", values, "recvEparchyCode");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeNotIn(List<String> values) {
            addCriterion("RECV_EPARCHY_CODE not in", values, "recvEparchyCode");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeBetween(String value1, String value2) {
            addCriterion("RECV_EPARCHY_CODE between", value1, value2, "recvEparchyCode");
            return (Criteria) this;
        }

        public Criteria andRecvEparchyCodeNotBetween(String value1, String value2) {
            addCriterion("RECV_EPARCHY_CODE not between", value1, value2, "recvEparchyCode");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeIsNull() {
            addCriterion("RECV_CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeIsNotNull() {
            addCriterion("RECV_CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeEqualTo(String value) {
            addCriterion("RECV_CITY_CODE =", value, "recvCityCode");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeNotEqualTo(String value) {
            addCriterion("RECV_CITY_CODE <>", value, "recvCityCode");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeGreaterThan(String value) {
            addCriterion("RECV_CITY_CODE >", value, "recvCityCode");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RECV_CITY_CODE >=", value, "recvCityCode");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeLessThan(String value) {
            addCriterion("RECV_CITY_CODE <", value, "recvCityCode");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeLessThanOrEqualTo(String value) {
            addCriterion("RECV_CITY_CODE <=", value, "recvCityCode");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeLike(String value) {
            addCriterion("RECV_CITY_CODE like", value, "recvCityCode");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeNotLike(String value) {
            addCriterion("RECV_CITY_CODE not like", value, "recvCityCode");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeIn(List<String> values) {
            addCriterion("RECV_CITY_CODE in", values, "recvCityCode");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeNotIn(List<String> values) {
            addCriterion("RECV_CITY_CODE not in", values, "recvCityCode");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeBetween(String value1, String value2) {
            addCriterion("RECV_CITY_CODE between", value1, value2, "recvCityCode");
            return (Criteria) this;
        }

        public Criteria andRecvCityCodeNotBetween(String value1, String value2) {
            addCriterion("RECV_CITY_CODE not between", value1, value2, "recvCityCode");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdIsNull() {
            addCriterion("RECV_DEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdIsNotNull() {
            addCriterion("RECV_DEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdEqualTo(String value) {
            addCriterion("RECV_DEPART_ID =", value, "recvDepartId");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdNotEqualTo(String value) {
            addCriterion("RECV_DEPART_ID <>", value, "recvDepartId");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdGreaterThan(String value) {
            addCriterion("RECV_DEPART_ID >", value, "recvDepartId");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECV_DEPART_ID >=", value, "recvDepartId");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdLessThan(String value) {
            addCriterion("RECV_DEPART_ID <", value, "recvDepartId");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdLessThanOrEqualTo(String value) {
            addCriterion("RECV_DEPART_ID <=", value, "recvDepartId");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdLike(String value) {
            addCriterion("RECV_DEPART_ID like", value, "recvDepartId");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdNotLike(String value) {
            addCriterion("RECV_DEPART_ID not like", value, "recvDepartId");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdIn(List<String> values) {
            addCriterion("RECV_DEPART_ID in", values, "recvDepartId");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdNotIn(List<String> values) {
            addCriterion("RECV_DEPART_ID not in", values, "recvDepartId");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdBetween(String value1, String value2) {
            addCriterion("RECV_DEPART_ID between", value1, value2, "recvDepartId");
            return (Criteria) this;
        }

        public Criteria andRecvDepartIdNotBetween(String value1, String value2) {
            addCriterion("RECV_DEPART_ID not between", value1, value2, "recvDepartId");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdIsNull() {
            addCriterion("RECV_STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdIsNotNull() {
            addCriterion("RECV_STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdEqualTo(String value) {
            addCriterion("RECV_STAFF_ID =", value, "recvStaffId");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdNotEqualTo(String value) {
            addCriterion("RECV_STAFF_ID <>", value, "recvStaffId");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdGreaterThan(String value) {
            addCriterion("RECV_STAFF_ID >", value, "recvStaffId");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECV_STAFF_ID >=", value, "recvStaffId");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdLessThan(String value) {
            addCriterion("RECV_STAFF_ID <", value, "recvStaffId");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdLessThanOrEqualTo(String value) {
            addCriterion("RECV_STAFF_ID <=", value, "recvStaffId");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdLike(String value) {
            addCriterion("RECV_STAFF_ID like", value, "recvStaffId");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdNotLike(String value) {
            addCriterion("RECV_STAFF_ID not like", value, "recvStaffId");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdIn(List<String> values) {
            addCriterion("RECV_STAFF_ID in", values, "recvStaffId");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdNotIn(List<String> values) {
            addCriterion("RECV_STAFF_ID not in", values, "recvStaffId");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdBetween(String value1, String value2) {
            addCriterion("RECV_STAFF_ID between", value1, value2, "recvStaffId");
            return (Criteria) this;
        }

        public Criteria andRecvStaffIdNotBetween(String value1, String value2) {
            addCriterion("RECV_STAFF_ID not between", value1, value2, "recvStaffId");
            return (Criteria) this;
        }

        public Criteria andCanUseTagIsNull() {
            addCriterion("CAN_USE_TAG is null");
            return (Criteria) this;
        }

        public Criteria andCanUseTagIsNotNull() {
            addCriterion("CAN_USE_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andCanUseTagEqualTo(String value) {
            addCriterion("CAN_USE_TAG =", value, "canUseTag");
            return (Criteria) this;
        }

        public Criteria andCanUseTagNotEqualTo(String value) {
            addCriterion("CAN_USE_TAG <>", value, "canUseTag");
            return (Criteria) this;
        }

        public Criteria andCanUseTagGreaterThan(String value) {
            addCriterion("CAN_USE_TAG >", value, "canUseTag");
            return (Criteria) this;
        }

        public Criteria andCanUseTagGreaterThanOrEqualTo(String value) {
            addCriterion("CAN_USE_TAG >=", value, "canUseTag");
            return (Criteria) this;
        }

        public Criteria andCanUseTagLessThan(String value) {
            addCriterion("CAN_USE_TAG <", value, "canUseTag");
            return (Criteria) this;
        }

        public Criteria andCanUseTagLessThanOrEqualTo(String value) {
            addCriterion("CAN_USE_TAG <=", value, "canUseTag");
            return (Criteria) this;
        }

        public Criteria andCanUseTagLike(String value) {
            addCriterion("CAN_USE_TAG like", value, "canUseTag");
            return (Criteria) this;
        }

        public Criteria andCanUseTagNotLike(String value) {
            addCriterion("CAN_USE_TAG not like", value, "canUseTag");
            return (Criteria) this;
        }

        public Criteria andCanUseTagIn(List<String> values) {
            addCriterion("CAN_USE_TAG in", values, "canUseTag");
            return (Criteria) this;
        }

        public Criteria andCanUseTagNotIn(List<String> values) {
            addCriterion("CAN_USE_TAG not in", values, "canUseTag");
            return (Criteria) this;
        }

        public Criteria andCanUseTagBetween(String value1, String value2) {
            addCriterion("CAN_USE_TAG between", value1, value2, "canUseTag");
            return (Criteria) this;
        }

        public Criteria andCanUseTagNotBetween(String value1, String value2) {
            addCriterion("CAN_USE_TAG not between", value1, value2, "canUseTag");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoIsNull() {
            addCriterion("RSRV_INFO is null");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoIsNotNull() {
            addCriterion("RSRV_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoEqualTo(String value) {
            addCriterion("RSRV_INFO =", value, "rsrvInfo");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoNotEqualTo(String value) {
            addCriterion("RSRV_INFO <>", value, "rsrvInfo");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoGreaterThan(String value) {
            addCriterion("RSRV_INFO >", value, "rsrvInfo");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoGreaterThanOrEqualTo(String value) {
            addCriterion("RSRV_INFO >=", value, "rsrvInfo");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoLessThan(String value) {
            addCriterion("RSRV_INFO <", value, "rsrvInfo");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoLessThanOrEqualTo(String value) {
            addCriterion("RSRV_INFO <=", value, "rsrvInfo");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoLike(String value) {
            addCriterion("RSRV_INFO like", value, "rsrvInfo");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoNotLike(String value) {
            addCriterion("RSRV_INFO not like", value, "rsrvInfo");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoIn(List<String> values) {
            addCriterion("RSRV_INFO in", values, "rsrvInfo");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoNotIn(List<String> values) {
            addCriterion("RSRV_INFO not in", values, "rsrvInfo");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoBetween(String value1, String value2) {
            addCriterion("RSRV_INFO between", value1, value2, "rsrvInfo");
            return (Criteria) this;
        }

        public Criteria andRsrvInfoNotBetween(String value1, String value2) {
            addCriterion("RSRV_INFO not between", value1, value2, "rsrvInfo");
            return (Criteria) this;
        }

        public Criteria andRsrvFeeIsNull() {
            addCriterion("RSRV_FEE is null");
            return (Criteria) this;
        }

        public Criteria andRsrvFeeIsNotNull() {
            addCriterion("RSRV_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andRsrvFeeEqualTo(Long value) {
            addCriterion("RSRV_FEE =", value, "rsrvFee");
            return (Criteria) this;
        }

        public Criteria andRsrvFeeNotEqualTo(Long value) {
            addCriterion("RSRV_FEE <>", value, "rsrvFee");
            return (Criteria) this;
        }

        public Criteria andRsrvFeeGreaterThan(Long value) {
            addCriterion("RSRV_FEE >", value, "rsrvFee");
            return (Criteria) this;
        }

        public Criteria andRsrvFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("RSRV_FEE >=", value, "rsrvFee");
            return (Criteria) this;
        }

        public Criteria andRsrvFeeLessThan(Long value) {
            addCriterion("RSRV_FEE <", value, "rsrvFee");
            return (Criteria) this;
        }

        public Criteria andRsrvFeeLessThanOrEqualTo(Long value) {
            addCriterion("RSRV_FEE <=", value, "rsrvFee");
            return (Criteria) this;
        }

        public Criteria andRsrvFeeIn(List<Long> values) {
            addCriterion("RSRV_FEE in", values, "rsrvFee");
            return (Criteria) this;
        }

        public Criteria andRsrvFeeNotIn(List<Long> values) {
            addCriterion("RSRV_FEE not in", values, "rsrvFee");
            return (Criteria) this;
        }

        public Criteria andRsrvFeeBetween(Long value1, Long value2) {
            addCriterion("RSRV_FEE between", value1, value2, "rsrvFee");
            return (Criteria) this;
        }

        public Criteria andRsrvFeeNotBetween(Long value1, Long value2) {
            addCriterion("RSRV_FEE not between", value1, value2, "rsrvFee");
            return (Criteria) this;
        }

        public Criteria andCancelTagIsNull() {
            addCriterion("CANCEL_TAG is null");
            return (Criteria) this;
        }

        public Criteria andCancelTagIsNotNull() {
            addCriterion("CANCEL_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTagEqualTo(String value) {
            addCriterion("CANCEL_TAG =", value, "cancelTag");
            return (Criteria) this;
        }

        public Criteria andCancelTagNotEqualTo(String value) {
            addCriterion("CANCEL_TAG <>", value, "cancelTag");
            return (Criteria) this;
        }

        public Criteria andCancelTagGreaterThan(String value) {
            addCriterion("CANCEL_TAG >", value, "cancelTag");
            return (Criteria) this;
        }

        public Criteria andCancelTagGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_TAG >=", value, "cancelTag");
            return (Criteria) this;
        }

        public Criteria andCancelTagLessThan(String value) {
            addCriterion("CANCEL_TAG <", value, "cancelTag");
            return (Criteria) this;
        }

        public Criteria andCancelTagLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_TAG <=", value, "cancelTag");
            return (Criteria) this;
        }

        public Criteria andCancelTagLike(String value) {
            addCriterion("CANCEL_TAG like", value, "cancelTag");
            return (Criteria) this;
        }

        public Criteria andCancelTagNotLike(String value) {
            addCriterion("CANCEL_TAG not like", value, "cancelTag");
            return (Criteria) this;
        }

        public Criteria andCancelTagIn(List<String> values) {
            addCriterion("CANCEL_TAG in", values, "cancelTag");
            return (Criteria) this;
        }

        public Criteria andCancelTagNotIn(List<String> values) {
            addCriterion("CANCEL_TAG not in", values, "cancelTag");
            return (Criteria) this;
        }

        public Criteria andCancelTagBetween(String value1, String value2) {
            addCriterion("CANCEL_TAG between", value1, value2, "cancelTag");
            return (Criteria) this;
        }

        public Criteria andCancelTagNotBetween(String value1, String value2) {
            addCriterion("CANCEL_TAG not between", value1, value2, "cancelTag");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNull() {
            addCriterion("VERSION_NO is null");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNotNull() {
            addCriterion("VERSION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(Short value) {
            addCriterion("VERSION_NO =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Short value) {
            addCriterion("VERSION_NO <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Short value) {
            addCriterion("VERSION_NO >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Short value) {
            addCriterion("VERSION_NO >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Short value) {
            addCriterion("VERSION_NO <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Short value) {
            addCriterion("VERSION_NO <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<Short> values) {
            addCriterion("VERSION_NO in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<Short> values) {
            addCriterion("VERSION_NO not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(Short value1, Short value2) {
            addCriterion("VERSION_NO between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(Short value1, Short value2) {
            addCriterion("VERSION_NO not between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andSumConsumeIsNull() {
            addCriterion("SUM_CONSUME is null");
            return (Criteria) this;
        }

        public Criteria andSumConsumeIsNotNull() {
            addCriterion("SUM_CONSUME is not null");
            return (Criteria) this;
        }

        public Criteria andSumConsumeEqualTo(Long value) {
            addCriterion("SUM_CONSUME =", value, "sumConsume");
            return (Criteria) this;
        }

        public Criteria andSumConsumeNotEqualTo(Long value) {
            addCriterion("SUM_CONSUME <>", value, "sumConsume");
            return (Criteria) this;
        }

        public Criteria andSumConsumeGreaterThan(Long value) {
            addCriterion("SUM_CONSUME >", value, "sumConsume");
            return (Criteria) this;
        }

        public Criteria andSumConsumeGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_CONSUME >=", value, "sumConsume");
            return (Criteria) this;
        }

        public Criteria andSumConsumeLessThan(Long value) {
            addCriterion("SUM_CONSUME <", value, "sumConsume");
            return (Criteria) this;
        }

        public Criteria andSumConsumeLessThanOrEqualTo(Long value) {
            addCriterion("SUM_CONSUME <=", value, "sumConsume");
            return (Criteria) this;
        }

        public Criteria andSumConsumeIn(List<Long> values) {
            addCriterion("SUM_CONSUME in", values, "sumConsume");
            return (Criteria) this;
        }

        public Criteria andSumConsumeNotIn(List<Long> values) {
            addCriterion("SUM_CONSUME not in", values, "sumConsume");
            return (Criteria) this;
        }

        public Criteria andSumConsumeBetween(Long value1, Long value2) {
            addCriterion("SUM_CONSUME between", value1, value2, "sumConsume");
            return (Criteria) this;
        }

        public Criteria andSumConsumeNotBetween(Long value1, Long value2) {
            addCriterion("SUM_CONSUME not between", value1, value2, "sumConsume");
            return (Criteria) this;
        }

        public Criteria andResultInfoIsNull() {
            addCriterion("RESULT_INFO is null");
            return (Criteria) this;
        }

        public Criteria andResultInfoIsNotNull() {
            addCriterion("RESULT_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andResultInfoEqualTo(String value) {
            addCriterion("RESULT_INFO =", value, "resultInfo");
            return (Criteria) this;
        }

        public Criteria andResultInfoNotEqualTo(String value) {
            addCriterion("RESULT_INFO <>", value, "resultInfo");
            return (Criteria) this;
        }

        public Criteria andResultInfoGreaterThan(String value) {
            addCriterion("RESULT_INFO >", value, "resultInfo");
            return (Criteria) this;
        }

        public Criteria andResultInfoGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_INFO >=", value, "resultInfo");
            return (Criteria) this;
        }

        public Criteria andResultInfoLessThan(String value) {
            addCriterion("RESULT_INFO <", value, "resultInfo");
            return (Criteria) this;
        }

        public Criteria andResultInfoLessThanOrEqualTo(String value) {
            addCriterion("RESULT_INFO <=", value, "resultInfo");
            return (Criteria) this;
        }

        public Criteria andResultInfoLike(String value) {
            addCriterion("RESULT_INFO like", value, "resultInfo");
            return (Criteria) this;
        }

        public Criteria andResultInfoNotLike(String value) {
            addCriterion("RESULT_INFO not like", value, "resultInfo");
            return (Criteria) this;
        }

        public Criteria andResultInfoIn(List<String> values) {
            addCriterion("RESULT_INFO in", values, "resultInfo");
            return (Criteria) this;
        }

        public Criteria andResultInfoNotIn(List<String> values) {
            addCriterion("RESULT_INFO not in", values, "resultInfo");
            return (Criteria) this;
        }

        public Criteria andResultInfoBetween(String value1, String value2) {
            addCriterion("RESULT_INFO between", value1, value2, "resultInfo");
            return (Criteria) this;
        }

        public Criteria andResultInfoNotBetween(String value1, String value2) {
            addCriterion("RESULT_INFO not between", value1, value2, "resultInfo");
            return (Criteria) this;
        }

        public Criteria andCanPreTransIsNull() {
            addCriterion("CAN_PRE_TRANS is null");
            return (Criteria) this;
        }

        public Criteria andCanPreTransIsNotNull() {
            addCriterion("CAN_PRE_TRANS is not null");
            return (Criteria) this;
        }

        public Criteria andCanPreTransEqualTo(String value) {
            addCriterion("CAN_PRE_TRANS =", value, "canPreTrans");
            return (Criteria) this;
        }

        public Criteria andCanPreTransNotEqualTo(String value) {
            addCriterion("CAN_PRE_TRANS <>", value, "canPreTrans");
            return (Criteria) this;
        }

        public Criteria andCanPreTransGreaterThan(String value) {
            addCriterion("CAN_PRE_TRANS >", value, "canPreTrans");
            return (Criteria) this;
        }

        public Criteria andCanPreTransGreaterThanOrEqualTo(String value) {
            addCriterion("CAN_PRE_TRANS >=", value, "canPreTrans");
            return (Criteria) this;
        }

        public Criteria andCanPreTransLessThan(String value) {
            addCriterion("CAN_PRE_TRANS <", value, "canPreTrans");
            return (Criteria) this;
        }

        public Criteria andCanPreTransLessThanOrEqualTo(String value) {
            addCriterion("CAN_PRE_TRANS <=", value, "canPreTrans");
            return (Criteria) this;
        }

        public Criteria andCanPreTransLike(String value) {
            addCriterion("CAN_PRE_TRANS like", value, "canPreTrans");
            return (Criteria) this;
        }

        public Criteria andCanPreTransNotLike(String value) {
            addCriterion("CAN_PRE_TRANS not like", value, "canPreTrans");
            return (Criteria) this;
        }

        public Criteria andCanPreTransIn(List<String> values) {
            addCriterion("CAN_PRE_TRANS in", values, "canPreTrans");
            return (Criteria) this;
        }

        public Criteria andCanPreTransNotIn(List<String> values) {
            addCriterion("CAN_PRE_TRANS not in", values, "canPreTrans");
            return (Criteria) this;
        }

        public Criteria andCanPreTransBetween(String value1, String value2) {
            addCriterion("CAN_PRE_TRANS between", value1, value2, "canPreTrans");
            return (Criteria) this;
        }

        public Criteria andCanPreTransNotBetween(String value1, String value2) {
            addCriterion("CAN_PRE_TRANS not between", value1, value2, "canPreTrans");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeIsNull() {
            addCriterion("NET_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeIsNotNull() {
            addCriterion("NET_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeEqualTo(String value) {
            addCriterion("NET_TYPE_CODE =", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeNotEqualTo(String value) {
            addCriterion("NET_TYPE_CODE <>", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeGreaterThan(String value) {
            addCriterion("NET_TYPE_CODE >", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NET_TYPE_CODE >=", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeLessThan(String value) {
            addCriterion("NET_TYPE_CODE <", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("NET_TYPE_CODE <=", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeLike(String value) {
            addCriterion("NET_TYPE_CODE like", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeNotLike(String value) {
            addCriterion("NET_TYPE_CODE not like", value, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeIn(List<String> values) {
            addCriterion("NET_TYPE_CODE in", values, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeNotIn(List<String> values) {
            addCriterion("NET_TYPE_CODE not in", values, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeBetween(String value1, String value2) {
            addCriterion("NET_TYPE_CODE between", value1, value2, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andNetTypeCodeNotBetween(String value1, String value2) {
            addCriterion("NET_TYPE_CODE not between", value1, value2, "netTypeCode");
            return (Criteria) this;
        }

        public Criteria andDepositCodeIsNull() {
            addCriterion("DEPOSIT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDepositCodeIsNotNull() {
            addCriterion("DEPOSIT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDepositCodeEqualTo(Integer value) {
            addCriterion("DEPOSIT_CODE =", value, "depositCode");
            return (Criteria) this;
        }

        public Criteria andDepositCodeNotEqualTo(Integer value) {
            addCriterion("DEPOSIT_CODE <>", value, "depositCode");
            return (Criteria) this;
        }

        public Criteria andDepositCodeGreaterThan(Integer value) {
            addCriterion("DEPOSIT_CODE >", value, "depositCode");
            return (Criteria) this;
        }

        public Criteria andDepositCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPOSIT_CODE >=", value, "depositCode");
            return (Criteria) this;
        }

        public Criteria andDepositCodeLessThan(Integer value) {
            addCriterion("DEPOSIT_CODE <", value, "depositCode");
            return (Criteria) this;
        }

        public Criteria andDepositCodeLessThanOrEqualTo(Integer value) {
            addCriterion("DEPOSIT_CODE <=", value, "depositCode");
            return (Criteria) this;
        }

        public Criteria andDepositCodeIn(List<Integer> values) {
            addCriterion("DEPOSIT_CODE in", values, "depositCode");
            return (Criteria) this;
        }

        public Criteria andDepositCodeNotIn(List<Integer> values) {
            addCriterion("DEPOSIT_CODE not in", values, "depositCode");
            return (Criteria) this;
        }

        public Criteria andDepositCodeBetween(Integer value1, Integer value2) {
            addCriterion("DEPOSIT_CODE between", value1, value2, "depositCode");
            return (Criteria) this;
        }

        public Criteria andDepositCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPOSIT_CODE not between", value1, value2, "depositCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIsNull() {
            addCriterion("DISCOUNT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIsNotNull() {
            addCriterion("DISCOUNT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeEqualTo(Long value) {
            addCriterion("DISCOUNT_CODE =", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotEqualTo(Long value) {
            addCriterion("DISCOUNT_CODE <>", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeGreaterThan(Long value) {
            addCriterion("DISCOUNT_CODE >", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("DISCOUNT_CODE >=", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLessThan(Long value) {
            addCriterion("DISCOUNT_CODE <", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLessThanOrEqualTo(Long value) {
            addCriterion("DISCOUNT_CODE <=", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIn(List<Long> values) {
            addCriterion("DISCOUNT_CODE in", values, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotIn(List<Long> values) {
            addCriterion("DISCOUNT_CODE not in", values, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeBetween(Long value1, Long value2) {
            addCriterion("DISCOUNT_CODE between", value1, value2, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotBetween(Long value1, Long value2) {
            addCriterion("DISCOUNT_CODE not between", value1, value2, "discountCode");
            return (Criteria) this;
        }

        public Criteria andRsrvDate1IsNull() {
            addCriterion("RSRV_DATE1 is null");
            return (Criteria) this;
        }

        public Criteria andRsrvDate1IsNotNull() {
            addCriterion("RSRV_DATE1 is not null");
            return (Criteria) this;
        }

        public Criteria andRsrvDate1EqualTo(Date value) {
            addCriterionForJDBCDate("RSRV_DATE1 =", value, "rsrvDate1");
            return (Criteria) this;
        }

        public Criteria andRsrvDate1NotEqualTo(Date value) {
            addCriterionForJDBCDate("RSRV_DATE1 <>", value, "rsrvDate1");
            return (Criteria) this;
        }

        public Criteria andRsrvDate1GreaterThan(Date value) {
            addCriterionForJDBCDate("RSRV_DATE1 >", value, "rsrvDate1");
            return (Criteria) this;
        }

        public Criteria andRsrvDate1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RSRV_DATE1 >=", value, "rsrvDate1");
            return (Criteria) this;
        }

        public Criteria andRsrvDate1LessThan(Date value) {
            addCriterionForJDBCDate("RSRV_DATE1 <", value, "rsrvDate1");
            return (Criteria) this;
        }

        public Criteria andRsrvDate1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RSRV_DATE1 <=", value, "rsrvDate1");
            return (Criteria) this;
        }

        public Criteria andRsrvDate1In(List<Date> values) {
            addCriterionForJDBCDate("RSRV_DATE1 in", values, "rsrvDate1");
            return (Criteria) this;
        }

        public Criteria andRsrvDate1NotIn(List<Date> values) {
            addCriterionForJDBCDate("RSRV_DATE1 not in", values, "rsrvDate1");
            return (Criteria) this;
        }

        public Criteria andRsrvDate1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("RSRV_DATE1 between", value1, value2, "rsrvDate1");
            return (Criteria) this;
        }

        public Criteria andRsrvDate1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RSRV_DATE1 not between", value1, value2, "rsrvDate1");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNull() {
            addCriterion("ACTIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNotNull() {
            addCriterion("ACTIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ACTIVE_TIME =", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACTIVE_TIME <>", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ACTIVE_TIME >", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTIVE_TIME >=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThan(Date value) {
            addCriterionForJDBCDate("ACTIVE_TIME <", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTIVE_TIME <=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ACTIVE_TIME in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACTIVE_TIME not in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTIVE_TIME between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTIVE_TIME not between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdIsNull() {
            addCriterion("CANCEL_STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdIsNotNull() {
            addCriterion("CANCEL_STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdEqualTo(String value) {
            addCriterion("CANCEL_STAFF_ID =", value, "cancelStaffId");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdNotEqualTo(String value) {
            addCriterion("CANCEL_STAFF_ID <>", value, "cancelStaffId");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdGreaterThan(String value) {
            addCriterion("CANCEL_STAFF_ID >", value, "cancelStaffId");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_STAFF_ID >=", value, "cancelStaffId");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdLessThan(String value) {
            addCriterion("CANCEL_STAFF_ID <", value, "cancelStaffId");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_STAFF_ID <=", value, "cancelStaffId");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdLike(String value) {
            addCriterion("CANCEL_STAFF_ID like", value, "cancelStaffId");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdNotLike(String value) {
            addCriterion("CANCEL_STAFF_ID not like", value, "cancelStaffId");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdIn(List<String> values) {
            addCriterion("CANCEL_STAFF_ID in", values, "cancelStaffId");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdNotIn(List<String> values) {
            addCriterion("CANCEL_STAFF_ID not in", values, "cancelStaffId");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdBetween(String value1, String value2) {
            addCriterion("CANCEL_STAFF_ID between", value1, value2, "cancelStaffId");
            return (Criteria) this;
        }

        public Criteria andCancelStaffIdNotBetween(String value1, String value2) {
            addCriterion("CANCEL_STAFF_ID not between", value1, value2, "cancelStaffId");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdIsNull() {
            addCriterion("CANCEL_DEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdIsNotNull() {
            addCriterion("CANCEL_DEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdEqualTo(String value) {
            addCriterion("CANCEL_DEPART_ID =", value, "cancelDepartId");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdNotEqualTo(String value) {
            addCriterion("CANCEL_DEPART_ID <>", value, "cancelDepartId");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdGreaterThan(String value) {
            addCriterion("CANCEL_DEPART_ID >", value, "cancelDepartId");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_DEPART_ID >=", value, "cancelDepartId");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdLessThan(String value) {
            addCriterion("CANCEL_DEPART_ID <", value, "cancelDepartId");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_DEPART_ID <=", value, "cancelDepartId");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdLike(String value) {
            addCriterion("CANCEL_DEPART_ID like", value, "cancelDepartId");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdNotLike(String value) {
            addCriterion("CANCEL_DEPART_ID not like", value, "cancelDepartId");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdIn(List<String> values) {
            addCriterion("CANCEL_DEPART_ID in", values, "cancelDepartId");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdNotIn(List<String> values) {
            addCriterion("CANCEL_DEPART_ID not in", values, "cancelDepartId");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdBetween(String value1, String value2) {
            addCriterion("CANCEL_DEPART_ID between", value1, value2, "cancelDepartId");
            return (Criteria) this;
        }

        public Criteria andCancelDepartIdNotBetween(String value1, String value2) {
            addCriterion("CANCEL_DEPART_ID not between", value1, value2, "cancelDepartId");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeIsNull() {
            addCriterion("CANCEL_CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeIsNotNull() {
            addCriterion("CANCEL_CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeEqualTo(String value) {
            addCriterion("CANCEL_CITY_CODE =", value, "cancelCityCode");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeNotEqualTo(String value) {
            addCriterion("CANCEL_CITY_CODE <>", value, "cancelCityCode");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeGreaterThan(String value) {
            addCriterion("CANCEL_CITY_CODE >", value, "cancelCityCode");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_CITY_CODE >=", value, "cancelCityCode");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeLessThan(String value) {
            addCriterion("CANCEL_CITY_CODE <", value, "cancelCityCode");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_CITY_CODE <=", value, "cancelCityCode");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeLike(String value) {
            addCriterion("CANCEL_CITY_CODE like", value, "cancelCityCode");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeNotLike(String value) {
            addCriterion("CANCEL_CITY_CODE not like", value, "cancelCityCode");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeIn(List<String> values) {
            addCriterion("CANCEL_CITY_CODE in", values, "cancelCityCode");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeNotIn(List<String> values) {
            addCriterion("CANCEL_CITY_CODE not in", values, "cancelCityCode");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeBetween(String value1, String value2) {
            addCriterion("CANCEL_CITY_CODE between", value1, value2, "cancelCityCode");
            return (Criteria) this;
        }

        public Criteria andCancelCityCodeNotBetween(String value1, String value2) {
            addCriterion("CANCEL_CITY_CODE not between", value1, value2, "cancelCityCode");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeIsNull() {
            addCriterion("CANCEL_EPARCHY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeIsNotNull() {
            addCriterion("CANCEL_EPARCHY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeEqualTo(String value) {
            addCriterion("CANCEL_EPARCHY_CODE =", value, "cancelEparchyCode");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeNotEqualTo(String value) {
            addCriterion("CANCEL_EPARCHY_CODE <>", value, "cancelEparchyCode");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeGreaterThan(String value) {
            addCriterion("CANCEL_EPARCHY_CODE >", value, "cancelEparchyCode");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_EPARCHY_CODE >=", value, "cancelEparchyCode");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeLessThan(String value) {
            addCriterion("CANCEL_EPARCHY_CODE <", value, "cancelEparchyCode");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_EPARCHY_CODE <=", value, "cancelEparchyCode");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeLike(String value) {
            addCriterion("CANCEL_EPARCHY_CODE like", value, "cancelEparchyCode");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeNotLike(String value) {
            addCriterion("CANCEL_EPARCHY_CODE not like", value, "cancelEparchyCode");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeIn(List<String> values) {
            addCriterion("CANCEL_EPARCHY_CODE in", values, "cancelEparchyCode");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeNotIn(List<String> values) {
            addCriterion("CANCEL_EPARCHY_CODE not in", values, "cancelEparchyCode");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeBetween(String value1, String value2) {
            addCriterion("CANCEL_EPARCHY_CODE between", value1, value2, "cancelEparchyCode");
            return (Criteria) this;
        }

        public Criteria andCancelEparchyCodeNotBetween(String value1, String value2) {
            addCriterion("CANCEL_EPARCHY_CODE not between", value1, value2, "cancelEparchyCode");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CANCEL_TIME =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CANCEL_TIME <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CANCEL_TIME >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CANCEL_TIME >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterionForJDBCDate("CANCEL_TIME <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CANCEL_TIME <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CANCEL_TIME in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CANCEL_TIME not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CANCEL_TIME between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CANCEL_TIME not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andNextDateIsNull() {
            addCriterion("NEXT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNextDateIsNotNull() {
            addCriterion("NEXT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNextDateEqualTo(Date value) {
            addCriterionForJDBCDate("NEXT_DATE =", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("NEXT_DATE <>", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateGreaterThan(Date value) {
            addCriterionForJDBCDate("NEXT_DATE >", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NEXT_DATE >=", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateLessThan(Date value) {
            addCriterionForJDBCDate("NEXT_DATE <", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NEXT_DATE <=", value, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateIn(List<Date> values) {
            addCriterionForJDBCDate("NEXT_DATE in", values, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("NEXT_DATE not in", values, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NEXT_DATE between", value1, value2, "nextDate");
            return (Criteria) this;
        }

        public Criteria andNextDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NEXT_DATE not between", value1, value2, "nextDate");
            return (Criteria) this;
        }

        public Criteria andPDepositCodeIsNull() {
            addCriterion("P_DEPOSIT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPDepositCodeIsNotNull() {
            addCriterion("P_DEPOSIT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPDepositCodeEqualTo(Integer value) {
            addCriterion("P_DEPOSIT_CODE =", value, "pDepositCode");
            return (Criteria) this;
        }

        public Criteria andPDepositCodeNotEqualTo(Integer value) {
            addCriterion("P_DEPOSIT_CODE <>", value, "pDepositCode");
            return (Criteria) this;
        }

        public Criteria andPDepositCodeGreaterThan(Integer value) {
            addCriterion("P_DEPOSIT_CODE >", value, "pDepositCode");
            return (Criteria) this;
        }

        public Criteria andPDepositCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_DEPOSIT_CODE >=", value, "pDepositCode");
            return (Criteria) this;
        }

        public Criteria andPDepositCodeLessThan(Integer value) {
            addCriterion("P_DEPOSIT_CODE <", value, "pDepositCode");
            return (Criteria) this;
        }

        public Criteria andPDepositCodeLessThanOrEqualTo(Integer value) {
            addCriterion("P_DEPOSIT_CODE <=", value, "pDepositCode");
            return (Criteria) this;
        }

        public Criteria andPDepositCodeIn(List<Integer> values) {
            addCriterion("P_DEPOSIT_CODE in", values, "pDepositCode");
            return (Criteria) this;
        }

        public Criteria andPDepositCodeNotIn(List<Integer> values) {
            addCriterion("P_DEPOSIT_CODE not in", values, "pDepositCode");
            return (Criteria) this;
        }

        public Criteria andPDepositCodeBetween(Integer value1, Integer value2) {
            addCriterion("P_DEPOSIT_CODE between", value1, value2, "pDepositCode");
            return (Criteria) this;
        }

        public Criteria andPDepositCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("P_DEPOSIT_CODE not between", value1, value2, "pDepositCode");
            return (Criteria) this;
        }

        public Criteria andIfStopTransIsNull() {
            addCriterion("IF_STOP_TRANS is null");
            return (Criteria) this;
        }

        public Criteria andIfStopTransIsNotNull() {
            addCriterion("IF_STOP_TRANS is not null");
            return (Criteria) this;
        }

        public Criteria andIfStopTransEqualTo(String value) {
            addCriterion("IF_STOP_TRANS =", value, "ifStopTrans");
            return (Criteria) this;
        }

        public Criteria andIfStopTransNotEqualTo(String value) {
            addCriterion("IF_STOP_TRANS <>", value, "ifStopTrans");
            return (Criteria) this;
        }

        public Criteria andIfStopTransGreaterThan(String value) {
            addCriterion("IF_STOP_TRANS >", value, "ifStopTrans");
            return (Criteria) this;
        }

        public Criteria andIfStopTransGreaterThanOrEqualTo(String value) {
            addCriterion("IF_STOP_TRANS >=", value, "ifStopTrans");
            return (Criteria) this;
        }

        public Criteria andIfStopTransLessThan(String value) {
            addCriterion("IF_STOP_TRANS <", value, "ifStopTrans");
            return (Criteria) this;
        }

        public Criteria andIfStopTransLessThanOrEqualTo(String value) {
            addCriterion("IF_STOP_TRANS <=", value, "ifStopTrans");
            return (Criteria) this;
        }

        public Criteria andIfStopTransLike(String value) {
            addCriterion("IF_STOP_TRANS like", value, "ifStopTrans");
            return (Criteria) this;
        }

        public Criteria andIfStopTransNotLike(String value) {
            addCriterion("IF_STOP_TRANS not like", value, "ifStopTrans");
            return (Criteria) this;
        }

        public Criteria andIfStopTransIn(List<String> values) {
            addCriterion("IF_STOP_TRANS in", values, "ifStopTrans");
            return (Criteria) this;
        }

        public Criteria andIfStopTransNotIn(List<String> values) {
            addCriterion("IF_STOP_TRANS not in", values, "ifStopTrans");
            return (Criteria) this;
        }

        public Criteria andIfStopTransBetween(String value1, String value2) {
            addCriterion("IF_STOP_TRANS between", value1, value2, "ifStopTrans");
            return (Criteria) this;
        }

        public Criteria andIfStopTransNotBetween(String value1, String value2) {
            addCriterion("IF_STOP_TRANS not between", value1, value2, "ifStopTrans");
            return (Criteria) this;
        }

        public Criteria andConsumeThresholdIsNull() {
            addCriterion("CONSUME_THRESHOLD is null");
            return (Criteria) this;
        }

        public Criteria andConsumeThresholdIsNotNull() {
            addCriterion("CONSUME_THRESHOLD is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeThresholdEqualTo(Integer value) {
            addCriterion("CONSUME_THRESHOLD =", value, "consumeThreshold");
            return (Criteria) this;
        }

        public Criteria andConsumeThresholdNotEqualTo(Integer value) {
            addCriterion("CONSUME_THRESHOLD <>", value, "consumeThreshold");
            return (Criteria) this;
        }

        public Criteria andConsumeThresholdGreaterThan(Integer value) {
            addCriterion("CONSUME_THRESHOLD >", value, "consumeThreshold");
            return (Criteria) this;
        }

        public Criteria andConsumeThresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONSUME_THRESHOLD >=", value, "consumeThreshold");
            return (Criteria) this;
        }

        public Criteria andConsumeThresholdLessThan(Integer value) {
            addCriterion("CONSUME_THRESHOLD <", value, "consumeThreshold");
            return (Criteria) this;
        }

        public Criteria andConsumeThresholdLessThanOrEqualTo(Integer value) {
            addCriterion("CONSUME_THRESHOLD <=", value, "consumeThreshold");
            return (Criteria) this;
        }

        public Criteria andConsumeThresholdIn(List<Integer> values) {
            addCriterion("CONSUME_THRESHOLD in", values, "consumeThreshold");
            return (Criteria) this;
        }

        public Criteria andConsumeThresholdNotIn(List<Integer> values) {
            addCriterion("CONSUME_THRESHOLD not in", values, "consumeThreshold");
            return (Criteria) this;
        }

        public Criteria andConsumeThresholdBetween(Integer value1, Integer value2) {
            addCriterion("CONSUME_THRESHOLD between", value1, value2, "consumeThreshold");
            return (Criteria) this;
        }

        public Criteria andConsumeThresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("CONSUME_THRESHOLD not between", value1, value2, "consumeThreshold");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(Long value) {
            addCriterion("BATCH_ID =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(Long value) {
            addCriterion("BATCH_ID <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(Long value) {
            addCriterion("BATCH_ID >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BATCH_ID >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(Long value) {
            addCriterion("BATCH_ID <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(Long value) {
            addCriterion("BATCH_ID <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<Long> values) {
            addCriterion("BATCH_ID in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<Long> values) {
            addCriterion("BATCH_ID not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(Long value1, Long value2) {
            addCriterion("BATCH_ID between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(Long value1, Long value2) {
            addCriterion("BATCH_ID not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andTransFormulaIsNull() {
            addCriterion("TRANS_FORMULA is null");
            return (Criteria) this;
        }

        public Criteria andTransFormulaIsNotNull() {
            addCriterion("TRANS_FORMULA is not null");
            return (Criteria) this;
        }

        public Criteria andTransFormulaEqualTo(String value) {
            addCriterion("TRANS_FORMULA =", value, "transFormula");
            return (Criteria) this;
        }

        public Criteria andTransFormulaNotEqualTo(String value) {
            addCriterion("TRANS_FORMULA <>", value, "transFormula");
            return (Criteria) this;
        }

        public Criteria andTransFormulaGreaterThan(String value) {
            addCriterion("TRANS_FORMULA >", value, "transFormula");
            return (Criteria) this;
        }

        public Criteria andTransFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_FORMULA >=", value, "transFormula");
            return (Criteria) this;
        }

        public Criteria andTransFormulaLessThan(String value) {
            addCriterion("TRANS_FORMULA <", value, "transFormula");
            return (Criteria) this;
        }

        public Criteria andTransFormulaLessThanOrEqualTo(String value) {
            addCriterion("TRANS_FORMULA <=", value, "transFormula");
            return (Criteria) this;
        }

        public Criteria andTransFormulaLike(String value) {
            addCriterion("TRANS_FORMULA like", value, "transFormula");
            return (Criteria) this;
        }

        public Criteria andTransFormulaNotLike(String value) {
            addCriterion("TRANS_FORMULA not like", value, "transFormula");
            return (Criteria) this;
        }

        public Criteria andTransFormulaIn(List<String> values) {
            addCriterion("TRANS_FORMULA in", values, "transFormula");
            return (Criteria) this;
        }

        public Criteria andTransFormulaNotIn(List<String> values) {
            addCriterion("TRANS_FORMULA not in", values, "transFormula");
            return (Criteria) this;
        }

        public Criteria andTransFormulaBetween(String value1, String value2) {
            addCriterion("TRANS_FORMULA between", value1, value2, "transFormula");
            return (Criteria) this;
        }

        public Criteria andTransFormulaNotBetween(String value1, String value2) {
            addCriterion("TRANS_FORMULA not between", value1, value2, "transFormula");
            return (Criteria) this;
        }

        public Criteria andExecDateIsNull() {
            addCriterion("EXEC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExecDateIsNotNull() {
            addCriterion("EXEC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExecDateEqualTo(Date value) {
            addCriterionForJDBCDate("EXEC_DATE =", value, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXEC_DATE <>", value, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateGreaterThan(Date value) {
            addCriterionForJDBCDate("EXEC_DATE >", value, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXEC_DATE >=", value, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateLessThan(Date value) {
            addCriterionForJDBCDate("EXEC_DATE <", value, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXEC_DATE <=", value, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateIn(List<Date> values) {
            addCriterionForJDBCDate("EXEC_DATE in", values, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXEC_DATE not in", values, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXEC_DATE between", value1, value2, "execDate");
            return (Criteria) this;
        }

        public Criteria andExecDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXEC_DATE not between", value1, value2, "execDate");
            return (Criteria) this;
        }

        public Criteria andTransMonthsIsNull() {
            addCriterion("TRANS_MONTHS is null");
            return (Criteria) this;
        }

        public Criteria andTransMonthsIsNotNull() {
            addCriterion("TRANS_MONTHS is not null");
            return (Criteria) this;
        }

        public Criteria andTransMonthsEqualTo(Integer value) {
            addCriterion("TRANS_MONTHS =", value, "transMonths");
            return (Criteria) this;
        }

        public Criteria andTransMonthsNotEqualTo(Integer value) {
            addCriterion("TRANS_MONTHS <>", value, "transMonths");
            return (Criteria) this;
        }

        public Criteria andTransMonthsGreaterThan(Integer value) {
            addCriterion("TRANS_MONTHS >", value, "transMonths");
            return (Criteria) this;
        }

        public Criteria andTransMonthsGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANS_MONTHS >=", value, "transMonths");
            return (Criteria) this;
        }

        public Criteria andTransMonthsLessThan(Integer value) {
            addCriterion("TRANS_MONTHS <", value, "transMonths");
            return (Criteria) this;
        }

        public Criteria andTransMonthsLessThanOrEqualTo(Integer value) {
            addCriterion("TRANS_MONTHS <=", value, "transMonths");
            return (Criteria) this;
        }

        public Criteria andTransMonthsIn(List<Integer> values) {
            addCriterion("TRANS_MONTHS in", values, "transMonths");
            return (Criteria) this;
        }

        public Criteria andTransMonthsNotIn(List<Integer> values) {
            addCriterion("TRANS_MONTHS not in", values, "transMonths");
            return (Criteria) this;
        }

        public Criteria andTransMonthsBetween(Integer value1, Integer value2) {
            addCriterion("TRANS_MONTHS between", value1, value2, "transMonths");
            return (Criteria) this;
        }

        public Criteria andTransMonthsNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANS_MONTHS not between", value1, value2, "transMonths");
            return (Criteria) this;
        }

        public Criteria andRecvUserIdIsNull() {
            addCriterion("RECV_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecvUserIdIsNotNull() {
            addCriterion("RECV_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecvUserIdEqualTo(Long value) {
            addCriterion("RECV_USER_ID =", value, "recvUserId");
            return (Criteria) this;
        }

        public Criteria andRecvUserIdNotEqualTo(Long value) {
            addCriterion("RECV_USER_ID <>", value, "recvUserId");
            return (Criteria) this;
        }

        public Criteria andRecvUserIdGreaterThan(Long value) {
            addCriterion("RECV_USER_ID >", value, "recvUserId");
            return (Criteria) this;
        }

        public Criteria andRecvUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RECV_USER_ID >=", value, "recvUserId");
            return (Criteria) this;
        }

        public Criteria andRecvUserIdLessThan(Long value) {
            addCriterion("RECV_USER_ID <", value, "recvUserId");
            return (Criteria) this;
        }

        public Criteria andRecvUserIdLessThanOrEqualTo(Long value) {
            addCriterion("RECV_USER_ID <=", value, "recvUserId");
            return (Criteria) this;
        }

        public Criteria andRecvUserIdIn(List<Long> values) {
            addCriterion("RECV_USER_ID in", values, "recvUserId");
            return (Criteria) this;
        }

        public Criteria andRecvUserIdNotIn(List<Long> values) {
            addCriterion("RECV_USER_ID not in", values, "recvUserId");
            return (Criteria) this;
        }

        public Criteria andRecvUserIdBetween(Long value1, Long value2) {
            addCriterion("RECV_USER_ID between", value1, value2, "recvUserId");
            return (Criteria) this;
        }

        public Criteria andRecvUserIdNotBetween(Long value1, Long value2) {
            addCriterion("RECV_USER_ID not between", value1, value2, "recvUserId");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("PROVINCE_CODE like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("PROVINCE_CODE not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProductMoneyIsNull() {
            addCriterion("PRODUCT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andProductMoneyIsNotNull() {
            addCriterion("PRODUCT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andProductMoneyEqualTo(Long value) {
            addCriterion("PRODUCT_MONEY =", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyNotEqualTo(Long value) {
            addCriterion("PRODUCT_MONEY <>", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyGreaterThan(Long value) {
            addCriterion("PRODUCT_MONEY >", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_MONEY >=", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyLessThan(Long value) {
            addCriterion("PRODUCT_MONEY <", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_MONEY <=", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyIn(List<Long> values) {
            addCriterion("PRODUCT_MONEY in", values, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyNotIn(List<Long> values) {
            addCriterion("PRODUCT_MONEY not in", values, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_MONEY between", value1, value2, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_MONEY not between", value1, value2, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductStartCycleIsNull() {
            addCriterion("PRODUCT_START_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andProductStartCycleIsNotNull() {
            addCriterion("PRODUCT_START_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andProductStartCycleEqualTo(Integer value) {
            addCriterion("PRODUCT_START_CYCLE =", value, "productStartCycle");
            return (Criteria) this;
        }

        public Criteria andProductStartCycleNotEqualTo(Integer value) {
            addCriterion("PRODUCT_START_CYCLE <>", value, "productStartCycle");
            return (Criteria) this;
        }

        public Criteria andProductStartCycleGreaterThan(Integer value) {
            addCriterion("PRODUCT_START_CYCLE >", value, "productStartCycle");
            return (Criteria) this;
        }

        public Criteria andProductStartCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_START_CYCLE >=", value, "productStartCycle");
            return (Criteria) this;
        }

        public Criteria andProductStartCycleLessThan(Integer value) {
            addCriterion("PRODUCT_START_CYCLE <", value, "productStartCycle");
            return (Criteria) this;
        }

        public Criteria andProductStartCycleLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_START_CYCLE <=", value, "productStartCycle");
            return (Criteria) this;
        }

        public Criteria andProductStartCycleIn(List<Integer> values) {
            addCriterion("PRODUCT_START_CYCLE in", values, "productStartCycle");
            return (Criteria) this;
        }

        public Criteria andProductStartCycleNotIn(List<Integer> values) {
            addCriterion("PRODUCT_START_CYCLE not in", values, "productStartCycle");
            return (Criteria) this;
        }

        public Criteria andProductStartCycleBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_START_CYCLE between", value1, value2, "productStartCycle");
            return (Criteria) this;
        }

        public Criteria andProductStartCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_START_CYCLE not between", value1, value2, "productStartCycle");
            return (Criteria) this;
        }

        public Criteria andProductEndCycleIsNull() {
            addCriterion("PRODUCT_END_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andProductEndCycleIsNotNull() {
            addCriterion("PRODUCT_END_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andProductEndCycleEqualTo(Integer value) {
            addCriterion("PRODUCT_END_CYCLE =", value, "productEndCycle");
            return (Criteria) this;
        }

        public Criteria andProductEndCycleNotEqualTo(Integer value) {
            addCriterion("PRODUCT_END_CYCLE <>", value, "productEndCycle");
            return (Criteria) this;
        }

        public Criteria andProductEndCycleGreaterThan(Integer value) {
            addCriterion("PRODUCT_END_CYCLE >", value, "productEndCycle");
            return (Criteria) this;
        }

        public Criteria andProductEndCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_END_CYCLE >=", value, "productEndCycle");
            return (Criteria) this;
        }

        public Criteria andProductEndCycleLessThan(Integer value) {
            addCriterion("PRODUCT_END_CYCLE <", value, "productEndCycle");
            return (Criteria) this;
        }

        public Criteria andProductEndCycleLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_END_CYCLE <=", value, "productEndCycle");
            return (Criteria) this;
        }

        public Criteria andProductEndCycleIn(List<Integer> values) {
            addCriterion("PRODUCT_END_CYCLE in", values, "productEndCycle");
            return (Criteria) this;
        }

        public Criteria andProductEndCycleNotIn(List<Integer> values) {
            addCriterion("PRODUCT_END_CYCLE not in", values, "productEndCycle");
            return (Criteria) this;
        }

        public Criteria andProductEndCycleBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_END_CYCLE between", value1, value2, "productEndCycle");
            return (Criteria) this;
        }

        public Criteria andProductEndCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_END_CYCLE not between", value1, value2, "productEndCycle");
            return (Criteria) this;
        }

        public Criteria andActiveRecordIdIsNull() {
            addCriterion("ACTIVE_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andActiveRecordIdIsNotNull() {
            addCriterion("ACTIVE_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActiveRecordIdEqualTo(Long value) {
            addCriterion("ACTIVE_RECORD_ID =", value, "activeRecordId");
            return (Criteria) this;
        }

        public Criteria andActiveRecordIdNotEqualTo(Long value) {
            addCriterion("ACTIVE_RECORD_ID <>", value, "activeRecordId");
            return (Criteria) this;
        }

        public Criteria andActiveRecordIdGreaterThan(Long value) {
            addCriterion("ACTIVE_RECORD_ID >", value, "activeRecordId");
            return (Criteria) this;
        }

        public Criteria andActiveRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTIVE_RECORD_ID >=", value, "activeRecordId");
            return (Criteria) this;
        }

        public Criteria andActiveRecordIdLessThan(Long value) {
            addCriterion("ACTIVE_RECORD_ID <", value, "activeRecordId");
            return (Criteria) this;
        }

        public Criteria andActiveRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("ACTIVE_RECORD_ID <=", value, "activeRecordId");
            return (Criteria) this;
        }

        public Criteria andActiveRecordIdIn(List<Long> values) {
            addCriterion("ACTIVE_RECORD_ID in", values, "activeRecordId");
            return (Criteria) this;
        }

        public Criteria andActiveRecordIdNotIn(List<Long> values) {
            addCriterion("ACTIVE_RECORD_ID not in", values, "activeRecordId");
            return (Criteria) this;
        }

        public Criteria andActiveRecordIdBetween(Long value1, Long value2) {
            addCriterion("ACTIVE_RECORD_ID between", value1, value2, "activeRecordId");
            return (Criteria) this;
        }

        public Criteria andActiveRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("ACTIVE_RECORD_ID not between", value1, value2, "activeRecordId");
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