package Exceptions2;

/**
 * Что бы идентифицировать ошибку в ходе работы с классом Сканер
 *
 */
public class ScannerException extends Exception{
    public ScannerException(String description){// метод для вывода сообщения в консоль нашего,а не дефолтного
        super(description);
    }
}
