package lesson7;

import lesson6.Car;
import lesson6.DbConnector;
import lesson6.User;

/**
 * Created by Паша on 31.07.2017.
 */
public class Demo {
    public static void main(String[] args) {
        // two options to create object
        //class name (type) object name = new class name ();
        //class name (type) object name = new class name (attributes);

        User user = new User();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User("Jack");


        Car car = new Car(10000, 2015, "Anton");
        // Car car1 = new Car();


        DbConnector dbConnector = new DbConnector();
        //--------------


    }
}
