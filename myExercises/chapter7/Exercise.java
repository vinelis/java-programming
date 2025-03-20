package myExercises.chapter7;

import java.util.Scanner;

public class Exercise {

    private static final String[] DAYSOFTHEWEEK = {"Mondey", "Tuesday", "Wednesday", "Thurday", "Friday", "Saturday", "Sunday"};
    private static int number;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Give me a number an i will give you a day of the week ");
        number = scanner.nextInt();
        scanner.close();
        dayByNumber(DAYSOFTHEWEEK,number);

    }

    public static void dayByNumber(String[] array, int number){
        System.out.println("Your day of the week is " + array[number - 1]);
    }

}

