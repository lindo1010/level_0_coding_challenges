package com.company;
import java.util.ArrayList;

public class Task09 {
    public static void main(String[] args) {System.out.println(printVowels("Umuzi"));}

    static String printVowels(String str){
        String beginning = "Vowels: ";
        char[] stringArray = str.toCharArray();
        ArrayList<String> vowels = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            if (stringArray[i] == 'a' || stringArray[i] == 'A'){vowels.add("a");}
            if (stringArray[i] == 'e' || stringArray[i] == 'E'){vowels.add("e");}
            if (stringArray[i] == 'i' || stringArray[i] == 'I'){vowels.add("i");}
            if (stringArray[i] == 'o' || stringArray[i] == 'O'){vowels.add("o");}
            if (stringArray[i] == 'u' || stringArray[i] == 'U'){vowels.add("u");}
        }
        String vowelsString = "";
        for (int i = 0; i < vowels.size(); i++) {
            if(!(vowelsString.contains(vowels.get(i)))) {vowelsString += vowels.get(i);}
        }
        String[] splitVowels = vowelsString.split("");
        String common = "";
        for(int i = 0; i < splitVowels.length; i++){
            common += splitVowels[i];
            if(i != splitVowels.length-1) {common += ", ";}
        }
        return beginning + common;
    }
}