package NestedClasses;

/**
 *  В Java есть 3 типа вложенных классов.
 *
 *  1 тип это нестатический вложенный класс. Они относятся к объекту.Имеют доступ к полям объекта.
 *  private class Motor{
 *  public void startMotor(){
 *      System.out.println("Motor " + id + " is starting..");
 *         }
 *     }
 *  Внутри каждой электрокар есть мотор. Таким образом разграничиваем логику внутри самого класса.
 *
 *  Зачем нужны вложенные нестатические классы.
 *  Електрокар это сложный механизм. У него есть мотор,кп,тормоза,приборка и тд. Если целиком описывать логику
 *  всего в классе Електрокар,то он бы оказался слишком сложным.Поэтому внутри него мы создаем много вложенных
 *  нестатических классов.И в каждом прописываем логику подобъекта.Обычно они private.
 *  Нестатические вложенные классы создаются когда главный класс объемный сложный и его нужно разделить
 *  на несколько подобъектов.
 *
 *  2 тип это статический вложенный класс.
 *  public static class Battery{
 *         public void charge(){
 *             System.out.println("Battery is charging...");
 *         }
 *     }
 *  Этот класс имеет меньше отношения к електрокар. Он не имеет доступа к полям класса.(id тут).
 *  Только к статическим. И еще что их связывает это логика. в електрокар есть батарея.
 *  Обычно эти классы используются извне. поэтому они паблик.
 *  в мейн методе создали Electrocar.Battery battery = new Electrocar.Battery();
 *
 *
 *3 тип это вложенный в метод класс.
 * public void start(){
 *         Motor motor = new Motor();// когда запускаем машину сначала старутем мотор.
 *         motor.startMotor();
 *
 * //вложенный класс в методе SomeClass
 *         class SomeClass{
 *             public void someMethod(){
 *
 *             }
 *         }
 *         System.out.println("Electrocar " + id + " is starting..");
 *     }
 *
 *  Имеет доступ к нестатическим полям класса и методам. От переменных в методе требуется что бы они были константами.
 *  Тогда к ним тоже будет доступ вложенного в метод класса.  final int x = 1;
 *
 *  Зачем создавать вложенный класс внутри метода?Это похоже на анонимные классы. Будет вызван 1 раз.
 *
 *
 *
 *
 */
public class Electrocar {
    private int id;
    // вложенный нестатический класс Motor
    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id + " is starting..");//имеем доступ к полю id
        }
    }
//вложенный статический класс Battery
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id){
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();// когда запускаем машину сначала старутем мотор.
        motor.startMotor();

        final int x = 1;

//вложенный класс в методе SomeClass
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);

            }
        }
        System.out.println("Electrocar " + id + " is starting..");
    }
}
