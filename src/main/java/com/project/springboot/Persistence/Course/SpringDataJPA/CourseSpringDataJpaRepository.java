package com.project.springboot.Persistence.Course.SpringDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<BtechCourse,Integer> {

    List<BtechCourse> findByDept(String dept);
}
