package com.gxa.pojo;


import lombok.*;

@Data
public class Teacher {

  private Integer teacherId;
  private String teacherName;
  private String teacherGender;
  private Integer teacherAge;
  private Integer isDeleted;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


}
