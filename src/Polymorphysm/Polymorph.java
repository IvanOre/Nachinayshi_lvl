package Polymorphysm;

/**
 * множество форм. Способность метода обрабатывать данные разных типов.
 *
 *Animal animal = new Animal();// можем создавать объекты анимал родительского класса
 * Dog dog = new Dog();
 * animal.eat();
 *  dog.eat();//есть метод только потому,что унаследовались от Animal
 *
 *  Позднее связывание это когда мы переопределили родительский метод тут eat c animal is eating,на dog is eating
 *  и теперь animal.eat() будет выводить dog is eating.
 *  Не смотря на то ,что мы эту собаку воспринимаем как животное общее,всегда вызывается тот метод,который
 *  определен в потомке. Позднее связывание
 *
 *  У полфиморфизма есть возможность передавать в метод разные типы,если у них один и тот же родитель
 *  Польза полиморфизма,что мы можем сделать код меньше,и многоразовым. В примере метод test() выполнился
 *  корректно на 3 разных объектах.Если бы полиморфизма не было,то для каждого типа анимал,дог,кет
 *  нам пришлось бы делать свой метод.Тут же выстроив правильную наследственную связь мы обошлись одним методом,
 *  который обслуживает общего родителя всех этих классов,а именно Animal и потомки спокойно передаются в
 *  этот метод
 */
public class Polymorph {
    public static void main(String[] args) {
        //здесь рассматриваем собаку как животное и не имеем доступ к специфичным собачьим методам
        // Animal animal = new Dog();//создали новый объект дог из переменной типа анимал.одна из сторон полиморфизма
        //animal.eat();// имеем доступ к eat
        /*animal.bark();// не имеем доступ к bark()

        // здесь рассматриваем собаку как собаку.имеем доступ к методам дог класса
        Dog dog = new Dog();// ссылка на объект это сам класс
        dog.eat();
        dog.bark();*/
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        // благодаря полиморфизму можем вызывать метод на всех классах которые унаследовались от родителя Animal
       test(animal);
       test(dog);
       test(cat);


    }

    public static void test(Animal animal){// принимает в качестве аргументов животное
        animal.eat();

    }
}