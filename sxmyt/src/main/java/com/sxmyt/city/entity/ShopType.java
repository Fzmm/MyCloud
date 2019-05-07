package com.sxmyt.city.entity;

import java.util.Date;

public class ShopType {
    /**
     * 
     */
    private Integer id;

    /**
     * 商品类别名字
     */
    private String shopTypeName;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 
     */
    private String imgPath;

    /**
     * 
     */
    private Integer isDelete;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String createUser;

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
     * 商品类别名字
     * @return shop_type_name 商品类别名字
     */
    public String getShopTypeName() {
        return shopTypeName;
    }

    /**
     * 商品类别名字
     * @param shopTypeName 商品类别名字
     */
    public void setShopTypeName(String shopTypeName) {
        this.shopTypeName = shopTypeName == null ? null : shopTypeName.trim();
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 
     * @return img_path 
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * 
     * @param imgPath 
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    /**
     * 
     * @return is_delete 
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 
     * @param isDelete 
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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
}