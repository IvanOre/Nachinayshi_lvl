package StringBuilder.Formating;

/**
 * System.out.printf-f в конце. форматируемый вывод
 * System.out.printf("This is a string, %s" , "NICE");
 * %s указывает на место куда будет вставляться следующее слово в строке(NICE)
 * %-означает тип вставляемого значения. тут s-String. %s
 * %d-вставим digit. цифры
 * %f-floating point number. число с точкой.
 * System.out.printf("This is a string, %s,%d" , "NICE",  88);
 * по порядку идут %s,%d-строка и число. и далее указывается в таком же порядке строка и число,
 * которые будут добавлены
 * System.out.printf("%f This is a %s string, %s,%d" ,14.3 , "NICE","Olaa",  88);
 *
 * Помимо того что можем просто вставлять значения в строку,мы можем их форматировать.
 * System.out.printf("String %10d",88);
 * %10d-будет цифра ,но шириной в 10 символов       String         88
 * Какое бы не было число оно будет занимать 10 символов в строке
 *
 * System.out.printf("String %-10d \n",455555);
 * %-10d-значит цифры идут слева направо
 * String 455555
 *
 *
 *  System.out.printf("String %10d \n",88);
 * \n в строке это перенос на новую строку в консоли
 *
 *
 *  System.out.printf("String %.2f \n",13.123654);
 *  %.2f-хотим что бы в вещественном числе было 2 символа после точки  String 13,12
 *  числа еще и округляются.
 */
public class Formating {
    public static void main(String[] args) {
//        System.out.printf("This is a string, %s" , "NICE");
//        System.out.println();
//        System.out.printf("This is a string, %s,%d" , "NICE",  88);
//        System.out.println();
//        System.out.printf("%f This is a %s string, %s,%d" ,14.3 , "NICE","Olaa",  88);

        System.out.printf("String %10d \n",88);
        System.out.printf("String %10d \n",1);
        System.out.printf("String %-10d \n",455555);
        System.out.printf("String %.2f \n",13.123654);
    }
}
