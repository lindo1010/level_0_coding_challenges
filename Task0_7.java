package com.company;

public class Task0_7 {
    public static void main(String[] args) {
        //System.out.println(degrees_to_fahrenheit(7));
        //System.out.println(fahrenheit_to_degrees(5));
    }
    public static double degrees_to_fahrenheit(double a){
        double fahrenheit = (a * 1.8)+32;
        return fahrenheit;
    }
    public static double fahrenheit_to_degrees(double x){
        double degrees = (x - 32)/ 1.8;
        return degrees;
    }
}
