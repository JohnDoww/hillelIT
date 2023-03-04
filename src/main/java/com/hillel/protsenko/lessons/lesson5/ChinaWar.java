package com.hillel.protsenko.lessons.lesson5;

public class ChinaWar {
    public static void main(String[] args) {
        int liSol = 13;
        int liArch = 24;
        int liHors = 46;
        int liTotalSol =860;
        System.out.println("LI dynasty - Total count of classic solders: "+liSol*liTotalSol);
        System.out.println("LI dynasty - Total count of archers: "+liArch*liTotalSol);
        System.out.println("LI dynasty - Total count of horse riders: "+liHors*liTotalSol);
        int totalPowerLi = (liSol+liArch+liHors)*liTotalSol;
        System.out.println("LI dynasty - Total power: "+totalPowerLi+"\n");

        int miSol = 9;
        int miArch = 35;
        int miHors = 12;
        int miTotalSol = (int) (860 *1.5);
        System.out.println("MI dynasty - Total count of classic solders: "+miSol*miTotalSol);
        System.out.println("MI dynasty - Total count of archers: "+miArch*miTotalSol);
        System.out.println("MI dynasty - Total count of horse riders: "+miHors*miTotalSol);
        int totalPowerMi = (miSol+miArch+miHors)*miTotalSol;
        System.out.println("MI dynasty - Total power: "+totalPowerMi);

        System.out.println(140/10);

        /*  За владу в стародавньому Китаї боролися дві династії: Лі та Мінь.
                З кожного боку боролися 3 типи воїнів з такими показниками атаки:
        Лі:
        воїн - 13
        лучник - 24
        вершник - 46
        Мінь:

        воїн - 9
        лучник - 35
        вершник - 12
        Розрахувати: загальний показник атаки для обох династій, якщо відомо
                , що воїнів династії Лі кожного типу було 860, а кількість воїнів династії Мінь кожного типу в півтора рази більша.
        Вивести в консоль значення загальної атаки кожної армії;*/
    }
}