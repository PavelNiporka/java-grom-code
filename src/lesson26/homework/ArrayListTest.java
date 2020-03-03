package lesson26.homework;

import lesson25.*;

import java.util.ArrayList;

/**
 * Created by Паша on 05.07.2018.
 */
public class ArrayListTest {
    public static void main(String[] args) throws Exception {


        Order order1 = new Order(10, 19, "www", "eee", "we");
        Order order2 = new Order(100, 11, "wwww", "eeee", "er");
        Order order3 = new Order(1001, 19, "wwwww", "eee", "tt");
        Order order4 = new Order(1, 13, "w", "eeeee", "t");
        Order order5 = new Order(100, 19, "wwwww", "eee", "ttt");

        ArrayListTest arrayListTest = new ArrayListTest();
        arrayListTest.useList(order1);
        arrayListTest.useList(order2);
        // arrayListTest.useList(null);
        arrayListTest.useList(order3);
        arrayListTest.useList(order4);
        arrayListTest.useList(order5);
        System.out.println(arrayListTest.list.toString());
        arrayListTest.list.add(order2);
        System.out.println(arrayListTest.list.toString());
        arrayListTest.list.add(2, order4);
        System.out.println(arrayListTest.list.toString());
        arrayListTest.list.remove(order1);
        System.out.println(arrayListTest.list.toString());


    }

    private ArrayList<Order> list = new ArrayList<>();


    public ArrayList useList(Order order) throws Exception {
        if (order == null) {
            throw new NullPointerException("Order is null");
        }
        for (int i = 0; i < 5; i++) {
            list.add(order);
        }
        list.add(2, order);

        list.remove(2);

        list.remove(order);

        list.addAll(list);

        ArrayList<Order> orders = new ArrayList<>(list.subList(0, 5));
        list.set(2, order);

        list.contains(order);

        list.toArray(new Order[list.size()]);

        list.clear();

        list = orders;


        return list;

    }


}
