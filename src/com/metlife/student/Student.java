package com.metlife.student;

public class Student {
    public int studentRollno;
    public String studentName;

    public String studentMailid;

    public double studentPercentage;

    public static String schoolName;

    public static String schoolAddress;

    public void printStudentDetails(){
        System.out.println(studentName);
        System.out.println("---");
    }
}
