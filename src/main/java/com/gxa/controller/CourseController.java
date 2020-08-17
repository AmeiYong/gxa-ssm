package com.gxa.controller;

import com.gxa.dto.ResultDTO;
import com.gxa.pojo.Course;
import com.gxa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    /**
     * 课程列表
     * @return
     */
    @GetMapping("/list")
    public String listPage(){
        return "course/course-list";
    }

    /**
     * 添加课程
     * @return
     */
    @GetMapping("/add/page")
    public String addPage(){
        return "course/course-add";
    }

    /**
     * 添加课程
     * @param course
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public ResultDTO add(Course course){
        return courseService.add(course);
    }

    /**
     * 列表数据
     * @return
     */
    @GetMapping("/list/data")
    @ResponseBody
    public ResultDTO listData(){
        return courseService.list();
    }
}
