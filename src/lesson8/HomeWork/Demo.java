package lesson8.HomeWork;

/**
 * Created by Паша on 08.08.2017.
 */
public class Demo {
    public static void main(String[] args) {

    }

    public Student createHighestParent() {
        Student student = new Student("Nick", "vasia", 4, new Course[0]);
        return student;
    }

    public SpecialStudent createLowestChild() {

        SpecialStudent specialStudent = new SpecialStudent("Ann", "Ann", 2, new Course[0], 12312, "llslfsdf");

        return specialStudent;
    }

}
