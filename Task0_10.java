package com.company;

public class Task0_10 {
    public static void main(String[] args) {
        common_characters("Mkhize","Lindokuhle");

    }
    static void common_characters(String firstString, String secondString){
        int num_of_char = 26; //26 alphabets

        int [] letters1 = new int [num_of_char];
        int [] letters2 = new int [num_of_char];

        int firstString_length = firstString.length();
        int secondString_length = secondString.length();

        //for loop to loop through a string and convert it character also assign it to an index and store in the letters array
        for (int x = 0; x < firstString_length; x++ ){
            letters1[firstString.charAt(x) - 'a'] +=1; //.chrAt() method converts string to character
        }
        for (int x = 0; x < secondString_length; x++) {
            letters2[secondString.charAt(x) - 'a'] +=1;
        }

        for (int x = 0; x < num_of_char; x++){
            //find common index in both strings if it is not 0
            if (letters1[x] != 0 && letters2[x] != 0){
                //minimum occurence of the string in both strings
                for (int i =0; i < Math.min(letters1[x],letters2[x]); i++){
                    System.out.println(((char)(x + 'a')));
                }
            }
        }
    }
}
