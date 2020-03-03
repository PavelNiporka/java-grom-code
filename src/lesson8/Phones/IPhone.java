package lesson8.Phones;

/**
 * Created by Паша on 02.08.2017.
 */
public class IPhone extends Phone {
    int price;
    double weight;
    String countryProduced;
    boolean fingerPrint;

    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint) {
        super(price, weight, countryProduced);
        System.out.println("iPhone constructor was invoked...");
        this.fingerPrint = fingerPrint;
    }


    void deleteIPhoneFromDb() {
        System.out.println("deleteIPhoneFromDb invoked...");
    }


}
