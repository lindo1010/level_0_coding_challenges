package com.company;

public class Task0_10 {
static void common_characters(String input1, String input2){

        String common_strings;
        String common_characters = "";

        for (int i = 0; i < input1.length(); i++){
            for (int z = 0; z < input2.length(); z++){
                if (Character.toString(input1.charAt(i)).equalsIgnoreCase(Character.toString(input2.charAt(z)))){
                    common_strings = Character.toString(input1.charAt(i));
                    common_characters += common_strings + ",";
                }
            }
        }
        common_characters = common_characters.substring(0,common_characters.length()-1);
        System.out.print("Common letters: " + common_characters);
    }

    public static void main(String[] args) {
        common_characters("computers","house");
    }
}
