package Serialization2_tryWithRes;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person person1 = new Person(1,"Ivan");

        //try with resources/созадли обжектоутпутстрим и ему поставили файлоутпутстрим с именем файла//
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin")) ) {
            oos.writeObject(person1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
