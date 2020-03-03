package lesson25.homework;

import java.util.Objects;

/**
 * Created by Паша on 05.07.2018.
 */
public class GeneralDAO<T> {
    @SuppressWarnings("unchecked")
    private  T[] files = (T[]) new Object[10];

    public T save(T t) throws Exception {
        validate(t);
        int index = 0;
        for (T file : files) {
            if (file == null) {
                files[index] = t;
                return files[index];
            }
            index++;
        }
        throw new Exception("No free space for file " + t);

    }

    public T[] getAll() {
        int count = 0;
        for (T file : files) {
            if (file != null)
                count++;
        }

        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[count];

        int index = 0;
        for (T file : files) {
            if (file != null) {
                result[index] = file;
            }
            index++;
        }
        return result;
    }


    private boolean validate(T t) throws Exception {
        if (t == null) throw new NullPointerException("File is null");
        for (T file : files) {
            if (file != null && file.equals(t))
                throw new Exception("File " + t + " already exists");
        }
        return true;
    }
}



