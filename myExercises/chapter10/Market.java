package myExercises.chapter10;

import java.util.Scanner;

public class Market {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        Fruits apple = new Apple();
        ((Apple) apple).removeSeeds();

        Apple apple2 = new Apple();
        apple2.removeSeeds();

        Banana banana = new Banana();
        banana.peel();

        Fruits banana2 = new Banana();
        ((Banana) banana2).peel();

        Fruits orange = new Fruits();

        squeeze(apple);
        squeeze(banana);
        squeeze(banana2);
        squeeze(orange);

    }

    public static void squeeze(Fruits fruit){
        System.out.println("Squeezing...");
        fruit.makeJuice();
    }


}

