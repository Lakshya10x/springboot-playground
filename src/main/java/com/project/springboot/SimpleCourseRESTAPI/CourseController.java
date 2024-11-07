package com.project.springboot.SimpleCourseRESTAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/url")
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retreiveAllCourses()
    {
        return Arrays.asList(new Course(1,"Core-Java","Udemy"),new Course(2,"Spring Boot Course","Udemy"));
    }
}
