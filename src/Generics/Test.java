package Generics;
/**
 * Объект класса List хранит в себе Object. Что бы не положили в List это будет рассматриваться как обжект.
 * String animal = animals.get(1); будет ошибка. пытаемся вызвать обжект на строке.Что бы не было ошибки нужно
 * сделать даункаст String animal = (String) animals.get(1); даункастим обжект анималс до стринг
 * Но каждый раз писать так не удобно.
 * List<String> в скобках указали тот класс,объекты которого будут помещаться в этот Arraylist
 */

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ///////JAVA 5/////////
        List animals = new ArrayList<>();
        Animal ourAnimal = new Animal();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Frog");
        animals.add(ourAnimal);//без проблем поместили в массив наш объект тоже.но сдаункастить до стринга не можем

        String animal = (String) animals.get(1);// даункастим до стринга или ошибка будет

        ////////С появлением дженериков///////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Frog");
       // animals2.add(ourAnimal); не можем поместить уже объект. тк там стринги задали
        String animal2 = animals2.get(1);// нет ошибки уже без приведения
        System.out.println(animal2);

        //////// C приходом Java 7///////////////
        List<String> animals3 = new ArrayList<>();// можем не указывать справа тип параметризации. только слева


    }

}
class Animal{

}
