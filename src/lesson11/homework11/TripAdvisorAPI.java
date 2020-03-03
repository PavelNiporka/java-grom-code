    package lesson11.homework11;

import java.util.Date;


public class TripAdvisorAPI implements API {

    private Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    //TripAdvisorAPI находит комнаты по заданным параметрам, а так же, количество гостей ищется в диапазоне +-1.
    // Например если пользователь ищет комнату с ко-вом гостей 3 и другими параметрами,
    // TripAdvisorAPI вернет все комнаты с ко-вом гостей от 2 до четырех
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;

        for (Room room : rooms) {
            if (room != null && room.getCityName().equals(city) && room.getHotelName().equals(hotel) && room.getPrice() == price) {
                if (room.getPersons() >= persons - 1 && room.getPersons() <= persons + 1) {
                    count++;

                }
            }

        }

        Room[] result = new Room[count];
        int countPersons = 0;
        for (Room room : rooms) {
            if (room != null && room.getCityName().equals(city) && room.getHotelName().equals(hotel) && room.getPrice() == price) {
                if (room.getPersons() >= persons - 1 && room.getPersons() <= persons + 1) {
                    result[countPersons] = room;
                    countPersons++;

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