package com.gxa.controller;

import com.gxa.dto.ResultDTO;
import com.gxa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/list")
    public String listPage(){
        return "course/course-list";
    }

    @GetMapping("/list/data")
    public ResultDTO listData(){
        return courseService.listData();
    }

    @GetMapping("/add/page")
    public String addPage(){
        return "";
    }

}
