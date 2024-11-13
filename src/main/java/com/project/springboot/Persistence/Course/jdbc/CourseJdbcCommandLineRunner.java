package com.project.springboot.Persistence.Course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    /** CommandLineRunner -> When you've some logic to run at the start of application
        Interface used to indicate that a bean should run when it is contained within a Spring Application
     **/
    @Autowired
    private CourseJDBCRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.insertUserInput(new Course(3,"Ramayan","Valmiki"));
        repo.deleteUserInput(1);

        System.out.println(repo.findById(3));
    }
}
