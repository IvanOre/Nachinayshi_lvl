package Arrays;

/**
 *
 * подходит если просто хотим создать массив с ячейками и потом уже проинициализировать числа в нем
 *
 * int [] numbers = new int[5];// 5 это размер массива
 *         System.out.println(numbers[0]);-выводим из массива элемент под индексом 0
 *
 * for (int i = 0;i<numbers.length;i++){ узнаем длину массива. имя массива.length
 *
 *  numbers[i] = i*10; инициализируем значения в массиве умножая каждый элемент на 10
 *
 *         }
 *
 *
 *
 *
 *
 * подходит при создании массива когда мы уже знаем какие значения будут в нем
 *
 * int [] numbers1 = {1,2,3,4,5};// в этом массиве мы знаем значения лежащие в нем
 *         for (int i = 0;i < numbers1.length;i++){
 *             System.out.println(numbers1[i]);// вывели все числа находящиеся в нашем массиве
 *         }
 *
 *
 *
 */
public class Arrays {
    public static void main(String[] args) {
// создаем массив.
        int [] numbers = new int[5];// 5 это размер массива
        for (int i = 0;i<numbers.length;i++){
            numbers[i] = i*10;
        }
        for (int i = 0;i < numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int [] numbers1 = {1,2,3,4,5};// в этом массиве мы знаем значения лежащие в нем
        for (int i = 0;i < numbers1.length;i++){
            System.out.println(numbers1[i]);// вывели все числа находящиеся в нашем массиве
        }

    }
}
