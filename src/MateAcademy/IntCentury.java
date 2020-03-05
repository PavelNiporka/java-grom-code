package MateAcademy;

public class IntCentury {
    public static void main(String[] args) {
        //century(2099);
        System.out.println(centuryl(1999));


    }

    public static double century(int number) {
        // your code goes here
        int centuryCount = 0;
        while (number > 0) {
            number -= 100;
            centuryCount = centuryCount + 1;
        }
        System.out.print(centuryCount);
        return centuryCount;
    }

    public static int centuryl(int numbers) {
        // System.out.println(numbers);
        return (numbers + 99) / 100;
    }

}
