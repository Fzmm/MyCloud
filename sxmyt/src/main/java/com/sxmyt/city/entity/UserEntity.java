package com.sxmyt.city.entity;

import java.util.Date;

public class UserEntity {
    /**
     * 
     */
    private Integer userId;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 手机号码
     */
    private String userPhone;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * shiro盐
     */
    private String salt;

    /**
     * 平台来源（APP-0）
     */
    private Integer soruce;

    /**
     * 平台上传码
     */
    private String keyInfo;

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
     * @return user_id 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 用户昵称
     * @return user_name 用户昵称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户昵称
     * @param userName 用户昵称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return user_password 密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 密码
     * @param userPassword 密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * 用户邮箱
     * @return user_email 用户邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 用户邮箱
     * @param userEmail 用户邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * 手机号码
     * @return user_phone 手机号码
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 手机号码
     * @param userPhone 手机号码
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 用户昵称
     * @return nick_name 用户昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 用户昵称
     * @param nickName 用户昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * shiro盐
     * @return salt shiro盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * shiro盐
     * @param salt shiro盐
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 平台来源（APP-0）
     * @return soruce 平台来源（APP-0）
     */
    public Integer getSoruce() {
        return soruce;
    }

    /**
     * 平台来源（APP-0）
     * @param soruce 平台来源（APP-0）
     */
    public void setSoruce(Integer soruce) {
        this.soruce = soruce;
    }

    /**
     * 平台上传码
     * @return key_info 平台上传码
     */
    public String getKeyInfo() {
        return keyInfo;
    }

    /**
     * 平台上传码
     * @param keyInfo 平台上传码
     */
    public void setKeyInfo(String keyInfo) {
        this.keyInfo = keyInfo == null ? null : keyInfo.trim();
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