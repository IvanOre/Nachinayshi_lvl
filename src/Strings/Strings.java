package Strings;

/**
 *  Strings ссылочный тип данных. Пишутся с большой буквы тк являются классами тоже.
 *  Класс-чертеж. Объект-произведенная единица.
 *  Строка Hello это уже объект. String str = "Hello";(str ссылается на объект Hello)
 */
public class Strings {
    public static void main(String[] args) {
        int x = 77;
        String str = "Hello";
        String space = " ";
        String name = "Ivan";
        System.out.println(str+space+name);
        System.out.println("Hello" + " " + "Max");
        System.out.println("My number is: " + x);
        String s = new String("New String");// можно так создать объект сроки. но лучше по обычному
        System.out.println(s);


    }
}
