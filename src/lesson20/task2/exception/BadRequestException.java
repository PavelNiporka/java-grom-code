package lesson20.task2.exception;

/**
 * Created by Паша on 08.06.2018.
 */
public class BadRequestException extends Exception {

    public BadRequestException(String message) {
        super(message);
    }
}
