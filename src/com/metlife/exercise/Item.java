package com.metlife.exercise;

public class Item {
    private int ID;
    private int Quantity;

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String descr;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private double price;

        /*Please complete day 3 task iassignment

        create a method in item class to print discounted price.
        If qty = 2 --> print the final price by providing 10% discount of price
        If qty = 3 to 5--> print the final price by providing 15% discount of price
        If qty >5 --> print the final price by providing 25% discount of price
*/
//    Example:
    public void DiscountPrice(){
        double finalPrice=0;
        if(Quantity==2) {
            finalPrice = (price-(price*10/100))*Quantity;
        }else if(Quantity>=3 && Quantity<=5){
            finalPrice=(price-(price*15/100))*Quantity;
        } else if (Quantity>5) {
            finalPrice=(price-(price*25/100))*Quantity;
        }
        System.out.println(finalPrice);
    }
}
