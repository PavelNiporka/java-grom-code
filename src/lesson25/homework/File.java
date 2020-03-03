package lesson25.homework;

/**
 * Created by Паша on 05.07.2018.
 */
public class File {
    private int filesCount;
    private String location;

    public File(int filesCount, String location) {
        this.filesCount = filesCount;
        this.location = location;
    }

    @Override
    public String toString() {
        return "File{" +
                "filesCount=" + filesCount +
                ", location='" + location + '\'' +
                '}';
    }
}
