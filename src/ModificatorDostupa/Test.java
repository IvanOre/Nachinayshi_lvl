package ModificatorDostupa;

/**
 * public
 * public int id;
 * Доступ к нему везде на протяжении одного проекта
 *................................................................................
 * private
 * private int year;
 * Доступ к нему только в пределах класса,где это поле задекларировано.
 * Так же приватные методы.Если не хотим что бы метод был частью нашего api,тоже в пределах нашего класса был,
 * то пишем private. private void technicalMethod(){
 *
 * }
 * Метод для внутренних нужд допустим.
 *.................................................................................
 * default
 * Включается если вообще не указываем никакой модификатор доступа. int id; например. По другому называют его
 * модификатор доступа в пакете(package lvl modificator). Все что default , доступно в пределах этого пакета.
 *.................................................................................
 * protected
 * protected int id;
 * Это поле или метод доступны в пределах одного пакета,доступны вне этого пакета,доступны всем подклассам
 * даже если эти подклассы вне пакета ,где эти поля или методы были декларированы.
 * Если унаследоваться от класса где протектед поля до мы получим доступ к ним даже в не пакета если находимся
 * ..............................................................................................
 * В одном классе(Test у нас)не может быть 2 публичных классов.Нужен новый джава файл для публичного класса.
 * Класс не может быть приватным или протектед. Метод или переменная пожалуйста
 * Единственный наверное случай когда можно декларировать поля public это когда создаем константы.
 * Тк они неизменяемые.
 *
 */
public class Test {

    public int id;

    private int year;

    public final static String CONSTANT = "CONSTANT";

    public static void main(String[] args) {

    }
}
