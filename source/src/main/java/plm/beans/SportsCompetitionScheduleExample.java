package plm.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SportsCompetitionScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SportsCompetitionScheduleExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSportsIdIsNull() {
            addCriterion("sports_id is null");
            return (Criteria) this;
        }

        public Criteria andSportsIdIsNotNull() {
            addCriterion("sports_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportsIdEqualTo(Integer value) {
            addCriterion("sports_id =", value, "sportsId");
            return (Criteria) this;
        }

        public Criteria andSportsIdNotEqualTo(Integer value) {
            addCriterion("sports_id <>", value, "sportsId");
            return (Criteria) this;
        }

        public Criteria andSportsIdGreaterThan(Integer value) {
            addCriterion("sports_id >", value, "sportsId");
            return (Criteria) this;
        }

        public Criteria andSportsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sports_id >=", value, "sportsId");
            return (Criteria) this;
        }

        public Criteria andSportsIdLessThan(Integer value) {
            addCriterion("sports_id <", value, "sportsId");
            return (Criteria) this;
        }

        public Criteria andSportsIdLessThanOrEqualTo(Integer value) {
            addCriterion("sports_id <=", value, "sportsId");
            return (Criteria) this;
        }

        public Criteria andSportsIdIn(List<Integer> values) {
            addCriterion("sports_id in", values, "sportsId");
            return (Criteria) this;
        }

        public Criteria andSportsIdNotIn(List<Integer> values) {
            addCriterion("sports_id not in", values, "sportsId");
            return (Criteria) this;
        }

        public Criteria andSportsIdBetween(Integer value1, Integer value2) {
            addCriterion("sports_id between", value1, value2, "sportsId");
            return (Criteria) this;
        }

        public Criteria andSportsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sports_id not between", value1, value2, "sportsId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitIdIsNull() {
            addCriterion("competition_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitIdIsNotNull() {
            addCriterion("competition_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitIdEqualTo(Integer value) {
            addCriterion("competition_unit_id =", value, "competitionUnitId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitIdNotEqualTo(Integer value) {
            addCriterion("competition_unit_id <>", value, "competitionUnitId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitIdGreaterThan(Integer value) {
            addCriterion("competition_unit_id >", value, "competitionUnitId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("competition_unit_id >=", value, "competitionUnitId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitIdLessThan(Integer value) {
            addCriterion("competition_unit_id <", value, "competitionUnitId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("competition_unit_id <=", value, "competitionUnitId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitIdIn(List<Integer> values) {
            addCriterion("competition_unit_id in", values, "competitionUnitId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitIdNotIn(List<Integer> values) {
            addCriterion("competition_unit_id not in", values, "competitionUnitId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("competition_unit_id between", value1, value2, "competitionUnitId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("competition_unit_id not between", value1, value2, "competitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdIsNull() {
            addCriterion("sports_group_item_id is null");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdIsNotNull() {
            addCriterion("sports_group_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdEqualTo(String value) {
            addCriterion("sports_group_item_id =", value, "sportsGroupItemId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdNotEqualTo(String value) {
            addCriterion("sports_group_item_id <>", value, "sportsGroupItemId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdGreaterThan(String value) {
            addCriterion("sports_group_item_id >", value, "sportsGroupItemId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("sports_group_item_id >=", value, "sportsGroupItemId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdLessThan(String value) {
            addCriterion("sports_group_item_id <", value, "sportsGroupItemId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdLessThanOrEqualTo(String value) {
            addCriterion("sports_group_item_id <=", value, "sportsGroupItemId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdLike(String value) {
            addCriterion("sports_group_item_id like", value, "sportsGroupItemId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdNotLike(String value) {
            addCriterion("sports_group_item_id not like", value, "sportsGroupItemId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdIn(List<String> values) {
            addCriterion("sports_group_item_id in", values, "sportsGroupItemId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdNotIn(List<String> values) {
            addCriterion("sports_group_item_id not in", values, "sportsGroupItemId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdBetween(String value1, String value2) {
            addCriterion("sports_group_item_id between", value1, value2, "sportsGroupItemId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupItemIdNotBetween(String value1, String value2) {
            addCriterion("sports_group_item_id not between", value1, value2, "sportsGroupItemId");
            return (Criteria) this;
        }

        public Criteria andSportsItemStartTimeIsNull() {
            addCriterion("sports_item_start_time is null");
            return (Criteria) this;
        }

        public Criteria andSportsItemStartTimeIsNotNull() {
            addCriterion("sports_item_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andSportsItemStartTimeEqualTo(Date value) {
            addCriterion("sports_item_start_time =", value, "sportsItemStartTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemStartTimeNotEqualTo(Date value) {
            addCriterion("sports_item_start_time <>", value, "sportsItemStartTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemStartTimeGreaterThan(Date value) {
            addCriterion("sports_item_start_time >", value, "sportsItemStartTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sports_item_start_time >=", value, "sportsItemStartTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemStartTimeLessThan(Date value) {
            addCriterion("sports_item_start_time <", value, "sportsItemStartTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("sports_item_start_time <=", value, "sportsItemStartTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemStartTimeIn(List<Date> values) {
            addCriterion("sports_item_start_time in", values, "sportsItemStartTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemStartTimeNotIn(List<Date> values) {
            addCriterion("sports_item_start_time not in", values, "sportsItemStartTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemStartTimeBetween(Date value1, Date value2) {
            addCriterion("sports_item_start_time between", value1, value2, "sportsItemStartTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("sports_item_start_time not between", value1, value2, "sportsItemStartTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemEndTimeIsNull() {
            addCriterion("sports_item_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSportsItemEndTimeIsNotNull() {
            addCriterion("sports_item_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSportsItemEndTimeEqualTo(Date value) {
            addCriterion("sports_item_end_time =", value, "sportsItemEndTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemEndTimeNotEqualTo(Date value) {
            addCriterion("sports_item_end_time <>", value, "sportsItemEndTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemEndTimeGreaterThan(Date value) {
            addCriterion("sports_item_end_time >", value, "sportsItemEndTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sports_item_end_time >=", value, "sportsItemEndTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemEndTimeLessThan(Date value) {
            addCriterion("sports_item_end_time <", value, "sportsItemEndTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("sports_item_end_time <=", value, "sportsItemEndTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemEndTimeIn(List<Date> values) {
            addCriterion("sports_item_end_time in", values, "sportsItemEndTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemEndTimeNotIn(List<Date> values) {
            addCriterion("sports_item_end_time not in", values, "sportsItemEndTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemEndTimeBetween(Date value1, Date value2) {
            addCriterion("sports_item_end_time between", value1, value2, "sportsItemEndTime");
            return (Criteria) this;
        }

        public Criteria andSportsItemEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("sports_item_end_time not between", value1, value2, "sportsItemEndTime");
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