package lesson27.homework;

import java.util.LinkedList;

/**
 * Created by Паша on 06.07.2018.
 */
public class LinkedListTest {
    public static void main(String[] args) throws Exception {

        Order order1 = new Order(10, 19, "www", "eee", "we");
        Order order2 = new Order(100, 11, "wwww", "eeee", "er");
        Order order3 = new Order(1001, 19, "wwwww", "eee", "tt");
        Order order4 = new Order(1, 13, "w", "eeeee", "t");
        Order order5 = new Order(100, 19, "wwwww", "eee", "ttt");

        LinkedListTest linkedListTest = new LinkedListTest();

        linkedListTest.useList(order1);
        linkedListTest.useList(order2);
        linkedListTest.useList(order3);
        linkedListTest.useList(order4);
        linkedListTest.useList(order5);
        //linkedListTest.useList(null);
        //System.out.println(linkedListTest.linkedList.toString());
      //  linkedListTest.linkedList.clear();
      //  System.out.println(linkedListTest.linkedList.toString());
      //  linkedListTest.linkedList.set();
        System.out.println(linkedListTest.linkedList.toString());



    }

    private LinkedList<Order> linkedList = new LinkedList<>();


    private LinkedList useList(Order order) throws Exception {
        if (order == null) throw new NullPointerException("Order is null");
        for (int i = 0; i < 5; i++) {
            linkedList.add(order);
        }
        linkedList.add(0, order);
        linkedList.remove(0);
        linkedList.remove(order);
        linkedList.addAll(linkedList);
        LinkedList<Order> orders = new LinkedList<>(linkedList.subList(0, 5));
        linkedList.set(3, order);
        linkedList.contains(order);
        linkedList.toArray(new Object[linkedList.size()]);
        linkedList.clear();
        linkedList = orders;

        return linkedList;
    }
}
