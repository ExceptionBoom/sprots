package plm.beans;

import java.util.ArrayList;
import java.util.List;

public class SportsSpaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SportsSpaceExample() {
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

        public Criteria andStraightTrackNumberIsNull() {
            addCriterion("straight_track_number is null");
            return (Criteria) this;
        }

        public Criteria andStraightTrackNumberIsNotNull() {
            addCriterion("straight_track_number is not null");
            return (Criteria) this;
        }

        public Criteria andStraightTrackNumberEqualTo(Integer value) {
            addCriterion("straight_track_number =", value, "straightTrackNumber");
            return (Criteria) this;
        }

        public Criteria andStraightTrackNumberNotEqualTo(Integer value) {
            addCriterion("straight_track_number <>", value, "straightTrackNumber");
            return (Criteria) this;
        }

        public Criteria andStraightTrackNumberGreaterThan(Integer value) {
            addCriterion("straight_track_number >", value, "straightTrackNumber");
            return (Criteria) this;
        }

        public Criteria andStraightTrackNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("straight_track_number >=", value, "straightTrackNumber");
            return (Criteria) this;
        }

        public Criteria andStraightTrackNumberLessThan(Integer value) {
            addCriterion("straight_track_number <", value, "straightTrackNumber");
            return (Criteria) this;
        }

        public Criteria andStraightTrackNumberLessThanOrEqualTo(Integer value) {
            addCriterion("straight_track_number <=", value, "straightTrackNumber");
            return (Criteria) this;
        }

        public Criteria andStraightTrackNumberIn(List<Integer> values) {
            addCriterion("straight_track_number in", values, "straightTrackNumber");
            return (Criteria) this;
        }

        public Criteria andStraightTrackNumberNotIn(List<Integer> values) {
            addCriterion("straight_track_number not in", values, "straightTrackNumber");
            return (Criteria) this;
        }

        public Criteria andStraightTrackNumberBetween(Integer value1, Integer value2) {
            addCriterion("straight_track_number between", value1, value2, "straightTrackNumber");
            return (Criteria) this;
        }

        public Criteria andStraightTrackNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("straight_track_number not between", value1, value2, "straightTrackNumber");
            return (Criteria) this;
        }

        public Criteria andBendTrackNumberIsNull() {
            addCriterion("bend_track_number is null");
            return (Criteria) this;
        }

        public Criteria andBendTrackNumberIsNotNull() {
            addCriterion("bend_track_number is not null");
            return (Criteria) this;
        }

        public Criteria andBendTrackNumberEqualTo(Integer value) {
            addCriterion("bend_track_number =", value, "bendTrackNumber");
            return (Criteria) this;
        }

        public Criteria andBendTrackNumberNotEqualTo(Integer value) {
            addCriterion("bend_track_number <>", value, "bendTrackNumber");
            return (Criteria) this;
        }

        public Criteria andBendTrackNumberGreaterThan(Integer value) {
            addCriterion("bend_track_number >", value, "bendTrackNumber");
            return (Criteria) this;
        }

        public Criteria andBendTrackNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("bend_track_number >=", value, "bendTrackNumber");
            return (Criteria) this;
        }

        public Criteria andBendTrackNumberLessThan(Integer value) {
            addCriterion("bend_track_number <", value, "bendTrackNumber");
            return (Criteria) this;
        }

        public Criteria andBendTrackNumberLessThanOrEqualTo(Integer value) {
            addCriterion("bend_track_number <=", value, "bendTrackNumber");
            return (Criteria) this;
        }

        public Criteria andBendTrackNumberIn(List<Integer> values) {
            addCriterion("bend_track_number in", values, "bendTrackNumber");
            return (Criteria) this;
        }

        public Criteria andBendTrackNumberNotIn(List<Integer> values) {
            addCriterion("bend_track_number not in", values, "bendTrackNumber");
            return (Criteria) this;
        }

        public Criteria andBendTrackNumberBetween(Integer value1, Integer value2) {
            addCriterion("bend_track_number between", value1, value2, "bendTrackNumber");
            return (Criteria) this;
        }

        public Criteria andBendTrackNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("bend_track_number not between", value1, value2, "bendTrackNumber");
            return (Criteria) this;
        }

        public Criteria andJumpingAreaNumberIsNull() {
            addCriterion("jumping_area_number is null");
            return (Criteria) this;
        }

        public Criteria andJumpingAreaNumberIsNotNull() {
            addCriterion("jumping_area_number is not null");
            return (Criteria) this;
        }

        public Criteria andJumpingAreaNumberEqualTo(Integer value) {
            addCriterion("jumping_area_number =", value, "jumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andJumpingAreaNumberNotEqualTo(Integer value) {
            addCriterion("jumping_area_number <>", value, "jumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andJumpingAreaNumberGreaterThan(Integer value) {
            addCriterion("jumping_area_number >", value, "jumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andJumpingAreaNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("jumping_area_number >=", value, "jumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andJumpingAreaNumberLessThan(Integer value) {
            addCriterion("jumping_area_number <", value, "jumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andJumpingAreaNumberLessThanOrEqualTo(Integer value) {
            addCriterion("jumping_area_number <=", value, "jumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andJumpingAreaNumberIn(List<Integer> values) {
            addCriterion("jumping_area_number in", values, "jumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andJumpingAreaNumberNotIn(List<Integer> values) {
            addCriterion("jumping_area_number not in", values, "jumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andJumpingAreaNumberBetween(Integer value1, Integer value2) {
            addCriterion("jumping_area_number between", value1, value2, "jumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andJumpingAreaNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("jumping_area_number not between", value1, value2, "jumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andHighJumpingAreaNumberIsNull() {
            addCriterion("high_jumping_area_number is null");
            return (Criteria) this;
        }

        public Criteria andHighJumpingAreaNumberIsNotNull() {
            addCriterion("high_jumping_area_number is not null");
            return (Criteria) this;
        }

        public Criteria andHighJumpingAreaNumberEqualTo(Integer value) {
            addCriterion("high_jumping_area_number =", value, "highJumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andHighJumpingAreaNumberNotEqualTo(Integer value) {
            addCriterion("high_jumping_area_number <>", value, "highJumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andHighJumpingAreaNumberGreaterThan(Integer value) {
            addCriterion("high_jumping_area_number >", value, "highJumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andHighJumpingAreaNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("high_jumping_area_number >=", value, "highJumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andHighJumpingAreaNumberLessThan(Integer value) {
            addCriterion("high_jumping_area_number <", value, "highJumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andHighJumpingAreaNumberLessThanOrEqualTo(Integer value) {
            addCriterion("high_jumping_area_number <=", value, "highJumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andHighJumpingAreaNumberIn(List<Integer> values) {
            addCriterion("high_jumping_area_number in", values, "highJumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andHighJumpingAreaNumberNotIn(List<Integer> values) {
            addCriterion("high_jumping_area_number not in", values, "highJumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andHighJumpingAreaNumberBetween(Integer value1, Integer value2) {
            addCriterion("high_jumping_area_number between", value1, value2, "highJumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andHighJumpingAreaNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("high_jumping_area_number not between", value1, value2, "highJumpingAreaNumber");
            return (Criteria) this;
        }

        public Criteria andShortThrowAreaNumberIsNull() {
            addCriterion("short_throw_area_number is null");
            return (Criteria) this;
        }

        public Criteria andShortThrowAreaNumberIsNotNull() {
            addCriterion("short_throw_area_number is not null");
            return (Criteria) this;
        }

        public Criteria andShortThrowAreaNumberEqualTo(Integer value) {
            addCriterion("short_throw_area_number =", value, "shortThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andShortThrowAreaNumberNotEqualTo(Integer value) {
            addCriterion("short_throw_area_number <>", value, "shortThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andShortThrowAreaNumberGreaterThan(Integer value) {
            addCriterion("short_throw_area_number >", value, "shortThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andShortThrowAreaNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("short_throw_area_number >=", value, "shortThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andShortThrowAreaNumberLessThan(Integer value) {
            addCriterion("short_throw_area_number <", value, "shortThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andShortThrowAreaNumberLessThanOrEqualTo(Integer value) {
            addCriterion("short_throw_area_number <=", value, "shortThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andShortThrowAreaNumberIn(List<Integer> values) {
            addCriterion("short_throw_area_number in", values, "shortThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andShortThrowAreaNumberNotIn(List<Integer> values) {
            addCriterion("short_throw_area_number not in", values, "shortThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andShortThrowAreaNumberBetween(Integer value1, Integer value2) {
            addCriterion("short_throw_area_number between", value1, value2, "shortThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andShortThrowAreaNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("short_throw_area_number not between", value1, value2, "shortThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andLongThrowAreaNumberIsNull() {
            addCriterion("long_throw_area_number is null");
            return (Criteria) this;
        }

        public Criteria andLongThrowAreaNumberIsNotNull() {
            addCriterion("long_throw_area_number is not null");
            return (Criteria) this;
        }

        public Criteria andLongThrowAreaNumberEqualTo(Integer value) {
            addCriterion("long_throw_area_number =", value, "longThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andLongThrowAreaNumberNotEqualTo(Integer value) {
            addCriterion("long_throw_area_number <>", value, "longThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andLongThrowAreaNumberGreaterThan(Integer value) {
            addCriterion("long_throw_area_number >", value, "longThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andLongThrowAreaNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("long_throw_area_number >=", value, "longThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andLongThrowAreaNumberLessThan(Integer value) {
            addCriterion("long_throw_area_number <", value, "longThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andLongThrowAreaNumberLessThanOrEqualTo(Integer value) {
            addCriterion("long_throw_area_number <=", value, "longThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andLongThrowAreaNumberIn(List<Integer> values) {
            addCriterion("long_throw_area_number in", values, "longThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andLongThrowAreaNumberNotIn(List<Integer> values) {
            addCriterion("long_throw_area_number not in", values, "longThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andLongThrowAreaNumberBetween(Integer value1, Integer value2) {
            addCriterion("long_throw_area_number between", value1, value2, "longThrowAreaNumber");
            return (Criteria) this;
        }

        public Criteria andLongThrowAreaNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("long_throw_area_number not between", value1, value2, "longThrowAreaNumber");
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