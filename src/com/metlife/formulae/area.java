package com.metlife.formulae;

public class area {
    public static double AreaOfTriangle(double height,int base ){
        double areaOfTraingle = ((double)height*base)/2;
        return areaOfTraingle;
    }
    public static int AreaOfRectangle(int l, int w){
        return l*w;
    }
    public void AreaOfCircle(int r){
        double area;
        System.out.println(  area=(Math.PI)*(Math.sqrt(r)));
    }
}
