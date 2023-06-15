package Anonimus_Classes;

/**
 * Что если OtherAnimal нам нужно использовать в коде 1 раз?
 * Создавать целый класс что бы потом переопределить1  метод это слишком.
 *
 *   Animal animal1 = new Animal(){
 *             public void eat(){
 *                 System.out.println("Other animal is eating..");
 *             }
 *         };
 *   Создаем новый объект Animal с фигурными скобками уже и в них переопределяем метод eat()
 *   Можем использовать его один раз и сослать на одну переменную.
 *
 *
 *
 * Можем через интерфейс
 *
 * interface AbleToEat{
 *     public  void eat();
 *


 class Animal implements AbleToEat{

@Override
public void eat() {
System.out.println("EatEatEatEat");

}
}

 public class Test {
 public static void main(String[] args) {
 AbleToEat ableToEat = new AbleToEat() {
@Override
public void eat() {
System.out.println("Someone is eating");

}
};
 ableToEat.eat();

 При создании объекта нашего интерфейса сама среда разработки предлагает создать анонимный класс с методом


 */




/*class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
}*/

/*class OtherAnimal extends Animal{
    public void eat(){
        System.out.println("Other animal is eating..");

    }
}*/
interface AbleToEat{
    public  void eat();

 class Animal implements AbleToEat{

     @Override
     public void eat() {
         System.out.println("EatEatEatEat");

     }
 }


}
public class Test {
    public static void main(String[] args) {
/*
        Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Animal(){
            public void eat(){
                System.out.println("Other animal is eating..");
            }
        };
        animal1.eat();
*/

        /////////Пример с интерфейсом////////////
AbleToEat ableToEat = new AbleToEat() {
    @Override
    public void eat() {
        System.out.println("Someone is eating");

    }
};
ableToEat.eat();





    }
}
