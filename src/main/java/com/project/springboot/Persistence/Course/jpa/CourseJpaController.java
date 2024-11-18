package com.project.springboot.Persistence.Course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class CourseJpaController {

    @Autowired
    private CourseJpaRepository repo;

    @RequestMapping(method = RequestMethod.POST, value = "/addCourse")
    public void insert(@RequestBody Course course)
    {
        repo.insert(course);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/courses")
    public List<Course> findAllCourses()
    {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/course/{id}")
    public Course findCourseById(@PathVariable long id)
    {
        return repo.findById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteCourse/{id}")
    public void deleteCourseById(@PathVariable long id)
    {
        repo.deleteById(id);
    }

}
