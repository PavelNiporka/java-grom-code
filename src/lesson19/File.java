package lesson19;



public class File {

    private long id;
    private String name;
    private String format;
    private long size;

    public File(long id, String name, String format, long size) throws Exception {


        checkEmpty(name);
        checkLength(name);
        checkFile(name);


        this.id = id;
        this.name = name;
        this.format = format;
        this.size = size;


    }

    private boolean checkLength(String file) throws Exception {
        if (file.length() > 10) {
            throw new Exception(file + " file name longer than 10 characters,and can not  be create");
        }
        return true;

    }

    private boolean checkEmpty(String name) throws Exception {
        if (name.isEmpty()) {
            throw new Exception(name + " the file has an empty name");
        }
        return true;
    }


    private boolean checkFile(String name) throws Exception {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (!Character.isLetterOrDigit(c))
                throw new Exception("The file " + name + " has invalid characters");
        }
        return true;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public long getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        if (id != file.id) return false;
        return name.equals(getName());
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        //  result = 31 * result + format.hashCode();
        //   result = 31 * result + (int) (size ^ (size >>> 32));
        return result;
    }

}
