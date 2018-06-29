package plm.beans;

import java.util.ArrayList;
import java.util.List;

public class SportsScoreSchemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SportsScoreSchemeExample() {
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

        public Criteria andSportsAwardGrade1IsNull() {
            addCriterion("sports_award_grade1 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade1IsNotNull() {
            addCriterion("sports_award_grade1 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade1EqualTo(Integer value) {
            addCriterion("sports_award_grade1 =", value, "sportsAwardGrade1");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade1NotEqualTo(Integer value) {
            addCriterion("sports_award_grade1 <>", value, "sportsAwardGrade1");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade1GreaterThan(Integer value) {
            addCriterion("sports_award_grade1 >", value, "sportsAwardGrade1");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade1GreaterThanOrEqualTo(Integer value) {
            addCriterion("sports_award_grade1 >=", value, "sportsAwardGrade1");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade1LessThan(Integer value) {
            addCriterion("sports_award_grade1 <", value, "sportsAwardGrade1");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade1LessThanOrEqualTo(Integer value) {
            addCriterion("sports_award_grade1 <=", value, "sportsAwardGrade1");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade1In(List<Integer> values) {
            addCriterion("sports_award_grade1 in", values, "sportsAwardGrade1");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade1NotIn(List<Integer> values) {
            addCriterion("sports_award_grade1 not in", values, "sportsAwardGrade1");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade1Between(Integer value1, Integer value2) {
            addCriterion("sports_award_grade1 between", value1, value2, "sportsAwardGrade1");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade1NotBetween(Integer value1, Integer value2) {
            addCriterion("sports_award_grade1 not between", value1, value2, "sportsAwardGrade1");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2IsNull() {
            addCriterion("sports_award_grade2 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2IsNotNull() {
            addCriterion("sports_award_grade2 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2EqualTo(String value) {
            addCriterion("sports_award_grade2 =", value, "sportsAwardGrade2");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2NotEqualTo(String value) {
            addCriterion("sports_award_grade2 <>", value, "sportsAwardGrade2");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2GreaterThan(String value) {
            addCriterion("sports_award_grade2 >", value, "sportsAwardGrade2");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade2 >=", value, "sportsAwardGrade2");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2LessThan(String value) {
            addCriterion("sports_award_grade2 <", value, "sportsAwardGrade2");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade2 <=", value, "sportsAwardGrade2");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2Like(String value) {
            addCriterion("sports_award_grade2 like", value, "sportsAwardGrade2");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2NotLike(String value) {
            addCriterion("sports_award_grade2 not like", value, "sportsAwardGrade2");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2In(List<String> values) {
            addCriterion("sports_award_grade2 in", values, "sportsAwardGrade2");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2NotIn(List<String> values) {
            addCriterion("sports_award_grade2 not in", values, "sportsAwardGrade2");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2Between(String value1, String value2) {
            addCriterion("sports_award_grade2 between", value1, value2, "sportsAwardGrade2");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade2NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade2 not between", value1, value2, "sportsAwardGrade2");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3IsNull() {
            addCriterion("sports_award_grade3 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3IsNotNull() {
            addCriterion("sports_award_grade3 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3EqualTo(String value) {
            addCriterion("sports_award_grade3 =", value, "sportsAwardGrade3");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3NotEqualTo(String value) {
            addCriterion("sports_award_grade3 <>", value, "sportsAwardGrade3");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3GreaterThan(String value) {
            addCriterion("sports_award_grade3 >", value, "sportsAwardGrade3");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade3 >=", value, "sportsAwardGrade3");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3LessThan(String value) {
            addCriterion("sports_award_grade3 <", value, "sportsAwardGrade3");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade3 <=", value, "sportsAwardGrade3");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3Like(String value) {
            addCriterion("sports_award_grade3 like", value, "sportsAwardGrade3");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3NotLike(String value) {
            addCriterion("sports_award_grade3 not like", value, "sportsAwardGrade3");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3In(List<String> values) {
            addCriterion("sports_award_grade3 in", values, "sportsAwardGrade3");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3NotIn(List<String> values) {
            addCriterion("sports_award_grade3 not in", values, "sportsAwardGrade3");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3Between(String value1, String value2) {
            addCriterion("sports_award_grade3 between", value1, value2, "sportsAwardGrade3");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade3NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade3 not between", value1, value2, "sportsAwardGrade3");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4IsNull() {
            addCriterion("sports_award_grade4 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4IsNotNull() {
            addCriterion("sports_award_grade4 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4EqualTo(String value) {
            addCriterion("sports_award_grade4 =", value, "sportsAwardGrade4");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4NotEqualTo(String value) {
            addCriterion("sports_award_grade4 <>", value, "sportsAwardGrade4");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4GreaterThan(String value) {
            addCriterion("sports_award_grade4 >", value, "sportsAwardGrade4");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade4 >=", value, "sportsAwardGrade4");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4LessThan(String value) {
            addCriterion("sports_award_grade4 <", value, "sportsAwardGrade4");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade4 <=", value, "sportsAwardGrade4");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4Like(String value) {
            addCriterion("sports_award_grade4 like", value, "sportsAwardGrade4");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4NotLike(String value) {
            addCriterion("sports_award_grade4 not like", value, "sportsAwardGrade4");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4In(List<String> values) {
            addCriterion("sports_award_grade4 in", values, "sportsAwardGrade4");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4NotIn(List<String> values) {
            addCriterion("sports_award_grade4 not in", values, "sportsAwardGrade4");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4Between(String value1, String value2) {
            addCriterion("sports_award_grade4 between", value1, value2, "sportsAwardGrade4");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade4NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade4 not between", value1, value2, "sportsAwardGrade4");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5IsNull() {
            addCriterion("sports_award_grade5 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5IsNotNull() {
            addCriterion("sports_award_grade5 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5EqualTo(String value) {
            addCriterion("sports_award_grade5 =", value, "sportsAwardGrade5");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5NotEqualTo(String value) {
            addCriterion("sports_award_grade5 <>", value, "sportsAwardGrade5");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5GreaterThan(String value) {
            addCriterion("sports_award_grade5 >", value, "sportsAwardGrade5");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade5 >=", value, "sportsAwardGrade5");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5LessThan(String value) {
            addCriterion("sports_award_grade5 <", value, "sportsAwardGrade5");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade5 <=", value, "sportsAwardGrade5");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5Like(String value) {
            addCriterion("sports_award_grade5 like", value, "sportsAwardGrade5");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5NotLike(String value) {
            addCriterion("sports_award_grade5 not like", value, "sportsAwardGrade5");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5In(List<String> values) {
            addCriterion("sports_award_grade5 in", values, "sportsAwardGrade5");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5NotIn(List<String> values) {
            addCriterion("sports_award_grade5 not in", values, "sportsAwardGrade5");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5Between(String value1, String value2) {
            addCriterion("sports_award_grade5 between", value1, value2, "sportsAwardGrade5");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade5NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade5 not between", value1, value2, "sportsAwardGrade5");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6IsNull() {
            addCriterion("sports_award_grade6 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6IsNotNull() {
            addCriterion("sports_award_grade6 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6EqualTo(String value) {
            addCriterion("sports_award_grade6 =", value, "sportsAwardGrade6");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6NotEqualTo(String value) {
            addCriterion("sports_award_grade6 <>", value, "sportsAwardGrade6");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6GreaterThan(String value) {
            addCriterion("sports_award_grade6 >", value, "sportsAwardGrade6");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade6 >=", value, "sportsAwardGrade6");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6LessThan(String value) {
            addCriterion("sports_award_grade6 <", value, "sportsAwardGrade6");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade6 <=", value, "sportsAwardGrade6");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6Like(String value) {
            addCriterion("sports_award_grade6 like", value, "sportsAwardGrade6");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6NotLike(String value) {
            addCriterion("sports_award_grade6 not like", value, "sportsAwardGrade6");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6In(List<String> values) {
            addCriterion("sports_award_grade6 in", values, "sportsAwardGrade6");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6NotIn(List<String> values) {
            addCriterion("sports_award_grade6 not in", values, "sportsAwardGrade6");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6Between(String value1, String value2) {
            addCriterion("sports_award_grade6 between", value1, value2, "sportsAwardGrade6");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade6NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade6 not between", value1, value2, "sportsAwardGrade6");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7IsNull() {
            addCriterion("sports_award_grade7 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7IsNotNull() {
            addCriterion("sports_award_grade7 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7EqualTo(String value) {
            addCriterion("sports_award_grade7 =", value, "sportsAwardGrade7");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7NotEqualTo(String value) {
            addCriterion("sports_award_grade7 <>", value, "sportsAwardGrade7");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7GreaterThan(String value) {
            addCriterion("sports_award_grade7 >", value, "sportsAwardGrade7");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade7 >=", value, "sportsAwardGrade7");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7LessThan(String value) {
            addCriterion("sports_award_grade7 <", value, "sportsAwardGrade7");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade7 <=", value, "sportsAwardGrade7");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7Like(String value) {
            addCriterion("sports_award_grade7 like", value, "sportsAwardGrade7");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7NotLike(String value) {
            addCriterion("sports_award_grade7 not like", value, "sportsAwardGrade7");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7In(List<String> values) {
            addCriterion("sports_award_grade7 in", values, "sportsAwardGrade7");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7NotIn(List<String> values) {
            addCriterion("sports_award_grade7 not in", values, "sportsAwardGrade7");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7Between(String value1, String value2) {
            addCriterion("sports_award_grade7 between", value1, value2, "sportsAwardGrade7");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade7NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade7 not between", value1, value2, "sportsAwardGrade7");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8IsNull() {
            addCriterion("sports_award_grade8 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8IsNotNull() {
            addCriterion("sports_award_grade8 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8EqualTo(String value) {
            addCriterion("sports_award_grade8 =", value, "sportsAwardGrade8");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8NotEqualTo(String value) {
            addCriterion("sports_award_grade8 <>", value, "sportsAwardGrade8");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8GreaterThan(String value) {
            addCriterion("sports_award_grade8 >", value, "sportsAwardGrade8");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade8 >=", value, "sportsAwardGrade8");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8LessThan(String value) {
            addCriterion("sports_award_grade8 <", value, "sportsAwardGrade8");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade8 <=", value, "sportsAwardGrade8");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8Like(String value) {
            addCriterion("sports_award_grade8 like", value, "sportsAwardGrade8");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8NotLike(String value) {
            addCriterion("sports_award_grade8 not like", value, "sportsAwardGrade8");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8In(List<String> values) {
            addCriterion("sports_award_grade8 in", values, "sportsAwardGrade8");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8NotIn(List<String> values) {
            addCriterion("sports_award_grade8 not in", values, "sportsAwardGrade8");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8Between(String value1, String value2) {
            addCriterion("sports_award_grade8 between", value1, value2, "sportsAwardGrade8");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade8NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade8 not between", value1, value2, "sportsAwardGrade8");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9IsNull() {
            addCriterion("sports_award_grade9 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9IsNotNull() {
            addCriterion("sports_award_grade9 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9EqualTo(String value) {
            addCriterion("sports_award_grade9 =", value, "sportsAwardGrade9");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9NotEqualTo(String value) {
            addCriterion("sports_award_grade9 <>", value, "sportsAwardGrade9");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9GreaterThan(String value) {
            addCriterion("sports_award_grade9 >", value, "sportsAwardGrade9");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade9 >=", value, "sportsAwardGrade9");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9LessThan(String value) {
            addCriterion("sports_award_grade9 <", value, "sportsAwardGrade9");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade9 <=", value, "sportsAwardGrade9");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9Like(String value) {
            addCriterion("sports_award_grade9 like", value, "sportsAwardGrade9");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9NotLike(String value) {
            addCriterion("sports_award_grade9 not like", value, "sportsAwardGrade9");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9In(List<String> values) {
            addCriterion("sports_award_grade9 in", values, "sportsAwardGrade9");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9NotIn(List<String> values) {
            addCriterion("sports_award_grade9 not in", values, "sportsAwardGrade9");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9Between(String value1, String value2) {
            addCriterion("sports_award_grade9 between", value1, value2, "sportsAwardGrade9");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade9NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade9 not between", value1, value2, "sportsAwardGrade9");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10IsNull() {
            addCriterion("sports_award_grade10 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10IsNotNull() {
            addCriterion("sports_award_grade10 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10EqualTo(String value) {
            addCriterion("sports_award_grade10 =", value, "sportsAwardGrade10");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10NotEqualTo(String value) {
            addCriterion("sports_award_grade10 <>", value, "sportsAwardGrade10");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10GreaterThan(String value) {
            addCriterion("sports_award_grade10 >", value, "sportsAwardGrade10");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade10 >=", value, "sportsAwardGrade10");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10LessThan(String value) {
            addCriterion("sports_award_grade10 <", value, "sportsAwardGrade10");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade10 <=", value, "sportsAwardGrade10");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10Like(String value) {
            addCriterion("sports_award_grade10 like", value, "sportsAwardGrade10");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10NotLike(String value) {
            addCriterion("sports_award_grade10 not like", value, "sportsAwardGrade10");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10In(List<String> values) {
            addCriterion("sports_award_grade10 in", values, "sportsAwardGrade10");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10NotIn(List<String> values) {
            addCriterion("sports_award_grade10 not in", values, "sportsAwardGrade10");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10Between(String value1, String value2) {
            addCriterion("sports_award_grade10 between", value1, value2, "sportsAwardGrade10");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade10NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade10 not between", value1, value2, "sportsAwardGrade10");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11IsNull() {
            addCriterion("sports_award_grade11 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11IsNotNull() {
            addCriterion("sports_award_grade11 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11EqualTo(String value) {
            addCriterion("sports_award_grade11 =", value, "sportsAwardGrade11");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11NotEqualTo(String value) {
            addCriterion("sports_award_grade11 <>", value, "sportsAwardGrade11");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11GreaterThan(String value) {
            addCriterion("sports_award_grade11 >", value, "sportsAwardGrade11");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade11 >=", value, "sportsAwardGrade11");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11LessThan(String value) {
            addCriterion("sports_award_grade11 <", value, "sportsAwardGrade11");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade11 <=", value, "sportsAwardGrade11");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11Like(String value) {
            addCriterion("sports_award_grade11 like", value, "sportsAwardGrade11");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11NotLike(String value) {
            addCriterion("sports_award_grade11 not like", value, "sportsAwardGrade11");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11In(List<String> values) {
            addCriterion("sports_award_grade11 in", values, "sportsAwardGrade11");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11NotIn(List<String> values) {
            addCriterion("sports_award_grade11 not in", values, "sportsAwardGrade11");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11Between(String value1, String value2) {
            addCriterion("sports_award_grade11 between", value1, value2, "sportsAwardGrade11");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade11NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade11 not between", value1, value2, "sportsAwardGrade11");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12IsNull() {
            addCriterion("sports_award_grade12 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12IsNotNull() {
            addCriterion("sports_award_grade12 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12EqualTo(String value) {
            addCriterion("sports_award_grade12 =", value, "sportsAwardGrade12");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12NotEqualTo(String value) {
            addCriterion("sports_award_grade12 <>", value, "sportsAwardGrade12");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12GreaterThan(String value) {
            addCriterion("sports_award_grade12 >", value, "sportsAwardGrade12");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade12 >=", value, "sportsAwardGrade12");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12LessThan(String value) {
            addCriterion("sports_award_grade12 <", value, "sportsAwardGrade12");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade12 <=", value, "sportsAwardGrade12");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12Like(String value) {
            addCriterion("sports_award_grade12 like", value, "sportsAwardGrade12");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12NotLike(String value) {
            addCriterion("sports_award_grade12 not like", value, "sportsAwardGrade12");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12In(List<String> values) {
            addCriterion("sports_award_grade12 in", values, "sportsAwardGrade12");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12NotIn(List<String> values) {
            addCriterion("sports_award_grade12 not in", values, "sportsAwardGrade12");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12Between(String value1, String value2) {
            addCriterion("sports_award_grade12 between", value1, value2, "sportsAwardGrade12");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade12NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade12 not between", value1, value2, "sportsAwardGrade12");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13IsNull() {
            addCriterion("sports_award_grade13 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13IsNotNull() {
            addCriterion("sports_award_grade13 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13EqualTo(String value) {
            addCriterion("sports_award_grade13 =", value, "sportsAwardGrade13");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13NotEqualTo(String value) {
            addCriterion("sports_award_grade13 <>", value, "sportsAwardGrade13");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13GreaterThan(String value) {
            addCriterion("sports_award_grade13 >", value, "sportsAwardGrade13");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade13 >=", value, "sportsAwardGrade13");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13LessThan(String value) {
            addCriterion("sports_award_grade13 <", value, "sportsAwardGrade13");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade13 <=", value, "sportsAwardGrade13");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13Like(String value) {
            addCriterion("sports_award_grade13 like", value, "sportsAwardGrade13");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13NotLike(String value) {
            addCriterion("sports_award_grade13 not like", value, "sportsAwardGrade13");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13In(List<String> values) {
            addCriterion("sports_award_grade13 in", values, "sportsAwardGrade13");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13NotIn(List<String> values) {
            addCriterion("sports_award_grade13 not in", values, "sportsAwardGrade13");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13Between(String value1, String value2) {
            addCriterion("sports_award_grade13 between", value1, value2, "sportsAwardGrade13");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade13NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade13 not between", value1, value2, "sportsAwardGrade13");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14IsNull() {
            addCriterion("sports_award_grade14 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14IsNotNull() {
            addCriterion("sports_award_grade14 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14EqualTo(String value) {
            addCriterion("sports_award_grade14 =", value, "sportsAwardGrade14");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14NotEqualTo(String value) {
            addCriterion("sports_award_grade14 <>", value, "sportsAwardGrade14");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14GreaterThan(String value) {
            addCriterion("sports_award_grade14 >", value, "sportsAwardGrade14");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade14 >=", value, "sportsAwardGrade14");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14LessThan(String value) {
            addCriterion("sports_award_grade14 <", value, "sportsAwardGrade14");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade14 <=", value, "sportsAwardGrade14");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14Like(String value) {
            addCriterion("sports_award_grade14 like", value, "sportsAwardGrade14");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14NotLike(String value) {
            addCriterion("sports_award_grade14 not like", value, "sportsAwardGrade14");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14In(List<String> values) {
            addCriterion("sports_award_grade14 in", values, "sportsAwardGrade14");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14NotIn(List<String> values) {
            addCriterion("sports_award_grade14 not in", values, "sportsAwardGrade14");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14Between(String value1, String value2) {
            addCriterion("sports_award_grade14 between", value1, value2, "sportsAwardGrade14");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade14NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade14 not between", value1, value2, "sportsAwardGrade14");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15IsNull() {
            addCriterion("sports_award_grade15 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15IsNotNull() {
            addCriterion("sports_award_grade15 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15EqualTo(String value) {
            addCriterion("sports_award_grade15 =", value, "sportsAwardGrade15");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15NotEqualTo(String value) {
            addCriterion("sports_award_grade15 <>", value, "sportsAwardGrade15");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15GreaterThan(String value) {
            addCriterion("sports_award_grade15 >", value, "sportsAwardGrade15");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade15 >=", value, "sportsAwardGrade15");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15LessThan(String value) {
            addCriterion("sports_award_grade15 <", value, "sportsAwardGrade15");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade15 <=", value, "sportsAwardGrade15");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15Like(String value) {
            addCriterion("sports_award_grade15 like", value, "sportsAwardGrade15");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15NotLike(String value) {
            addCriterion("sports_award_grade15 not like", value, "sportsAwardGrade15");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15In(List<String> values) {
            addCriterion("sports_award_grade15 in", values, "sportsAwardGrade15");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15NotIn(List<String> values) {
            addCriterion("sports_award_grade15 not in", values, "sportsAwardGrade15");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15Between(String value1, String value2) {
            addCriterion("sports_award_grade15 between", value1, value2, "sportsAwardGrade15");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade15NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade15 not between", value1, value2, "sportsAwardGrade15");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16IsNull() {
            addCriterion("sports_award_grade16 is null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16IsNotNull() {
            addCriterion("sports_award_grade16 is not null");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16EqualTo(String value) {
            addCriterion("sports_award_grade16 =", value, "sportsAwardGrade16");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16NotEqualTo(String value) {
            addCriterion("sports_award_grade16 <>", value, "sportsAwardGrade16");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16GreaterThan(String value) {
            addCriterion("sports_award_grade16 >", value, "sportsAwardGrade16");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16GreaterThanOrEqualTo(String value) {
            addCriterion("sports_award_grade16 >=", value, "sportsAwardGrade16");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16LessThan(String value) {
            addCriterion("sports_award_grade16 <", value, "sportsAwardGrade16");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16LessThanOrEqualTo(String value) {
            addCriterion("sports_award_grade16 <=", value, "sportsAwardGrade16");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16Like(String value) {
            addCriterion("sports_award_grade16 like", value, "sportsAwardGrade16");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16NotLike(String value) {
            addCriterion("sports_award_grade16 not like", value, "sportsAwardGrade16");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16In(List<String> values) {
            addCriterion("sports_award_grade16 in", values, "sportsAwardGrade16");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16NotIn(List<String> values) {
            addCriterion("sports_award_grade16 not in", values, "sportsAwardGrade16");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16Between(String value1, String value2) {
            addCriterion("sports_award_grade16 between", value1, value2, "sportsAwardGrade16");
            return (Criteria) this;
        }

        public Criteria andSportsAwardGrade16NotBetween(String value1, String value2) {
            addCriterion("sports_award_grade16 not between", value1, value2, "sportsAwardGrade16");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeIsNull() {
            addCriterion("break_score_grade is null");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeIsNotNull() {
            addCriterion("break_score_grade is not null");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeEqualTo(String value) {
            addCriterion("break_score_grade =", value, "breakScoreGrade");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeNotEqualTo(String value) {
            addCriterion("break_score_grade <>", value, "breakScoreGrade");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeGreaterThan(String value) {
            addCriterion("break_score_grade >", value, "breakScoreGrade");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeGreaterThanOrEqualTo(String value) {
            addCriterion("break_score_grade >=", value, "breakScoreGrade");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeLessThan(String value) {
            addCriterion("break_score_grade <", value, "breakScoreGrade");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeLessThanOrEqualTo(String value) {
            addCriterion("break_score_grade <=", value, "breakScoreGrade");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeLike(String value) {
            addCriterion("break_score_grade like", value, "breakScoreGrade");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeNotLike(String value) {
            addCriterion("break_score_grade not like", value, "breakScoreGrade");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeIn(List<String> values) {
            addCriterion("break_score_grade in", values, "breakScoreGrade");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeNotIn(List<String> values) {
            addCriterion("break_score_grade not in", values, "breakScoreGrade");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeBetween(String value1, String value2) {
            addCriterion("break_score_grade between", value1, value2, "breakScoreGrade");
            return (Criteria) this;
        }

        public Criteria andBreakScoreGradeNotBetween(String value1, String value2) {
            addCriterion("break_score_grade not between", value1, value2, "breakScoreGrade");
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