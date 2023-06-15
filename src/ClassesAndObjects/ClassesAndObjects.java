package ClassesAndObjects;

/**
 * class Person{
 *
 * }
 * Класс эти тип данных который мы сами создали.
 *  Person person1 = new Person();
 *  тип данных Person/ переменная person1 и эту переменную ссылаем на новый объект класса Person (new Person())
 * У класса могут быть данные(поля) и действия которые он может совершать(методы)
 *
 *  Person person1 = new Person();
 *         person1.name = "Ivan";
 *         person1.age = 34;
 *         System.out.println("My name is "+person1.name +"," +" My age is "+person1.age);
 *
 *         Person person2 = new Person();
 *         person2.name = "Roman";
 *         person2.age = 25;
 *         System.out.println("My name is "+person2.name +","+ " My age is "+person2.age);
 *
 *
 * .////////////////////////////////////////типы методов/////////////////////////////////////////////////////////.
 *
 *  void-методы ничего не возвращают в метод main. Например вызвав метод sayHello() мы не возвращаем никаких данных
 *  этот метод сам выводит на экран строки.
 *
 *
 *   int calculateToYearsRetirement(){ поставили метод не void ,а int и теперь мы должны вернуть значение в main
 *         // туда где он был вызван
 *         int years = 65-age;
 *         return years;
 *     }
 *этот метод параметризованный как int
 *
 * в main методе возвращаем int years2 = person2.calculateToYearsRetirement();
 * присвоили возвращаемое значение нашего метода на экран не выводим.
 * просто помещаем в эти переменные значения полученные методом
 * Выводим в консоль так System.out.println("Ивану до пенсии "+years1+" лет");
 *
 *
 * int calculateToYearsRetirement(){
 *  *         int years = 65-age;
 *  *         return years;
 *  *     }
 *  return-возвращает значение которое равно int значению,но еще и мгновенно выходит из метода
 *  После него нет смысла что-то писать уже.
 *  Если указали конкретный тип возвращаемого значения(int тут) то вы не можете вернуть другой тип
 *
 *
 *
 *  ////////////////////////////Параметры методов//////////////////////////////////////////////////////////
 *
 *  void setName(String username){
 *   name = username;
 *     }
 * метод setName принимает строку в свои параметры метода и в теле метода считает что она называется username
 * name=username и теперь поле name в Person будет равняться username
 *  person1.setName("Ivan");   должен принимать в себя строку теперь
 *
 *  еще способ например:
 *  String s = "Roman";
 *  person2.setName(s);
 *
 *
 *
 */
public class ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setNameAge("Ivan",34);// должен принимать в себя строку теперь и число
       // person1.age = 34;
        person1.sayHello();
        person1.speak();// Вызываем метод на объекте. Переменной person1
       int years1 = person1.calculateToYearsRetirement();
        System.out.println();


        Person person2 = new Person();
        // person2.name = "Roman";
       //String s = "Roman";
        person2.age = 25;
        person2.sayHello();
        //person2.setName(s);
        person2.speak();
       int years2 = person2.calculateToYearsRetirement();// присвоили возвращаемое значение нашего метода
        // на экран не выводим. просто помещаем в эти переменные значения полученные методом
       // System.out.println("Роману до пенсии "+years2+" лет");


    }
}

class Person{// получается абстрактный. нет ничего конкретного. лишь описание что люди имеют имя и возраст.
    String name;
    int age;

    void setNameAge(String username,int userage){// метод setName принимает строку в свои параметры метода
        name = username;
        age = userage;

    }






    //void calculateToYearsRetirement(){// считаем года оставшиеся человеку до пенсии
        //int years = 65-age;// 65 пенсия отнимаем возраст нашего человека
        //System.out.println("Лет до пенсии: " + years);

   // }

    int calculateToYearsRetirement(){// поставили метод не void ,а int и теперь мы должны вернуть значение в main
        // туда где он был вызван
        int years = 65-age;
        return years;
    }





    void speak(){// добавили метод в класс. что-то должен он делать
        System.out.println("My name is "+name+" " +"my age is "+ age);
        // теперь у каждого объекта класса Person имеется метод speak()который выводит на экран sout

    }
    void sayHello(){
        System.out.println("Hello!");
    }

}