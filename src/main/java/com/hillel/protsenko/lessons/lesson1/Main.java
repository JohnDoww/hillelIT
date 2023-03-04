package com.hillel.protsenko.lessons.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String firstAct ="Dear user, try to guess the generated number, you have "+" tries: ";
        Scanner in = new Scanner(System.in);

            System.out.println("Dear user, try to guess the generated number 1 to 10, you have "+" tries:");
      //      String checkDataT=in.nextLine();
        //Integer inputDbl = Integer.parseInt(checkDataT);
        if (!in.hasNextInt()) {
            System.out.println("That's not a number!");
            System.out.println("there nothing");
        }
        //System.out.println(inputDbl);
        //System.out.println(checkDataT);



//        System.out.println("Hi world");
//        for (int i = 0; i < 11; i++) {
//            int guess = (int) (Math.random()*11);
//            System.out.println(guess);
//        }
    }
}
