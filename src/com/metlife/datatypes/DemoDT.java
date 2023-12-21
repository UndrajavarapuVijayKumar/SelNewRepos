package com.metlife.datatypes;

public class DemoDT {
    public static void main(String[] args) {
        String [] n = new String[2];
        n[0]="red";
        System.out.println(n[0]);
        System.out.println(n[1]);
        String [] n2=new String[]{"vijay","kumar"};

        for(String n3:n2){
            System.out.println(n3);
        }
    }
}
