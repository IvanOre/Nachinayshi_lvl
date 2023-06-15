package Exceptions2;
/**
 *
 *
 *
 */

import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        // пример что человеку нужно вводить 0 в коносль.остальное это исключение////
        Scanner scanner = new Scanner(System.in);
        while (true){
         int x = Integer.parseInt(scanner.nextLine());// преобразуем троки в целые числа
            if (x !=0){
               /* try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Вы ввели что-то кроме 0");
                }*/
                //Выбрасываем наш ексепшн из созданного сканнерЕксепшн////////
                throw new ScannerException("Пользователь ввел что-то кроме нуля");
            }
        }
    }
}
