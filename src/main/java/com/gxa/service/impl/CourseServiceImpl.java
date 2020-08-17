package com.gxa.service.impl;

import com.gxa.dto.ResultDTO;
import com.gxa.mapper.CourseMapper;
import com.gxa.pojo.Course;
import com.gxa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public ResultDTO list() {
        // 查询数据库得到所有的课程
        List<Course> courseList = courseMapper.findAll();
        return new ResultDTO(200,"获取成功!", courseList);
    }

    /**
     * 添加课程
     * @param course : 课程对象
     * @return
     */
    @Override
    public ResultDTO add(Course course) {
        // 1 先进行数据校验

        // 2 先去查询有没有同名课程
        Course dbCourse = courseMapper.findByName(course.getCourseName());
        // 3 没有同名课程才能添加
        if (dbCourse != null) {
            return new ResultDTO(1004,"课程已经存在!");
        }
        // 填充添加时间
        course.setCreateTime(new Timestamp(System.currentTimeMillis()));
        courseMapper.save(course);
        return new ResultDTO(200, "添加成功!");
    }
}