package Serialization1;
/**
 * Зачем нам создавать сначала fos и потом oos и в аргументы ему передавать fos?
 * Для того что бы oos работал и записывал объекты в файл ему для работы нужен объект fos
 * Fos записывает последовательность байтов в файл.
 * Oos записывает конкретно объекты файла. Более узкая специализация.Но для записи ему нужен более абстрактный Fos
 *
 *
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        //запись обычных одиночных объектов///
   // Person person1 = new Person(1,"Ivan");
   // Person person2 = new Person(2,"Maximus");


////////////////////////Пример 2. Записываем массив объектовБа не по одному////////////////////

    Person[] people  = {new Person(1,"Ivan"),
                new Person(2,"Maximus"),new Person(3,"Bob")};


        try {
            FileOutputStream fos = new FileOutputStream("people.bin");//запись в файл
            ObjectOutputStream oos = new ObjectOutputStream(fos);//передаем в аргумент наш fos

            // числовая запись в файл массива//
           /* oos.writeInt(people.length);// будет записано число. тут 3 тк и объекта в массиве
            for (Person person : people){// будет записано число объектов классов персон
                oos.writeObject(person);
            }*/

     ///////////////////////////////Объектная запись массива//////////////////////////////
            oos.writeObject(people);



            /*oos.writeObject();//записываем объекты
            oos.writeObject();*/

            System.out.println();
            System.out.println();

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
