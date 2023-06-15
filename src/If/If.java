package If;

/**
 *
 * if(условие выполняется пока не станет верным.ищем именно верное){
 *
 * }
 *
 *
 *  if (myint<10){
 *             System.out.println("It's a true");
 *         } else if (myint>20) {
 *             System.out.println("It's a lie");
 *  ничего не выполнится. тк условия оба не верны.
 *  но если после всего напишем еще условие else он поймает все остальные случаи
 *         }else {
 *             System.out.println("No one right");
 *         }
 *         в консоль выдаст именно No one right
 *
 *
 *  взаимоисключающие случаи. оба варинта верны. то будет выполнено 1 условие myInt<10. читается сверху вниз
 *  1 дало нам правду. поэтому другие уже не проверяем
 *         if (myint<10){
 *            System.out.println("It's a true");
 *         } else if (myint<20) {
 *            System.out.println("It's a lie");
 *
 *        }
 */
public class If {
    public static void main(String[] args) {

        int myint = 5;

//        if (5==5){// если условие верно то
//            System.out.println("it's a true");
//
//        }else {// иначе(если условие неверно) тогда выполняется это
//            System.out.println("it's a lie");
//        }




//        if (myint<10){
//            System.out.println("It's a true");
//        } else if (myint>20) {
//            System.out.println("It's a lie");
//    // ничего не выполнится. тк условия оба не верны. но если после всего напишем еще условие else он поймает
//     // все остальные случаи
//        }else {
//            System.out.println("No one right"); // верное условие
//        }


        // взаимоисключающие случаи. оба варинта верны. то будет выполнено 1 условие myInt<10.
        if (myint<10){
           System.out.println("It's a true");
        } else if (myint<20) {
           System.out.println("It's a lie");

       }


    }
}
