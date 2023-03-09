package com.hillel.protsenko.lessons.lesson7;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {
        int totalPlayers =25;
        int totalAgeA=0;
        int totalAgeB=0;
        int avgAgeA;
        int avgAgeB;
        int [] teamA = new int[totalPlayers];
        int [] teamB = new int[totalPlayers];

        for (int i = 0; i <totalPlayers ; i++) {
            teamA[i] =  (int)(18+ (Math.random()*23));
            totalAgeA +=teamA[i];
            teamB[i] =  (int)(18+ (Math.random()*23));
            totalAgeB +=teamB[i];
        }

        avgAgeA = totalAgeA/totalPlayers;
        avgAgeB = totalAgeB/totalPlayers;

        System.out.println("Team A. Age of each player "+(Arrays.toString(teamA)));
        System.out.println("Average age of players Team A is: "+avgAgeA);
        System.out.println("Team B. Age of each player "+(Arrays.toString(teamB)));
        System.out.println("Average age of players Team B is: "+avgAgeB);
        //Є дві команди регбі з 25 гравців різного віку у кожній.
        //Вік беремо випадковим чином в діапазоні від 18 до 40.
        //Виведіть у двох рядках вік гравців кожної команди.
        //Порахуйте середній вік гравців кожної команди та виведіть на екран.
    }
}
