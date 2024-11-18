package com.project.springboot.Persistence.Course.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
    @Entity : To create mapping between our Java bean and the table to insert, retrieve values & do operations on your table.
 */
//@Entity
public class Course {

    @Id
    private long id;
    @Column(name = "courseName")
    private String name;
    @Column(name = "authorName")
    private String author;

    /**
     *  If no column annotation specified, the default values applied.
     */

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Course() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
