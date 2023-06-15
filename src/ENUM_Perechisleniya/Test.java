package ENUM_Perechisleniya;

/**
 * ENUM статические константы.Объекты
 * Конвенция писать большими буквами.
 * System.out.println(season instanceof Enum);
 * instanceof проверяет соответствие
 *
 * System.out.println(season.name()); возвращает имя enum в виде строки. изначальное,как задекларирован
 *
 *  Animal cat = Animal.valueOf("CAT"); вернет enum соответсвующий этой строке
 *   System.out.println(cat.getTranslation()); тут с методом перевода нашего
 *
 *   Season winter = Season.WINTER;
 *   System.out.println(winter.ordinal()); показывает место enum(его индекс) в порядке как они записаны
 */
public class Test {
    public static void main(String[] args) {
    //Animal animal = Animal.DOG;//в переменной animal лежит ЕНАМ Дог
        //System.out.println(animal);// выводит наш toString переопределенный по умолчанию
   /* switch (animal){
        case DOG -> System.out.println("Its a dog");
        case CAT -> System.out.println("Its a cat");
        case FROG -> System.out.println("Its a frog");
        default -> System.out.println("Its a not animal");
    }*/

  /* Season season = Season.SPRING;// В переменной season лежит ENUM SPRING
        switch (season){
            case SPRING -> System.out.println("Its warm season");
            case AUTUMN -> System.out.println("Its cold season");
            case SUMMER -> System.out.println("Its hot season");
            case WINTER -> System.out.println("Its frozen season");
            default -> System.out.println("Its anomaly season");
        }
        System.out.println(season.getTemperature());*/

////////////////////////////ПОЛЕЗНЫЕ МЕТОДЫ В ENUM////////////////////////////////////////////////////////////

        //name()
       /* Season season = Season.SPRING;
        Animal animal = Animal.FROG;
        System.out.println(animal.name());// возвращает имя enum в виде строки*/

        //valueOf
      /* Animal cat = Animal.valueOf("CAT");//вернет enum соответсвующий этой строке
        System.out.println(cat.getTranslation());*/

        //ordinal()
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());// показывает место enum(его индекс)





    }
}
