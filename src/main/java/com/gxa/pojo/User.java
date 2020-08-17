package com.gxa.pojo;

/**
 * 标准Javabean的写法所有属性私有化
 * 必须声明无参构造器：java中的反射
 * 所有属性必须有getter和setter方法
 */
public class User {

    private  String userName;
    private  Integer userAge;
    private  String  userGender;
    public User(){

    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }



    public User(String userName, Integer userAge, String userGender) {
        this.userName = userName;
        this.userAge = userAge;
        this.userGender = userGender;
    }
}
