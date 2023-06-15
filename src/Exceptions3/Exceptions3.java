package Exceptions3;

/**
 * Checked and Unchecked Exceptions
 * Checked Exceptions(Compile Time Exception) это проверяемые исключения. Они возникают во время компиляции
 * программы. Это скорее не ошибки,а исключительные случаи.
 * Unchecked Exception(Runtime exception)-исключения возникают непосредственно во время выполнения программы.
 * Ошибка в работе программы.Их не обязаны обрабатывать тк их не должно быть по сути.
 *
 * На прошлых уроках имели дело только с Checked Exception
 *
 * Один из самых популярных Unchecked Exception это деление на 0.
 *  int a = 2 /0; Ошибка не выдается,но создается предупреждение средой разработки. К джаве отношение не имеет.
 *  Скомпилируется и запустится,но будет ошибка на этапе выполнения уже.
 *
 *
 *  null pointer в вашем имени лежит нул. ничто.
 *  String name = null;
 *  name.length();
 *
 *
 *
 *  ВЫход за границы массива.
 *  IndexOfBoundException
 *  int[] arr = new int[2];
 *    System.out.println(arr[2]);
 *
 *
 *
 *
 */
public class Exceptions3 {
    public static void main(String[] args) {
        // int a = 2 /0; деление на 0.

        /*String name = null;// null pointer в вашем имени лежит нул. ничто.
        name.length();*/

        int[] arr = new int[2];
        System.out.println(arr[2]);


    }
}
