package src.lesson11.firstinterface;

/**
 * Created by Паша on 22.09.2017.
 */
public class TestClass implements FirstInterface {

    private int test = 10;

    @Override
    public void send() {
        //some logic
    }

    @Override
    public String receive() {
        return null;

        //some logic
    }
}
