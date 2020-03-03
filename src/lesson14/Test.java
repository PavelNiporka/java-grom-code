package lesson14;

/**
 * Created by Паша on 28.11.2017.
 */
public class Test implements Cloneable {
     private int someNumber;
     private String name;

    public Test(int someNumber, String name) {
        this.someNumber = someNumber;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception {
        Test test = new Test(123213,"wqwe");
        System.out.println(test.hashCode());
        Test test1 = (Test) test.clone();
        System.out.println(test1.hashCode());

    }

    public int getSomeNumber() {
        return someNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "someNumber=" + someNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
