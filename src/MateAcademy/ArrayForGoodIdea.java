package MateAcademy;


public class ArrayForGoodIdea {
    public static void main(String[] args) {
        String[] array = {};
        System.out.println(well(array));

    }

    public static String well(String[] x) {
        int count = 0;
        for (String array : x) {
            if (array.equals("good"))
                count++;
            if (count > 2)
                return "I smell a series!";
        }
        if (count != 0)
            return "Publish!";
            return "Fail!";
    }



}



