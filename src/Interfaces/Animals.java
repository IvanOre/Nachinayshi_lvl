package Interfaces;

/**
 *Мы реализуем(implements) интерфейс Info. А при реализации интерфейса мы обязаны унаследовать и реализовать
 * его методы.
 * Аннотация @Override перед объявлением метода означает,
 * что метод переопределяет объявление метода в базовом классе.
 */
public class Animals implements Info{
    public int id;

    public Animals(int id){
        this.id = id;
    }

    public void sleeping(){
        System.out.println("I am sleeping");
    }

    @Override // Аннотация @Override обязывает иметь такое же имя как в реализуемом методе
    public void showInfo() {
        System.out.println("Id is "+id);// выводим что нужно в этом методе

    }
}
