package Wildcard_Generics;

public class Animal {
    private int id;
    public Animal(){// пустой дефолтный конструктор создали вручную(для наследника) тк уже есть переопределенный

    }
    public Animal(int id){// конструктор создали с аргументом id
        this.id = id;

    }

    public void eat(){
        System.out.println("Animal is eating.....");
    }
    public String toString(){// переобпределили туСтринг из обжект. вернем id
        return String.valueOf(id);// c valueOf конвертируем целое число id в строку
    }
}
