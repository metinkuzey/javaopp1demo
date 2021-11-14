package com.metinkuzey.oop;

public class Product {
    // Constructor Define
    public Product(){
        System.out.println("Product constructor run");
    }
    public Product(int id,String name, double price, String description){
        this();//calling the default constructor of class
        this.id = id;
        this.unitPrice = price;
        this.name = name;
        this.description = description;
    }

    int id;
    String name;
    double unitPrice;
    String description;

}
