package com.metlife.Employees;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee e1 = new Employee(101);
        Employee e2 = new Employee(102);
        Employee e3 = new Employee(103);

//        e1.empid= 101;
        e1.name= "jhon";
        e1.performance="A";
//        e1.salary=9000;
        e1.setSalary(4500);
        e1.company="MetLife";

//        e2.empid= 102;
        e2.name= "Saul";
        e2.performance="B";
//        e2.salary=8000;
        e2.company="MetLife";

//        e3.empid= 103;
        e3.name= "ken";
        e3.performance="C";
//        e3.salary=6000;
        e3.company="MetLife";

        /*System.out.println(e3.empid);
        System.out.println(e3.name);
        System.out.println(e3.performance);
        System.out.println(e3.salary);
        System.out.println(e3.company);

        System.out.println(e2.empid);
        System.out.println(e2.name);
        System.out.println(e2.performance);
        System.out.println(e2.salary);
        System.out.println(e2.company);

        System.out.println(e1.empid);
        System.out.println(e1.name);
        System.out.println(e1.performance);
        System.out.println(e1.salary);
        System.out.println(e1.company);*/



//        e1.displayEmployees();

//        e1.allocateBonus();

        e1.displayEmployees();

//        e2.displayEmployees();
//
////        e2.allocateBonus();
//
//        e3.displayEmployees();

//        System.out.println((Math.PI)*(Math.sqrt(10)));
    }
}
