package com.project.springboot.Persistence.Course.SpringDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.save(new BtechCourse(1,"DBMS","CS"));
        repo.save(new BtechCourse(2,"DSA","CS"));
        repo.save(new BtechCourse(3,"Wireless Communication","CS"));
        repo.save(new BtechCourse(4,"Thermodynamics","ME"));

        repo.deleteById(3);
//      repo.deleteAllInBatch();

        System.out.println(repo.existsById(3));
        System.out.println(repo.count());

        System.out.println(repo.findById(4).get());
        repo.findAll().stream().forEach(System.out::println);
        System.out.println(repo.findByDept("CS"));

    }
}
