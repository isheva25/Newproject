package question.l2;

import java.util.Scanner;

public class lesson_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Доброго времени суток Студент");
        System.out.print("Введите данные координат для вычисления площади прямоугольника");

        System.out.println("Введите координаты точки А:");
        String tochkaA = sc.nextLine();

        System.out.println("Введите координаты точки B:");
        String tochkaB = sc.nextLine();

        System.out.println("Введите координаты точки C:");
        String tochkaC = sc.nextLine();

        System.out.println("Введите координаты точки D:");
        String tochkaD = sc.nextLine();

        System.out.println("Площадь прямоугольника: " + (tochkaB - tochkaC) * (tochkaB - tochkaA) + "условных единиц");
    }
}