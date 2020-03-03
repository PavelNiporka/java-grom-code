package lesson11.homework11;

/**
 * Created by Паша on 28.09.2017.
 */
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();



}

