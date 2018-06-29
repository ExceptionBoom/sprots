package plm.beans;

import java.util.ArrayList;
import java.util.List;

public class SportsGroupUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SportsGroupUnitExample() {
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

        public Criteria andSportsGroupIdIsNull() {
            addCriterion("sports_group_id is null");
            return (Criteria) this;
        }

        public Criteria andSportsGroupIdIsNotNull() {
            addCriterion("sports_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportsGroupIdEqualTo(Integer value) {
            addCriterion("sports_group_id =", value, "sportsGroupId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupIdNotEqualTo(Integer value) {
            addCriterion("sports_group_id <>", value, "sportsGroupId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupIdGreaterThan(Integer value) {
            addCriterion("sports_group_id >", value, "sportsGroupId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sports_group_id >=", value, "sportsGroupId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupIdLessThan(Integer value) {
            addCriterion("sports_group_id <", value, "sportsGroupId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("sports_group_id <=", value, "sportsGroupId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupIdIn(List<Integer> values) {
            addCriterion("sports_group_id in", values, "sportsGroupId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupIdNotIn(List<Integer> values) {
            addCriterion("sports_group_id not in", values, "sportsGroupId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("sports_group_id between", value1, value2, "sportsGroupId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sports_group_id not between", value1, value2, "sportsGroupId");
            return (Criteria) this;
        }

        public Criteria andSportsCompetitionUnitIdIsNull() {
            addCriterion("sports_competition_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andSportsCompetitionUnitIdIsNotNull() {
            addCriterion("sports_competition_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportsCompetitionUnitIdEqualTo(Integer value) {
            addCriterion("sports_competition_unit_id =", value, "sportsCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsCompetitionUnitIdNotEqualTo(Integer value) {
            addCriterion("sports_competition_unit_id <>", value, "sportsCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsCompetitionUnitIdGreaterThan(Integer value) {
            addCriterion("sports_competition_unit_id >", value, "sportsCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsCompetitionUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sports_competition_unit_id >=", value, "sportsCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsCompetitionUnitIdLessThan(Integer value) {
            addCriterion("sports_competition_unit_id <", value, "sportsCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsCompetitionUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("sports_competition_unit_id <=", value, "sportsCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsCompetitionUnitIdIn(List<Integer> values) {
            addCriterion("sports_competition_unit_id in", values, "sportsCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsCompetitionUnitIdNotIn(List<Integer> values) {
            addCriterion("sports_competition_unit_id not in", values, "sportsCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsCompetitionUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("sports_competition_unit_id between", value1, value2, "sportsCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsCompetitionUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sports_competition_unit_id not between", value1, value2, "sportsCompetitionUnitId");
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