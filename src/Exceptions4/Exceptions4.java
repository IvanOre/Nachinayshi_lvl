package Exceptions4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * метод может выбрасывать несколько ексепшенов. если они нужны.Далее их нужно будет хендлить везде
 *     public void run() throws IOException, ParseException,IllegalArgumentException {
 *
 *     }
 *     Но если исключения наследуются от одного крупного который мы указали,то можем указывать только его тк
 *     все другие наследуемые от него в него входят уже и сработают автоматом.
 *
 *
 *     можно в одном блоке через или | вместо еще одного блока трай
 *      } catch (IOException  | ParseException e) {
 *             throw new RuntimeException(e);
 *
 *
 */
public class Exceptions4 {
    public static void main(String[] args)  {


        try {
            run();// обязаны выкинуть ексепшн и тут либо в сигнатуру либо трай кетч

        } catch (Exception e) {//можно выкинуть родителя ексепшенов. В него входят все сразу

        }

    }

//метод может выбрасывать несколько ексепшенов. если они нужны.Далее их нужно будет хендлить везде
    public static void run() throws IOException, ParseException,IllegalArgumentException {

    }
}
