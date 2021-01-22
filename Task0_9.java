package com.company;

public class Task0_9 {
    public static void main(String[] args) {
        print_vowels("Lindokuhle");
    }
    static void print_vowels(String randomString){
        //used .replaceAll methode to replace non vowels with empty string and remain with vowels
        // the "^" not of makes sure the values returned are the ones we want
        String vowelsInString = randomString.replaceAll("[^aeiouAEIOU]","");
        System.out.println(vowelsInString);
    }
}
