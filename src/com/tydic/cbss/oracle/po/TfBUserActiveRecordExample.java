package com.tydic.cbss.oracle.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TfBUserActiveRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfBUserActiveRecordExample() {
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

        public Criteria andPartitionIdIsNull() {
            addCriterion("PARTITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartitionIdIsNotNull() {
            addCriterion("PARTITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartitionIdEqualTo(Short value) {
            addCriterion("PARTITION_ID =", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotEqualTo(Short value) {
            addCriterion("PARTITION_ID <>", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdGreaterThan(Short value) {
            addCriterion("PARTITION_ID >", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdGreaterThanOrEqualTo(Short value) {
            addCriterion("PARTITION_ID >=", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdLessThan(Short value) {
            addCriterion("PARTITION_ID <", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdLessThanOrEqualTo(Short value) {
            addCriterion("PARTITION_ID <=", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdIn(List<Short> values) {
            addCriterion("PARTITION_ID in", values, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotIn(List<Short> values) {
            addCriterion("PARTITION_ID not in", values, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdBetween(Short value1, Short value2) {
            addCriterion("PARTITION_ID between", value1, value2, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotBetween(Short value1, Short value2) {
            addCriterion("PARTITION_ID not between", value1, value2, "partitionId");
            return (Criteria) this;
        }

        public Criteria andSubsIdIsNull() {
            addCriterion("SUBS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubsIdIsNotNull() {
            addCriterion("SUBS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubsIdEqualTo(Long value) {
            addCriterion("SUBS_ID =", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdNotEqualTo(Long value) {
            addCriterion("SUBS_ID <>", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdGreaterThan(Long value) {
            addCriterion("SUBS_ID >", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUBS_ID >=", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdLessThan(Long value) {
            addCriterion("SUBS_ID <", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdLessThanOrEqualTo(Long value) {
            addCriterion("SUBS_ID <=", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdIn(List<Long> values) {
            addCriterion("SUBS_ID in", values, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdNotIn(List<Long> values) {
            addCriterion("SUBS_ID not in", values, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdBetween(Long value1, Long value2) {
            addCriterion("SUBS_ID between", value1, value2, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdNotBetween(Long value1, Long value2) {
            addCriterion("SUBS_ID not between", value1, value2, "subsId");
            return (Criteria) this;
        }

        public Criteria andAccNbrIsNull() {
            addCriterion("ACC_NBR is null");
            return (Criteria) this;
        }

        public Criteria andAccNbrIsNotNull() {
            addCriterion("ACC_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andAccNbrEqualTo(String value) {
            addCriterion("ACC_NBR =", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrNotEqualTo(String value) {
            addCriterion("ACC_NBR <>", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrGreaterThan(String value) {
            addCriterion("ACC_NBR >", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_NBR >=", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrLessThan(String value) {
            addCriterion("ACC_NBR <", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrLessThanOrEqualTo(String value) {
            addCriterion("ACC_NBR <=", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrLike(String value) {
            addCriterion("ACC_NBR like", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrNotLike(String value) {
            addCriterion("ACC_NBR not like", value, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrIn(List<String> values) {
            addCriterion("ACC_NBR in", values, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrNotIn(List<String> values) {
            addCriterion("ACC_NBR not in", values, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrBetween(String value1, String value2) {
            addCriterion("ACC_NBR between", value1, value2, "accNbr");
            return (Criteria) this;
        }

        public Criteria andAccNbrNotBetween(String value1, String value2) {
            addCriterion("ACC_NBR not between", value1, value2, "accNbr");
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

        public Criteria andActionCodeEqualTo(Long value) {
            addCriterion("ACTION_CODE =", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeNotEqualTo(Long value) {
            addCriterion("ACTION_CODE <>", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeGreaterThan(Long value) {
            addCriterion("ACTION_CODE >", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTION_CODE >=", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeLessThan(Long value) {
            addCriterion("ACTION_CODE <", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeLessThanOrEqualTo(Long value) {
            addCriterion("ACTION_CODE <=", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeIn(List<Long> values) {
            addCriterion("ACTION_CODE in", values, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeNotIn(List<Long> values) {
            addCriterion("ACTION_CODE not in", values, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeBetween(Long value1, Long value2) {
            addCriterion("ACTION_CODE between", value1, value2, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeNotBetween(Long value1, Long value2) {
            addCriterion("ACTION_CODE not between", value1, value2, "actionCode");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNull() {
            addCriterion("EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(Long value) {
            addCriterion("EVENT_ID =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(Long value) {
            addCriterion("EVENT_ID <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(Long value) {
            addCriterion("EVENT_ID >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EVENT_ID >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(Long value) {
            addCriterion("EVENT_ID <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(Long value) {
            addCriterion("EVENT_ID <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<Long> values) {
            addCriterion("EVENT_ID in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<Long> values) {
            addCriterion("EVENT_ID not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(Long value1, Long value2) {
            addCriterion("EVENT_ID between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(Long value1, Long value2) {
            addCriterion("EVENT_ID not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNull() {
            addCriterion("ACTION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNotNull() {
            addCriterion("ACTION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andActionTypeEqualTo(Integer value) {
            addCriterion("ACTION_TYPE =", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotEqualTo(Integer value) {
            addCriterion("ACTION_TYPE <>", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThan(Integer value) {
            addCriterion("ACTION_TYPE >", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTION_TYPE >=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThan(Integer value) {
            addCriterion("ACTION_TYPE <", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ACTION_TYPE <=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeIn(List<Integer> values) {
            addCriterion("ACTION_TYPE in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotIn(List<Integer> values) {
            addCriterion("ACTION_TYPE not in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeBetween(Integer value1, Integer value2) {
            addCriterion("ACTION_TYPE between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTION_TYPE not between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andRuleGroupIsNull() {
            addCriterion("RULE_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andRuleGroupIsNotNull() {
            addCriterion("RULE_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andRuleGroupEqualTo(Long value) {
            addCriterion("RULE_GROUP =", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupNotEqualTo(Long value) {
            addCriterion("RULE_GROUP <>", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupGreaterThan(Long value) {
            addCriterion("RULE_GROUP >", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupGreaterThanOrEqualTo(Long value) {
            addCriterion("RULE_GROUP >=", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupLessThan(Long value) {
            addCriterion("RULE_GROUP <", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupLessThanOrEqualTo(Long value) {
            addCriterion("RULE_GROUP <=", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupIn(List<Long> values) {
            addCriterion("RULE_GROUP in", values, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupNotIn(List<Long> values) {
            addCriterion("RULE_GROUP not in", values, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupBetween(Long value1, Long value2) {
            addCriterion("RULE_GROUP between", value1, value2, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupNotBetween(Long value1, Long value2) {
            addCriterion("RULE_GROUP not between", value1, value2, "ruleGroup");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndCycleTimeIsNull() {
            addCriterion("END_CYCLE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndCycleTimeIsNotNull() {
            addCriterion("END_CYCLE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndCycleTimeEqualTo(Date value) {
            addCriterionForJDBCDate("END_CYCLE_TIME =", value, "endCycleTime");
            return (Criteria) this;
        }

        public Criteria andEndCycleTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_CYCLE_TIME <>", value, "endCycleTime");
            return (Criteria) this;
        }

        public Criteria andEndCycleTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("END_CYCLE_TIME >", value, "endCycleTime");
            return (Criteria) this;
        }

        public Criteria andEndCycleTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_CYCLE_TIME >=", value, "endCycleTime");
            return (Criteria) this;
        }

        public Criteria andEndCycleTimeLessThan(Date value) {
            addCriterionForJDBCDate("END_CYCLE_TIME <", value, "endCycleTime");
            return (Criteria) this;
        }

        public Criteria andEndCycleTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_CYCLE_TIME <=", value, "endCycleTime");
            return (Criteria) this;
        }

        public Criteria andEndCycleTimeIn(List<Date> values) {
            addCriterionForJDBCDate("END_CYCLE_TIME in", values, "endCycleTime");
            return (Criteria) this;
        }

        public Criteria andEndCycleTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_CYCLE_TIME not in", values, "endCycleTime");
            return (Criteria) this;
        }

        public Criteria andEndCycleTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_CYCLE_TIME between", value1, value2, "endCycleTime");
            return (Criteria) this;
        }

        public Criteria andEndCycleTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_CYCLE_TIME not between", value1, value2, "endCycleTime");
            return (Criteria) this;
        }

        public Criteria andActiveSourceIsNull() {
            addCriterion("ACTIVE_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andActiveSourceIsNotNull() {
            addCriterion("ACTIVE_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andActiveSourceEqualTo(Integer value) {
            addCriterion("ACTIVE_SOURCE =", value, "activeSource");
            return (Criteria) this;
        }

        public Criteria andActiveSourceNotEqualTo(Integer value) {
            addCriterion("ACTIVE_SOURCE <>", value, "activeSource");
            return (Criteria) this;
        }

        public Criteria andActiveSourceGreaterThan(Integer value) {
            addCriterion("ACTIVE_SOURCE >", value, "activeSource");
            return (Criteria) this;
        }

        public Criteria andActiveSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTIVE_SOURCE >=", value, "activeSource");
            return (Criteria) this;
        }

        public Criteria andActiveSourceLessThan(Integer value) {
            addCriterion("ACTIVE_SOURCE <", value, "activeSource");
            return (Criteria) this;
        }

        public Criteria andActiveSourceLessThanOrEqualTo(Integer value) {
            addCriterion("ACTIVE_SOURCE <=", value, "activeSource");
            return (Criteria) this;
        }

        public Criteria andActiveSourceIn(List<Integer> values) {
            addCriterion("ACTIVE_SOURCE in", values, "activeSource");
            return (Criteria) this;
        }

        public Criteria andActiveSourceNotIn(List<Integer> values) {
            addCriterion("ACTIVE_SOURCE not in", values, "activeSource");
            return (Criteria) this;
        }

        public Criteria andActiveSourceBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVE_SOURCE between", value1, value2, "activeSource");
            return (Criteria) this;
        }

        public Criteria andActiveSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVE_SOURCE not between", value1, value2, "activeSource");
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