package com.gxa.mapper;

import com.gxa.pojo.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {

    /**
     * 通过名字查询数据
     * @param courseName
     * @return
     */
    Course findByName(@Param("courseName") String courseName);

    /**
     * 保存数据
     * @param course
     */
    void save(@Param("course") Course course);

    List<Course> findAll();
}
