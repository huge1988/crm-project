package com.qy25.sm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIsNull() {
            addCriterion("supplier_contact is null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIsNotNull() {
            addCriterion("supplier_contact is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactEqualTo(String value) {
            addCriterion("supplier_contact =", value, "supplierContact");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNotEqualTo(String value) {
            addCriterion("supplier_contact <>", value, "supplierContact");
            return (Criteria) this;
        }

        public Criteria andSupplierContactGreaterThan(String value) {
            addCriterion("supplier_contact >", value, "supplierContact");
            return (Criteria) this;
        }

        public Criteria andSupplierContactGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_contact >=", value, "supplierContact");
            return (Criteria) this;
        }

        public Criteria andSupplierContactLessThan(String value) {
            addCriterion("supplier_contact <", value, "supplierContact");
            return (Criteria) this;
        }

        public Criteria andSupplierContactLessThanOrEqualTo(String value) {
            addCriterion("supplier_contact <=", value, "supplierContact");
            return (Criteria) this;
        }

        public Criteria andSupplierContactLike(String value) {
            addCriterion("supplier_contact like", value, "supplierContact");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNotLike(String value) {
            addCriterion("supplier_contact not like", value, "supplierContact");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIn(List<String> values) {
            addCriterion("supplier_contact in", values, "supplierContact");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNotIn(List<String> values) {
            addCriterion("supplier_contact not in", values, "supplierContact");
            return (Criteria) this;
        }

        public Criteria andSupplierContactBetween(String value1, String value2) {
            addCriterion("supplier_contact between", value1, value2, "supplierContact");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNotBetween(String value1, String value2) {
            addCriterion("supplier_contact not between", value1, value2, "supplierContact");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIsNull() {
            addCriterion("supplier_phone is null");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIsNotNull() {
            addCriterion("supplier_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneEqualTo(String value) {
            addCriterion("supplier_phone =", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotEqualTo(String value) {
            addCriterion("supplier_phone <>", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneGreaterThan(String value) {
            addCriterion("supplier_phone >", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_phone >=", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLessThan(String value) {
            addCriterion("supplier_phone <", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLessThanOrEqualTo(String value) {
            addCriterion("supplier_phone <=", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLike(String value) {
            addCriterion("supplier_phone like", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotLike(String value) {
            addCriterion("supplier_phone not like", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIn(List<String> values) {
            addCriterion("supplier_phone in", values, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotIn(List<String> values) {
            addCriterion("supplier_phone not in", values, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneBetween(String value1, String value2) {
            addCriterion("supplier_phone between", value1, value2, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotBetween(String value1, String value2) {
            addCriterion("supplier_phone not between", value1, value2, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIsNull() {
            addCriterion("supplier_email is null");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIsNotNull() {
            addCriterion("supplier_email is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailEqualTo(String value) {
            addCriterion("supplier_email =", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotEqualTo(String value) {
            addCriterion("supplier_email <>", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailGreaterThan(String value) {
            addCriterion("supplier_email >", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_email >=", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLessThan(String value) {
            addCriterion("supplier_email <", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLessThanOrEqualTo(String value) {
            addCriterion("supplier_email <=", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLike(String value) {
            addCriterion("supplier_email like", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotLike(String value) {
            addCriterion("supplier_email not like", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIn(List<String> values) {
            addCriterion("supplier_email in", values, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotIn(List<String> values) {
            addCriterion("supplier_email not in", values, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailBetween(String value1, String value2) {
            addCriterion("supplier_email between", value1, value2, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotBetween(String value1, String value2) {
            addCriterion("supplier_email not between", value1, value2, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressIsNull() {
            addCriterion("supplier_address is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressIsNotNull() {
            addCriterion("supplier_address is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressEqualTo(String value) {
            addCriterion("supplier_address =", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotEqualTo(String value) {
            addCriterion("supplier_address <>", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressGreaterThan(String value) {
            addCriterion("supplier_address >", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_address >=", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressLessThan(String value) {
            addCriterion("supplier_address <", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressLessThanOrEqualTo(String value) {
            addCriterion("supplier_address <=", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressLike(String value) {
            addCriterion("supplier_address like", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotLike(String value) {
            addCriterion("supplier_address not like", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressIn(List<String> values) {
            addCriterion("supplier_address in", values, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotIn(List<String> values) {
            addCriterion("supplier_address not in", values, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressBetween(String value1, String value2) {
            addCriterion("supplier_address between", value1, value2, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotBetween(String value1, String value2) {
            addCriterion("supplier_address not between", value1, value2, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankIsNull() {
            addCriterion("supplier_brank is null");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankIsNotNull() {
            addCriterion("supplier_brank is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankEqualTo(String value) {
            addCriterion("supplier_brank =", value, "supplierBrank");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNotEqualTo(String value) {
            addCriterion("supplier_brank <>", value, "supplierBrank");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankGreaterThan(String value) {
            addCriterion("supplier_brank >", value, "supplierBrank");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_brank >=", value, "supplierBrank");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankLessThan(String value) {
            addCriterion("supplier_brank <", value, "supplierBrank");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankLessThanOrEqualTo(String value) {
            addCriterion("supplier_brank <=", value, "supplierBrank");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankLike(String value) {
            addCriterion("supplier_brank like", value, "supplierBrank");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNotLike(String value) {
            addCriterion("supplier_brank not like", value, "supplierBrank");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankIn(List<String> values) {
            addCriterion("supplier_brank in", values, "supplierBrank");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNotIn(List<String> values) {
            addCriterion("supplier_brank not in", values, "supplierBrank");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankBetween(String value1, String value2) {
            addCriterion("supplier_brank between", value1, value2, "supplierBrank");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNotBetween(String value1, String value2) {
            addCriterion("supplier_brank not between", value1, value2, "supplierBrank");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumIsNull() {
            addCriterion("supplier_brank_num is null");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumIsNotNull() {
            addCriterion("supplier_brank_num is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumEqualTo(String value) {
            addCriterion("supplier_brank_num =", value, "supplierBrankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumNotEqualTo(String value) {
            addCriterion("supplier_brank_num <>", value, "supplierBrankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumGreaterThan(String value) {
            addCriterion("supplier_brank_num >", value, "supplierBrankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_brank_num >=", value, "supplierBrankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumLessThan(String value) {
            addCriterion("supplier_brank_num <", value, "supplierBrankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumLessThanOrEqualTo(String value) {
            addCriterion("supplier_brank_num <=", value, "supplierBrankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumLike(String value) {
            addCriterion("supplier_brank_num like", value, "supplierBrankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumNotLike(String value) {
            addCriterion("supplier_brank_num not like", value, "supplierBrankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumIn(List<String> values) {
            addCriterion("supplier_brank_num in", values, "supplierBrankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumNotIn(List<String> values) {
            addCriterion("supplier_brank_num not in", values, "supplierBrankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumBetween(String value1, String value2) {
            addCriterion("supplier_brank_num between", value1, value2, "supplierBrankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBrankNumNotBetween(String value1, String value2) {
            addCriterion("supplier_brank_num not between", value1, value2, "supplierBrankNum");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatIdIsNull() {
            addCriterion("creat_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatIdIsNotNull() {
            addCriterion("creat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatIdEqualTo(Long value) {
            addCriterion("creat_id =", value, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdNotEqualTo(Long value) {
            addCriterion("creat_id <>", value, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdGreaterThan(Long value) {
            addCriterion("creat_id >", value, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creat_id >=", value, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdLessThan(Long value) {
            addCriterion("creat_id <", value, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdLessThanOrEqualTo(Long value) {
            addCriterion("creat_id <=", value, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdIn(List<Long> values) {
            addCriterion("creat_id in", values, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdNotIn(List<Long> values) {
            addCriterion("creat_id not in", values, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdBetween(Long value1, Long value2) {
            addCriterion("creat_id between", value1, value2, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdNotBetween(Long value1, Long value2) {
            addCriterion("creat_id not between", value1, value2, "creatId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
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