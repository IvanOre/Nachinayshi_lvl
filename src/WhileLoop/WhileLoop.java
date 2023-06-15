package WhileLoop;

/**
 * while(){
 *
 * }
 * в круглых скобках задается условие до каких пор будет крутиться цикл. в фигурных-тело цикла.
 * в круглых скобках должно быть условие которое дает либо true либо faulse
 *  int value = 10;
 *
 *         while (value>6){
 *             System.out.println("Hello");
 *
 *         }
 *         при таком условии цикл будет бесконечным тк всегда будет true
 *
 *          while (value<5){
 *             System.out.println("Hello");
 *             value = value+1;       добавили инкремент.каждый цикл добавляет к нашему value +1.
 *             0-1-2-3-4 и остановится. тк value уже будет не меньше 5 ,а сравняется с ним
 *
 *         }
 *         выполняется пока у нас в круглых скобках выражение равно true;
 *
 *          while (true){
 *
 *         }-бесконечный цикл. в условии () всегда true. в теории это будет крутиться бесконечно
 *
 */

public class WhileLoop {
    public static void main(String[] args) {

        int value = 0;

        while (value<5){
            System.out.println("Hello");
            value = value+1;// добавили инкремент.каждый цикл добавляет к нашему value +1. 0-1-2-3-4 и остановится.

        }

    }
}
