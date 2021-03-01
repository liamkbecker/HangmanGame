package rocks.zipcode;

import java.util.Scanner;
import java.util.Random;

public class displayPlus {

    char[] wordArray;

    public char[] toCharArray(String input){
        char[] returnCharArray = new char[input.length()];
        for(int i = 0; i < input.length(); i++){
            returnCharArray[i] = input.charAt(i);
        }
        return returnCharArray;
    }

}
