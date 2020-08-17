package com.gxa.pojo;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.*;

import java.sql.Timestamp;

@Data
public class Admin {

  private Long id;
  @ExcelProperty(index = 0)
  private String name;
  @ExcelProperty(index = 1)
  private String pwd;
  private Integer isDeleted;
  private Timestamp lastLoginTime;
  @ExcelProperty(index = 2)
  @DateTimeFormat("yyyy-MM-dd HH:mm:ss")
  private String createTime;
  private Timestamp updateTime;

  public Admin() {
  }


}
