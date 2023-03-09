package com.hillel.protsenko.lessons.lesson7;

public class Array {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3};
        System.out.println(array1);

        //package lesson7;
        //
        //import java.util.ArrayList;
        //import java.util.Arrays;
        //import java.util.Collections;
        //
        //public class Main {
        //
        //    public static void main(String[] args) {
        //
        //
        ////        int[] array = new int[10];
        ////        int arrayIntegerValue[] = new int[7];
        //
        ////        System.out.println(array);
        //
        ////        array[0] = 1;
        ////        array[1] = 21;
        ////        array[2] = 41;
        ////        array[3] = 6;
        ////        array[4] = 8;
        ////        array[5] = 5;
        ////        array[6] = -9;
        ////
        ////        array[0] = 354;
        //
        ////        System.out.println(array[0]);
        ////        System.out.println(array[1]);
        ////        System.out.println(array[2]);
        ////        System.out.println(array[3]);
        ////        System.out.println(array[4]);
        ////        System.out.println(array[5]);
        ////        System.out.println(array[6]);
        //
        //
        ////        for (int i = 0; i < array.length; i++) {
        ////            array[i] = (int) (Math.random() * 101);
        ////        }
        //////
        ////        for (int i = 0; i < array.length; i++) {
        ////            if (array[i] == 55) {
        ////                array[i] = 77;
        ////            }
        ////            System.out.print(array[i] + " ");
        ////        }
        ////        System.out.println();
        ////
        ////        System.out.println(Arrays.toString(array));
        //
        //
        ////        for (int value : array) {
        ////            System.out.print(value + " ");
        ////        }
        //
        //
        ////   створити масив на 10 елементів та заповнити його випадковими цифрами від 0 до 10
        ////   вивести на екран в один рядок усі цифри, розділивши їх комою, але у
        ////   останнього символу не виводити кому
        //
        ////        int[] numbers = new int[10];
        ////
        ////        for (int i = 0; i < numbers.length; i++) {
        ////            numbers[i] = (int) (Math.random() * 11);
        ////
        ////            if (i == numbers.length - 1) {
        ////                System.out.print(numbers[i]);
        ////            } else {
        ////                System.out.print(numbers[i] + ", ");
        ////            }
        ////        }
        //
        ////        for (int i = 0; i < numbers.length; i++) {
        //////            if (numbers[i] == numbers.length) {
        //////                System.out.print(numbers[i]);
        //////            } else {
        //////                System.out.print(numbers[i] + ", ");
        //////            }
        //////            if (numbers[numbers.length - 1] == numbers.length) {
        //////                System.out.print(numbers[i]);
        //////            } else {
        //////                System.out.print(numbers[i] + ", ");
        //////            }
        ////
        ////            if (i == numbers.length - 1) {
        ////                System.out.print(numbers[i]);
        ////            } else {
        ////                System.out.print(numbers[i] + ", ");
        ////            }
        ////        }
        //
        //
        ////        for (int value : numbers) {
        ////            System.out.print(value + ", ");
        ////        }
        //
        ////        System.out.println(Arrays.toString(numbers));
        //
        //
        //
        //
        //
        ///*
        //     У вбивстві Кеннеді є 10 підозрюваних. Для кожного підозрюваного
        //     встановлено ймовірність того, що він був убивцею. Всі ці ймовірності
        //     записані як масив чисел. Написати функцію, яка і визначить
        //     номер підозрюваного, якого треба ув'язнити.
        //*/
        //
        ////        int[] array = {1, 44, 98, 44, 22, 33, 55, 22, 98, 10};
        //////        int chance = 1;
        //////        int indexMaxValue = -1;
        //////        for (int i = 0; i < array.length; i++) {
        //////            if (chance < array[i]) {
        //////                chance = array[i];
        //////                indexMaxValue = i;
        //////            }
        //////
        ////////            chance = Math.max(chance, array[i]);
        //////        }
        ////        int chance = 1;
        ////        int indexMaxValue = -1;
        ////        for (int i = 0; i < array.length; i++) {
        ////            chance = Math.max(chance, array[i]);
        ////        }
        ////        System.out.println("max chance: " + chance);
        ////
        ////        for (int i = 0; i < array.length; i++) {
        ////            if (array[i] == chance) {
        ////                System.out.println("index: " + i + ", chance: " + chance);
        ////            }
        ////        }
        //
        //
        //
        //
        ///*
        //     У вашій баскетбольній команді 10 людей. Очки гравців основного
        //     складу записані в парні комірки масиву, а запасних гравців - у
        //     непарні. Написати функцію, яка знайде наскільки більше балів
        //     заробив основний склад щодо запасних гравців.
        //*/
        //
        ////        int[] team = new int[10];
        ////
        ////        for (int i = 0; i < team.length; i++) {
        ////            team[i] = (int) (Math.random() * 11);
        ////        }
        ////
        ////        System.out.println(Arrays.toString(team));
        ////
        ////        int mainScore = 0;
        ////        int reserveScore = 0;
        ////        for (int i = 0; i < team.length; i++) {
        ////            if (i % 2 != 0) {
        ////                reserveScore += team[i];
        ////            } else {
        ////                mainScore += team[i];
        ////            }
        ////        }
        ////
        ////        System.out.println("team main score: " + mainScore);
        ////        System.out.println("team reserve score: " + reserveScore);
        ////
        ////
        ////        if (mainScore > reserveScore) {
        ////            System.out.println("team main have more points than team reserve: " + (mainScore - reserveScore));
        ////        } else if (reserveScore > mainScore) {
        ////            System.out.println("team reserve have more points than team main: " + (reserveScore - mainScore));
        ////        } else {
        ////            System.out.println("Draw!!!");
        ////        }
        //
        //
        ////        Integer[] array = {5, 2, 6, 1, -20, 99, 8, 0, -99};
        ////
        ////        int counter = 0;
        ////        for (int i = 0; i < array.length - 1; i++) {
        ////            for (int j = 0; j < array.length - 1 - i; j++) {
        ////                counter++;
        ////                if (array[j] < array[j + 1]) {
        ////                    int temp = array[j];
        ////                    array[j] = array[j + 1];
        ////                    array[j + 1] = temp;
        ////                }
        ////            }
        ////        }
        ////
        ////        System.out.println(Arrays.toString(array));
        ////        System.out.println("counter: " + counter);
        //
        //
        //
        ////        Arrays.sort(array, Collections.reverseOrder());
        ////        System.out.println(Arrays.toString(array));
        //
        //
        //
        //        // BAD!!!!!!!!!!!!!!!!!
        ////        int[] array1 = {1, 2, 3, 4, 5};
        ////        int[] array2 = array1;
        ////
        ////        System.out.println(Arrays.toString(array1));
        ////        System.out.println(Arrays.toString(array2));
        ////
        ////        array2[0] = 99;
        ////
        ////        System.out.println();
        ////        System.out.println(Arrays.toString(array1));
        ////        System.out.println(Arrays.toString(array2));
        //
        //
        ////        int[] array1 = {1, 2, 3, 4, 5};
        ////        int[] array2 = new int[array1.length];
        ////
        ////        for (int i = 0; i < array1.length; i++) {
        ////            array2[i] = array1[i];
        ////        }
        ////
        ////        System.out.println(Arrays.toString(array1));
        ////        System.out.println(Arrays.toString(array2));
        ////
        ////        array2[0] = 99;
        ////
        ////        System.out.println();
        ////        System.out.println(Arrays.toString(array1));
        ////        System.out.println(Arrays.toString(array2));
        //
        //
        ////        int[] array1 = {1, 2, 3, 4, 5};
        ////        int[] array2 = Arrays.copyOf(array1, 10);
        ////
        ////        System.out.println(Arrays.toString(array1));
        ////        System.out.println(Arrays.toString(array2));
        ////
        ////        array2[0] = 99;
        ////
        ////        System.out.println();
        ////        System.out.println(Arrays.toString(array1));
        ////        System.out.println(Arrays.toString(array2));
        //
        ////        int[] array1 = {1, 2, 3, 4, 5};
        ////        int[] array2 = new int[3];
        ////
        ////        System.arraycopy(array1, 2, array2, 0, 3);
        ////
        ////        System.out.println(Arrays.toString(array1));
        ////        System.out.println(Arrays.toString(array2));

        ////        int[] array = new int[-1];
        ////        System.out.println(Arrays.toString(array));
        //    }
        //}
        //How to check all values inside the array
        //System.out.println(Arrays.toString(array_Variable));
    }
}
