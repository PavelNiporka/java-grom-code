package lesson9;

/**
 * Created by Паша on 10.08.2017.
 */
public class Company {
    private String name;
    private String countryFounded;

    protected String code;

    protected int someField;

    public Company(String name, String countryFounded) {
        this.name = name;
        this.countryFounded = countryFounded;
    }

    protected String getName() {
        return name;
    }

    protected String getCountryFounded() {
        return countryFounded;
    }

    protected void setCountryFounded(String countryFounded) {
        this.countryFounded = countryFounded;
    }
}
