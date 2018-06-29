package plm.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SportsUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SportsUnitExample() {
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

        public Criteria andSportsManagerIdIsNull() {
            addCriterion("sports_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andSportsManagerIdIsNotNull() {
            addCriterion("sports_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportsManagerIdEqualTo(Integer value) {
            addCriterion("sports_manager_id =", value, "sportsManagerId");
            return (Criteria) this;
        }

        public Criteria andSportsManagerIdNotEqualTo(Integer value) {
            addCriterion("sports_manager_id <>", value, "sportsManagerId");
            return (Criteria) this;
        }

        public Criteria andSportsManagerIdGreaterThan(Integer value) {
            addCriterion("sports_manager_id >", value, "sportsManagerId");
            return (Criteria) this;
        }

        public Criteria andSportsManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sports_manager_id >=", value, "sportsManagerId");
            return (Criteria) this;
        }

        public Criteria andSportsManagerIdLessThan(Integer value) {
            addCriterion("sports_manager_id <", value, "sportsManagerId");
            return (Criteria) this;
        }

        public Criteria andSportsManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("sports_manager_id <=", value, "sportsManagerId");
            return (Criteria) this;
        }

        public Criteria andSportsManagerIdIn(List<Integer> values) {
            addCriterion("sports_manager_id in", values, "sportsManagerId");
            return (Criteria) this;
        }

        public Criteria andSportsManagerIdNotIn(List<Integer> values) {
            addCriterion("sports_manager_id not in", values, "sportsManagerId");
            return (Criteria) this;
        }

        public Criteria andSportsManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("sports_manager_id between", value1, value2, "sportsManagerId");
            return (Criteria) this;
        }

        public Criteria andSportsManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sports_manager_id not between", value1, value2, "sportsManagerId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStartDataIsNull() {
            addCriterion("start_data is null");
            return (Criteria) this;
        }

        public Criteria andStartDataIsNotNull() {
            addCriterion("start_data is not null");
            return (Criteria) this;
        }

        public Criteria andStartDataEqualTo(Date value) {
            addCriterion("start_data =", value, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataNotEqualTo(Date value) {
            addCriterion("start_data <>", value, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataGreaterThan(Date value) {
            addCriterion("start_data >", value, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataGreaterThanOrEqualTo(Date value) {
            addCriterion("start_data >=", value, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataLessThan(Date value) {
            addCriterion("start_data <", value, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataLessThanOrEqualTo(Date value) {
            addCriterion("start_data <=", value, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataIn(List<Date> values) {
            addCriterion("start_data in", values, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataNotIn(List<Date> values) {
            addCriterion("start_data not in", values, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataBetween(Date value1, Date value2) {
            addCriterion("start_data between", value1, value2, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataNotBetween(Date value1, Date value2) {
            addCriterion("start_data not between", value1, value2, "startData");
            return (Criteria) this;
        }

        public Criteria andEndDataIsNull() {
            addCriterion("end_data is null");
            return (Criteria) this;
        }

        public Criteria andEndDataIsNotNull() {
            addCriterion("end_data is not null");
            return (Criteria) this;
        }

        public Criteria andEndDataEqualTo(Date value) {
            addCriterion("end_data =", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataNotEqualTo(Date value) {
            addCriterion("end_data <>", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataGreaterThan(Date value) {
            addCriterion("end_data >", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataGreaterThanOrEqualTo(Date value) {
            addCriterion("end_data >=", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataLessThan(Date value) {
            addCriterion("end_data <", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataLessThanOrEqualTo(Date value) {
            addCriterion("end_data <=", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataIn(List<Date> values) {
            addCriterion("end_data in", values, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataNotIn(List<Date> values) {
            addCriterion("end_data not in", values, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataBetween(Date value1, Date value2) {
            addCriterion("end_data between", value1, value2, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataNotBetween(Date value1, Date value2) {
            addCriterion("end_data not between", value1, value2, "endData");
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