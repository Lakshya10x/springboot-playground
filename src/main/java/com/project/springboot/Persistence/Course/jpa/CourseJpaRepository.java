package com.project.springboot.Persistence.Course.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

//    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    /**
        @PersistenceContext -> Express a dependency on a container-managed EntityManager & its associated persistence context
     */

    public void insert(Course course)
    {
        entityManager.merge(course);
    }
    public void deleteById(long id)
    {
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }
    public Course findById(long id)
    {
        return entityManager.find(Course.class,id);
    }

}
