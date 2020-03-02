package MateAcademy;

public class WillYouMakeIt {
    public static void main(String[] args) {

        System.out.println(zeroFuel(50, 25, 6));

    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {

        boolean check = true;
        if (distanceToPump / mpg <= fuelLeft) {
            return check;
        }
        return false;

    }


}
