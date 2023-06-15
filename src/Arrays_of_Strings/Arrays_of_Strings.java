package Arrays_of_Strings;

/**
 *
 * int[] numbers = new int[5]; создали массив задав размер 5
 *         numbers[0] = 10; присвоили 1 элементу массива значение 10. значит значение 2 элемента(1) будет 0.
 *         тк джава сама присваивает значения ячейкам в массиве,которые не были проинициализированы
 *     }
 *
 *  String[] strings = new String[3]; созадли массив строк
 *         strings[0] = "Hello"; проинициализировали каждый элемент массива
 *         strings[1] = "New";
 *         strings[2] = "World";
 *
 *   for (int i = 0; i < strings.length;i++){ проходимся циклом фор
 *             System.out.println(strings[i]);
 *         }
 *
 * Цикл for each тоже проходится по массиву , но с каждым телом массива мы можем что-то сделать
 *
 *  for(String strings:strings) = for(тип данных и имя переменной: имя того с чем работаем)
 *  String тип данных. strings имя переменной которая будет использоваться внутри этого цикла. : strings-имя массива
 * имя переменой по сути может быть любым. лучше указывать точнее что бы было понятнее всем с чем работаем
 *
 *
 * Посчитаем сумму элементов массива через цикл for ech
 *  int[] numbers1 = {1,2,3};
 *         int sum = 0;
 *         for (int x:numbers1){
 *             sum = sum+x;
 *         }
 *
 *
 *
 *
 */
public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];// создали массив задав размер 5
        numbers[0] = 10;// присвоили 1 элементу массива значение 10. значит значение 2 элемента(1) будет 0.

        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "New";
        strings[2] = "World";

        for (int i = 0; i < strings.length;i++){
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String string:strings){
            System.out.println(string);
        }

        //2 пример


        int[] numbers1 = {1,2,3};
        int sum = 0;
        for (int x:numbers1){
            sum = sum+x;
        }
        System.out.println();
        System.out.println(sum);


        // 3 пример

        int value = 0;
        String s = null;// не задали значение(по умолчанию значит null)выделятся памяти только под ссылку





    }
}
