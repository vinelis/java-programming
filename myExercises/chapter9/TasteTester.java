package myExercises.chapter9;

import java.util.Scanner;

public class TasteTester {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){

        WeddingCake cake1 = new WeddingCake();
        cake1.setFlavour("Vanilla");
        cake1.setPrice(200);
        cake1.setTiers(3);

        //System.out.println("Your wedding cake taste is " + cake1.getFlavour() + " and its has " + cake1.getTiers() + " tiers \nThe whole price of your cake is $" + cake1.getPrice() );

        BirthdayCake cake = new BirthdayCake();
        cake.setPrice(99);
        System.out.print("How many candles would your like?");
        int candles = scanner.nextInt();
        cake.setCandles(candles);
        System.out.print("What flavour would you like?");
        String flavour = scanner.next();
        cake.setFlavour(flavour);
        scanner.close();
        System.out.print("Birthday cake \n");
        System.out.print("Flavour: " + cake.getFlavour());
        System.out.print("\nCandles: " + cake.getCandles());
        System.out.print("\nPrice: " + cake.getPrice());








    }

}
