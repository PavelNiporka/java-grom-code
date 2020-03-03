package src.lesson10.abstractfirstexample;

/**
 * Created by Паша on 16.09.2017.
 */
public abstract class DbProvider {
    private String dbHost;

    // public DbProvider(String dbHost) {
    //     this.dbHost = dbHost;
    // }

    abstract void connectToDb();

    abstract void disconnectFromDb();

    void printDBhost() {
        System.out.println("DB host is" + dbHost);

    }


}
