package plm.beans;

import java.util.ArrayList;
import java.util.List;

public class AthletesEnrollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AthletesEnrollExample() {
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

        public Criteria andCompetitionUnitManagerIdIsNull() {
            addCriterion("competition_unit_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitManagerIdIsNotNull() {
            addCriterion("competition_unit_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitManagerIdEqualTo(Integer value) {
            addCriterion("competition_unit_manager_id =", value, "competitionUnitManagerId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitManagerIdNotEqualTo(Integer value) {
            addCriterion("competition_unit_manager_id <>", value, "competitionUnitManagerId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitManagerIdGreaterThan(Integer value) {
            addCriterion("competition_unit_manager_id >", value, "competitionUnitManagerId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("competition_unit_manager_id >=", value, "competitionUnitManagerId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitManagerIdLessThan(Integer value) {
            addCriterion("competition_unit_manager_id <", value, "competitionUnitManagerId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("competition_unit_manager_id <=", value, "competitionUnitManagerId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitManagerIdIn(List<Integer> values) {
            addCriterion("competition_unit_manager_id in", values, "competitionUnitManagerId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitManagerIdNotIn(List<Integer> values) {
            addCriterion("competition_unit_manager_id not in", values, "competitionUnitManagerId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("competition_unit_manager_id between", value1, value2, "competitionUnitManagerId");
            return (Criteria) this;
        }

        public Criteria andCompetitionUnitManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("competition_unit_manager_id not between", value1, value2, "competitionUnitManagerId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupUnitIdIsNull() {
            addCriterion("sports_group_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andSportsGroupUnitIdIsNotNull() {
            addCriterion("sports_group_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportsGroupUnitIdEqualTo(Integer value) {
            addCriterion("sports_group_unit_id =", value, "sportsGroupUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupUnitIdNotEqualTo(Integer value) {
            addCriterion("sports_group_unit_id <>", value, "sportsGroupUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupUnitIdGreaterThan(Integer value) {
            addCriterion("sports_group_unit_id >", value, "sportsGroupUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sports_group_unit_id >=", value, "sportsGroupUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupUnitIdLessThan(Integer value) {
            addCriterion("sports_group_unit_id <", value, "sportsGroupUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("sports_group_unit_id <=", value, "sportsGroupUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupUnitIdIn(List<Integer> values) {
            addCriterion("sports_group_unit_id in", values, "sportsGroupUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupUnitIdNotIn(List<Integer> values) {
            addCriterion("sports_group_unit_id not in", values, "sportsGroupUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("sports_group_unit_id between", value1, value2, "sportsGroupUnitId");
            return (Criteria) this;
        }

        public Criteria andSportsGroupUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sports_group_unit_id not between", value1, value2, "sportsGroupUnitId");
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
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