package lesson7;

import java.util.Date;
import java.lang.String;

/**
 * Created by Паша on 01.08.2017.
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


    public boolean confirmOrder() {
        if (isConfirmed) {
            isConfirmed = true;
            dateConfirmed = new Date();
            return true;
        } else return false;


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



