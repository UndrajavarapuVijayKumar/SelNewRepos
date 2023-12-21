package com.metlife.math;

public class Runner {
    public static void main(String[] args) {
            //Volume of Sphere
        double volsphere=volume.VolumeOfSphere(10);
        System.out.println("Volume of Sphere: "+volsphere);
            //Volume of Pyramid
        double volpyramid=volume.VolumeOfPyramid(10,20,10);
        System.out.println("Volume of Pyramid :" +volpyramid);
            //Volume of Cuboid
        double volCuboid = volume.VolumeOfCuboid(10,10,10);
        System.out.println("Volume of Cuboid  :"+volCuboid);
            //Volume of Cylinder
        double volCylinder = volume.VolumeOfCylinder(10,20);
        System.out.println("Volume of Cylinder: "+volCylinder);
            //Volume of Cone
        double volCone = volume.VolumeOfCone(10,13);
        System.out.println("Volume of Cone : "+volCone);
            //Volume of Hemisphere
        double volHemisphere = volume.VolumeOfHemisphere(6);
        System.out.println("Volume of Hemisphere: "+volHemisphere);
    }
}
