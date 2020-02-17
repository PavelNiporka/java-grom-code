package MateAcademy;

public class intCentury {
    public static void main(String[] args) {
        century(2000);
        centuryl(2000);

    }

    public static double century(int number) {
        // your code goes here
        int centuryCount = 0;
             while (number > 0) {
            number = number - 100;
            centuryCount = centuryCount + 1;
        }
        System.out.print(centuryCount);
        return centuryCount;
    }
    public static int centuryl(int numbers) {
        System.out.print(numbers);
        return (numbers + 99) / 100;
    }

}
