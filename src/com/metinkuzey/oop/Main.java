package com.metinkuzey.oop;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.id = 1;
        product1.name = "Apple Macbook M1";
        product1.unitPrice = 15000.00;
        product1.description = "6 CPU 16 GB Ram";
        Product product2 = new Product();
        product2.id = 1;
        product2.name = "Apple Macbook Air";
        product2.unitPrice = 10000.00;
        product2.description = "4 CPU 16 GB Ram";
        Product product3 = new Product();
        product3.id = 1;
        product3.name = "Apple iMac Pro";
        product3.unitPrice = 25000.00;
        product3.description = "10 CPU 64 GB Ram";

        Product[] products = {product1,product2,product3};
        System.out.println(products.length);
        for (Product product:products
             ) {
            System.out.println("         Id: " + product.id);
            System.out.println("       Name: " + product.name);
            System.out.println("      Price: " + product.unitPrice);
            System.out.println("Description: " + product.description);
            System.out.println("----------------------------");
        }

        // NOTE: IMPORTANT --> Classes are reference types

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Electronic";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Telephone";

        Product product4 = new Product(4,"iPhone 13 Pro Max", 25000.00,"2Tb 6.7 inch");
        Product product5 = new Product(5,"iPhone 13 Pro", 20000.00,"1Tb 6.7 inch");
        Product product6 = new Product(6,"iPhone 13 Mini",12000.00,"5.5 inch 512 Gb");
        Product[] products1 = {product4,product5,product6};
        for (Product product:products1
             ) {
            System.out.println("         Id: " + product.id);
            System.out.println("       Name: " + product.name);
            System.out.println("      Price: " + product.unitPrice);
            System.out.println("Description: " + product.description);
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
