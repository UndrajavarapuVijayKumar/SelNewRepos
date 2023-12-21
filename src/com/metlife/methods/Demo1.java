package com.metlife.methods;

import com.metlife.formulae.area;

public class Demo1 {

    public static void main(String[] args) {        //main method

        area a1 = new area();

        a1.AreaOfCircle(10);
        a1.AreaOfCircle(20);
        a1.AreaOfCircle(30);

        double x = area.AreaOfTriangle(25,1);
        double y = area.AreaOfTriangle(30,1);
        System.out.println(x+" Triangle "+y);

        int i = area.AreaOfRectangle(2,2);
        int j =area.AreaOfRectangle(4,4);
        System.out.println(i+" rectangle "+j);
    }
}
