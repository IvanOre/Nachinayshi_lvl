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
          //������ ������� ��������� ��������////
          /* Person person1 = (Person) ois.readObject();//������ ��� ������. � ���������� �� ������
            Person person2 = (Person) ois.readObject();*/


     /////////////////////////// ������ ������ ������� � �������////////////////////////////
          /* int personCount = ois.readInt();// ������ ����� ���������� ���-�� �������� ����� ��������� � ����������
            Person[] people = new Person[personCount];// ������� ��� ������ � ������� person�ount
            for (int i = 0; i< personCount;i++){
                people[i] = (Person) ois.readObject();
            }*/



    ////////////////////////////��������� ������ �������//////////////////////////////
            Person[] people = (Person[]) ois.readObject();


            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
