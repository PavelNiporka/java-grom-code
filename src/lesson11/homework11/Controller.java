package lesson11.homework11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Controller {
    private API apis[];

    public Controller(API[] apis) {
        this.apis = apis;
    }

    // Который используя все реализации интерфейса API, находит комнаты по заданным параметрам
    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int countRoom = 0;
        for (API api : apis) {
            if (api != null && api.findRooms(price, persons, city, hotel) != null) {
                countRoom++;
            }
        }
        Room[] result = new Room[countRoom];
        int index = 0;

        for (API api : apis) {
            if (api != null) {
                for (Room room : api.findRooms(price, persons, city, hotel)) {
                    result[index] = room;
                    index++;
                }

            }
        }
        return result;

    }

    //Который находит общие комнаты у двух API (в результирующий массив добавлять комнаты с api1).
    //Комнаты будем считать равными, если у них одинаковые все поля кроме id и dateAvailableFrom. Гарантируется что id комнаты уникальный во всей системе
    public Room[] check(API api1, API api2) {

        Room[] firstRooms = api1.getAll();
        Room[] secondRooms = api2.getAll();
        int count = 0;
        if (firstRooms != null && secondRooms != null) {
            for (Room firstRoom : firstRooms) {
                for (Room secondRoom : secondRooms) {
                    if (firstRoom.getPrice() == secondRoom.getPrice() && firstRoom.getPersons() == secondRoom.getPersons()) {
                        if (firstRoom.getHotelName().equals(secondRoom.getHotelName()) && firstRoom.getCityName().equals(secondRoom.getCityName())) {
                            count++;
                        }

                    }
                }

            }
        }
        Room[] result = new Room[count];
        int index = 0;
        for (Room firstRoom : api1.getAll()) {
            for(Room secondRoom : api2.getAll() )
            if (firstRoom != null && secondRoom != null && firstRoom.getPrice() == secondRoom.getPrice() && firstRoom.getPersons() == secondRoom.getPersons()
                    && firstRoom.getCityName().equals(secondRoom.getCityName()) && firstRoom.getHotelName().equals(secondRoom.getHotelName())) {
                result[index] = firstRoom;
                index++;

            }


        }

        return result;
    }


}








