package question.l2;

import java.util.Scanner;

public class lesson_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Доброго времени суток Студент");
        System.out.println("Введите данные координат для вычисления площади прямоугольника");

        System.out.println("Введите координаты точки А:");
        int tochkaA = sc.nextInt();

        System.out.println("Введите координаты точки B:");
        int tochkaB = sc.nextInt();

        System.out.println("Введите координаты точки C:");
        int tochkaC = sc.nextInt();

        System.out.println("Введите координаты точки D:");
        int tochkaD = sc.nextInt();

        System.out.println("Площадь прямоугольника: " + (tochkaC - tochkaB) * (tochkaD - tochkaA) + " условных единиц");
    }
}