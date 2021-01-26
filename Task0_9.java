package com.company;

public class Task0_9 {
    public static void main(String[] args) {
        print_vowels("Lindokuhle");
    }
    static void print_vowels(String randomString){
        String vowelsInString = randomString.replaceAll("[^aeiouAEIOU]","");
        System.out.println(vowelsInString);
    }
}
