package Muiltidemensional_Arrays;

/**
 * int [][] matrice = {{1,2,3},
 *                     {4,5,6},
 *                     {7,8,9}};
 *
 * Двумерный массив это массив массивов
 *
 * System.out.println(matrice[1][1]);
 * что бы выбрать элемент указываем его позицию. в начале строка потом столбец. на пересечении лежит наше число
 * может выглядеть как угодно. каждый подмассив содержать различное кол-во значений
 * {{1,2,3,4,5,6,7,8},
 * {4,7,3},
 * {0}}
 * может быть и таким.но система поиска не меняется
 *
 * ///////////////////Пример 2//////////////////////////
 *
 *         String [][] strings = new String[2][3];// 2 строки и 3 столбца задали размер массива
 *
 *         String[][] strings1 = {{"Hello","World"},
 *                                 {"Nice","Day","Friend"},
 *                                 {"My","Today"}};
 *
 *         System.out.println(strings1[1][2] + " " +strings1[2][0]);
 *
 */
public class Multidemensional_Arrays {
    public static void main(String[] args) {

        int [][] matrice = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        //System.out.println(matrice[1][1]);

///////////////////Пример 2//////////////////////////

        String [][] strings = new String[2][3];// 2 строки и 3 столбца задали размер массива

        String[][] strings1 = {{"Hello","World"},
                                {"Nice","Day","Friend"},
                                {"My","Today"}};

        //System.out.println(strings1[1][2] + " "+strings1[2][0]);

        /////////////Пример 3//// Вывести в виде таблицы массив///////////////////

        int [][] numbers = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        // i< numbers.length равняется 3. тк одномерных массивов у нас тут 3 внутри двумерного
        // j<numbers[i].length проходится по элементам строки подмассива
        for (int i = 0;i< numbers.length;i++){
            for (int j = 0; j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+ " ");// выводим наши элементы в строку
            }
            System.out.println();//после вывода каждых 3 элементов тк i< numbers.length равняется 3. переходим на новую строку


        }





    }
}
