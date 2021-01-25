package com.company;

public class Task0_10 {
public static void common_characters(String firstString, String secondString){
        String common;
        for (int x = 0; x < firstString.length(); x++){
            for (int i = 0; i < secondString.length(); i++){
                if (Character.toString(firstString.charAt(x)).equalsIgnoreCase(Character.toString(secondString.charAt(i)))){
                    common = Character.toString(firstString.charAt(x));
                    System.out.print(common);
                }
            }
        }
    }

    public static void main(String[] args) {
        common_characters("house","computers");
    }
}
