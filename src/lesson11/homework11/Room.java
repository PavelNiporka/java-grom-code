package lesson11.homework11;

import java.util.Date;

/**
 * Created by Паша on 28.09.2017.
 */
public class Room {
    private long id;
    public int price;
    public int persons;
    public Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }


    public int getPersons() {
        return persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (price != room.price) return false;
        if (persons != room.persons) return false;
        if (!dateAvailableFrom.equals(room.dateAvailableFrom)) return false;
        if (!hotelName.equals(room.hotelName)) return false;
        return cityName.equals(room.cityName);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + persons;
        result = 31 * result + dateAvailableFrom.hashCode();
        result = 31 * result + hotelName.hashCode();
        result = 31 * result + cityName.hashCode();
        return result;
    }
}
