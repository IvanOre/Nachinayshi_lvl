package StringBuilder;

/**
 * В Джаве 2 типа объектов. mutable-изменяемый. immutable-неизменяемый.
 *
 * Mutable пример из прошлых уроков класс Human. По ходу программы изменяли его через сеттеры.
 *
 * Тип данных String это immutable.
 * Все методы вызываемые на String не оперируют на строке,а вызывают новую строку,которая является результатом
 * этого вызываемого метода.
 *  String x = "hello";
 *         x.toUpperCase();
 *         System.out.println(x);
 *         Так не сработает. тк String не изменяемый.
 *
 *
 *
 *  String x = "hello";
 *         x =  x.toUpperCase();
 *         System.out.println(x);
 *         Так сработает тк ссылаем стринг х,на новый объект стринг,на hello,и это возвращает нам  новый объект
 *  И тк на объект hello никакая переменная больше не ссылается,скоро его удалит из оперативки Garbage collector.
 *  Если мы имеем дело с immutable объектами ,то нам нужно помещать результат исполнения методов на них
 *  в переменные.
 *
 *   String string1 = "Hello";
 *         String string2 = " my";
 *         String string3 = " friend";
 *         String stringAll = string1+string2+string3;
 *         System.out.println(stringAll);
 *
 * Когда конкатенируем строки 1 и 2 создается 3 строка которая являет собой сумму 1 и 2. На сами же строки 1 и 2 на
 * них перестает ссылаться переменная и они удалятся сборщиком. Далее у нас есть новая общая строка из 1 и 2 и мы
 * ее конкатенируем с 3 строкой,тк мы не можем изменять строки,создается еще одна новая где 1 и 2 строка+3
 *Это нормально если мало строк. А если много то снижает производительность программы. Для этого был придуман
 * стринг билдер.
 * StringBuilder mutable и объекты класса стринг могут изменяться по ходу программы.
 *
 *  StringBuilder sb = new StringBuilder("Hello"); в конструктор можем поставлять начальное значение,
 *  а можем и нет
 *         System.out.println(sb.toString()); через toString
 *  Мы можем не создавая новых объектов,к объекту sb добавлять сколько угодно новых строк
 *  через метод append,вызываемый на нашем sb.
 *   sb.append(" my").sb.append(" friend"); пишем строку которую хотим конкатенировать к предыдущей
 *   Тут чейнинг. Вызов на одной строке через точку методы одного класса.
 *
 *   Если нужно часто и много менять строку,то юзаем не String,a StringBuilder. Не создается куча новых объектов
 *   и память не забивается.
 *
 *
 *
 *
 *
 */
public class StringBuild {
    public static void main(String[] args) {

       /* String x = "hello";
        x =  x.toUpperCase();
        System.out.println(x);*/

//        String string1 = "Hello";
//        String string2 = " my";
//        String string3 = " friend";
//        String stringAll = string1+string2+string3;
//        System.out.println(stringAll);

        StringBuilder sb = new StringBuilder("Hello");// в конструктор можем поставлять начальное зачение, а можем и нет
        sb.append(" my").append(" friend");// пишем строку которую хотим конкатенировать к предыдущейsb
        System.out.println(sb.toString());// через toString

    }
}
