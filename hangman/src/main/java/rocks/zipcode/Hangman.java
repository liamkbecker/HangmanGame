package rocks.zipcode;

import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args){
        Hangman game = new Hangman();
        game.runGame();
    }

    public void runGame(){

        boolean wordGuessed = false;
        int guesses = 0;

        //choose a word, method in displayPlus

        while(true){
            wordGuessed = false;
            System.out.println("Welcome to Hazel's Hangman!");
            while(!wordGuessed){
                //print guesses and current state, method in displayPlus
                //ask for a guess, method in displayPlus

                //check letter, increment guesses. method in guessesPlus

                if(wordGuessed){
                    //Update display. method in displayPlus
                    System.out.println("You got it!");
                }

                if(guesses == 0){
                    //Update display. method in displayPlus
                    System.out.println("Game over!");
                    break;
                }
            }
            //Do you want to play again? method in displayPlus
        }


    }

    public Hangman() {}
}
