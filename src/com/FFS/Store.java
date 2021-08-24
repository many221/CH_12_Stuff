package com.FFS;

import com.FFS.Products.Beverage;
import com.FFS.Products.Fruit;
import com.FFS.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> inventory = new ArrayList<> ();
    private int balance = 500_0;
    private String name;

    public Store(String name) {
        this.name = name;
    }

    public void addInventory(Product product) {
    }

    //X Beverage Version
    public void addInventory() {
        Beverage bev = new Beverage ();
        addInventory ( bev );
    }
    //X Fruit Version
    public void addInventory() {
        Fruit fruit = new Fruit ();
        addInventory (fruit);
    }


}
