package lesson8.ads;

import java.util.Date;

/**
 * Created by Паша on 05.08.2017.
 */
public class Ad extends BaseEntity {

    Date dateCreated;
    int price;

    public Ad(long id, int price) {
        super(id);
        this.price = price;
        this.dateCreated = new Date();
    }

    void publishAd() {
        //someLogic
    }
}
