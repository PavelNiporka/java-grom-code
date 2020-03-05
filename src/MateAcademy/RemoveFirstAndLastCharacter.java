package MateAcademy;


public class RemoveFirstAndLastCharacter {

    public static void main(String[] args) {
        String str = "12390912sdds";
        System.out.println(remove(str));

    }

    static String remove(String str) {
        // return str.substring(1, str.length() - 1);
        // Determine the length of the string
        // int strLength = str.length();
        // Set empty variable to hold output string
        String result = "";
        // Check each character except the last since it gets excluded anyway
        for (int i = 0; i < str.length() - 1; i++) {
            if (i != 0) {
                // If the current character is not the first, add it to our variable
                result = result + str.charAt(i);
            }
        }

        // Return our collected characters as a string
        return result;


    }

}
