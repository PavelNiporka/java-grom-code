package lesson25;

/**
 * Created by Паша on 05.07.2018.
 */
public class TestClass<T, K, V> {

    public T doSomething1(T t) {
        System.out.println("1");
        //logic
        return t;
    }

    public K doSomething2(K k) {
        System.out.println("2");
        //logic
        return k;
    }

    public V doSomething3(V v) {
        System.out.println("3");
        return v;


    }


}
