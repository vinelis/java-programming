package myExercises.chapter8;

import java.util.Scanner;

public class Exercise {

    static Scanner scanner = new Scanner(System.in);
    public static String oldPassword;
    public static String username;


    public static void main(String[] args){


        System.out.println("Give me your username");
        String username = scanner.next();
        System.out.println("If you want to change yout password, first i need the old one");
        String oldPassword = scanner.next();
        System.out.println("Give me the new password");
        String password = scanner.next();
        scanner.close();

        isAValidPassword(password);

    }

    public static boolean containUpperCase (String password){

        boolean out = false;
        for(int i=0; i < password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                 out = true;
            }
        }
        return out;
}

    public static boolean containAtLeast8Characters (String password){
        return (password.length()>7);
    }

    public static boolean containASpecialCharacter (String password){
        boolean out = false;

        for(int i = 0; i<password.length(); i++ ){
            if (!Character.isLetterOrDigit(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))){
                out = true;
            }
        }
        return out;
    }

    public static boolean containTheUsername (String password){
        return password.contains(username);
    }

    public static boolean isEqualTheOldPassword (String password){
        return password.contains(oldPassword);
    }

    public static void isAValidPassword(String password){

        if(containUpperCase(password)  && containAtLeast8Characters(password) && isEqualTheOldPassword(password) && containTheUsername(password)){
            System.out.println("Your password is accepted");
        }
        else{
            System.out.println("You need to check your password my friend");
        }
    }

}