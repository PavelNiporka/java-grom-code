package lesson20.task2.exception;

/**
 * Created by Паша on 08.06.2018.
 */
public class LimitExceeded extends  BadRequestException{

    public LimitExceeded(String message) {
        super(message);
    }
}
