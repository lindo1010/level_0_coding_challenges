package com.company;

public class Task0_7 {
    public static void main(String[] args) {
        System.out.println(degreesToFahrenheit(7));
        System.out.println(fahrenheitToDegrees(5));
    }
    public static double degreesToFahrenheit(double a){
        double fahrenheit = (a * 1.8)+32;
        return fahrenheit;
    }
    public static double fahrenheitToDegrees(double x){
        double degrees = (x - 32)/ 1.8;
        return degrees;
    }
}
