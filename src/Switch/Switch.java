package Switch;

import java.util.Scanner;

/**
 *Используется когда надо много чего-то перебрать.
 *
 *
 */
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст:");
        int age = scanner.nextInt();// переменная age в ней будем хранить что введем в консоль
        switch (age){// заводим цикл switch в которой будем перебирать возраст и ниже в case их все перебираем
            case 0 :
                System.out.println("Вы родились");
                break;// ставим брейк после каждого кейса,что бы не выполнялись все сразу
            case 7 :
                System.out.println("Вы пошли в школу");
                break;
            case 18 :
                System.out.println("Вы закончили школу");
                break;
            default:// что выполнится если ничего не было введено из кейсовых значений. можем писать можем нет
                System.out.println("Ни одно из предыдущих условий не подошло");

                // можно не только int значения,но и с 7 жавы String тоже
        }

    }
}
