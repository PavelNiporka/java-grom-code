package lesson11.homework11;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Паша on 28.09.2017.
 */
public class BookingComAPI implements API {

    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }
    //BookingComAPI находит комнаты по заданным параметрам, а так же комнаты,
    // которые по цене отличаются на 100 единиц в обе стороны. Например если пользователь ищет комнату с ценой 50 и другими параметрами,
    // BookingComAPI вернет все комнаты с ценой в диапазоне 0 - 150

    @Override

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room room : rooms) {
            if (room != null && room.getPrice() <= price + 100 && room.getPrice() >= price - 100) {
                if (room.getPersons() ==  persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                    count++;
                }
            }
        }
        Room[] result = new Room[count];
        int deviationPrice = 0;
        for (Room room : rooms) {
            if (room != null && room.getPrice() <= price + 100 && room.getPrice() >= price - 100) {
                if (room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                    result[deviationPrice] = room;
                    deviationPrice++;


                }
            }

        }
        return result;

    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
