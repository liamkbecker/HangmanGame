package rocks.zipcode;

import java.util.Scanner;
import java.util.Random;

public class displayPlus {

    char[] wordArray;

    public char[] toCharArray(String input){
        char[] charArray = new char[input.length()];
        for(int i = 0; i < input.length(); i++){
            charArray[i] = input.charAt(i);
        }
        return charArray;
    }

    public char[] generateBlankArray(String input){
        char[] charArray = new char[input.length()];
        for(int i = 0; i < input.length(); i++){
            charArray[i] = '_';
        }
        return charArray;
    }

    public String formatCharArray(char[] array){
        String returnString = "";
        returnString = returnString + array[0];
        for(int i = 1; i < array.length; i++){
            returnString = returnString + " ";
            returnString = returnString + array[i];
        }
        return returnString;
    }

}
