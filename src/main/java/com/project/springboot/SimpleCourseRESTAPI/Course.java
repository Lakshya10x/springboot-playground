package com.project.springboot.SimpleCourseRESTAPI;

public class Course {

    private int id;
    private String courseName;
    private String platform;

    public Course(int id, String courseName, String platform) {
        this.id = id;
        this.courseName = courseName;
        this.platform = platform;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getPlatform() {
        return platform;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }
}
