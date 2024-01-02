package com.metlife.inheritance;

public class EmpRunner {
    public static void main(String[] args) {
        PermanentEmployee pe =new PermanentEmployee();
        pe.setId(101);
        pe.calculateSalary(1000);
        pe.DisplayingMeth();

        C2HEmployee c2 = new C2HEmployee();
        c2.setId(102);
        c2.calculateSalary(200,8);
        c2.DisplayingMeth();
    }
}
