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
      inventory.add ( product );
    }

    //X Beverage Version
    public void addInventory(String name, int price, String id, String description, int volume, int volumeUnit) {
        Beverage bev = new Beverage (name,price,id,description,volume,volumeUnit);
        addInventory (bev);
    }

    //X Fruit Version
    public void addInventory(String name, int price, String id, String description, int hardness) {
        Fruit fruit = new Fruit (name,price,id,description,hardness);
        addInventory (fruit);
    }



}
