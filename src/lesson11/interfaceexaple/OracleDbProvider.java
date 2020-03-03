package src.lesson11.interfaceexaple;

/**
 * Created by Паша on 16.09.2017.
 */
public class OracleDbProvider implements DbProvider {

    @Override
    public void connectToDb() {
        //some logic for oracle
    }

    @Override
    public void disconnectFromDb() {
        //some logic for oracle
    }

    @Override
    public void encryptDate() {
        //some logic for oracle
    }
}
