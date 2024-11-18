package com.project.springboot.Persistence.Course.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//@Transactional
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

    public List<Course> findAll()
    {
        String jpqlSelect = "SELECT c FROM Course c"; // JPQL query to select all course
        return entityManager.createQuery(jpqlSelect, Course.class).getResultList();
    }

    /**
     * Explanation:
     *
     * @PersistenceContext: Injects an instance of EntityManager.
     * createQuery: Creates a JPA query using JPQL (Java Persistence Query Language).
     * getResultList(): Executes the query and retrieves a list of results
     */

}
