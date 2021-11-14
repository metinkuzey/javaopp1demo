package com.metinkuzey.oop;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Apple Macbook M1");
        product1.setUnitPrice(15000.00);
        product1.setDescription("6 CPU 16 GB Ram");
        product1.setDiscountRate(20);
        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Apple Macbook Air");
        product2.setUnitPrice(10000.00);
        product2.setDescription("4 CPU 16 GB Ram");
        product2.setDiscountRate(15);
        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Apple iMac Pro");
        product3.setUnitPrice(25000.00);
        product3.setDescription("10 CPU 64 GB Ram");
        product3.setDiscountRate(10.00);

        Product[] products = {product1,product2,product3};
        System.out.println("Products size is " + products.length + ".");
        for (Product product:products
             ) {
            System.out.println("         Id: " + product.getId());
            System.out.println("       Name: " + product.getName());
            System.out.println("      Price: " + product.getUnitPrice());
            System.out.println("Description: " + product.getDescription());
            System.out.println("   Discount: " + product.getDiscountRate());
            System.out.println("  Net Price: " + product.getUnitPriceAfterDiscount());
            System.out.println("----------------------------");
        }

        // NOTE: IMPORTANT --> Classes are reference types

        Category category1 = new Category();
        category1.setId(1) ;
        category1.setName("Electronic");

        Category category2 = new Category();
        category2.setId(2) ;
        category2.setName("Computer");
        Category[] categoryList = {category1,category2};
        for (Category category:categoryList){
            System.out.println("         Id: " + category.getId());
            System.out.println("       Name: " + category.getName());
            System.out.println("----------------------------");
        }

        Product product4 = new Product(4,"iPhone 13 Pro Max", 25000.00,"2Tb 6.7 inch",20.00);
        Product product5 = new Product(5,"iPhone 13 Pro", 20000.00,"1Tb 6.7 inch",25.00);
        Product product6 = new Product(6,"iPhone 13 Mini",12000.00,"5.5 inch 512 Gb",15.00);
        Product[] products1 = {product4,product5,product6};
        for (Product product:products1
             ) {
            System.out.println("         Id: " + product.getId());
            System.out.println("       Name: " + product.getName());
            System.out.println("      Price: " + product.getUnitPrice());
            System.out.println("Description: " + product.getDescription());
            System.out.println("   Discount: " + product.getDiscountRate());
            System.out.println("  Net Price: " + product.getUnitPriceAfterDiscount());
            System.out.println("----------------------------");
        }

        //Don't Repeat Yourself - DRY Principle
        /**
         * SOLID PRINCIPLES
         * S --> SINGLE RESPONSIBILITY
         * O --> OPEN CLOSED
         * L --> LISKOV SUBSTITUTION
         * I --> INTERFACE SEGREGATION
         * D --> DEPENDENCY INVERSION
         **/

        ProductManager productManager = new ProductManager();
        productManager.addToChart(product1);
        productManager.addToChart(product2);
        productManager.addToChart(product3);
        productManager.addToChart(product4);
        productManager.addToChart(product5);
        productManager.addToChart(product6);

    }
}
