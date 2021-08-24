package com.FFS.Products;

public class Beverage extends Product{

    public static final String[] UNITS = new String[]{"oz","quarts","gal","mL","Litres"};
    private int volume;
    private String volumeUnit;

    public Beverage(String name, int price, String id, String description, int volume, String volumeUnit) {
        super ( name, price, id, description );
        this.volume = volume;
        this.volumeUnit = volumeUnit;
    }

    public Beverage(String name, int price, String id, String description, int volume, int volumeUnit) {
        super ( name, price, id, description );
        this.volume = volume;
        this.volumeUnit = UNITS[volumeUnit];
    }

    @Override
    public String toString() {
        return super.toString () + "Volume: " + volume + " " + volumeUnit + "| ";
    }
}
