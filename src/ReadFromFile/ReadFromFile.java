package ReadFromFile;
/**
 * Указываем путь до файла нашего текстового
 * String path = "C:/Users/Skynet/Desktop/test.txt"; тоже работает но разница в системах может быть
 *         File file = new File(path);
 * Что бы не думать о различиях пути в разных системах то укажем через сепаратор. он автоматом все подстроит
 * String separator = File.separator;
 *  String path = separator+"C:"+separator+"Users"+separator+"Skynet"+separator+"Desktop"+separator+"test.txt";
 *
 *
 *
 *   while (scanner.hasNextLine()){// создадим цикл. выполняется до тех пор, пока в файле есть строки
 *             System.out.println(scanner.nextLine());
 *         }
 *
 * если файл лежит в папке проекта,то не надо создавать путь до него.
 * просто указываем имя файла File file = new File("Test2");
 *
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        //String separator = File.separator;
        //String path = separator+"C:"+separator+"Users"+separator+"Skynet"+separator+"Desktop"+separator+"test.txt";
        File file = new File("Test2");

        Scanner scanner = new Scanner(file);// сканер считывает поток данных из нашего файла в аргументе
       /* while (scanner.hasNextLine()){// создадим цикл. выполняется до тех пор, пока в файле есть строки
            System.out.println(scanner.nextLine());
        }*/
        String line = scanner.nextLine();// содержит массив чисел,но они представляются как строки
        String[] numbersString = line.split(" ");// разделяем строку по пробелам и помещаем в массив

        int[] numbers = new int[3];// из строки выводим 3 примитива типа int через sout теперь
        int counter = 0;

        for (String number : numbersString){
           numbers[counter++] = Integer.parseInt(number);
        }


        System.out.println(Arrays.toString(numbers));// выводим через toString тк не можем напрямую вывести массив


        scanner.close();// в конце закрываем сканер что бы перестал работу поток чтения
    }
}
