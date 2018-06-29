package plm.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SportsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SportsExample() {
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

        public Criteria andSpaceIdIsNull() {
            addCriterion("space_id is null");
            return (Criteria) this;
        }

        public Criteria andSpaceIdIsNotNull() {
            addCriterion("space_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceIdEqualTo(Integer value) {
            addCriterion("space_id =", value, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdNotEqualTo(Integer value) {
            addCriterion("space_id <>", value, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdGreaterThan(Integer value) {
            addCriterion("space_id >", value, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("space_id >=", value, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdLessThan(Integer value) {
            addCriterion("space_id <", value, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdLessThanOrEqualTo(Integer value) {
            addCriterion("space_id <=", value, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdIn(List<Integer> values) {
            addCriterion("space_id in", values, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdNotIn(List<Integer> values) {
            addCriterion("space_id not in", values, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdBetween(Integer value1, Integer value2) {
            addCriterion("space_id between", value1, value2, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSpaceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("space_id not between", value1, value2, "spaceId");
            return (Criteria) this;
        }

        public Criteria andSportsOrganzationCommitteeIdIsNull() {
            addCriterion("sports_organzation_committee_id is null");
            return (Criteria) this;
        }

        public Criteria andSportsOrganzationCommitteeIdIsNotNull() {
            addCriterion("sports_organzation_committee_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportsOrganzationCommitteeIdEqualTo(Integer value) {
            addCriterion("sports_organzation_committee_id =", value, "sportsOrganzationCommitteeId");
            return (Criteria) this;
        }

        public Criteria andSportsOrganzationCommitteeIdNotEqualTo(Integer value) {
            addCriterion("sports_organzation_committee_id <>", value, "sportsOrganzationCommitteeId");
            return (Criteria) this;
        }

        public Criteria andSportsOrganzationCommitteeIdGreaterThan(Integer value) {
            addCriterion("sports_organzation_committee_id >", value, "sportsOrganzationCommitteeId");
            return (Criteria) this;
        }

        public Criteria andSportsOrganzationCommitteeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sports_organzation_committee_id >=", value, "sportsOrganzationCommitteeId");
            return (Criteria) this;
        }

        public Criteria andSportsOrganzationCommitteeIdLessThan(Integer value) {
            addCriterion("sports_organzation_committee_id <", value, "sportsOrganzationCommitteeId");
            return (Criteria) this;
        }

        public Criteria andSportsOrganzationCommitteeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sports_organzation_committee_id <=", value, "sportsOrganzationCommitteeId");
            return (Criteria) this;
        }

        public Criteria andSportsOrganzationCommitteeIdIn(List<Integer> values) {
            addCriterion("sports_organzation_committee_id in", values, "sportsOrganzationCommitteeId");
            return (Criteria) this;
        }

        public Criteria andSportsOrganzationCommitteeIdNotIn(List<Integer> values) {
            addCriterion("sports_organzation_committee_id not in", values, "sportsOrganzationCommitteeId");
            return (Criteria) this;
        }

        public Criteria andSportsOrganzationCommitteeIdBetween(Integer value1, Integer value2) {
            addCriterion("sports_organzation_committee_id between", value1, value2, "sportsOrganzationCommitteeId");
            return (Criteria) this;
        }

        public Criteria andSportsOrganzationCommitteeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sports_organzation_committee_id not between", value1, value2, "sportsOrganzationCommitteeId");
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

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andHostUnitIsNull() {
            addCriterion("host_unit is null");
            return (Criteria) this;
        }

        public Criteria andHostUnitIsNotNull() {
            addCriterion("host_unit is not null");
            return (Criteria) this;
        }

        public Criteria andHostUnitEqualTo(String value) {
            addCriterion("host_unit =", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitNotEqualTo(String value) {
            addCriterion("host_unit <>", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitGreaterThan(String value) {
            addCriterion("host_unit >", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitGreaterThanOrEqualTo(String value) {
            addCriterion("host_unit >=", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitLessThan(String value) {
            addCriterion("host_unit <", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitLessThanOrEqualTo(String value) {
            addCriterion("host_unit <=", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitLike(String value) {
            addCriterion("host_unit like", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitNotLike(String value) {
            addCriterion("host_unit not like", value, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitIn(List<String> values) {
            addCriterion("host_unit in", values, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitNotIn(List<String> values) {
            addCriterion("host_unit not in", values, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitBetween(String value1, String value2) {
            addCriterion("host_unit between", value1, value2, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andHostUnitNotBetween(String value1, String value2) {
            addCriterion("host_unit not between", value1, value2, "hostUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitIsNull() {
            addCriterion("organize_unit is null");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitIsNotNull() {
            addCriterion("organize_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitEqualTo(String value) {
            addCriterion("organize_unit =", value, "organizeUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitNotEqualTo(String value) {
            addCriterion("organize_unit <>", value, "organizeUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitGreaterThan(String value) {
            addCriterion("organize_unit >", value, "organizeUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("organize_unit >=", value, "organizeUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitLessThan(String value) {
            addCriterion("organize_unit <", value, "organizeUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitLessThanOrEqualTo(String value) {
            addCriterion("organize_unit <=", value, "organizeUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitLike(String value) {
            addCriterion("organize_unit like", value, "organizeUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitNotLike(String value) {
            addCriterion("organize_unit not like", value, "organizeUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitIn(List<String> values) {
            addCriterion("organize_unit in", values, "organizeUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitNotIn(List<String> values) {
            addCriterion("organize_unit not in", values, "organizeUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitBetween(String value1, String value2) {
            addCriterion("organize_unit between", value1, value2, "organizeUnit");
            return (Criteria) this;
        }

        public Criteria andOrganizeUnitNotBetween(String value1, String value2) {
            addCriterion("organize_unit not between", value1, value2, "organizeUnit");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameIsNull() {
            addCriterion("sports_manager_name is null");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameIsNotNull() {
            addCriterion("sports_manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameEqualTo(String value) {
            addCriterion("sports_manager_name =", value, "sportsManagerName");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameNotEqualTo(String value) {
            addCriterion("sports_manager_name <>", value, "sportsManagerName");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameGreaterThan(String value) {
            addCriterion("sports_manager_name >", value, "sportsManagerName");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("sports_manager_name >=", value, "sportsManagerName");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameLessThan(String value) {
            addCriterion("sports_manager_name <", value, "sportsManagerName");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameLessThanOrEqualTo(String value) {
            addCriterion("sports_manager_name <=", value, "sportsManagerName");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameLike(String value) {
            addCriterion("sports_manager_name like", value, "sportsManagerName");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameNotLike(String value) {
            addCriterion("sports_manager_name not like", value, "sportsManagerName");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameIn(List<String> values) {
            addCriterion("sports_manager_name in", values, "sportsManagerName");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameNotIn(List<String> values) {
            addCriterion("sports_manager_name not in", values, "sportsManagerName");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameBetween(String value1, String value2) {
            addCriterion("sports_manager_name between", value1, value2, "sportsManagerName");
            return (Criteria) this;
        }

        public Criteria andSportsManagerNameNotBetween(String value1, String value2) {
            addCriterion("sports_manager_name not between", value1, value2, "sportsManagerName");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneIsNull() {
            addCriterion("sports_manager_phone is null");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneIsNotNull() {
            addCriterion("sports_manager_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneEqualTo(String value) {
            addCriterion("sports_manager_phone =", value, "sportsManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneNotEqualTo(String value) {
            addCriterion("sports_manager_phone <>", value, "sportsManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneGreaterThan(String value) {
            addCriterion("sports_manager_phone >", value, "sportsManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sports_manager_phone >=", value, "sportsManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneLessThan(String value) {
            addCriterion("sports_manager_phone <", value, "sportsManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("sports_manager_phone <=", value, "sportsManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneLike(String value) {
            addCriterion("sports_manager_phone like", value, "sportsManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneNotLike(String value) {
            addCriterion("sports_manager_phone not like", value, "sportsManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneIn(List<String> values) {
            addCriterion("sports_manager_phone in", values, "sportsManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneNotIn(List<String> values) {
            addCriterion("sports_manager_phone not in", values, "sportsManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneBetween(String value1, String value2) {
            addCriterion("sports_manager_phone between", value1, value2, "sportsManagerPhone");
            return (Criteria) this;
        }

        public Criteria andSportsManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("sports_manager_phone not between", value1, value2, "sportsManagerPhone");
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