package lesson11.biginterfaceexemple;

/**
 * Created by Паша on 22.09.2017.
 */
public class Storage {
    private File[] files = new File[5];

    public Storage(File[] files) {
        this.files = files;
    }

    public File[] getFiles() {
        return files;
    }


}

