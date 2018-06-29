package plm.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompetitionUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompetitionUnitExample() {
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

        public Criteria andSportsHasCompetitionUnitSportsIdIsNull() {
            addCriterion("sports_has_competition_unit_sports_id is null");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitSportsIdIsNotNull() {
            addCriterion("sports_has_competition_unit_sports_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitSportsIdEqualTo(Integer value) {
            addCriterion("sports_has_competition_unit_sports_id =", value, "sportsHasCompetitionUnitSportsId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitSportsIdNotEqualTo(Integer value) {
            addCriterion("sports_has_competition_unit_sports_id <>", value, "sportsHasCompetitionUnitSportsId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitSportsIdGreaterThan(Integer value) {
            addCriterion("sports_has_competition_unit_sports_id >", value, "sportsHasCompetitionUnitSportsId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitSportsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sports_has_competition_unit_sports_id >=", value, "sportsHasCompetitionUnitSportsId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitSportsIdLessThan(Integer value) {
            addCriterion("sports_has_competition_unit_sports_id <", value, "sportsHasCompetitionUnitSportsId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitSportsIdLessThanOrEqualTo(Integer value) {
            addCriterion("sports_has_competition_unit_sports_id <=", value, "sportsHasCompetitionUnitSportsId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitSportsIdIn(List<Integer> values) {
            addCriterion("sports_has_competition_unit_sports_id in", values, "sportsHasCompetitionUnitSportsId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitSportsIdNotIn(List<Integer> values) {
            addCriterion("sports_has_competition_unit_sports_id not in", values, "sportsHasCompetitionUnitSportsId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitSportsIdBetween(Integer value1, Integer value2) {
            addCriterion("sports_has_competition_unit_sports_id between", value1, value2, "sportsHasCompetitionUnitSportsId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitSportsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sports_has_competition_unit_sports_id not between", value1, value2, "sportsHasCompetitionUnitSportsId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitCompetitionUnitIdIsNull() {
            addCriterion("sports_has_competition_unit_competition_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitCompetitionUnitIdIsNotNull() {
            addCriterion("sports_has_competition_unit_competition_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitCompetitionUnitIdEqualTo(Integer value) {
            addCriterion("sports_has_competition_unit_competition_unit_id =", value, "sportsHasCompetitionUnitCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitCompetitionUnitIdNotEqualTo(Integer value) {
            addCriterion("sports_has_competition_unit_competition_unit_id <>", value, "sportsHasCompetitionUnitCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitCompetitionUnitIdGreaterThan(Integer value) {
            addCriterion("sports_has_competition_unit_competition_unit_id >", value, "sportsHasCompetitionUnitCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitCompetitionUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sports_has_competition_unit_competition_unit_id >=", value, "sportsHasCompetitionUnitCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitCompetitionUnitIdLessThan(Integer value) {
            addCriterion("sports_has_competition_unit_competition_unit_id <", value, "sportsHasCompetitionUnitCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitCompetitionUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("sports_has_competition_unit_competition_unit_id <=", value, "sportsHasCompetitionUnitCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitCompetitionUnitIdIn(List<Integer> values) {
            addCriterion("sports_has_competition_unit_competition_unit_id in", values, "sportsHasCompetitionUnitCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitCompetitionUnitIdNotIn(List<Integer> values) {
            addCriterion("sports_has_competition_unit_competition_unit_id not in", values, "sportsHasCompetitionUnitCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitCompetitionUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("sports_has_competition_unit_competition_unit_id between", value1, value2, "sportsHasCompetitionUnitCompetitionUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsHasCompetitionUnitCompetitionUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sports_has_competition_unit_competition_unit_id not between", value1, value2, "sportsHasCompetitionUnitCompetitionUnitId");
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIsNull() {
            addCriterion("registration_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIsNotNull() {
            addCriterion("registration_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeEqualTo(Date value) {
            addCriterion("registration_time =", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotEqualTo(Date value) {
            addCriterion("registration_time <>", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeGreaterThan(Date value) {
            addCriterion("registration_time >", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registration_time >=", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeLessThan(Date value) {
            addCriterion("registration_time <", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeLessThanOrEqualTo(Date value) {
            addCriterion("registration_time <=", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIn(List<Date> values) {
            addCriterion("registration_time in", values, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotIn(List<Date> values) {
            addCriterion("registration_time not in", values, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeBetween(Date value1, Date value2) {
            addCriterion("registration_time between", value1, value2, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotBetween(Date value1, Date value2) {
            addCriterion("registration_time not between", value1, value2, "registrationTime");
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