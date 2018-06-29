package plm.beans;

import java.util.ArrayList;
import java.util.List;

public class SportsDevideGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SportsDevideGroupExample() {
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

        public Criteria andAthletesEnrollIdIsNull() {
            addCriterion("athletes_enroll_id is null");
            return (Criteria) this;
        }

        public Criteria andAthletesEnrollIdIsNotNull() {
            addCriterion("athletes_enroll_id is not null");
            return (Criteria) this;
        }

        public Criteria andAthletesEnrollIdEqualTo(Integer value) {
            addCriterion("athletes_enroll_id =", value, "athletesEnrollId");
            return (Criteria) this;
        }

        public Criteria andAthletesEnrollIdNotEqualTo(Integer value) {
            addCriterion("athletes_enroll_id <>", value, "athletesEnrollId");
            return (Criteria) this;
        }

        public Criteria andAthletesEnrollIdGreaterThan(Integer value) {
            addCriterion("athletes_enroll_id >", value, "athletesEnrollId");
            return (Criteria) this;
        }

        public Criteria andAthletesEnrollIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("athletes_enroll_id >=", value, "athletesEnrollId");
            return (Criteria) this;
        }

        public Criteria andAthletesEnrollIdLessThan(Integer value) {
            addCriterion("athletes_enroll_id <", value, "athletesEnrollId");
            return (Criteria) this;
        }

        public Criteria andAthletesEnrollIdLessThanOrEqualTo(Integer value) {
            addCriterion("athletes_enroll_id <=", value, "athletesEnrollId");
            return (Criteria) this;
        }

        public Criteria andAthletesEnrollIdIn(List<Integer> values) {
            addCriterion("athletes_enroll_id in", values, "athletesEnrollId");
            return (Criteria) this;
        }

        public Criteria andAthletesEnrollIdNotIn(List<Integer> values) {
            addCriterion("athletes_enroll_id not in", values, "athletesEnrollId");
            return (Criteria) this;
        }

        public Criteria andAthletesEnrollIdBetween(Integer value1, Integer value2) {
            addCriterion("athletes_enroll_id between", value1, value2, "athletesEnrollId");
            return (Criteria) this;
        }

        public Criteria andAthletesEnrollIdNotBetween(Integer value1, Integer value2) {
            addCriterion("athletes_enroll_id not between", value1, value2, "athletesEnrollId");
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

        public Criteria andTrackNumberIsNull() {
            addCriterion("track_number is null");
            return (Criteria) this;
        }

        public Criteria andTrackNumberIsNotNull() {
            addCriterion("track_number is not null");
            return (Criteria) this;
        }

        public Criteria andTrackNumberEqualTo(Integer value) {
            addCriterion("track_number =", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotEqualTo(Integer value) {
            addCriterion("track_number <>", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberGreaterThan(Integer value) {
            addCriterion("track_number >", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("track_number >=", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberLessThan(Integer value) {
            addCriterion("track_number <", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberLessThanOrEqualTo(Integer value) {
            addCriterion("track_number <=", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberIn(List<Integer> values) {
            addCriterion("track_number in", values, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotIn(List<Integer> values) {
            addCriterion("track_number not in", values, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberBetween(Integer value1, Integer value2) {
            addCriterion("track_number between", value1, value2, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("track_number not between", value1, value2, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andItemGroupNumberIsNull() {
            addCriterion("item_group_number is null");
            return (Criteria) this;
        }

        public Criteria andItemGroupNumberIsNotNull() {
            addCriterion("item_group_number is not null");
            return (Criteria) this;
        }

        public Criteria andItemGroupNumberEqualTo(Integer value) {
            addCriterion("item_group_number =", value, "itemGroupNumber");
            return (Criteria) this;
        }

        public Criteria andItemGroupNumberNotEqualTo(Integer value) {
            addCriterion("item_group_number <>", value, "itemGroupNumber");
            return (Criteria) this;
        }

        public Criteria andItemGroupNumberGreaterThan(Integer value) {
            addCriterion("item_group_number >", value, "itemGroupNumber");
            return (Criteria) this;
        }

        public Criteria andItemGroupNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_group_number >=", value, "itemGroupNumber");
            return (Criteria) this;
        }

        public Criteria andItemGroupNumberLessThan(Integer value) {
            addCriterion("item_group_number <", value, "itemGroupNumber");
            return (Criteria) this;
        }

        public Criteria andItemGroupNumberLessThanOrEqualTo(Integer value) {
            addCriterion("item_group_number <=", value, "itemGroupNumber");
            return (Criteria) this;
        }

        public Criteria andItemGroupNumberIn(List<Integer> values) {
            addCriterion("item_group_number in", values, "itemGroupNumber");
            return (Criteria) this;
        }

        public Criteria andItemGroupNumberNotIn(List<Integer> values) {
            addCriterion("item_group_number not in", values, "itemGroupNumber");
            return (Criteria) this;
        }

        public Criteria andItemGroupNumberBetween(Integer value1, Integer value2) {
            addCriterion("item_group_number between", value1, value2, "itemGroupNumber");
            return (Criteria) this;
        }

        public Criteria andItemGroupNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("item_group_number not between", value1, value2, "itemGroupNumber");
            return (Criteria) this;
        }

        public Criteria andCompetitionNumberIsNull() {
            addCriterion("competition_number is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionNumberIsNotNull() {
            addCriterion("competition_number is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionNumberEqualTo(Integer value) {
            addCriterion("competition_number =", value, "competitionNumber");
            return (Criteria) this;
        }

        public Criteria andCompetitionNumberNotEqualTo(Integer value) {
            addCriterion("competition_number <>", value, "competitionNumber");
            return (Criteria) this;
        }

        public Criteria andCompetitionNumberGreaterThan(Integer value) {
            addCriterion("competition_number >", value, "competitionNumber");
            return (Criteria) this;
        }

        public Criteria andCompetitionNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("competition_number >=", value, "competitionNumber");
            return (Criteria) this;
        }

        public Criteria andCompetitionNumberLessThan(Integer value) {
            addCriterion("competition_number <", value, "competitionNumber");
            return (Criteria) this;
        }

        public Criteria andCompetitionNumberLessThanOrEqualTo(Integer value) {
            addCriterion("competition_number <=", value, "competitionNumber");
            return (Criteria) this;
        }

        public Criteria andCompetitionNumberIn(List<Integer> values) {
            addCriterion("competition_number in", values, "competitionNumber");
            return (Criteria) this;
        }

        public Criteria andCompetitionNumberNotIn(List<Integer> values) {
            addCriterion("competition_number not in", values, "competitionNumber");
            return (Criteria) this;
        }

        public Criteria andCompetitionNumberBetween(Integer value1, Integer value2) {
            addCriterion("competition_number between", value1, value2, "competitionNumber");
            return (Criteria) this;
        }

        public Criteria andCompetitionNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("competition_number not between", value1, value2, "competitionNumber");
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