package lesson10.polyexample;

/**
 * Created by Паша on 16.09.2017.
 */
public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    void run() {
        System.out.println("Human class is called...");
        System.out.println(name + " is running");
    }

}
