package com.metlife.exercise;

public class Shopping {
    public static void main(String[] args) {
        Item i1 = new Item();
        Item i2 = new Item();

       /* i1.descr="description";
        i2.descr="descriptionn2";

        System.out.println(i1.descr+"----"+i2.descr);*/

        i1.setDescr("MacBook");
        System.out.println(i1.getDescr());
        i1.setQuantity(5);
        i1.setPrice(100000);

        i1.DiscountPrice();
        i2.setDescr("laptops");
        i2.setQuantity(2);
        i2.setPrice(10000);
        i2.DiscountPrice();

        //continution in git
    }
}
