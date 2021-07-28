package com.company;

public class Task08 {
    public static void main(String[] args) {convertToMinutes(71);}

    public static void convertToMinutes( int a){
        int hours = a / 60;
        int minutes = a % 60;
        if(a / 60 == 1){
            if (a % 60 == 1){System.out.println(hours +" hour, " + minutes + " minute");}
            else{System.out.println(hours +" hour, " + minutes + " minutes");}
        }else {
            if (a % 60 == 1){System.out.println(hours +" hours, " + minutes + " minute");}
            else {System.out.println(hours +" hours, " + minutes + " minutes");}
        }
    }
}
