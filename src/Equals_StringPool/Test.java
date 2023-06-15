package Equals_StringPool;

/**
 * Объекты анимал1 и анимал2 не равны.
 * == сравнивает ссылки на объекты,а не сами объекты. Подходит для примитивных типов данных.
 * А объекты например наши анимал1 и анимал2 могут храниться вообще в разных участках памяти на компе.
 * Что делать если хотим сравнить объекты структурно,а не их указатели?
 * Для этого есть метод equals().Но для того что бы сравнивать структурно нам нужно переопределить метод equals.
 *
 *  Animal animal1 = new Animal(1);
 *         Animal animal2 = new Animal(1);
 *         System.out.println(animal1.equals(animal2));
 *
 *
 * public boolean equals(Object obj){
 *         Animal otherAnimal = (Animal) obj; даункастим obj до анимал
 *         return this.id == otherAnimal.id;
 *  Переопределили сравнение по id
 *  equals() надо использовать всегда когда хотим сравнить объекты по их структуре.как сущности.
 *  Если же нужно сравнить объекты как ссылки(2 ссылки указывают на один и тот же объект) тогда юзаем ==.
 *
 *  Еще пример это сравнение строк.
 *  String string1 = "Hello";
 *  String string2 = "Hello";
 *  cравнение == тоже работает.
 *  Есть StringPool.
 *  Когда созадем строку hello под нее выделяется память и стринг1 ссылается на нее.
 *  Когда создаем вторую строку тоже хелло ,джава видит что такое уже есть и ссылает стринг2 на первое хелло.
 *  Поэтому стринг1 и стринг 2 равны. тк ссылаются на один объект Хелло. Экономия памяти.
 *  Если создавать через String string1 = new String("Hello") тогда будет false. тк это уже создание
 *  объекта. соответственно объекты будут разные.
 *  Лучше взять за правило всегда сравнивать строки через equals()
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        String a = "hello";
        String b = "hello123".substring(0,5);// обрезали строку с 1 по 5 элемент
        System.out.println(b);
        System.out.println(a.equals(b));// true/ а если через == то false


    }
}
class Animal{
    private int id;
    public Animal(int id){
        this.id = id;
    }
    public boolean equals(Object obj){
        Animal otherAnimal = (Animal) obj;// даункастим obj до анимал
        return this.id == otherAnimal.id;

    }
}