package Serialization2_tryWithRes;
/**
 * Ключевое слово transient указывает если мы не хотим сериализовывать какое-то поле
 * serialVersionUID зачем нужно.Он помечает состояние класса.
 * Записали наш файл. прошло 5 лет.Над проектом работали люди. поменяли класс Person.
 * Новому классу Person не можем присвоить старый класс Person.Для этого и используем UID
 * Старый UID был 8890959442460228657L. Новый стал после изменений класса 9109280069092111715L
 * Попытаемся считать наш старый класс и получим ошибку.Объект давно записанный в файл
 * это объект уже другого класса.
 * Когда существенно меняем класс,то мы должны перегенерировать наш UID
 * 
 *
 *
 *
 */

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {


    @Serial
    private static final long serialVersionUID = 9109280069092111715L;
    private int id;//будет 0 тк это значение по умолчанию для целого числа.если transient пишем
    private String name;//не хотим сериализовывать transient / будет null

    private int age;//добавили новое поле просто для демонстрации UID

    public Person(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return id + " : " + name;
    }
}

