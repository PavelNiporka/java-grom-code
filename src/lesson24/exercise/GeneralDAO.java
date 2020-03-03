package lesson24.exercise;

/**
 * Created by Паша on 05.07.2018.
 */
public class GeneralDAO<T> {
    @SuppressWarnings("unchecked")
    private T[] array = (T[]) new Object[5];

    public T save(T t) {
        int index = 0;
        for (T el : array) {
            if (el == null) {
                array[index] = t;
                return array[index];
            }
            index++;
        }
        return null;
    }

    public T[] getALL() {
        return array;
    }
}
