package lesson8.ads;

import java.util.Date;

/**
 * Created by Паша on 05.08.2017.
 */
public class Massage extends BaseEntity {

    String massage;
    Date dateRead;
    Date dateSent;
    String userFrom;
    String userTo;

    public Massage(long id, String massage, String userFrom, String userTo) {
        super(id);
        this.massage = massage;
        this.dateSent = new Date();
        this.userFrom = userFrom;
        this.userTo = userTo;
    }

    void setDateRead() {
        dateRead = new Date();

    }

    boolean isRead() {

        return dateRead == null;
    }


}
