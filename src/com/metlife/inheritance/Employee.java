package com.metlife.inheritance;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
        //GitPush

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  void DisplayingMeth(){
        System.out.println("Emplyoee ID : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Salary : "+salary);
    }
//    PermanentEmployee p1 = new PermanentEmployee();
}
