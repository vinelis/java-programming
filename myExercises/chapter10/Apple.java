package myExercises.chapter10;

public class Apple extends Fruits {

    public Apple(){
        setCalories(256);
    }

    public void removeSeeds(){
        System.out.println("I am removing the seeds, so you can enjoy your apple juice");
    }

    public void makeJuice(){
        System.out.println("Your apple juice taste like shit");
    }
}
