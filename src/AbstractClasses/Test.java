package AbstractClasses;

/**
 * В чем мотивация использования абстрактных классов?
 * Объекты Кет и Дог объекты которые мы видели в реальной жизни.Создание Анимал не имеет смысла. Это концепт
 * Мы не можем иметь объект животное.Как оно будет выглядеть? Что бы запретить создание этого класса мы
 * можем пометить его как Абстрактный класс
 * Абстрактный класс используем когда хотим создать иерархию классов,но класс родитель не является самостоятельным
 * классом.От него обязательно нужно наследоваться и реализовать абстрактные методы если они есть.
 * Абстрактные методы создаются только в абстрактных классах.
 *
 * Разница между абстрактным классом и интерфейсом: Интерфейс это контракт. Это то что класс умеет делать.
 * А абстрактный класс это то чем класс является.
 * Мы можем реализовать много интерфейсов. А унаследоваться только от одного класса.
 *
 */
public class Test {
    public static void main(String[] args) {
    Cat cat = new Cat();
    Dog dog = new Dog();
    cat.makeSound();
    dog.makeSound();
    cat.eat();
    dog.eat();

    }
}
