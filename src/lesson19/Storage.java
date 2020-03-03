package lesson19;

public class Storage {

    private long id;
    public File[] files;
    public String[] formatsSupported;
    public String storageCountry;
    public long storageSize;

    public Storage(long id, File[] files, String[] formatsSupported, String storageCountry, long storageSize) {
        this.id = id;
        this.files = files;
        this.formatsSupported = formatsSupported;
        this.storageCountry = storageCountry;
        this.storageSize = storageSize;
    }

    public long getId() {
        return id;
    }

    public File[] getFiles() {
        return files;
    }



    public String[] getFormatsSupported() {
        return formatsSupported;
    }

    public long getStorageSize() {
        return storageSize;
    }

}
