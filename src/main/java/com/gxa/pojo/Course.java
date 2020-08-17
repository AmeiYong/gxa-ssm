package com.gxa.pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@lombok.Data
public class Course {

  private Integer id;
  private String courseName;
  private Double coursePrice;
  private String courseDesc;
  private Integer courseCount;
  private Integer isDeleted;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


}
