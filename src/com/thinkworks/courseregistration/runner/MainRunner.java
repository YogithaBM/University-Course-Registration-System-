package com.thinkworks.courseregistration.runner;

import com.thinkworks.courseregistration.dto.Course;
import com.thinkworks.courseregistration.dto.Registration;
import com.thinkworks.courseregistration.dto.Student;
import com.thinkworks.courseregistration.enums.CourseType;
import com.thinkworks.courseregistration.service.RegistrationService;

public class MainRunner {
    public static void main(String[] args) {
        Course course1=new Course(43,3,"BIOLOGY",60, CourseType.MBBS);
        Course course2=new Course(65,4,"Chemistry",53,CourseType.MBBS);
        Course course3=new Course(23,4,"Math",35,CourseType.B_TECH);
        Course course4=new Course(56,3,"Introduction to Computer Science",15,CourseType.B_TECH);
        Course[] courses3={course1,course2,course3,course4};

        Course[] courses1={course1,course2};
        Course[] courses2={course3,course4};

        Student student1=new Student(325133,"Milli","millibobby@gmail.com");
        Student student2=new Student(37453,"Paul","paul75@gmail.com");

        Registration registration1=new Registration(896234,student1,courses1);
        Registration registration2=new Registration(986234,student2,courses2);

        RegistrationService registrationService=new RegistrationService();
        registrationService.courseDetails(course1);
        System.out.println("  ");

        registrationService.studentDetails(student1);
        System.out.println("  ");

        registrationService.registrationDetails(registration1);
        System.out.println("  ");
        System.out.println("  ");

        registrationService.studentDetails(student2);
        System.out.println("  ");

        registrationService.registrationDetails(registration2);
        System.out.println("  ");
        System.out.println("  ");

        registrationService.lowCapacity(courses3);
    }
}
