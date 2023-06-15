package Scanner;
/**
 *  Scanner scanner = new Scanner(System.in);// отвечает за ввод данных в консоль от пользователя
 *         System.out.println("Введите что-нибудь");// выводит сообщение для юзера и ждет ввода и потом метод ниже идет
 *         String string = scanner.nextLine();// ссылаем на то что будет введено с клавиатуры
 *         System.out.println("Вы ввели: " + string);
 *
 *  Так же можно с числами.
 *  int i = scanner.nextInt();
 *
 */

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// отвечает за ввод данных в консоль от пользователя
        System.out.println("Введите что-нибудь");// выводит сообщение для юзера и ждет ввода и потом метод ниже идет
        String string = scanner.nextLine();// ссылаем на то что будет введено с клавиатуры
        System.out.println("Вы ввели: " + string);
    }
}
