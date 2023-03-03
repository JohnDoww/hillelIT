package com.hillel.protsenko.lessons.lesson6;

public class Shuttle {
    public static void main(String[] args) {
        int numberOfShuttle=0;
        int id =1;
        int desireAmount =100;
        for (; numberOfShuttle<desireAmount;id++) {
            String number = String.valueOf(id);
            numberOfShuttle++;
            // First Variant
             if (number.contains("4")  || number.contains("9"))
             { numberOfShuttle--;continue;}
            //Another variant
            // if (id / 10 == 9 || id % 10==4||id % 10 == 9 || id / 10==4)
            // { numberOfShuttle--;continue;}
            //else if (id >=140 && id <=149){ numberOfShuttle--;continue;}

            System.out.println("Shuttle Id "+id);
            System.out.println("Count number "+ numberOfShuttle+"\n");
        }
        if (numberOfShuttle==desireAmount) {
            System.out.println("Total shuttle amount = " + numberOfShuttle);
        } else {
            System.out.println("Wasted, we have less than 100 shuttles");
        }
            //У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати 100 космічних шатлів
            // для перевезення людей на Марс так, щоб
            // у номерах шатлів не траплялося нещасливих чисел. Напишіть программу, яка виводить усі номери таких шатлів.

    }
}
