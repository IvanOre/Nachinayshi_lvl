package AbstractClasses;

/**
 * Пометив класс как абстрактный мы даем понять джаве что это концепция и объекты класса не должны
 * быть созданы
 * Все наши животные будут одинаковы.Но все будут издавать разные звуки.
 */
public abstract class Animal {// объявили абстрактным
    public void eat(){
        System.out.println("I am eating...");
    }
    public abstract void makeSound();
}
