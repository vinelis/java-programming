package myExercises.chapter10;

public class Banana extends Fruits {


    public Banana(){
        setCalories(176);
    }
    public void peel(){
        System.out.println("Now your banana is peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is gross ");
    }
}
