package lesson8.ads;

/**
 * Created by Паша on 05.08.2017.
 */
public class HouseAd extends Ad {
    String ownerName;
    String address;
    double square;
    int floors;

    public HouseAd(long id, int price, String ownerName, String address, double square, int floors) {
        super(id, price);
        this.ownerName = ownerName;
        this.address = address;
        this.square = square;
        this.floors = floors;
    }

    boolean checkOwner() {
        Owner owners = new Owner();
        for (String owner1 : owners.owners) {
            if (ownerName == owner1)
                return true;
        }
        return false;
    }


}
