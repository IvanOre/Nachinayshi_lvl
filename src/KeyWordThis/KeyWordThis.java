package KeyWordThis;

/**
 *
 *Например есть
 * class Human{
 *     String name;
 *     int age;
 *
 *     public void setName(String name){
 *         name = name;
 *     }
 *     получается имя переменной в Human name и в параметрах сеттера тоже name и джава незнает какую переменную
 *     мы имеем ввиду.Она берет самую близкую. из сеттера. Это уже не правильно. присваиваем переменной ту же
 *     переменную. Нам нужен способ отличать переменную класса объекта Human от переменной метода сеттера
 *     Для этого существует слово this. указываем его перед переменной класса и все становится ясно,что к чему
 *     приравниваем.
 *     public void setName(String name){
 *  *        this.name = name;
 *  *     }
 *Это стандарт. так пишут практически всегда.
 * this ключевое слово, вызывает объект внутри класса.Используется в контексте сеттеров
 *
 */
public class KeyWordThis {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Ivan");
        human1.setAge(34);
        human1.getInfo();

    }
}


class Human{
    String name;
    int age;

    public void setName(String name){
       this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println("Меня зовут "+getName()+" мой возраст "+ getAge());
    }
}