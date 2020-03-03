package src.lesson10.abstractfirstexample;

/**
 * Created by Паша on 16.09.2017.
 */
public class MySQLProvider extends DbProvider {
    // public MySQLProvider(String dbHost) {
    //     super(dbHost);
    //  }

    @Override
    void connectToDb() {
        //logic for Mysql

    }


    @Override
    void disconnectFromDb() {

    }
}
