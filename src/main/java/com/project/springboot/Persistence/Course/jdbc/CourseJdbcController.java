package com.project.springboot.Persistence.Course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@RestController
public class CourseJdbcController {

    @Autowired
    private CourseJDBCRepository repo;

    @RequestMapping("/addData")
    public void addValue()
    {
        repo.insert();
    }
    @RequestMapping(method = RequestMethod.POST,value = "/addCourseInput")
    public void addUserValue(@RequestBody Course course)
    {
        repo.insertUserInput(course);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteCourse/{id}")
    public void deleteUserValue(@PathVariable int id)
    {
        repo.deleteUserInput(id);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/course")
    public Course findById(@RequestParam int id)
    {
        return repo.findById(id);
    }

}
