package com.company;

public class Task0_6 {
    public static void main(String[] args) {
    System.out.println(maximum(10,15,12));
    }
    public static int maximum(int a, int b, int c){
        int max;
        if(a >= b && a >= c) {
             max = a;
        }else if(b >= a && b >= c){
             max = b;
        }else {
             max = c;
        }
        return max;
    }
}
