package UpcastDowncast;

/**
 * Dog dog = new Dog();
 * Upcasting -восходящее преобразование.мы повышаем класс дог до анимал. Оно не явное. жава ничего не просит
 *     Animal animal = dog;
 *
 * Downcasting-нисходящее преобразование.
 *      Dog dog2 = (Dog) animal;// указали что в переменной анимал лежит объект класса дог
 *      dog2.bark();
 *
 *  Восходящее преобразование безопасно.Потому что повышаемый класс наследуется от класса до которого повышаем
 *  Нисходящее преобразование не безопасно.Потому что класс родитель принимать не только животное ДОг например,
 *  а и любое другое у которого нет метода bark() например
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark();// будет ошибка.ClassCastException






    }
}