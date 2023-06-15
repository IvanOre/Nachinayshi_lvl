package Exceptions1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *                                             Throwable
 *                  Exception(исключения)                              Error
 *                    RuntimeException
 *
 *Красный текст(printStackTrace) сообщающий об ошибке в консоли не очень хорошо.
 * все ошибки желательно обрабатывать самим и делать юзер френдли. типа саут вывода
 *
 */
public class Exceptions1 {
    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException e) {// ошибка из метода выводится здесь.
            System.out.println("Main method exception");
        }
       /* File file = new File("ewffsgf");

        try {
            Scanner scanner = new Scanner(file);

            System.out.println("After Scanner");// не сработало тк ошибка уже была найдена и пошел блок катч
        } catch (FileNotFoundException e) {// в трай кеч блоке можем указать свое описание исключения
            System.out.println("File not found");
        }
        System.out.println("After try-catch block");

    }*/
    }
        public static void readFile () throws FileNotFoundException {// в него перенесли чтение файла
            File file = new File("ewffsgf");
            Scanner scanner = new Scanner(file);
        }

}