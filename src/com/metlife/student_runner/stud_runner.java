package com.metlife.student_runner;

import com.metlife.student.Student;

public class stud_runner {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentRollno=1001;
        s1.studentName="jack";
        s1.studentMailid="jack@gmail.com";
        s1.studentPercentage=45.2;
        s1.schoolName="Global school";
        s1.schoolAddress="chennai";
//        System.out.println(s1.studentRollno);

        s3.studentRollno=1002;
        s3.studentName="peter";
        s3.studentMailid="peter@gmail.com";
        s3.studentPercentage=85.2;
        s3.schoolName="Global school";
        s3.schoolAddress="chennai";

        s2.studentRollno=1003;
        s2.studentName="mark";
        s2.studentMailid="mark@gmail.com";
        s2.studentPercentage=56.5;
        s2.schoolName="Global school";
        s2.schoolAddress="chennai";

        s1.printStudentDetails();
        s2.printStudentDetails();
        s3.printStudentDetails();
    }
}
/*


1003,"mark",mark@gmail.com,56.5, Global school, chennai*/
