package cn.appsys.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdPromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdPromotionExample() {
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
            addCriterion("adpromotion.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("adpromotion.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("adpromotion.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("adpromotion.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("adpromotion.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("adpromotion.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("adpromotion.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("adpromotion.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("adpromotion.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("adpromotion.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("adpromotion.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("adpromotion.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("adpromotion.appId is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("adpromotion.appId is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(Long value) {
            addCriterion("adpromotion.appId =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(Long value) {
            addCriterion("adpromotion.appId <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(Long value) {
            addCriterion("adpromotion.appId >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(Long value) {
            addCriterion("adpromotion.appId >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(Long value) {
            addCriterion("adpromotion.appId <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(Long value) {
            addCriterion("adpromotion.appId <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<Long> values) {
            addCriterion("adpromotion.appId in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<Long> values) {
            addCriterion("adpromotion.appId not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(Long value1, Long value2) {
            addCriterion("adpromotion.appId between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(Long value1, Long value2) {
            addCriterion("adpromotion.appId not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAdpicpathIsNull() {
            addCriterion("adpromotion.adPicPath is null");
            return (Criteria) this;
        }

        public Criteria andAdpicpathIsNotNull() {
            addCriterion("adpromotion.adPicPath is not null");
            return (Criteria) this;
        }

        public Criteria andAdpicpathEqualTo(String value) {
            addCriterion("adpromotion.adPicPath =", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathNotEqualTo(String value) {
            addCriterion("adpromotion.adPicPath <>", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathGreaterThan(String value) {
            addCriterion("adpromotion.adPicPath >", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathGreaterThanOrEqualTo(String value) {
            addCriterion("adpromotion.adPicPath >=", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathLessThan(String value) {
            addCriterion("adpromotion.adPicPath <", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathLessThanOrEqualTo(String value) {
            addCriterion("adpromotion.adPicPath <=", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathLike(String value) {
            addCriterion("adpromotion.adPicPath like", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathNotLike(String value) {
            addCriterion("adpromotion.adPicPath not like", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathIn(List<String> values) {
            addCriterion("adpromotion.adPicPath in", values, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathNotIn(List<String> values) {
            addCriterion("adpromotion.adPicPath not in", values, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathBetween(String value1, String value2) {
            addCriterion("adpromotion.adPicPath between", value1, value2, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathNotBetween(String value1, String value2) {
            addCriterion("adpromotion.adPicPath not between", value1, value2, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpvIsNull() {
            addCriterion("adpromotion.adPV is null");
            return (Criteria) this;
        }

        public Criteria andAdpvIsNotNull() {
            addCriterion("adpromotion.adPV is not null");
            return (Criteria) this;
        }

        public Criteria andAdpvEqualTo(Long value) {
            addCriterion("adpromotion.adPV =", value, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvNotEqualTo(Long value) {
            addCriterion("adpromotion.adPV <>", value, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvGreaterThan(Long value) {
            addCriterion("adpromotion.adPV >", value, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvGreaterThanOrEqualTo(Long value) {
            addCriterion("adpromotion.adPV >=", value, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvLessThan(Long value) {
            addCriterion("adpromotion.adPV <", value, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvLessThanOrEqualTo(Long value) {
            addCriterion("adpromotion.adPV <=", value, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvIn(List<Long> values) {
            addCriterion("adpromotion.adPV in", values, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvNotIn(List<Long> values) {
            addCriterion("adpromotion.adPV not in", values, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvBetween(Long value1, Long value2) {
            addCriterion("adpromotion.adPV between", value1, value2, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvNotBetween(Long value1, Long value2) {
            addCriterion("adpromotion.adPV not between", value1, value2, "adpv");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionIsNull() {
            addCriterion("adpromotion.carouselPosition is null");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionIsNotNull() {
            addCriterion("adpromotion.carouselPosition is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionEqualTo(Integer value) {
            addCriterion("adpromotion.carouselPosition =", value, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionNotEqualTo(Integer value) {
            addCriterion("adpromotion.carouselPosition <>", value, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionGreaterThan(Integer value) {
            addCriterion("adpromotion.carouselPosition >", value, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("adpromotion.carouselPosition >=", value, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionLessThan(Integer value) {
            addCriterion("adpromotion.carouselPosition <", value, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionLessThanOrEqualTo(Integer value) {
            addCriterion("adpromotion.carouselPosition <=", value, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionIn(List<Integer> values) {
            addCriterion("adpromotion.carouselPosition in", values, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionNotIn(List<Integer> values) {
            addCriterion("adpromotion.carouselPosition not in", values, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionBetween(Integer value1, Integer value2) {
            addCriterion("adpromotion.carouselPosition between", value1, value2, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionNotBetween(Integer value1, Integer value2) {
            addCriterion("adpromotion.carouselPosition not between", value1, value2, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("adpromotion.startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("adpromotion.startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("adpromotion.startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("adpromotion.startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("adpromotion.startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("adpromotion.startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("adpromotion.startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("adpromotion.startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("adpromotion.startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("adpromotion.startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("adpromotion.startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("adpromotion.startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("adpromotion.endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("adpromotion.endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("adpromotion.endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("adpromotion.endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("adpromotion.endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("adpromotion.endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("adpromotion.endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("adpromotion.endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("adpromotion.endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("adpromotion.endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("adpromotion.endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("adpromotion.endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("adpromotion.createdBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("adpromotion.createdBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(Long value) {
            addCriterion("adpromotion.createdBy =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(Long value) {
            addCriterion("adpromotion.createdBy <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(Long value) {
            addCriterion("adpromotion.createdBy >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(Long value) {
            addCriterion("adpromotion.createdBy >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(Long value) {
            addCriterion("adpromotion.createdBy <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(Long value) {
            addCriterion("adpromotion.createdBy <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<Long> values) {
            addCriterion("adpromotion.createdBy in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<Long> values) {
            addCriterion("adpromotion.createdBy not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(Long value1, Long value2) {
            addCriterion("adpromotion.createdBy between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(Long value1, Long value2) {
            addCriterion("adpromotion.createdBy not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNull() {
            addCriterion("adpromotion.creationDate is null");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNotNull() {
            addCriterion("adpromotion.creationDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreationdateEqualTo(Date value) {
            addCriterion("adpromotion.creationDate =", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotEqualTo(Date value) {
            addCriterion("adpromotion.creationDate <>", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThan(Date value) {
            addCriterion("adpromotion.creationDate >", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("adpromotion.creationDate >=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThan(Date value) {
            addCriterion("adpromotion.creationDate <", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThanOrEqualTo(Date value) {
            addCriterion("adpromotion.creationDate <=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateIn(List<Date> values) {
            addCriterion("adpromotion.creationDate in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotIn(List<Date> values) {
            addCriterion("adpromotion.creationDate not in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateBetween(Date value1, Date value2) {
            addCriterion("adpromotion.creationDate between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotBetween(Date value1, Date value2) {
            addCriterion("adpromotion.creationDate not between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNull() {
            addCriterion("adpromotion.modifyBy is null");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNotNull() {
            addCriterion("adpromotion.modifyBy is not null");
            return (Criteria) this;
        }

        public Criteria andModifybyEqualTo(Long value) {
            addCriterion("adpromotion.modifyBy =", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotEqualTo(Long value) {
            addCriterion("adpromotion.modifyBy <>", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThan(Long value) {
            addCriterion("adpromotion.modifyBy >", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThanOrEqualTo(Long value) {
            addCriterion("adpromotion.modifyBy >=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThan(Long value) {
            addCriterion("adpromotion.modifyBy <", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThanOrEqualTo(Long value) {
            addCriterion("adpromotion.modifyBy <=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyIn(List<Long> values) {
            addCriterion("adpromotion.modifyBy in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotIn(List<Long> values) {
            addCriterion("adpromotion.modifyBy not in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyBetween(Long value1, Long value2) {
            addCriterion("adpromotion.modifyBy between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotBetween(Long value1, Long value2) {
            addCriterion("adpromotion.modifyBy not between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("adpromotion.modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("adpromotion.modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("adpromotion.modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("adpromotion.modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("adpromotion.modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("adpromotion.modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("adpromotion.modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("adpromotion.modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("adpromotion.modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("adpromotion.modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("adpromotion.modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("adpromotion.modifyDate not between", value1, value2, "modifydate");
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