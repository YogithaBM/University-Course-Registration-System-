package com.thinkworks.courseregistration.service;

import com.thinkworks.courseregistration.dto.Course;
import com.thinkworks.courseregistration.dto.Registration;
import com.thinkworks.courseregistration.dto.Student;

public class RegistrationService{
    public void courseDetails(Course course){
        System.out.println("Course Details");
        System.out.println("ID : "+course.getCourseId());
        System.out.println("Name : "+course.getCourseName());
        System.out.println("Type : "+course.getCourseType());
        System.out.println("Credits : "+course.getCredits());
        System.out.println("Capacity : "+course.getCapacity());
    }

    public void studentDetails(Student student){
        System.out.println("Student Details");
        System.out.println("ID : "+student.getStudentId());
        System.out.println("Name : "+student.getStudentName());
        System.out.println("Email : "+student.getStudentEmail());
    }

    public void registrationDetails(Registration registration){
        System.out.println("Registration Details");
        System.out.println("ID : "+registration.getRegistrationId());
        System.out.println("Student Name "+registration.getStudent().getStudentName());
        System.out.println("Courses are : ");
        for(Course course: registration.getCourses()){
            System.out.println("  "+course.getCourseName());
        }
    }

    public void lowCapacity(Course[] courses) {
        for (Course course : courses) {
            if (course.getCapacity() <= 20) {
                System.out.println(course.getCourseName() + " : has low Capacity,Hurry Up");
            }
        }
    }

}
