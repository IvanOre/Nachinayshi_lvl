package KeyWordStatic;

/**
 *
 * В языке программирования Java ключевым словом static помечают члены (поля или методы),
 * которые принадлежат классу, а не экземпляру этого класса.
 * Это означает, что какое бы количество объектов вы не создали, всегда будет создан только один член,
 * доступный для использования всеми экземплярами класса.
 * Ключевое слово static применимо к переменным, методам, блокам инициализации,
 * импорту и вложенным классам (nested classes).
 *
 *
 *
 * Переменные метода класса обозначаются словом static
 * class Human{
 *
 *
 *     private String name;
 *     private int age;
 *     public static String description;
 *
 *
 *Статическая переменная создается лишь один раз. И присваивается новым созданным объектам класса
 *     Теперь можем обратится в мейн методе без создания нового объекта Human
 *     потому что эта переменная description статическая. она принадлежит не  объектам класса,а самому классу
 *     И будет делиться между всеми объектами класса.Она будет общая для всех объектов класса Human
 *
 *
 *
 *     public class KeyWordStatic {
 *     public static void main(String[] args) {
 *     Human.description = "Hello";
 *     }
 * }
 *
 * Мы не можем обращаться к переменной объекта через статический метод.Статический метод может работать только
 * со статическими переменными. Но не с переменными объекта обычными.
 * Статический метод один на класс и общий на все объекты.
 *
 * .............Зачем нужны статические методы и объекты............................................э
 * Статический метод:
 * Если методу не нужно знать переменные объекта. Если наш метод в общем случае функция
 * Нам не нужно создавать объект класса, что бы воспользоваться этим методом.
 * Хороший пример методы класса Math. содержит много статических методов, доступ к которым можем получить просто
 * через вызов через точку.
 *
 */
public class KeyWordStatic {
    public static void main(String[] args) {
         Human h1 = new Human("Ivan",34);
        Human h2 = new Human("Max",25);
        h1.numberOfPeople();
        h2.numberOfPeople();

    }
}

class Human{


    private String name;
    private int age;
    private static int countPeople;

    public Human(String name,int age){// наш конструктор с параметрами
        this.name = name;
        this.age = age;
        countPeople++; // при создании нового инкрементит +1

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  public void numberOfPeople(){
      System.out.println("Number of people is: "+countPeople);
  }
}