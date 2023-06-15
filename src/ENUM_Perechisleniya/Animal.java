package ENUM_Perechisleniya;

public enum Animal {
    // тк мы добавили свой конструктор и теперь обязана при создании объекта указать перевод на русский
    //эквивалентно new DOG("Собака")
    DOG("Собака"),CAT("Кошка"),FROG("Лягушка");

    private String translation;

    Animal(String translation){// при создании конструктора у нас перестает работать конструктор по умолчанию
    this.translation = translation;

    }
    public String getTranslation(){
        return translation;
    }
    public String toString(){// переопределяем туСтринг
        return "Перевод на русский язык: " + translation;

    }
}
