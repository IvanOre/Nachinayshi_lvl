package Object_toString;

/**
 * Любой класс в Джаве наследуется от класса Object
 * toString возвращает хешкод для созданного объекта.хешкод уникальный номер присвоенный каждому объекту
 * Всегда когда печатаем объект,то скрыто вызываем метод toString
 *
 *
 * Что делать если хотим видеть другое представление метода toString?
 * Можем его переопределить свои методом в классе объекта который хотим вывести
 *
 * class Human{
 *     private String name;
 *     private int age;
 *
 *     public Human(String name, int age) {
 *         this.name = name;
 *         this.age = age;
 *     }
 *
 *     @Override
 *     public String toString() {
 *         return "Human{" +
 *                 "name='" + name + '\'' +
 *                 ", age=" + age +
 *                 '}';
 *     }
 *     или
 *     @Override
 *     public String toString() {переопределяем метод toString. возвращаем как хотим что бы выглядел метод
 *         return name+","+age;
 *     }
 *
 */
public class ObjectToString {
    public static void main(String[] args) {
        Human h1 = new Human("Ivan",34);
        System.out.println(h1);

    }
}
class Human{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {// переопределяем метод toString. возвращаем как хотим что бы выглядел метод
        return name+","+age;
    }
}