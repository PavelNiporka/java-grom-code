package lesson24.exercise;

/**
 * Created by Паша on 05.07.2018.
 */
public class Tool {
    private String name;
    private String discription;

    public Tool(String name, String discription) {
        this.name = name;
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "name='" + name + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }
}
