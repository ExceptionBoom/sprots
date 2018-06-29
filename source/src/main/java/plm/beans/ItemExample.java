package plm.beans;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andPropertyIsNull() {
            addCriterion("property is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("property is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(String value) {
            addCriterion("property =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(String value) {
            addCriterion("property <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(String value) {
            addCriterion("property >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("property >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(String value) {
            addCriterion("property <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(String value) {
            addCriterion("property <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLike(String value) {
            addCriterion("property like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotLike(String value) {
            addCriterion("property not like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<String> values) {
            addCriterion("property in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<String> values) {
            addCriterion("property not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(String value1, String value2) {
            addCriterion("property between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(String value1, String value2) {
            addCriterion("property not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andSpiltTrackIsNull() {
            addCriterion("spilt_track is null");
            return (Criteria) this;
        }

        public Criteria andSpiltTrackIsNotNull() {
            addCriterion("spilt_track is not null");
            return (Criteria) this;
        }

        public Criteria andSpiltTrackEqualTo(Boolean value) {
            addCriterion("spilt_track =", value, "spiltTrack");
            return (Criteria) this;
        }

        public Criteria andSpiltTrackNotEqualTo(Boolean value) {
            addCriterion("spilt_track <>", value, "spiltTrack");
            return (Criteria) this;
        }

        public Criteria andSpiltTrackGreaterThan(Boolean value) {
            addCriterion("spilt_track >", value, "spiltTrack");
            return (Criteria) this;
        }

        public Criteria andSpiltTrackGreaterThanOrEqualTo(Boolean value) {
            addCriterion("spilt_track >=", value, "spiltTrack");
            return (Criteria) this;
        }

        public Criteria andSpiltTrackLessThan(Boolean value) {
            addCriterion("spilt_track <", value, "spiltTrack");
            return (Criteria) this;
        }

        public Criteria andSpiltTrackLessThanOrEqualTo(Boolean value) {
            addCriterion("spilt_track <=", value, "spiltTrack");
            return (Criteria) this;
        }

        public Criteria andSpiltTrackIn(List<Boolean> values) {
            addCriterion("spilt_track in", values, "spiltTrack");
            return (Criteria) this;
        }

        public Criteria andSpiltTrackNotIn(List<Boolean> values) {
            addCriterion("spilt_track not in", values, "spiltTrack");
            return (Criteria) this;
        }

        public Criteria andSpiltTrackBetween(Boolean value1, Boolean value2) {
            addCriterion("spilt_track between", value1, value2, "spiltTrack");
            return (Criteria) this;
        }

        public Criteria andSpiltTrackNotBetween(Boolean value1, Boolean value2) {
            addCriterion("spilt_track not between", value1, value2, "spiltTrack");
            return (Criteria) this;
        }

        public Criteria andUseTrackNumberIsNull() {
            addCriterion("use_track_number is null");
            return (Criteria) this;
        }

        public Criteria andUseTrackNumberIsNotNull() {
            addCriterion("use_track_number is not null");
            return (Criteria) this;
        }

        public Criteria andUseTrackNumberEqualTo(Integer value) {
            addCriterion("use_track_number =", value, "useTrackNumber");
            return (Criteria) this;
        }

        public Criteria andUseTrackNumberNotEqualTo(Integer value) {
            addCriterion("use_track_number <>", value, "useTrackNumber");
            return (Criteria) this;
        }

        public Criteria andUseTrackNumberGreaterThan(Integer value) {
            addCriterion("use_track_number >", value, "useTrackNumber");
            return (Criteria) this;
        }

        public Criteria andUseTrackNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_track_number >=", value, "useTrackNumber");
            return (Criteria) this;
        }

        public Criteria andUseTrackNumberLessThan(Integer value) {
            addCriterion("use_track_number <", value, "useTrackNumber");
            return (Criteria) this;
        }

        public Criteria andUseTrackNumberLessThanOrEqualTo(Integer value) {
            addCriterion("use_track_number <=", value, "useTrackNumber");
            return (Criteria) this;
        }

        public Criteria andUseTrackNumberIn(List<Integer> values) {
            addCriterion("use_track_number in", values, "useTrackNumber");
            return (Criteria) this;
        }

        public Criteria andUseTrackNumberNotIn(List<Integer> values) {
            addCriterion("use_track_number not in", values, "useTrackNumber");
            return (Criteria) this;
        }

        public Criteria andUseTrackNumberBetween(Integer value1, Integer value2) {
            addCriterion("use_track_number between", value1, value2, "useTrackNumber");
            return (Criteria) this;
        }

        public Criteria andUseTrackNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("use_track_number not between", value1, value2, "useTrackNumber");
            return (Criteria) this;
        }

        public Criteria andGroupParticipantsNumberIsNull() {
            addCriterion("group_participants_number is null");
            return (Criteria) this;
        }

        public Criteria andGroupParticipantsNumberIsNotNull() {
            addCriterion("group_participants_number is not null");
            return (Criteria) this;
        }

        public Criteria andGroupParticipantsNumberEqualTo(Integer value) {
            addCriterion("group_participants_number =", value, "groupParticipantsNumber");
            return (Criteria) this;
        }

        public Criteria andGroupParticipantsNumberNotEqualTo(Integer value) {
            addCriterion("group_participants_number <>", value, "groupParticipantsNumber");
            return (Criteria) this;
        }

        public Criteria andGroupParticipantsNumberGreaterThan(Integer value) {
            addCriterion("group_participants_number >", value, "groupParticipantsNumber");
            return (Criteria) this;
        }

        public Criteria andGroupParticipantsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_participants_number >=", value, "groupParticipantsNumber");
            return (Criteria) this;
        }

        public Criteria andGroupParticipantsNumberLessThan(Integer value) {
            addCriterion("group_participants_number <", value, "groupParticipantsNumber");
            return (Criteria) this;
        }

        public Criteria andGroupParticipantsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("group_participants_number <=", value, "groupParticipantsNumber");
            return (Criteria) this;
        }

        public Criteria andGroupParticipantsNumberIn(List<Integer> values) {
            addCriterion("group_participants_number in", values, "groupParticipantsNumber");
            return (Criteria) this;
        }

        public Criteria andGroupParticipantsNumberNotIn(List<Integer> values) {
            addCriterion("group_participants_number not in", values, "groupParticipantsNumber");
            return (Criteria) this;
        }

        public Criteria andGroupParticipantsNumberBetween(Integer value1, Integer value2) {
            addCriterion("group_participants_number between", value1, value2, "groupParticipantsNumber");
            return (Criteria) this;
        }

        public Criteria andGroupParticipantsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("group_participants_number not between", value1, value2, "groupParticipantsNumber");
            return (Criteria) this;
        }

        public Criteria andResultFormatIsNull() {
            addCriterion("result_format is null");
            return (Criteria) this;
        }

        public Criteria andResultFormatIsNotNull() {
            addCriterion("result_format is not null");
            return (Criteria) this;
        }

        public Criteria andResultFormatEqualTo(String value) {
            addCriterion("result_format =", value, "resultFormat");
            return (Criteria) this;
        }

        public Criteria andResultFormatNotEqualTo(String value) {
            addCriterion("result_format <>", value, "resultFormat");
            return (Criteria) this;
        }

        public Criteria andResultFormatGreaterThan(String value) {
            addCriterion("result_format >", value, "resultFormat");
            return (Criteria) this;
        }

        public Criteria andResultFormatGreaterThanOrEqualTo(String value) {
            addCriterion("result_format >=", value, "resultFormat");
            return (Criteria) this;
        }

        public Criteria andResultFormatLessThan(String value) {
            addCriterion("result_format <", value, "resultFormat");
            return (Criteria) this;
        }

        public Criteria andResultFormatLessThanOrEqualTo(String value) {
            addCriterion("result_format <=", value, "resultFormat");
            return (Criteria) this;
        }

        public Criteria andResultFormatLike(String value) {
            addCriterion("result_format like", value, "resultFormat");
            return (Criteria) this;
        }

        public Criteria andResultFormatNotLike(String value) {
            addCriterion("result_format not like", value, "resultFormat");
            return (Criteria) this;
        }

        public Criteria andResultFormatIn(List<String> values) {
            addCriterion("result_format in", values, "resultFormat");
            return (Criteria) this;
        }

        public Criteria andResultFormatNotIn(List<String> values) {
            addCriterion("result_format not in", values, "resultFormat");
            return (Criteria) this;
        }

        public Criteria andResultFormatBetween(String value1, String value2) {
            addCriterion("result_format between", value1, value2, "resultFormat");
            return (Criteria) this;
        }

        public Criteria andResultFormatNotBetween(String value1, String value2) {
            addCriterion("result_format not between", value1, value2, "resultFormat");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andGroupTimeIsNull() {
            addCriterion("group_time is null");
            return (Criteria) this;
        }

        public Criteria andGroupTimeIsNotNull() {
            addCriterion("group_time is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTimeEqualTo(String value) {
            addCriterion("group_time =", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeNotEqualTo(String value) {
            addCriterion("group_time <>", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeGreaterThan(String value) {
            addCriterion("group_time >", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeGreaterThanOrEqualTo(String value) {
            addCriterion("group_time >=", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeLessThan(String value) {
            addCriterion("group_time <", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeLessThanOrEqualTo(String value) {
            addCriterion("group_time <=", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeLike(String value) {
            addCriterion("group_time like", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeNotLike(String value) {
            addCriterion("group_time not like", value, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeIn(List<String> values) {
            addCriterion("group_time in", values, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeNotIn(List<String> values) {
            addCriterion("group_time not in", values, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeBetween(String value1, String value2) {
            addCriterion("group_time between", value1, value2, "groupTime");
            return (Criteria) this;
        }

        public Criteria andGroupTimeNotBetween(String value1, String value2) {
            addCriterion("group_time not between", value1, value2, "groupTime");
            return (Criteria) this;
        }

        public Criteria andSaveIsNull() {
            addCriterion("save is null");
            return (Criteria) this;
        }

        public Criteria andSaveIsNotNull() {
            addCriterion("save is not null");
            return (Criteria) this;
        }

        public Criteria andSaveEqualTo(Boolean value) {
            addCriterion("save =", value, "save");
            return (Criteria) this;
        }

        public Criteria andSaveNotEqualTo(Boolean value) {
            addCriterion("save <>", value, "save");
            return (Criteria) this;
        }

        public Criteria andSaveGreaterThan(Boolean value) {
            addCriterion("save >", value, "save");
            return (Criteria) this;
        }

        public Criteria andSaveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("save >=", value, "save");
            return (Criteria) this;
        }

        public Criteria andSaveLessThan(Boolean value) {
            addCriterion("save <", value, "save");
            return (Criteria) this;
        }

        public Criteria andSaveLessThanOrEqualTo(Boolean value) {
            addCriterion("save <=", value, "save");
            return (Criteria) this;
        }

        public Criteria andSaveIn(List<Boolean> values) {
            addCriterion("save in", values, "save");
            return (Criteria) this;
        }

        public Criteria andSaveNotIn(List<Boolean> values) {
            addCriterion("save not in", values, "save");
            return (Criteria) this;
        }

        public Criteria andSaveBetween(Boolean value1, Boolean value2) {
            addCriterion("save between", value1, value2, "save");
            return (Criteria) this;
        }

        public Criteria andSaveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("save not between", value1, value2, "save");
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