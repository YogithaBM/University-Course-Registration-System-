package com.thinkworks.courseregistration.dto;

import com.thinkworks.courseregistration.enums.CourseType;

public class Course {
    private int courseId;
    private String courseName;
    private int credits;
    private int capacity;
    private CourseType courseType;

    public Course(int courseId, int credits, String courseName, int capacity,CourseType courseType) {
        this.courseId = courseId;
        this.credits = credits;
        this.courseName = courseName;
        this.capacity = capacity;
        this.courseType=courseType;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
