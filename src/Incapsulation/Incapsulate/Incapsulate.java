package Incapsulation.Incapsulate;

/**
 * Инкапсуляция в Java является механизмом обёртывания данных (переменных) и кода, работающего с данными (методами),
 * в одно целое. В инкапсуляции переменные класса будут скрыты от других классов и доступ к ним может быть получен
 * только с помощью метода их текущего класса. По-другому это называется скрытием данных.
 *
 * Ограничиваем свои поля от других классов.Что бы были видны в пределах одного класса.
 *
 * private -это поле доступно и видно только в пределах своего класса.
 * Для доступа создаем геттеры и сеттеры для приватных полей класса.
 *  person1.setName("Иван");
 *  person1.setAge(34);
 *  получаем доступ к полям через сеттер и уже пишем значения в другом классе
 *
 *
 *   System.out.println("Выводим значение в main методе "+person1.getName());
 *   выводим через геттер в другом классе
 *
 *   Внутри класса можем изменять поля как угодно и пользователь не заметит этого.Мы внутри класса изменим
 *   внутреннюю логику ,а он получит данные через гетеры и сетеры не видя их
 *   Так же в гетерах и сетерах мы можем проверять корректность ввода. Например что бы не было имя пустое
 *   пишем :
 *   public void setName(String name){
 *        if (name.isEmpty()){
 *             System.out.println("Имя не должно быть пустым");
 *         }else {
 *         this.name = name;}
 *     }
 * и тут person1.setName(""); укажем пустоту,то вылезет уже наше сообщение из сеттера
 *
 */
public class Incapsulate {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.setName("Ivan");
    person1.setAge(34);
    System.out.println("Выводим значение в main методе: "+person1.getName());
    System.out.println("Выводим значение в main методе: "+person1.getAge());

   // person1.speak();
    }
}


class Person{
   private String name;
   private int age;

    public String getName() {
        return name;// возвращается строка, которая является полем в классе Person
    }

    public void setName(String name) {// void тк ничего не возвращает. только указывает что имя Person=имя сетера
       if (name.isEmpty()){
            System.out.println("Имя не должно быть пустым");
        }else {
        this.name = name;}
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void speak(){
        System.out.println("Меня зовут "+name+", мне "+age+" года");
    }


}