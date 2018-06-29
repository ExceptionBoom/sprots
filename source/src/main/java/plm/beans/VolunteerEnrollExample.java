package plm.beans;

import java.util.ArrayList;
import java.util.List;

public class VolunteerEnrollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VolunteerEnrollExample() {
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

        public Criteria andParticipantsIdIsNull() {
            addCriterion("participants_id is null");
            return (Criteria) this;
        }

        public Criteria andParticipantsIdIsNotNull() {
            addCriterion("participants_id is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantsIdEqualTo(Integer value) {
            addCriterion("participants_id =", value, "participantsId");
            return (Criteria) this;
        }

        public Criteria andParticipantsIdNotEqualTo(Integer value) {
            addCriterion("participants_id <>", value, "participantsId");
            return (Criteria) this;
        }

        public Criteria andParticipantsIdGreaterThan(Integer value) {
            addCriterion("participants_id >", value, "participantsId");
            return (Criteria) this;
        }

        public Criteria andParticipantsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("participants_id >=", value, "participantsId");
            return (Criteria) this;
        }

        public Criteria andParticipantsIdLessThan(Integer value) {
            addCriterion("participants_id <", value, "participantsId");
            return (Criteria) this;
        }

        public Criteria andParticipantsIdLessThanOrEqualTo(Integer value) {
            addCriterion("participants_id <=", value, "participantsId");
            return (Criteria) this;
        }

        public Criteria andParticipantsIdIn(List<Integer> values) {
            addCriterion("participants_id in", values, "participantsId");
            return (Criteria) this;
        }

        public Criteria andParticipantsIdNotIn(List<Integer> values) {
            addCriterion("participants_id not in", values, "participantsId");
            return (Criteria) this;
        }

        public Criteria andParticipantsIdBetween(Integer value1, Integer value2) {
            addCriterion("participants_id between", value1, value2, "participantsId");
            return (Criteria) this;
        }

        public Criteria andParticipantsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("participants_id not between", value1, value2, "participantsId");
            return (Criteria) this;
        }

        public Criteria andOrganizationManagerIdIsNull() {
            addCriterion("organization_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationManagerIdIsNotNull() {
            addCriterion("organization_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationManagerIdEqualTo(Integer value) {
            addCriterion("organization_manager_id =", value, "organizationManagerId");
            return (Criteria) this;
        }

        public Criteria andOrganizationManagerIdNotEqualTo(Integer value) {
            addCriterion("organization_manager_id <>", value, "organizationManagerId");
            return (Criteria) this;
        }

        public Criteria andOrganizationManagerIdGreaterThan(Integer value) {
            addCriterion("organization_manager_id >", value, "organizationManagerId");
            return (Criteria) this;
        }

        public Criteria andOrganizationManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("organization_manager_id >=", value, "organizationManagerId");
            return (Criteria) this;
        }

        public Criteria andOrganizationManagerIdLessThan(Integer value) {
            addCriterion("organization_manager_id <", value, "organizationManagerId");
            return (Criteria) this;
        }

        public Criteria andOrganizationManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("organization_manager_id <=", value, "organizationManagerId");
            return (Criteria) this;
        }

        public Criteria andOrganizationManagerIdIn(List<Integer> values) {
            addCriterion("organization_manager_id in", values, "organizationManagerId");
            return (Criteria) this;
        }

        public Criteria andOrganizationManagerIdNotIn(List<Integer> values) {
            addCriterion("organization_manager_id not in", values, "organizationManagerId");
            return (Criteria) this;
        }

        public Criteria andOrganizationManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("organization_manager_id between", value1, value2, "organizationManagerId");
            return (Criteria) this;
        }

        public Criteria andOrganizationManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("organization_manager_id not between", value1, value2, "organizationManagerId");
            return (Criteria) this;
        }

        public Criteria andVolunteerPositionIdIsNull() {
            addCriterion("volunteer_position_id is null");
            return (Criteria) this;
        }

        public Criteria andVolunteerPositionIdIsNotNull() {
            addCriterion("volunteer_position_id is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteerPositionIdEqualTo(Integer value) {
            addCriterion("volunteer_position_id =", value, "volunteerPositionId");
            return (Criteria) this;
        }

        public Criteria andVolunteerPositionIdNotEqualTo(Integer value) {
            addCriterion("volunteer_position_id <>", value, "volunteerPositionId");
            return (Criteria) this;
        }

        public Criteria andVolunteerPositionIdGreaterThan(Integer value) {
            addCriterion("volunteer_position_id >", value, "volunteerPositionId");
            return (Criteria) this;
        }

        public Criteria andVolunteerPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("volunteer_position_id >=", value, "volunteerPositionId");
            return (Criteria) this;
        }

        public Criteria andVolunteerPositionIdLessThan(Integer value) {
            addCriterion("volunteer_position_id <", value, "volunteerPositionId");
            return (Criteria) this;
        }

        public Criteria andVolunteerPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("volunteer_position_id <=", value, "volunteerPositionId");
            return (Criteria) this;
        }

        public Criteria andVolunteerPositionIdIn(List<Integer> values) {
            addCriterion("volunteer_position_id in", values, "volunteerPositionId");
            return (Criteria) this;
        }

        public Criteria andVolunteerPositionIdNotIn(List<Integer> values) {
            addCriterion("volunteer_position_id not in", values, "volunteerPositionId");
            return (Criteria) this;
        }

        public Criteria andVolunteerPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("volunteer_position_id between", value1, value2, "volunteerPositionId");
            return (Criteria) this;
        }

        public Criteria andVolunteerPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("volunteer_position_id not between", value1, value2, "volunteerPositionId");
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

        public Criteria andJudgeStateIsNull() {
            addCriterion("judge_state is null");
            return (Criteria) this;
        }

        public Criteria andJudgeStateIsNotNull() {
            addCriterion("judge_state is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeStateEqualTo(Boolean value) {
            addCriterion("judge_state =", value, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateNotEqualTo(Boolean value) {
            addCriterion("judge_state <>", value, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateGreaterThan(Boolean value) {
            addCriterion("judge_state >", value, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("judge_state >=", value, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateLessThan(Boolean value) {
            addCriterion("judge_state <", value, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateLessThanOrEqualTo(Boolean value) {
            addCriterion("judge_state <=", value, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateIn(List<Boolean> values) {
            addCriterion("judge_state in", values, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateNotIn(List<Boolean> values) {
            addCriterion("judge_state not in", values, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateBetween(Boolean value1, Boolean value2) {
            addCriterion("judge_state between", value1, value2, "judgeState");
            return (Criteria) this;
        }

        public Criteria andJudgeStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("judge_state not between", value1, value2, "judgeState");
            return (Criteria) this;
        }

        public Criteria andDescribetionIsNull() {
            addCriterion("describetion is null");
            return (Criteria) this;
        }

        public Criteria andDescribetionIsNotNull() {
            addCriterion("describetion is not null");
            return (Criteria) this;
        }

        public Criteria andDescribetionEqualTo(String value) {
            addCriterion("describetion =", value, "describetion");
            return (Criteria) this;
        }

        public Criteria andDescribetionNotEqualTo(String value) {
            addCriterion("describetion <>", value, "describetion");
            return (Criteria) this;
        }

        public Criteria andDescribetionGreaterThan(String value) {
            addCriterion("describetion >", value, "describetion");
            return (Criteria) this;
        }

        public Criteria andDescribetionGreaterThanOrEqualTo(String value) {
            addCriterion("describetion >=", value, "describetion");
            return (Criteria) this;
        }

        public Criteria andDescribetionLessThan(String value) {
            addCriterion("describetion <", value, "describetion");
            return (Criteria) this;
        }

        public Criteria andDescribetionLessThanOrEqualTo(String value) {
            addCriterion("describetion <=", value, "describetion");
            return (Criteria) this;
        }

        public Criteria andDescribetionLike(String value) {
            addCriterion("describetion like", value, "describetion");
            return (Criteria) this;
        }

        public Criteria andDescribetionNotLike(String value) {
            addCriterion("describetion not like", value, "describetion");
            return (Criteria) this;
        }

        public Criteria andDescribetionIn(List<String> values) {
            addCriterion("describetion in", values, "describetion");
            return (Criteria) this;
        }

        public Criteria andDescribetionNotIn(List<String> values) {
            addCriterion("describetion not in", values, "describetion");
            return (Criteria) this;
        }

        public Criteria andDescribetionBetween(String value1, String value2) {
            addCriterion("describetion between", value1, value2, "describetion");
            return (Criteria) this;
        }

        public Criteria andDescribetionNotBetween(String value1, String value2) {
            addCriterion("describetion not between", value1, value2, "describetion");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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