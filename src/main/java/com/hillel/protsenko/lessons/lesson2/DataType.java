package com.hillel.protsenko.lessons.lesson2;

public class DataType {
    public static void main(String[] args) {
        final double LAT = 11.5564;
        final double LONGI = 104.9281;
        char degrSymb = '\u00b0';
        String homePos = "My home is here: Latitude:"+degrSymb+LAT+"; Longitude:"+degrSymb+LONGI+";";
        System.out.println(homePos);
    }
}
