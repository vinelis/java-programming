package myExercises.chapter2;

/*
    Create a program that asks a user for a season of the year, then a whole number, then an adjective.
    And use the input to complete the sentence below. Output the result.
 */

import java.util.Scanner;

public class Exercise{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //1. Get the season
        System.out.println("Give me a season of the year.");
        String season = scanner.next();

        //2. Get the whole number
        System.out.println("Give me a whole number.");
        int number = scanner.nextInt();

        //3. Get the adjective
        System.out.println("Give me an adjective.");
        String adjective = scanner.next();

        scanner.close();

        //4. Display result
        System.out.println("On a " + adjective + " " + season + " day, i drink a minimum of " + number + " cups of coffe");
    }

}
