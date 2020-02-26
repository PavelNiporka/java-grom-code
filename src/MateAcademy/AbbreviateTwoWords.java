package MateAcademy;



public class AbbreviateTwoWords {
    public static void main(String[] args) {
        String name = "Pasha Sasha";
        System.out.print(abbrevName(name));

    }

    public static String abbrevName(String name) {

        if (name.length() == 0)
            return null;
        String[] words = name.split(" ");
        String abbrev = "";
        for (String word : words) {
            abbrev = Character.toUpperCase(word.charAt(0)) + ".";

        }
        return abbrev;


    }

}
