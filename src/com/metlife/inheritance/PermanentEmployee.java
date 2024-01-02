package com.metlife.inheritance;

public class PermanentEmployee extends Employee{
    public void calculateSalary(double perDaySalary){
//        System.out.println(30*perDaySalary);
        super.setSalary(30*perDaySalary);
        super.setName("vijay");
    }

}
