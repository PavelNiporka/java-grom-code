package MateAcademy;

public class CreatePhoneNumber {

    public static void main(String[] args) {
        int[] num = {1, 2, 8, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(num));
        String str = "poewrer213";
         Integer.valueOf(str);


    }

    static String createPhoneNumber(int[] numbers) {

        String phoneNumber = new String("(xxx) xxx-xxxx");
        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }
        return phoneNumber;


    }


}
