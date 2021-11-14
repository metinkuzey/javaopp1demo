package com.metinkuzey.oop;

public class ProductManager {
    public void addToChart(Product product){
        System.out.println("Id: " + product.getId() +
                           " and Name: " + product.getName() +
                           " --- Product added to chart.");
    }
}
