package plm.beans;

import java.util.ArrayList;
import java.util.List;

public class SportsScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SportsScoreExample() {
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

        public Criteria andSportsNameIsNull() {
            addCriterion("sports_name is null");
            return (Criteria) this;
        }

        public Criteria andSportsNameIsNotNull() {
            addCriterion("sports_name is not null");
            return (Criteria) this;
        }

        public Criteria andSportsNameEqualTo(String value) {
            addCriterion("sports_name =", value, "sportsName");
            return (Criteria) this;
        }

        public Criteria andSportsNameNotEqualTo(String value) {
            addCriterion("sports_name <>", value, "sportsName");
            return (Criteria) this;
        }

        public Criteria andSportsNameGreaterThan(String value) {
            addCriterion("sports_name >", value, "sportsName");
            return (Criteria) this;
        }

        public Criteria andSportsNameGreaterThanOrEqualTo(String value) {
            addCriterion("sports_name >=", value, "sportsName");
            return (Criteria) this;
        }

        public Criteria andSportsNameLessThan(String value) {
            addCriterion("sports_name <", value, "sportsName");
            return (Criteria) this;
        }

        public Criteria andSportsNameLessThanOrEqualTo(String value) {
            addCriterion("sports_name <=", value, "sportsName");
            return (Criteria) this;
        }

        public Criteria andSportsNameLike(String value) {
            addCriterion("sports_name like", value, "sportsName");
            return (Criteria) this;
        }

        public Criteria andSportsNameNotLike(String value) {
            addCriterion("sports_name not like", value, "sportsName");
            return (Criteria) this;
        }

        public Criteria andSportsNameIn(List<String> values) {
            addCriterion("sports_name in", values, "sportsName");
            return (Criteria) this;
        }

        public Criteria andSportsNameNotIn(List<String> values) {
            addCriterion("sports_name not in", values, "sportsName");
            return (Criteria) this;
        }

        public Criteria andSportsNameBetween(String value1, String value2) {
            addCriterion("sports_name between", value1, value2, "sportsName");
            return (Criteria) this;
        }

        public Criteria andSportsNameNotBetween(String value1, String value2) {
            addCriterion("sports_name not between", value1, value2, "sportsName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameIsNull() {
            addCriterion("competition_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameIsNotNull() {
            addCriterion("competition_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameEqualTo(String value) {
            addCriterion("competition_unit_name =", value, "competitionUnitName");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameNotEqualTo(String value) {
            addCriterion("competition_unit_name <>", value, "competitionUnitName");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameGreaterThan(String value) {
            addCriterion("competition_unit_name >", value, "competitionUnitName");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("competition_unit_name >=", value, "competitionUnitName");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameLessThan(String value) {
            addCriterion("competition_unit_name <", value, "competitionUnitName");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameLessThanOrEqualTo(String value) {
            addCriterion("competition_unit_name <=", value, "competitionUnitName");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameLike(String value) {
            addCriterion("competition_unit_name like", value, "competitionUnitName");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameNotLike(String value) {
            addCriterion("competition_unit_name not like", value, "competitionUnitName");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameIn(List<String> values) {
            addCriterion("competition_unit_name in", values, "competitionUnitName");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameNotIn(List<String> values) {
            addCriterion("competition_unit_name not in", values, "competitionUnitName");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameBetween(String value1, String value2) {
            addCriterion("competition_unit_name between", value1, value2, "competitionUnitName");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitNameNotBetween(String value1, String value2) {
            addCriterion("competition_unit_name not between", value1, value2, "competitionUnitName");
            return (Criteria) this;
        }

        public Criteria andAthleteNameIsNull() {
            addCriterion("athlete_name is null");
            return (Criteria) this;
        }

        public Criteria andAthleteNameIsNotNull() {
            addCriterion("athlete_name is not null");
            return (Criteria) this;
        }

        public Criteria andAthleteNameEqualTo(String value) {
            addCriterion("athlete_name =", value, "athleteName");
            return (Criteria) this;
        }

        public Criteria andAthleteNameNotEqualTo(String value) {
            addCriterion("athlete_name <>", value, "athleteName");
            return (Criteria) this;
        }

        public Criteria andAthleteNameGreaterThan(String value) {
            addCriterion("athlete_name >", value, "athleteName");
            return (Criteria) this;
        }

        public Criteria andAthleteNameGreaterThanOrEqualTo(String value) {
            addCriterion("athlete_name >=", value, "athleteName");
            return (Criteria) this;
        }

        public Criteria andAthleteNameLessThan(String value) {
            addCriterion("athlete_name <", value, "athleteName");
            return (Criteria) this;
        }

        public Criteria andAthleteNameLessThanOrEqualTo(String value) {
            addCriterion("athlete_name <=", value, "athleteName");
            return (Criteria) this;
        }

        public Criteria andAthleteNameLike(String value) {
            addCriterion("athlete_name like", value, "athleteName");
            return (Criteria) this;
        }

        public Criteria andAthleteNameNotLike(String value) {
            addCriterion("athlete_name not like", value, "athleteName");
            return (Criteria) this;
        }

        public Criteria andAthleteNameIn(List<String> values) {
            addCriterion("athlete_name in", values, "athleteName");
            return (Criteria) this;
        }

        public Criteria andAthleteNameNotIn(List<String> values) {
            addCriterion("athlete_name not in", values, "athleteName");
            return (Criteria) this;
        }

        public Criteria andAthleteNameBetween(String value1, String value2) {
            addCriterion("athlete_name between", value1, value2, "athleteName");
            return (Criteria) this;
        }

        public Criteria andAthleteNameNotBetween(String value1, String value2) {
            addCriterion("athlete_name not between", value1, value2, "athleteName");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
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