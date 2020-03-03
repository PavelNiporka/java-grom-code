package lesson6;


import java.util.Date;

/**
 * Created by Паша on 31.07.2017.
 */
public class Order {

    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;


    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;

    }


    public void confirmOrder() {
        if (!isConfirmed) {
            isConfirmed = true;
            dateConfirmed = new Date();
        }


    }

    public boolean checkPrice() {
        if (price > 1000) {
            return true;
        } else return false;


    }

    public boolean isValidType() {
        String Buy = null;
        String Sale = null;
        if (type == Buy || type == Sale) {
            return true;
        }
        return false;
    }

}



