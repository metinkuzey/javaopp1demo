package com.metinkuzey.oop;

public class ProductManager {
    public void addToChart(Product product){
        System.out.println("Id: " + product.id +
                           " and Name: " + product.name +
                           " --- Product added to chart.");
    }
}
