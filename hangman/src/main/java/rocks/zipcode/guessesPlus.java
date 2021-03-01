package rocks.zipcode;

import java.util.Scanner;
import java.util.Random;

public class guessesPlus {
    char displayed[];
    char word[];

    String[] wordPool1 = {"ate", "hungry", "potato", "barrel", "water"};

    public String getRandomWord(){

        Random rand = new Random();
        int selector = rand.nextInt(5);

        return wordPool1[selector];
    }

}
