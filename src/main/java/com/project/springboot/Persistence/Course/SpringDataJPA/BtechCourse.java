package com.project.springboot.Persistence.Course.SpringDataJPA;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
public class BtechCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ASubject_Name")
    private String subject;

    private String dept;

    public BtechCourse(int id, String subject, String dept) {
        this.id = id;
        this.subject = subject;
        this.dept = dept;
    }

    public BtechCourse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "BtechCourse{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
