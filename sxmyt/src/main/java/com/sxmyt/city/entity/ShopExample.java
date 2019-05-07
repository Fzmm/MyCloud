package com.sxmyt.city.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopExample {
    /**
     * tb_shop
     */
    protected String orderByClause;

    /**
     * tb_shop
     */
    protected boolean distinct;

    /**
     * tb_shop
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2019-05-07
     */
    public ShopExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2019-05-07
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-05-07
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-05-07
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2019-05-07
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2019-05-07
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2019-05-07
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2019-05-07
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-05-07
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-05-07
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-05-07
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * tb_shop 2019-05-07
     */
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

        public Criteria andShopUniIdIsNull() {
            addCriterion("shop_uni_id is null");
            return (Criteria) this;
        }

        public Criteria andShopUniIdIsNotNull() {
            addCriterion("shop_uni_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopUniIdEqualTo(Integer value) {
            addCriterion("shop_uni_id =", value, "shopUniId");
            return (Criteria) this;
        }

        public Criteria andShopUniIdNotEqualTo(Integer value) {
            addCriterion("shop_uni_id <>", value, "shopUniId");
            return (Criteria) this;
        }

        public Criteria andShopUniIdGreaterThan(Integer value) {
            addCriterion("shop_uni_id >", value, "shopUniId");
            return (Criteria) this;
        }

        public Criteria andShopUniIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_uni_id >=", value, "shopUniId");
            return (Criteria) this;
        }

        public Criteria andShopUniIdLessThan(Integer value) {
            addCriterion("shop_uni_id <", value, "shopUniId");
            return (Criteria) this;
        }

        public Criteria andShopUniIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_uni_id <=", value, "shopUniId");
            return (Criteria) this;
        }

        public Criteria andShopUniIdIn(List<Integer> values) {
            addCriterion("shop_uni_id in", values, "shopUniId");
            return (Criteria) this;
        }

        public Criteria andShopUniIdNotIn(List<Integer> values) {
            addCriterion("shop_uni_id not in", values, "shopUniId");
            return (Criteria) this;
        }

        public Criteria andShopUniIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_uni_id between", value1, value2, "shopUniId");
            return (Criteria) this;
        }

        public Criteria andShopUniIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_uni_id not between", value1, value2, "shopUniId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNull() {
            addCriterion("shop_price is null");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNotNull() {
            addCriterion("shop_price is not null");
            return (Criteria) this;
        }

        public Criteria andShopPriceEqualTo(BigDecimal value) {
            addCriterion("shop_price =", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotEqualTo(BigDecimal value) {
            addCriterion("shop_price <>", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThan(BigDecimal value) {
            addCriterion("shop_price >", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_price >=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThan(BigDecimal value) {
            addCriterion("shop_price <", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_price <=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceIn(List<BigDecimal> values) {
            addCriterion("shop_price in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotIn(List<BigDecimal> values) {
            addCriterion("shop_price not in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_price between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_price not between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopBuyNumberIsNull() {
            addCriterion("shop_buy_number is null");
            return (Criteria) this;
        }

        public Criteria andShopBuyNumberIsNotNull() {
            addCriterion("shop_buy_number is not null");
            return (Criteria) this;
        }

        public Criteria andShopBuyNumberEqualTo(Integer value) {
            addCriterion("shop_buy_number =", value, "shopBuyNumber");
            return (Criteria) this;
        }

        public Criteria andShopBuyNumberNotEqualTo(Integer value) {
            addCriterion("shop_buy_number <>", value, "shopBuyNumber");
            return (Criteria) this;
        }

        public Criteria andShopBuyNumberGreaterThan(Integer value) {
            addCriterion("shop_buy_number >", value, "shopBuyNumber");
            return (Criteria) this;
        }

        public Criteria andShopBuyNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_buy_number >=", value, "shopBuyNumber");
            return (Criteria) this;
        }

        public Criteria andShopBuyNumberLessThan(Integer value) {
            addCriterion("shop_buy_number <", value, "shopBuyNumber");
            return (Criteria) this;
        }

        public Criteria andShopBuyNumberLessThanOrEqualTo(Integer value) {
            addCriterion("shop_buy_number <=", value, "shopBuyNumber");
            return (Criteria) this;
        }

        public Criteria andShopBuyNumberIn(List<Integer> values) {
            addCriterion("shop_buy_number in", values, "shopBuyNumber");
            return (Criteria) this;
        }

        public Criteria andShopBuyNumberNotIn(List<Integer> values) {
            addCriterion("shop_buy_number not in", values, "shopBuyNumber");
            return (Criteria) this;
        }

        public Criteria andShopBuyNumberBetween(Integer value1, Integer value2) {
            addCriterion("shop_buy_number between", value1, value2, "shopBuyNumber");
            return (Criteria) this;
        }

        public Criteria andShopBuyNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_buy_number not between", value1, value2, "shopBuyNumber");
            return (Criteria) this;
        }

        public Criteria andShopSortIsNull() {
            addCriterion("shop_sort is null");
            return (Criteria) this;
        }

        public Criteria andShopSortIsNotNull() {
            addCriterion("shop_sort is not null");
            return (Criteria) this;
        }

        public Criteria andShopSortEqualTo(Integer value) {
            addCriterion("shop_sort =", value, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortNotEqualTo(Integer value) {
            addCriterion("shop_sort <>", value, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortGreaterThan(Integer value) {
            addCriterion("shop_sort >", value, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_sort >=", value, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortLessThan(Integer value) {
            addCriterion("shop_sort <", value, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortLessThanOrEqualTo(Integer value) {
            addCriterion("shop_sort <=", value, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortIn(List<Integer> values) {
            addCriterion("shop_sort in", values, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortNotIn(List<Integer> values) {
            addCriterion("shop_sort not in", values, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortBetween(Integer value1, Integer value2) {
            addCriterion("shop_sort between", value1, value2, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopSortNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_sort not between", value1, value2, "shopSort");
            return (Criteria) this;
        }

        public Criteria andShopShopNumberIsNull() {
            addCriterion("shop_shop_number is null");
            return (Criteria) this;
        }

        public Criteria andShopShopNumberIsNotNull() {
            addCriterion("shop_shop_number is not null");
            return (Criteria) this;
        }

        public Criteria andShopShopNumberEqualTo(Integer value) {
            addCriterion("shop_shop_number =", value, "shopShopNumber");
            return (Criteria) this;
        }

        public Criteria andShopShopNumberNotEqualTo(Integer value) {
            addCriterion("shop_shop_number <>", value, "shopShopNumber");
            return (Criteria) this;
        }

        public Criteria andShopShopNumberGreaterThan(Integer value) {
            addCriterion("shop_shop_number >", value, "shopShopNumber");
            return (Criteria) this;
        }

        public Criteria andShopShopNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_shop_number >=", value, "shopShopNumber");
            return (Criteria) this;
        }

        public Criteria andShopShopNumberLessThan(Integer value) {
            addCriterion("shop_shop_number <", value, "shopShopNumber");
            return (Criteria) this;
        }

        public Criteria andShopShopNumberLessThanOrEqualTo(Integer value) {
            addCriterion("shop_shop_number <=", value, "shopShopNumber");
            return (Criteria) this;
        }

        public Criteria andShopShopNumberIn(List<Integer> values) {
            addCriterion("shop_shop_number in", values, "shopShopNumber");
            return (Criteria) this;
        }

        public Criteria andShopShopNumberNotIn(List<Integer> values) {
            addCriterion("shop_shop_number not in", values, "shopShopNumber");
            return (Criteria) this;
        }

        public Criteria andShopShopNumberBetween(Integer value1, Integer value2) {
            addCriterion("shop_shop_number between", value1, value2, "shopShopNumber");
            return (Criteria) this;
        }

        public Criteria andShopShopNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_shop_number not between", value1, value2, "shopShopNumber");
            return (Criteria) this;
        }

        public Criteria andShopVipPriceIsNull() {
            addCriterion("shop_vip_price is null");
            return (Criteria) this;
        }

        public Criteria andShopVipPriceIsNotNull() {
            addCriterion("shop_vip_price is not null");
            return (Criteria) this;
        }

        public Criteria andShopVipPriceEqualTo(BigDecimal value) {
            addCriterion("shop_vip_price =", value, "shopVipPrice");
            return (Criteria) this;
        }

        public Criteria andShopVipPriceNotEqualTo(BigDecimal value) {
            addCriterion("shop_vip_price <>", value, "shopVipPrice");
            return (Criteria) this;
        }

        public Criteria andShopVipPriceGreaterThan(BigDecimal value) {
            addCriterion("shop_vip_price >", value, "shopVipPrice");
            return (Criteria) this;
        }

        public Criteria andShopVipPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_vip_price >=", value, "shopVipPrice");
            return (Criteria) this;
        }

        public Criteria andShopVipPriceLessThan(BigDecimal value) {
            addCriterion("shop_vip_price <", value, "shopVipPrice");
            return (Criteria) this;
        }

        public Criteria andShopVipPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_vip_price <=", value, "shopVipPrice");
            return (Criteria) this;
        }

        public Criteria andShopVipPriceIn(List<BigDecimal> values) {
            addCriterion("shop_vip_price in", values, "shopVipPrice");
            return (Criteria) this;
        }

        public Criteria andShopVipPriceNotIn(List<BigDecimal> values) {
            addCriterion("shop_vip_price not in", values, "shopVipPrice");
            return (Criteria) this;
        }

        public Criteria andShopVipPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_vip_price between", value1, value2, "shopVipPrice");
            return (Criteria) this;
        }

        public Criteria andShopVipPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_vip_price not between", value1, value2, "shopVipPrice");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * tb_shop
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tb_shop 2019-05-07
     */
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