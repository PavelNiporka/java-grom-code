package MateAcademy;

public class FirstNoneConsecutive {

    public static void main(String[] args) {
        int[] ar = {2, 3, 4, 5, 6, 8};
        System.out.println(find(ar));


    }

    static Integer find(final int[] array) {
        int i = array[0];
        for (int el : array) {
            if (i == el)
                i++;
            else return el;
        }
        return null;
    }


}






