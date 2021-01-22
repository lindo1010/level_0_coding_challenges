package com.company;

public class Task0_5 {
    public static void main(String[] args) {
        area_of_triangle(5,6,9);
    }
    public static void area_of_triangle(int a, int b, int c) {
        double s = 0.5 * (a + b + c);
        System.out.println("area is: " + s);
    }
}
