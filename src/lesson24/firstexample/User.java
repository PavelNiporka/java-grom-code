package lesson24.firstexample;

/**
 * Created by Паша on 04.07.2018.
 */
public class User {
    private int age;

    public User(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
