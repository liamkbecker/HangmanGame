package rocks.zipcode;

import java.util.Scanner;
import java.util.Random;

public class guessesPlus {

    String currentWord = "";

    String[] wordPool1 = {"ate", "hungry", "potato", "barrel", "water"};

    public String getRandomWord(){

        Random rand = new Random();
        int selector = rand.nextInt(5);

        currentWord = wordPool1[selector];

        return wordPool1[selector];
    }

    public String getCurrentWord(){
        return currentWord;
    }

}
