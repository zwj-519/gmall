package com.atguigu.gmall.user.bean;

import java.util.Date;

public class UmsMember {
    private String id;                     // PKInteger(20)
    private String memberLevelId;       //  Integer(20)
    private String username;               //String(64)  //用户名
    private String password;               // String(64)  //密码
    private String nickname;               // String(64)  //昵称
    private String phone;                  // String(64)  //手机号码
    private String status;                 // Integer(1)  //帐号启用状态:0->禁用；1->启用
    private Date createTime;             //Date        //注册时间
    private String  icon;                    //String(500) //头像
    private String gender;                 // Integer(1)  //性别：0->未知；1->男；2->女
    private Date birthday;               // Date        //生日
    private String city;                   // String(64)  //所做城市
    private String job;                    // String(100) //职业
    private String personalizedSignature;  //String(200) //个性签名
    private String sourceType;             //Integer(1)  //用户来源
    private String integration;            //Integer     //积分
    private String growth;                  //Integer     //成长值
    private String luckeyCount;            //Integer     //剩余抽奖次数
    private String historyIntegration;    // Integer     //历史积分数量

    public UmsMember() {
    }

    public UmsMember(String id, String memberLevelId, String username, String password, String nickname, String phone, String status, Date createTime, String icon, String gender, Date birthday, String city, String job, String personalizedSignature, String sourceType, String integration, String growth, String luckeyCount, String historyIntegration) {
        this.id = id;
        this.memberLevelId = memberLevelId;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.phone = phone;
        this.status = status;
        this.createTime = createTime;
        this.icon = icon;
        this.gender = gender;
        this.birthday = birthday;
        this.city = city;
        this.job = job;
        this.personalizedSignature = personalizedSignature;
        this.sourceType = sourceType;
        this.integration = integration;
        this.growth = growth;
        this.luckeyCount = luckeyCount;
        this.historyIntegration = historyIntegration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(String memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getIntegration() {
        return integration;
    }

    public void setIntegration(String integration) {
        this.integration = integration;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public String getLuckeyCount() {
        return luckeyCount;
    }

    public void setLuckeyCount(String luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    public String getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(String historyIntegration) {
        this.historyIntegration = historyIntegration;
    }
}
