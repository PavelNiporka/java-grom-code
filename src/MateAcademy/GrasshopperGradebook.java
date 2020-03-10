package MateAcademy;

public class GrasshopperGradebook {

    public static void main(String[] args) {
        System.out.println(getGrade(0, 0, 0));

    }

    public static char getGrade(int s1, int s2, int s3) {
        if ((s1 + s2 + s3) / 3 >= 90)
            return 'A';
        if ((s1 + s2 + s3) / 3 >= 80)
            return 'B';
        if ((s1 + s2 + s3) / 3 >= 70)
            return 'C';
        if ((s1 + s2 + s3) / 3 >= 60)
            return 'D';
        if ((s1 + s2 + s3) / 3 >= 0)
            return 'F';
        return 0;
    }


}
