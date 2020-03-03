package lesson11.homework11;


import java.util.Date;

/**
 * Created by Паша on 28.09.2017.
 */
public class GoogleAPI implements API {

    private Room rooms[];

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    //GoogleAPI ищет строго по заданным параметрам
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        int count = 0;
        for (Room room : rooms) {
            if (room != null && room.getPersons() == persons && room.getPrice() == price) {
                if (room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                    count++;


                }
            }
        }
        Room[] result = new Room[count];
        int index = 0;
        for (Room room : rooms) {
            if (room != null && room.getPersons() == persons && room.getPrice() == price) {
                if (room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                    result[index] = room;
                    index++;
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
