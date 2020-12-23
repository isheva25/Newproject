package question.l1;

import java.util.Scanner;

public class lesson_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Доброго времени суток, введите Имя");
        System.out.print("Имя: ");
        String name = sc.nextLine();

        System.out.println("Введите Отчество");
        System.out.print("Отчество: ");
        String middlename = sc.nextLine();

        System.out.println("Введите Фамилию");
        System.out.print("Фамилия: ");
        String surname = sc.nextLine();

        System.out.println("Здравствуйте " + surname + " " + name + " " + middlename);
    }
}
