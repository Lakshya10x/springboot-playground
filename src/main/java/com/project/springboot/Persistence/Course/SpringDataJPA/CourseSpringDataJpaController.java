package com.project.springboot.Persistence.Course.SpringDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseSpringDataJpaController {

    @Autowired
    private CourseSpringDataJpaRepository repo;

    @RequestMapping(method = RequestMethod.POST, value = "/addCourse")
    public void addCourse(@RequestBody BtechCourse course) {
        repo.save(course);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<BtechCourse> getAllCourses() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/course/{id}")
    public BtechCourse getCourseById(@PathVariable int id) {
        return repo.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteAll")
    public void removeEntity() {
        repo.deleteAllInBatch();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public void removeCourseById(@PathVariable int id) {
        repo.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/coursesCount")
    public long getCount() {
        return repo.count();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/courseByDept/{dept}")
    public List<BtechCourse> getCourseByDept(@PathVariable String dept)
    {
        return repo.findByDept(dept);
    }

}