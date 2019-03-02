package cn.appsys.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppCategoryExample() {
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
            addCriterion("appcategory.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("appcategory.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("appcategory.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("appcategory.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("appcategory.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("appcategory.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("appcategory.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("appcategory.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("appcategory.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("appcategory.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("appcategory.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("appcategory.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCategorycodeIsNull() {
            addCriterion("appcategory.categoryCode is null");
            return (Criteria) this;
        }

        public Criteria andCategorycodeIsNotNull() {
            addCriterion("appcategory.categoryCode is not null");
            return (Criteria) this;
        }

        public Criteria andCategorycodeEqualTo(String value) {
            addCriterion("appcategory.categoryCode =", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeNotEqualTo(String value) {
            addCriterion("appcategory.categoryCode <>", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeGreaterThan(String value) {
            addCriterion("appcategory.categoryCode >", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeGreaterThanOrEqualTo(String value) {
            addCriterion("appcategory.categoryCode >=", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeLessThan(String value) {
            addCriterion("appcategory.categoryCode <", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeLessThanOrEqualTo(String value) {
            addCriterion("appcategory.categoryCode <=", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeLike(String value) {
            addCriterion("appcategory.categoryCode like", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeNotLike(String value) {
            addCriterion("appcategory.categoryCode not like", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeIn(List<String> values) {
            addCriterion("appcategory.categoryCode in", values, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeNotIn(List<String> values) {
            addCriterion("appcategory.categoryCode not in", values, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeBetween(String value1, String value2) {
            addCriterion("appcategory.categoryCode between", value1, value2, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeNotBetween(String value1, String value2) {
            addCriterion("appcategory.categoryCode not between", value1, value2, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorynameIsNull() {
            addCriterion("appcategory.categoryName is null");
            return (Criteria) this;
        }

        public Criteria andCategorynameIsNotNull() {
            addCriterion("appcategory.categoryName is not null");
            return (Criteria) this;
        }

        public Criteria andCategorynameEqualTo(String value) {
            addCriterion("appcategory.categoryName =", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotEqualTo(String value) {
            addCriterion("appcategory.categoryName <>", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameGreaterThan(String value) {
            addCriterion("appcategory.categoryName >", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameGreaterThanOrEqualTo(String value) {
            addCriterion("appcategory.categoryName >=", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameLessThan(String value) {
            addCriterion("appcategory.categoryName <", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameLessThanOrEqualTo(String value) {
            addCriterion("appcategory.categoryName <=", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameLike(String value) {
            addCriterion("appcategory.categoryName like", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotLike(String value) {
            addCriterion("appcategory.categoryName not like", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameIn(List<String> values) {
            addCriterion("appcategory.categoryName in", values, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotIn(List<String> values) {
            addCriterion("appcategory.categoryName not in", values, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameBetween(String value1, String value2) {
            addCriterion("appcategory.categoryName between", value1, value2, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotBetween(String value1, String value2) {
            addCriterion("appcategory.categoryName not between", value1, value2, "categoryname");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("appcategory.parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("appcategory.parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Long value) {
            addCriterion("appcategory.parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Long value) {
            addCriterion("appcategory.parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Long value) {
            addCriterion("appcategory.parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("appcategory.parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Long value) {
            addCriterion("appcategory.parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Long value) {
            addCriterion("appcategory.parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Long> values) {
            addCriterion("appcategory.parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Long> values) {
            addCriterion("appcategory.parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Long value1, Long value2) {
            addCriterion("appcategory.parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Long value1, Long value2) {
            addCriterion("appcategory.parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("appcategory.createdBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("appcategory.createdBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(Long value) {
            addCriterion("appcategory.createdBy =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(Long value) {
            addCriterion("appcategory.createdBy <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(Long value) {
            addCriterion("appcategory.createdBy >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(Long value) {
            addCriterion("appcategory.createdBy >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(Long value) {
            addCriterion("appcategory.createdBy <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(Long value) {
            addCriterion("appcategory.createdBy <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<Long> values) {
            addCriterion("appcategory.createdBy in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<Long> values) {
            addCriterion("appcategory.createdBy not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(Long value1, Long value2) {
            addCriterion("appcategory.createdBy between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(Long value1, Long value2) {
            addCriterion("appcategory.createdBy not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("appcategory.creationTime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("appcategory.creationTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("appcategory.creationTime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("appcategory.creationTime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("appcategory.creationTime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appcategory.creationTime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("appcategory.creationTime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("appcategory.creationTime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("appcategory.creationTime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("appcategory.creationTime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("appcategory.creationTime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("appcategory.creationTime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNull() {
            addCriterion("appcategory.modifyBy is null");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNotNull() {
            addCriterion("appcategory.modifyBy is not null");
            return (Criteria) this;
        }

        public Criteria andModifybyEqualTo(Long value) {
            addCriterion("appcategory.modifyBy =", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotEqualTo(Long value) {
            addCriterion("appcategory.modifyBy <>", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThan(Long value) {
            addCriterion("appcategory.modifyBy >", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThanOrEqualTo(Long value) {
            addCriterion("appcategory.modifyBy >=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThan(Long value) {
            addCriterion("appcategory.modifyBy <", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThanOrEqualTo(Long value) {
            addCriterion("appcategory.modifyBy <=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyIn(List<Long> values) {
            addCriterion("appcategory.modifyBy in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotIn(List<Long> values) {
            addCriterion("appcategory.modifyBy not in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyBetween(Long value1, Long value2) {
            addCriterion("appcategory.modifyBy between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotBetween(Long value1, Long value2) {
            addCriterion("appcategory.modifyBy not between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("appcategory.modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("appcategory.modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("appcategory.modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("appcategory.modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("appcategory.modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("appcategory.modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("appcategory.modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("appcategory.modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("appcategory.modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("appcategory.modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("appcategory.modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("appcategory.modifyDate not between", value1, value2, "modifydate");
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