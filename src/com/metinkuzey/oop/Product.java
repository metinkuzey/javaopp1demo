package com.metinkuzey.oop;

public class Product {
    //Firstly, define class variables
    //encapsulation
    private int id;
    private String name;
    private double unitPrice;
    private String description;
    private double discountRate;
    private double unitPriceAfterDiscount;

    // Constructor Define
    public Product(){
        System.out.println("Product constructor run");
    }

    public Product(int id,String name,
                   double price, String description,
                   double discountRate){
        //this();//calling the default constructor of class
        this.id = id;
        this.unitPrice = price;
        this.name = name;
        this.description = description;
        this.discountRate = discountRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getUnitPriceAfterDiscount() {
        return unitPriceAfterDiscount = this.unitPrice - (this.unitPrice * this.discountRate)/100 ;
    }

}
