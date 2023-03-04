package com.hillel.protsenko.lessons.lesson6;
import java.util.Scanner;

public class ChooseTheNumber {
    public static void main(String[] args) {
        int randomNumb = (int) (Math.random()*11);
        Scanner in = new Scanner(System.in);

        for (int i=5;i>=0; i--){
            System.out.println("Dear user, try to guess the generated number 1 to 10, you have "+i+" tries:");

            if (!in.hasNextInt())
            {System.out.println("Hey you have to use only numbers!!!\n"+"Try again!");break;}

            int usersNumb =in.nextInt();

            if (randomNumb==usersNumb){
                System.out.println("Great job, you WIN !!\n"+"Your number is: "+usersNumb+" Random number was: "+randomNumb); break;}
            if (i==1){
                System.out.println("Sorry, you loose\n"+"Random number was: "+randomNumb);break;}
        }
//        Без сканера
//        Зробити гру, в якій комп'ютер загадав число у діапазоні від 0 до 10
//        Генерувати рандомні числа і порівнювати з загаданим (5 разів)
//        Використовувати цикли!
//                Доп. (Scanner)
//                Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//        Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).
//        Використовувати цикли!
    }
}
