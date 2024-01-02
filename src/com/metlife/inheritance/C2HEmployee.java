package com.metlife.inheritance;

public class C2HEmployee extends Employee{
    public void calculateSalary(int perHour,int totalHour){
//        System.out.println(8*perHour*totalHour);
        super.setSalary(8*perHour*totalHour);
        super.setName("kumar");
    }
}
