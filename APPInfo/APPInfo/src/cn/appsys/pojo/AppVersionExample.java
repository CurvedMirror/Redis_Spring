package cn.appsys.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppVersionExample() {
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
            addCriterion("appversion.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("appversion.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("appversion.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("appversion.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("appversion.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("appversion.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("appversion.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("appversion.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("appversion.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("appversion.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("appversion.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("appversion.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("appversion.appId is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("appversion.appId is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(Long value) {
            addCriterion("appversion.appId =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(Long value) {
            addCriterion("appversion.appId <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(Long value) {
            addCriterion("appversion.appId >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(Long value) {
            addCriterion("appversion.appId >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(Long value) {
            addCriterion("appversion.appId <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(Long value) {
            addCriterion("appversion.appId <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<Long> values) {
            addCriterion("appversion.appId in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<Long> values) {
            addCriterion("appversion.appId not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(Long value1, Long value2) {
            addCriterion("appversion.appId between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(Long value1, Long value2) {
            addCriterion("appversion.appId not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andVersionnoIsNull() {
            addCriterion("appversion.versionNo is null");
            return (Criteria) this;
        }

        public Criteria andVersionnoIsNotNull() {
            addCriterion("appversion.versionNo is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnoEqualTo(String value) {
            addCriterion("appversion.versionNo =", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotEqualTo(String value) {
            addCriterion("appversion.versionNo <>", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThan(String value) {
            addCriterion("appversion.versionNo >", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThanOrEqualTo(String value) {
            addCriterion("appversion.versionNo >=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThan(String value) {
            addCriterion("appversion.versionNo <", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThanOrEqualTo(String value) {
            addCriterion("appversion.versionNo <=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLike(String value) {
            addCriterion("appversion.versionNo like", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotLike(String value) {
            addCriterion("appversion.versionNo not like", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoIn(List<String> values) {
            addCriterion("appversion.versionNo in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotIn(List<String> values) {
            addCriterion("appversion.versionNo not in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoBetween(String value1, String value2) {
            addCriterion("appversion.versionNo between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotBetween(String value1, String value2) {
            addCriterion("appversion.versionNo not between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersioninfoIsNull() {
            addCriterion("appversion.versionInfo is null");
            return (Criteria) this;
        }

        public Criteria andVersioninfoIsNotNull() {
            addCriterion("appversion.versionInfo is not null");
            return (Criteria) this;
        }

        public Criteria andVersioninfoEqualTo(String value) {
            addCriterion("appversion.versionInfo =", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoNotEqualTo(String value) {
            addCriterion("appversion.versionInfo <>", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoGreaterThan(String value) {
            addCriterion("appversion.versionInfo >", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoGreaterThanOrEqualTo(String value) {
            addCriterion("appversion.versionInfo >=", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoLessThan(String value) {
            addCriterion("appversion.versionInfo <", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoLessThanOrEqualTo(String value) {
            addCriterion("appversion.versionInfo <=", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoLike(String value) {
            addCriterion("appversion.versionInfo like", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoNotLike(String value) {
            addCriterion("appversion.versionInfo not like", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoIn(List<String> values) {
            addCriterion("appversion.versionInfo in", values, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoNotIn(List<String> values) {
            addCriterion("appversion.versionInfo not in", values, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoBetween(String value1, String value2) {
            addCriterion("appversion.versionInfo between", value1, value2, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoNotBetween(String value1, String value2) {
            addCriterion("appversion.versionInfo not between", value1, value2, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andPublishstatusIsNull() {
            addCriterion("appversion.publishStatus is null");
            return (Criteria) this;
        }

        public Criteria andPublishstatusIsNotNull() {
            addCriterion("appversion.publishStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPublishstatusEqualTo(Long value) {
            addCriterion("appversion.publishStatus =", value, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusNotEqualTo(Long value) {
            addCriterion("appversion.publishStatus <>", value, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusGreaterThan(Long value) {
            addCriterion("appversion.publishStatus >", value, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusGreaterThanOrEqualTo(Long value) {
            addCriterion("appversion.publishStatus >=", value, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusLessThan(Long value) {
            addCriterion("appversion.publishStatus <", value, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusLessThanOrEqualTo(Long value) {
            addCriterion("appversion.publishStatus <=", value, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusIn(List<Long> values) {
            addCriterion("appversion.publishStatus in", values, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusNotIn(List<Long> values) {
            addCriterion("appversion.publishStatus not in", values, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusBetween(Long value1, Long value2) {
            addCriterion("appversion.publishStatus between", value1, value2, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusNotBetween(Long value1, Long value2) {
            addCriterion("appversion.publishStatus not between", value1, value2, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkIsNull() {
            addCriterion("appversion.downloadLink is null");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkIsNotNull() {
            addCriterion("appversion.downloadLink is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkEqualTo(String value) {
            addCriterion("appversion.downloadLink =", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkNotEqualTo(String value) {
            addCriterion("appversion.downloadLink <>", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkGreaterThan(String value) {
            addCriterion("appversion.downloadLink >", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkGreaterThanOrEqualTo(String value) {
            addCriterion("appversion.downloadLink >=", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkLessThan(String value) {
            addCriterion("appversion.downloadLink <", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkLessThanOrEqualTo(String value) {
            addCriterion("appversion.downloadLink <=", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkLike(String value) {
            addCriterion("appversion.downloadLink like", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkNotLike(String value) {
            addCriterion("appversion.downloadLink not like", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkIn(List<String> values) {
            addCriterion("appversion.downloadLink in", values, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkNotIn(List<String> values) {
            addCriterion("appversion.downloadLink not in", values, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkBetween(String value1, String value2) {
            addCriterion("appversion.downloadLink between", value1, value2, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkNotBetween(String value1, String value2) {
            addCriterion("appversion.downloadLink not between", value1, value2, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andVersionsizeIsNull() {
            addCriterion("appversion.versionSize is null");
            return (Criteria) this;
        }

        public Criteria andVersionsizeIsNotNull() {
            addCriterion("appversion.versionSize is not null");
            return (Criteria) this;
        }

        public Criteria andVersionsizeEqualTo(BigDecimal value) {
            addCriterion("appversion.versionSize =", value, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeNotEqualTo(BigDecimal value) {
            addCriterion("appversion.versionSize <>", value, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeGreaterThan(BigDecimal value) {
            addCriterion("appversion.versionSize >", value, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("appversion.versionSize >=", value, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeLessThan(BigDecimal value) {
            addCriterion("appversion.versionSize <", value, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("appversion.versionSize <=", value, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeIn(List<BigDecimal> values) {
            addCriterion("appversion.versionSize in", values, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeNotIn(List<BigDecimal> values) {
            addCriterion("appversion.versionSize not in", values, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("appversion.versionSize between", value1, value2, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("appversion.versionSize not between", value1, value2, "versionsize");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("appversion.createdBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("appversion.createdBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(Long value) {
            addCriterion("appversion.createdBy =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(Long value) {
            addCriterion("appversion.createdBy <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(Long value) {
            addCriterion("appversion.createdBy >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(Long value) {
            addCriterion("appversion.createdBy >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(Long value) {
            addCriterion("appversion.createdBy <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(Long value) {
            addCriterion("appversion.createdBy <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<Long> values) {
            addCriterion("appversion.createdBy in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<Long> values) {
            addCriterion("appversion.createdBy not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(Long value1, Long value2) {
            addCriterion("appversion.createdBy between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(Long value1, Long value2) {
            addCriterion("appversion.createdBy not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNull() {
            addCriterion("appversion.creationDate is null");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNotNull() {
            addCriterion("appversion.creationDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreationdateEqualTo(Date value) {
            addCriterion("appversion.creationDate =", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotEqualTo(Date value) {
            addCriterion("appversion.creationDate <>", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThan(Date value) {
            addCriterion("appversion.creationDate >", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("appversion.creationDate >=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThan(Date value) {
            addCriterion("appversion.creationDate <", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThanOrEqualTo(Date value) {
            addCriterion("appversion.creationDate <=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateIn(List<Date> values) {
            addCriterion("appversion.creationDate in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotIn(List<Date> values) {
            addCriterion("appversion.creationDate not in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateBetween(Date value1, Date value2) {
            addCriterion("appversion.creationDate between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotBetween(Date value1, Date value2) {
            addCriterion("appversion.creationDate not between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNull() {
            addCriterion("appversion.modifyBy is null");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNotNull() {
            addCriterion("appversion.modifyBy is not null");
            return (Criteria) this;
        }

        public Criteria andModifybyEqualTo(Long value) {
            addCriterion("appversion.modifyBy =", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotEqualTo(Long value) {
            addCriterion("appversion.modifyBy <>", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThan(Long value) {
            addCriterion("appversion.modifyBy >", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThanOrEqualTo(Long value) {
            addCriterion("appversion.modifyBy >=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThan(Long value) {
            addCriterion("appversion.modifyBy <", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThanOrEqualTo(Long value) {
            addCriterion("appversion.modifyBy <=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyIn(List<Long> values) {
            addCriterion("appversion.modifyBy in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotIn(List<Long> values) {
            addCriterion("appversion.modifyBy not in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyBetween(Long value1, Long value2) {
            addCriterion("appversion.modifyBy between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotBetween(Long value1, Long value2) {
            addCriterion("appversion.modifyBy not between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("appversion.modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("appversion.modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("appversion.modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("appversion.modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("appversion.modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("appversion.modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("appversion.modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("appversion.modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("appversion.modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("appversion.modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("appversion.modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("appversion.modifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andApklocpathIsNull() {
            addCriterion("appversion.apkLocPath is null");
            return (Criteria) this;
        }

        public Criteria andApklocpathIsNotNull() {
            addCriterion("appversion.apkLocPath is not null");
            return (Criteria) this;
        }

        public Criteria andApklocpathEqualTo(String value) {
            addCriterion("appversion.apkLocPath =", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathNotEqualTo(String value) {
            addCriterion("appversion.apkLocPath <>", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathGreaterThan(String value) {
            addCriterion("appversion.apkLocPath >", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathGreaterThanOrEqualTo(String value) {
            addCriterion("appversion.apkLocPath >=", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathLessThan(String value) {
            addCriterion("appversion.apkLocPath <", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathLessThanOrEqualTo(String value) {
            addCriterion("appversion.apkLocPath <=", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathLike(String value) {
            addCriterion("appversion.apkLocPath like", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathNotLike(String value) {
            addCriterion("appversion.apkLocPath not like", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathIn(List<String> values) {
            addCriterion("appversion.apkLocPath in", values, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathNotIn(List<String> values) {
            addCriterion("appversion.apkLocPath not in", values, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathBetween(String value1, String value2) {
            addCriterion("appversion.apkLocPath between", value1, value2, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathNotBetween(String value1, String value2) {
            addCriterion("appversion.apkLocPath not between", value1, value2, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApkfilenameIsNull() {
            addCriterion("appversion.apkFileName is null");
            return (Criteria) this;
        }

        public Criteria andApkfilenameIsNotNull() {
            addCriterion("appversion.apkFileName is not null");
            return (Criteria) this;
        }

        public Criteria andApkfilenameEqualTo(String value) {
            addCriterion("appversion.apkFileName =", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameNotEqualTo(String value) {
            addCriterion("appversion.apkFileName <>", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameGreaterThan(String value) {
            addCriterion("appversion.apkFileName >", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("appversion.apkFileName >=", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameLessThan(String value) {
            addCriterion("appversion.apkFileName <", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameLessThanOrEqualTo(String value) {
            addCriterion("appversion.apkFileName <=", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameLike(String value) {
            addCriterion("appversion.apkFileName like", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameNotLike(String value) {
            addCriterion("appversion.apkFileName not like", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameIn(List<String> values) {
            addCriterion("appversion.apkFileName in", values, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameNotIn(List<String> values) {
            addCriterion("appversion.apkFileName not in", values, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameBetween(String value1, String value2) {
            addCriterion("appversion.apkFileName between", value1, value2, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameNotBetween(String value1, String value2) {
            addCriterion("appversion.apkFileName not between", value1, value2, "apkfilename");
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