package com.sxmyt.city.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Shop {
    /**
     * 
     */
    private Integer id;

    /**
     * 商品类型
     */
    private Integer shopUniId;

    /**
     * 商品名字
     */
    private String shopName;

    /**
     * 商品价格
     */
    private BigDecimal shopPrice;

    /**
     * 购买数量
     */
    private Integer shopBuyNumber;

    /**
     * 商品排序
     */
    private Integer shopSort;

    /**
     * 商品数量
     */
    private Integer shopShopNumber;

    /**
     * 商品会员价格
     */
    private BigDecimal shopVipPrice;

    /**
     * 是否删除(0-对客户可见/1-不可见)
     */
    private Integer isDelete;

    /**
     * 
     */
    private String createUser;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商品类型
     * @return shop_uni_id 商品类型
     */
    public Integer getShopUniId() {
        return shopUniId;
    }

    /**
     * 商品类型
     * @param shopUniId 商品类型
     */
    public void setShopUniId(Integer shopUniId) {
        this.shopUniId = shopUniId;
    }

    /**
     * 商品名字
     * @return shop_name 商品名字
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 商品名字
     * @param shopName 商品名字
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * 商品价格
     * @return shop_price 商品价格
     */
    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    /**
     * 商品价格
     * @param shopPrice 商品价格
     */
    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    /**
     * 购买数量
     * @return shop_buy_number 购买数量
     */
    public Integer getShopBuyNumber() {
        return shopBuyNumber;
    }

    /**
     * 购买数量
     * @param shopBuyNumber 购买数量
     */
    public void setShopBuyNumber(Integer shopBuyNumber) {
        this.shopBuyNumber = shopBuyNumber;
    }

    /**
     * 商品排序
     * @return shop_sort 商品排序
     */
    public Integer getShopSort() {
        return shopSort;
    }

    /**
     * 商品排序
     * @param shopSort 商品排序
     */
    public void setShopSort(Integer shopSort) {
        this.shopSort = shopSort;
    }

    /**
     * 商品数量
     * @return shop_shop_number 商品数量
     */
    public Integer getShopShopNumber() {
        return shopShopNumber;
    }

    /**
     * 商品数量
     * @param shopShopNumber 商品数量
     */
    public void setShopShopNumber(Integer shopShopNumber) {
        this.shopShopNumber = shopShopNumber;
    }

    /**
     * 商品会员价格
     * @return shop_vip_price 商品会员价格
     */
    public BigDecimal getShopVipPrice() {
        return shopVipPrice;
    }

    /**
     * 商品会员价格
     * @param shopVipPrice 商品会员价格
     */
    public void setShopVipPrice(BigDecimal shopVipPrice) {
        this.shopVipPrice = shopVipPrice;
    }

    /**
     * 是否删除(0-对客户可见/1-不可见)
     * @return is_delete 是否删除(0-对客户可见/1-不可见)
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除(0-对客户可见/1-不可见)
     * @param isDelete 是否删除(0-对客户可见/1-不可见)
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 
     * @return create_user 
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 
     * @param createUser 
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}