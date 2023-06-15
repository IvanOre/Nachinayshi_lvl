package Interfaces;

/**
 * Мы реализуем(implements) интерфейс Info. А при реализации интерфейса мы обязаны унаследовать и реализовать
 *  его методы.
 */
public class Person implements Info{
    public String name;

    public Person(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is "+name);// выводим что сказать хотим в этом методе

    }
}
