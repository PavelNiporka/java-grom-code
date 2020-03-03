package lesson11.biginterfaceexemple;

/**
 * Created by Паша on 22.09.2017.
 */
public class File {
    private String name;
    private String path;
    private String extension;
    private int size;

    public File(String name, String path, String extension, int size) {
        this.name = name;
        this.path = path;
        this.extension = extension;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }
}
