package myExercises.chapter3;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1 Ask how many pennies
        System.out.println("How many pennies would you like?");
        double pennies = scanner.nextDouble();

        //2 Ask how many nickels
        System.out.println("How many nickels would you like");
        double nickels = scanner.nextDouble();

        //3 Ask how many dimes
        System.out.println("How many dimes would you like");
        double dimes = scanner.nextDouble();

        //4 Ask how many quarters
        System.out.println("How many quarters would you like");
        double quarters = scanner.nextDouble();
        scanner.close();

        // Calculate value
        double value = (pennies * 0.01 ) + (nickels * 0.05) + (dimes * 0.1) + (quarters * 0.25);

        if(value == 1){
            System.out.println("You win the game");
        }
        else if(value > 1){
            double wentOver = value - 1;
            System.out.println("Your value is more than a 1, you went over by " + wentOver);
        }
        else{
            double wentUnder = 1 - value;
            System.out.println("Your value is under than a 1, you went under by " + wentUnder);
        }
    }
}
