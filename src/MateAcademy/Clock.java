package MateAcademy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Clock {

    public static void main(String[] args) {

        System.out.println(Past(-2, 1, 0));

    }

    public static int Past(int h, int m, int s) {
        if (h < 0 || m < 0 || s < 0) return -1;

        return (h * 3600000) + (m * 60000) + (s * 1000);
    }

    @Test
    public void test1() {

        assertEquals(Clock.Past(0, 1, 1), 61000);
        assertEquals(Clock.Past(-1, -1, -1), -1);
    }


}
