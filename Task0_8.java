package com.company;

public class Task0_8 {
    public static void main(String[] args) {
        convert_to_minutes(71);
        
    }
    public static void convert_to_minutes( int a){
        int hours = a / 60;
        int minutes = a % 60;

        if(a / 60 == 1){
            if (a % 60 == 1){
                System.out.println(hours +" hour, " + minutes + " minute");
            }else{
                System.out.println(hours +" hour, " + minutes + " minutes");
            }
        }else {
            if (a % 60 == 1){
                System.out.println(hours +" hours, " + minutes + " minute");
            }
            else {
                System.out.println(hours +" hours, " + minutes + " minutes");
            }
        }
    }
}
