package lesson8.ads;

/**
 * Created by Паша on 05.08.2017.
 */
public class User extends BaseEntity {
    String userName;
    String location;


    public User(long id, String userName, String location) {
        super(id);
        this.userName = userName;
        this.location = location;
    }
}
