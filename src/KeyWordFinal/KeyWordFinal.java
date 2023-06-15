package KeyWordFinal;

/**
 * Ключевое слово final - используется для того, чтобы запретить изменять объект.
 * Для примитивов final делает постоянным присвоенное значение.
 * Для ссылки на объект - постоянной становится ссылка. Вся информация, которая находится в каждом объекте,
 * устанавливается во время создания объекта и остается в таком состоянии до конца жизни объекта.
 *
 * Используется что бы обозначить переменную которая не может изменяться. Константа
 * Все константы пишутся заглавными буквами.
 * Обычно константы все static.Что бы не было растраты памяти. Была одна и делилась между объектами
 * Изменять переменные final мы не можем.
 * Они не изменяются в ходу выполнения программы.
 *
 *
 */
public class KeyWordFinal {
    public static void main(String[] args) {


    }
}

class Test{
    public static final int CONSTANT = 0;


}