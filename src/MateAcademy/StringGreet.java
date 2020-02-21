package MateAcademy;


import java.awt.image.AffineTransformOp;

public class StringGreet {
    public static void main(String[] args) {
        String name = "Sasha";
        String owner = "Sasha";
        greet(name, owner);

    }

    static String greet(String name, String owner) {
        // Add code here
        if (name.equals(owner)) {
            System.out.println("Hello boss");
            return ("Hello boss");
        } else
            System.out.println("Hello guest");
        return ("Hello guest");


    }


}
