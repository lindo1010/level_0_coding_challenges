package com.company;

public class Task05 {
     public static void main(String[] args) {
            System.out.println(area_of_triangle(5,4,3));
        }

        public static double area_of_triangle(int a, int b, int c) {
            double s = 0.5 * (a + b + c);
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            return area;
        }
}
