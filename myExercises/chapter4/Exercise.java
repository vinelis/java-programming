package myExercises.chapter4;

import java.util.Random;
import java.util.Scanner;

public class Exercise {

   /*
    The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
    After each roll, tell the user which game space they are on and how many more spaces they have to go to win
    Repeat this 4 additional times, for 5 rolls in total.
    However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
    If they are greater than or less than 20 spaces exactly, they lose.
     */

    public static void main(String args[]) {

        int space = 0;
        int spacesToWin = 20;
        Random random = new Random();

        for (int i = 0; i < 5; i++) {

            int die = random.nextInt(6) + 1;
            space = space + die;

            Scanner scanner = new Scanner(System.in);
            if (space > 20) {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You lose, try again another one");
                break;
            } else if (space == 20) {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ", you are ond space " + space + " Congrats, you win!");
                break;
            } else if (i == 4 && space < 20) {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ", you are ond space " + space + " but you dont have more rolls, so you lose, try again another one");
                break;
            } else {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are now on space " + space + " and have " + (20 - space) + " more to go");
            }

        }


    }
}