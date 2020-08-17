package com.gxa.pojo;


public class Teacher {

  private Integer teacherId;
  private String teacherName;
  private String teacherGender;
  private Integer teacherAge;
  private Integer isDeleted;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public Integer getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(Integer teacherId) {
    this.teacherId = teacherId;
  }


  public String getTeacherName() {
    return teacherName;
  }

  public void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }


  public String getTeacherGender() {
    return teacherGender;
  }

  public void setTeacherGender(String teacherGender) {
    this.teacherGender = teacherGender;
  }


  public Integer getTeacherAge() {
    return teacherAge;
  }

  public void setTeacherAge(Integer teacherAge) {
    this.teacherAge = teacherAge;
  }


  public Integer getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Integer isDeleted) {
    this.isDeleted = isDeleted;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}
