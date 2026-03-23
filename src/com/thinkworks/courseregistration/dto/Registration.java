package com.thinkworks.courseregistration.dto;

public class Registration {
    private int registrationId;
    private Student student;
    private Course[] courses;

    public Registration(int registrationId, Student student, Course[] courses) {
        this.registrationId = registrationId;
        this.student = student;
        this.courses = courses;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public int calculateTotalCredits(){
        int totalCredits=0;
        for(Course course:courses){
            totalCredits+=course.getCredits();

        }
        return totalCredits;
    }


}
