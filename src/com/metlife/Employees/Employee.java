package com.metlife.Employees;

public class Employee {
    private int empid;  //security
    public String name;
    public static String company;
    private int salary;
    public String performance;
    public void displayEmployees() {
        System.out.println(empid);
        System.out.println(name);
//        System.out.println(company);
        System.out.println(getSalary());
        System.out.println(performance);
        System.out.println("------------");
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
//      if ( salary>=5000)
          this.salary = salary  ;

    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public void allocateBonus() {
        if (performance.equals("A"))
            salary = salary + 5000;
        else if (performance.equals("B"))
            salary = salary + 3000;
        else
            salary = salary + 1000;

    }

    //    private static int count=101;
   /* public Employee(){
        empid = count;
        count=count+1;
        System.out.println("Constructor created");
        System.out.println("launch constructor");
    }*/
    public Employee(int empid) {
        if (empid > 100)
            this.empid = empid;
        else
            System.out.println("Default value:");
    }
}
