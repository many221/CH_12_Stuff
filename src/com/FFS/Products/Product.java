package com.FFS.Products;

import java.text.NumberFormat;

public class Product {

    private String name;
    private int price;
    private String id;
    private String description;

    public Product(String name, int price, String id, String description) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.description = description;
    }

    public String getDisplayPrice(){

        return NumberFormat.getCurrencyInstance ().format (price/100.0);
    }

    @Override
    public String toString(){
        String output = "|ID : " + id + " | name: " + name  + " | Price: "  + getDisplayPrice ()  + " | ";

        return output;

    }


}
