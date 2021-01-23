package ru.training;

import java.util.Scanner;

class lesson_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Доброго времени суток Бездельник");
        System.out.println("Хочешь вычислить площадь какой-нибудь фигуры?");
        System.out.println("Введите: Да/Нет");
        String yes = "Да";
        String no = "Нет";

        String yesno = sc.nextLine();

        if (yesno=="Да") {
            System.out.println(yesno.equals(yes));
        }
        else if (yesno=="Нет") {
            System.out.println(yesno.equals(no));

        }
    }
}
