package com.FFS;
import com.FFS.Products.Beverage;
import com.FFS.Products.Fruit;
import com.FFS.Products.Product;

public class Main {

    public static void main(String[] args){

      Product prod1 = new Product ( "Nura", 300_00, "9032", "Nuraphones" );
      Fruit prod2 = new Fruit ( "Apple", 89, "5635","Bag O Apples",5 );
      Product prod3 = new Fruit ( "Oranges", 89, "5899","Bag O Oranges",4, true);
      Product prod4 = new Beverage ( "Whole Milk",4_99,"8899","Cow milk",1,2);
      Beverage prod5 = new Beverage ("Oranges",2_99,"3456","Pulp",2,1 );


//        System.out.println (prod1);
//        System.out.println (prod2);
//        System.out.println (prod3);
//        System.out.println (prod4);
//        System.out.println (prod5);

        Store ffs = new Store ( "Felicia's Fruit Stand" );

        ffs.addInventory ( prod1 );
        ffs.toString ();

    }
}

