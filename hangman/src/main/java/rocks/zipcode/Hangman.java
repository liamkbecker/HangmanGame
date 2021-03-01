package rocks.zipcode;

import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args){
        Hangman game = new Hangman();
        game.runGame();
    }

    boolean wordGuessed = false;
    int guesses = 0;

    public int getGuesses(){
        return guesses;
    }

    public boolean getWordGuessed(){
        return wordGuessed;
    }

    public void runGame(){

        guessesPlus GP = new guessesPlus();
        displayPlus DP = new displayPlus();

        System.out.println(GP.getRandomWord());


        //choose a word, method in displayPlus

        /*while(true){
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
        }*/


    }

    public Hangman() {}
}
