package myExercises.chapter5;

import java.util.Scanner;

public class Exercise5{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Enter base cost of the plan");
        double cost = scanner.nextDouble();
        System.out.println("Enter overage minutes:");
        int overage = scanner.nextInt();
        scanner.close();

        double overageValue = overageMinutes(overage);
        double taxes = calculateTaxes(cost,overageValue);
        calculateAndPrint(cost, overageValue, taxes);

    }
    public static double overageMinutes(int overage){
        return overage * (0.25);
    }
    public static double calculateTaxes(double cost, double overageValue){
        return (cost + overageValue) * (0.15);
    }
    public static void calculateAndPrint(double cost, double overageValue, double taxes ){

        System.out.println("Bill Statement:");
        System.out.println("Plan: " + String.format("%.2f",cost));
        System.out.println("Overage: " + String.format("%.2f",overageValue));
        System.out.println("Tax: " + String.format("%.2f", taxes));
        System.out.println("Total: " + String.format("%.2f",(cost + overageValue + taxes )));
    }


}
