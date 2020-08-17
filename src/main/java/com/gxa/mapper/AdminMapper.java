package com.gxa.mapper;

import com.gxa.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:IT-CNLM
 * @date:Created at 2020/08/12
 */
public interface AdminMapper {

    /**
     * 查询所有:select * from admin
     * @return
     */
    List<Admin> findAll();

    /**
     * 通过名字查询管理员
     * @param name:
     * @return
     */
    Admin findByName(@Param("name") String name);

    /**
     * 更新的方法
     */

    void update(@Param("admin") Admin admin);
}
