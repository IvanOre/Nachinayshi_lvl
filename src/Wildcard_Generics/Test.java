package Wildcard_Generics;
/**
 * private static void test(List<?> list){ метод для тестирования принимает на вход ?(wildcard)
 *         for (Animal animal : list){
 *             System.out.println(animal);
 *
 *         }
 *
 *         List<?> значит что можем принимать лист любых объектов
 *
 *         private static void test(List<? super Animal> list){
 *         for (Animal animal : list){
 *
 *   слово super дает понять что в листе будут объекты класса Animal или выше его стоящие(НЕ НИЖЕ)
 *   !!!!Не так полезно как extends.!!!!
 */

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);
    }

    // метод для тестирования принимает на вход ?(wildcard),любой объект
    //дали понять что любые объекты наследующиеся от Animal либо сам Animal(List<? extends Animal> list)
    private static void test(List<? extends Animal> list){
        for (Animal animal : list){
            animal.eat();


        }

    }
}
