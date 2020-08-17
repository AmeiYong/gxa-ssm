package com.gxa.service;

import com.gxa.dto.ResultDTO;
import com.gxa.pojo.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
    /**
     * 课程列表
     * @return
     */
    ResultDTO list();

    /**
     * 添加课程
     * @param course : 课程对象
     * @return
     */
    ResultDTO add(Course course);

}
