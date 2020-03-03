package src.lesson11.interfaceexaple;

/**
 * Created by Паша on 16.09.2017.
 */
public interface DbProvider {

    void connectToDb();

    void disconnectFromDb();

    void encryptDate();
}
