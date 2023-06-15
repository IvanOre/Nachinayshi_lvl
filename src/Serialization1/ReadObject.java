package Serialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
          //чтение обычных одиночных объектов////
          /* Person person1 = (Person) ois.readObject();//читаем наш персон. и даункастим до персон
            Person person2 = (Person) ois.readObject();*/


     /////////////////////////// пРИМЕР ЧТЕНИЯ МАССИВА С ЧИСЛАМИ////////////////////////////
          /* int personCount = ois.readInt();// читаем число записанное кол-во объектов будет храниться в переменной
            Person[] people = new Person[personCount];// создали тут массив с длинной personСount
            for (int i = 0; i< personCount;i++){
                people[i] = (Person) ois.readObject();
            }*/



    ////////////////////////////Объектное чтение массива//////////////////////////////
            Person[] people = (Person[]) ois.readObject();


            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
