package Polymorphysm;

public class Dog extends Animal{// унаследoвались от animal
    public void eat(){// переопределяем метод родителя
        System.out.println("Dog is eating");//теперь этот метод специфичен для собаки

    }
public void bark(){
    System.out.println("Dog is barking");
}


}
