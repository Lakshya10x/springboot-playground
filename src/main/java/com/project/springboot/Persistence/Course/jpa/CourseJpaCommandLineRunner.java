package com.project.springboot.Persistence.Course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.insert(new Course(3,"Ramayan","Valmiki"));
        repo.insert(new Course(4,"Mahabharat","Ved Vyasa"));

        repo.deleteById(3);
        System.out.println(repo.findById(4));
    }
}
