package Construktors;

/**
 * Конструкторы специальные методы которые вызываются при создании новго объекта
 * Этот метод инициализирует поля.
 * Пустой конструктор создается поу молчанию.Но мы его не видим.
 * Он обладает пустыми параметрами и у него пустое тело. Никакого присваивания и никакой логики.
 *
 *
 *
 * Это перегрузка методов....
 * public Human(){// пустой конструктор по умолчанию/ создается при создании нового объекта
 *         System.out.println("Привет из первого конструктора");
 *     }
 *
 *     public Human(String name,int age){
 *         this.name = name;
 *         this.age = age;
 *
 *     }
 *Это перегрузка методов...
 * В одном классе в джаве мы можем иметь несколько методов с одни именем. до тех пор пока у них разные параметры
 *
 *
 *
 *
 *
 *
 *
 */
public class Construktors {
    public static void main(String[] args) {
        Human human1 = new Human("Ivan",34);

    }
}
class Human{


    private String name;
    private int age;

    public Human(){// пустой конструктор по умолчанию/ создается при создании нового объекта
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Human(String name,int age){// наш конструктор с параметрами
        this.name = name;
        this.age = age;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}