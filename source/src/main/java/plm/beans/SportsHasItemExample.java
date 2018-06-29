package plm.beans;

import java.util.ArrayList;
import java.util.List;

public class SportsHasItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SportsHasItemExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andRise1IsNull() {
            addCriterion("rise1 is null");
            return (Criteria) this;
        }

        public Criteria andRise1IsNotNull() {
            addCriterion("rise1 is not null");
            return (Criteria) this;
        }

        public Criteria andRise1EqualTo(Integer value) {
            addCriterion("rise1 =", value, "rise1");
            return (Criteria) this;
        }

        public Criteria andRise1NotEqualTo(Integer value) {
            addCriterion("rise1 <>", value, "rise1");
            return (Criteria) this;
        }

        public Criteria andRise1GreaterThan(Integer value) {
            addCriterion("rise1 >", value, "rise1");
            return (Criteria) this;
        }

        public Criteria andRise1GreaterThanOrEqualTo(Integer value) {
            addCriterion("rise1 >=", value, "rise1");
            return (Criteria) this;
        }

        public Criteria andRise1LessThan(Integer value) {
            addCriterion("rise1 <", value, "rise1");
            return (Criteria) this;
        }

        public Criteria andRise1LessThanOrEqualTo(Integer value) {
            addCriterion("rise1 <=", value, "rise1");
            return (Criteria) this;
        }

        public Criteria andRise1In(List<Integer> values) {
            addCriterion("rise1 in", values, "rise1");
            return (Criteria) this;
        }

        public Criteria andRise1NotIn(List<Integer> values) {
            addCriterion("rise1 not in", values, "rise1");
            return (Criteria) this;
        }

        public Criteria andRise1Between(Integer value1, Integer value2) {
            addCriterion("rise1 between", value1, value2, "rise1");
            return (Criteria) this;
        }

        public Criteria andRise1NotBetween(Integer value1, Integer value2) {
            addCriterion("rise1 not between", value1, value2, "rise1");
            return (Criteria) this;
        }

        public Criteria andRise2IsNull() {
            addCriterion("rise2 is null");
            return (Criteria) this;
        }

        public Criteria andRise2IsNotNull() {
            addCriterion("rise2 is not null");
            return (Criteria) this;
        }

        public Criteria andRise2EqualTo(Integer value) {
            addCriterion("rise2 =", value, "rise2");
            return (Criteria) this;
        }

        public Criteria andRise2NotEqualTo(Integer value) {
            addCriterion("rise2 <>", value, "rise2");
            return (Criteria) this;
        }

        public Criteria andRise2GreaterThan(Integer value) {
            addCriterion("rise2 >", value, "rise2");
            return (Criteria) this;
        }

        public Criteria andRise2GreaterThanOrEqualTo(Integer value) {
            addCriterion("rise2 >=", value, "rise2");
            return (Criteria) this;
        }

        public Criteria andRise2LessThan(Integer value) {
            addCriterion("rise2 <", value, "rise2");
            return (Criteria) this;
        }

        public Criteria andRise2LessThanOrEqualTo(Integer value) {
            addCriterion("rise2 <=", value, "rise2");
            return (Criteria) this;
        }

        public Criteria andRise2In(List<Integer> values) {
            addCriterion("rise2 in", values, "rise2");
            return (Criteria) this;
        }

        public Criteria andRise2NotIn(List<Integer> values) {
            addCriterion("rise2 not in", values, "rise2");
            return (Criteria) this;
        }

        public Criteria andRise2Between(Integer value1, Integer value2) {
            addCriterion("rise2 between", value1, value2, "rise2");
            return (Criteria) this;
        }

        public Criteria andRise2NotBetween(Integer value1, Integer value2) {
            addCriterion("rise2 not between", value1, value2, "rise2");
            return (Criteria) this;
        }

        public Criteria andRise3IsNull() {
            addCriterion("rise3 is null");
            return (Criteria) this;
        }

        public Criteria andRise3IsNotNull() {
            addCriterion("rise3 is not null");
            return (Criteria) this;
        }

        public Criteria andRise3EqualTo(Integer value) {
            addCriterion("rise3 =", value, "rise3");
            return (Criteria) this;
        }

        public Criteria andRise3NotEqualTo(Integer value) {
            addCriterion("rise3 <>", value, "rise3");
            return (Criteria) this;
        }

        public Criteria andRise3GreaterThan(Integer value) {
            addCriterion("rise3 >", value, "rise3");
            return (Criteria) this;
        }

        public Criteria andRise3GreaterThanOrEqualTo(Integer value) {
            addCriterion("rise3 >=", value, "rise3");
            return (Criteria) this;
        }

        public Criteria andRise3LessThan(Integer value) {
            addCriterion("rise3 <", value, "rise3");
            return (Criteria) this;
        }

        public Criteria andRise3LessThanOrEqualTo(Integer value) {
            addCriterion("rise3 <=", value, "rise3");
            return (Criteria) this;
        }

        public Criteria andRise3In(List<Integer> values) {
            addCriterion("rise3 in", values, "rise3");
            return (Criteria) this;
        }

        public Criteria andRise3NotIn(List<Integer> values) {
            addCriterion("rise3 not in", values, "rise3");
            return (Criteria) this;
        }

        public Criteria andRise3Between(Integer value1, Integer value2) {
            addCriterion("rise3 between", value1, value2, "rise3");
            return (Criteria) this;
        }

        public Criteria andRise3NotBetween(Integer value1, Integer value2) {
            addCriterion("rise3 not between", value1, value2, "rise3");
            return (Criteria) this;
        }

        public Criteria andRise4IsNull() {
            addCriterion("rise4 is null");
            return (Criteria) this;
        }

        public Criteria andRise4IsNotNull() {
            addCriterion("rise4 is not null");
            return (Criteria) this;
        }

        public Criteria andRise4EqualTo(Integer value) {
            addCriterion("rise4 =", value, "rise4");
            return (Criteria) this;
        }

        public Criteria andRise4NotEqualTo(Integer value) {
            addCriterion("rise4 <>", value, "rise4");
            return (Criteria) this;
        }

        public Criteria andRise4GreaterThan(Integer value) {
            addCriterion("rise4 >", value, "rise4");
            return (Criteria) this;
        }

        public Criteria andRise4GreaterThanOrEqualTo(Integer value) {
            addCriterion("rise4 >=", value, "rise4");
            return (Criteria) this;
        }

        public Criteria andRise4LessThan(Integer value) {
            addCriterion("rise4 <", value, "rise4");
            return (Criteria) this;
        }

        public Criteria andRise4LessThanOrEqualTo(Integer value) {
            addCriterion("rise4 <=", value, "rise4");
            return (Criteria) this;
        }

        public Criteria andRise4In(List<Integer> values) {
            addCriterion("rise4 in", values, "rise4");
            return (Criteria) this;
        }

        public Criteria andRise4NotIn(List<Integer> values) {
            addCriterion("rise4 not in", values, "rise4");
            return (Criteria) this;
        }

        public Criteria andRise4Between(Integer value1, Integer value2) {
            addCriterion("rise4 between", value1, value2, "rise4");
            return (Criteria) this;
        }

        public Criteria andRise4NotBetween(Integer value1, Integer value2) {
            addCriterion("rise4 not between", value1, value2, "rise4");
            return (Criteria) this;
        }

        public Criteria andRise5IsNull() {
            addCriterion("rise5 is null");
            return (Criteria) this;
        }

        public Criteria andRise5IsNotNull() {
            addCriterion("rise5 is not null");
            return (Criteria) this;
        }

        public Criteria andRise5EqualTo(Integer value) {
            addCriterion("rise5 =", value, "rise5");
            return (Criteria) this;
        }

        public Criteria andRise5NotEqualTo(Integer value) {
            addCriterion("rise5 <>", value, "rise5");
            return (Criteria) this;
        }

        public Criteria andRise5GreaterThan(Integer value) {
            addCriterion("rise5 >", value, "rise5");
            return (Criteria) this;
        }

        public Criteria andRise5GreaterThanOrEqualTo(Integer value) {
            addCriterion("rise5 >=", value, "rise5");
            return (Criteria) this;
        }

        public Criteria andRise5LessThan(Integer value) {
            addCriterion("rise5 <", value, "rise5");
            return (Criteria) this;
        }

        public Criteria andRise5LessThanOrEqualTo(Integer value) {
            addCriterion("rise5 <=", value, "rise5");
            return (Criteria) this;
        }

        public Criteria andRise5In(List<Integer> values) {
            addCriterion("rise5 in", values, "rise5");
            return (Criteria) this;
        }

        public Criteria andRise5NotIn(List<Integer> values) {
            addCriterion("rise5 not in", values, "rise5");
            return (Criteria) this;
        }

        public Criteria andRise5Between(Integer value1, Integer value2) {
            addCriterion("rise5 between", value1, value2, "rise5");
            return (Criteria) this;
        }

        public Criteria andRise5NotBetween(Integer value1, Integer value2) {
            addCriterion("rise5 not between", value1, value2, "rise5");
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