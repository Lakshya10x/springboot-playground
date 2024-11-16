package com.project.springboot.Persistence.Course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate SpringJdbcTemplate;

    private static String INSERT_QUERY =
            """
                    INSERT INTO COURSE
                    VALUES (5,'MAHABHARAT', 'VED VYASA')
                    """;

    public void insert() {
        SpringJdbcTemplate.update(INSERT_QUERY);
        /**
         * Issue a single SQL update operation (such as - insert,update or delete statement)
         */
    }

    /**
     * Inserting and Deleting data using Spring JDBC
     */

    public static String INSERT_QUERY_USERINPUT =
                """
                    INSERT INTO COURSE(id,name,author)
                    VALUES (?,?,?);
                    """;

    public static String DELETE_QUERY =
            """
                    DELETE FROM COURSE WHERE id = ?;
                    """;

    public void insertUserInput(Course course)
    {
        SpringJdbcTemplate.update(INSERT_QUERY_USERINPUT,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteUserInput(int id)
    {
        SpringJdbcTemplate.update(DELETE_QUERY,id);
    }

    /**
     * Retrieving data from database
     */

    private String SELECT_QUERY =
            """
                    SELECT * FROM COURSE WHERE id = ?;
                    """;

    public Course findById(long id)
    {
        return SpringJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
    }
    /**
        Executing the select query, you'll get the sql table as a result set, we would take this result set and map it
        to the course bean (BeanPropertyRowMapper).
        // Result Set -> Bean => Row Mapper
     */
    /**
     * In our example situation, our column names in the table match the exact names in the bean.
     * => new BeanPropertyRowMapper<>(ClassName.class)
     */

}
