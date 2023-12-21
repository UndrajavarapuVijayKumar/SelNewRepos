package com.metlife.math;

public class volume {

    public static double VolumeOfSphere(int radius){
        double Sphere = (double)1.333*3.141*(radius*radius*radius);
        return Sphere;
    }
    public static double VolumeOfPyramid(int l,int w,int h){
        double pyramid = ((double) l*w*h)/3;
        return pyramid;
    }
    public static double VolumeOfCuboid(int l, int w, int h){
        double Cuboid = (double) l*w*h;
        return Cuboid;
    }
    public static double VolumeOfCylinder(int radius, int height){
        double cylinder = 3.141*(radius*radius)*(double) height;
        return cylinder;
    }
    public static double VolumeOfCone(int radius, int height){
        double cone = 3.141*((double) radius*radius)*(height/3);
        return cone;
    }
    public static double VolumeOfHemisphere(int radius){
        double hemisphere=(2*3.141*(radius*radius*radius))/3;
        return hemisphere;
    }
}
