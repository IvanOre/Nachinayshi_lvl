package Interfaces;

/**
 * Классы Animals & Person никак не связаны. Допусти мы хотим что бы у них было общее поведение.
 * Допустим эти 2 класса могут показывать информацию о себе. Animals говорить свое id. а Person говорить свое имя
 * Это общее поведение мы передадим с помощью ИНТЕРФЕЙСА
 *
 *
 * Info info1 = new Animals(1);
 * Info info2 = new Person("Ivan");
 *имя переменной не совпадает с классом объекта
 * Переменная info1 & info2 типа Info ссылаются на объекты класса Animal & Person
 * мы можем так делать только потому,что оба этих класса реализуют интерфейс Info,поэтому объекты класса Info
 * можем ссылать на объекты классов реализующих его(Animals & Person)
 *  info1.showInfo();
 *  info2.showInfo();
 *  можем вызвать только метод showInfo() из интерфейса Info/Методы из классов Animals & Person вызвать не можем
 *  в таком создании классов,через интерфейс. Сужаем методы Animals & Person до одного из интерфейса.
 *  По сути мы проделали полиморфизм.Мы рассматриваем классы Animals & Person не как объекты их классов,а как
 *  нечто,что реализует метод showInfo() интерфейса Info
 *
 *
 *  public static void outputInfo(Info info){метод принимает в качестве аргументов нечто что реализует класс Info
 *
 *         info.showInfo();можем реализовать только метод описанный в интерфейсе Info
 *     }
 * Что это нам дает???
 * теперь метод outputInfo может действовать на любом из объектов, класс который тоже реализует интерфейс Info
 *
 *
 *
 * Мы так же можем создать объекты класса Animals & Person и мы можем эти объекты в качестве аргументов
 *    поместить в наш метод outputInfo()
 *Animals animals1=new Animals(1);
         *Person person1=new Person("Ivan");
         *outputInfo(animals1);
         *outputInfo(person1);
 *
 * Универсальный метод, которому все равно что подаете на вход, важно что бы эти объекты подаваемые на вход,
 * реализовывали интерфейс Info
 *
 * Не смотря что интерфейс Info у нас общий при вызове метода showInfo() на общем интерфейсе Info
 * (outputInfo(Info info)) вызываются методы showInfo() конкретных объектов
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        /*Animals animals1 = new Animals(1);
        Person person1 = new Person("Ivan");
        animals1.sleeping();
        person1.sayHello();
        animals1.showInfo();
        person1.showInfo();*/

        // по своей сути это полиморфизм.далее изучим его

       // Info info1 = new Animals(1);
        //Info info2 = new Person("Ivan");
       // info1.showInfo();
       // info2.showInfo();
       // outputInfo(info1);
       // outputInfo(info2);


  /*Мы так же можем создать объекты класса Animals & Person и мы можем эти объекты в качестве аргументов
   поместить в наш метод outputInfo()*/
        Animals animals1 = new Animals(1);
        Person person1 = new Person("Ivan");
        outputInfo(animals1);
        outputInfo(person1);


    }
    public static void outputInfo(Info info){//метод принимает в качестве аргументов нечто что реализует класс Info

        info.showInfo();//можем реализовать только метод описанный в интерфейсе Info
    }
}
