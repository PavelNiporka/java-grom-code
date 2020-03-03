package lesson25;

/**
 * Created by Паша on 05.07.2018.
 */
public class Order extends IdEntity {
    private long id;

    public Order(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }
}
