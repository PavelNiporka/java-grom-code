package lesson29.homework;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Паша on 18.07.2018.
 */
public class HashTestSet {
    public static void main(String[] args) throws Exception {
        Order order1 = new Order(452, 2324, "231213", "treret", "324324r");
        Order order2 = new Order(451, 2324, "231213", "t", "324324r");
        Order order3 = new Order(455, 2324, "231213", "trer", "324324r");
        Order order4 = new Order(457, 2324, "231213", "tre", "324324r");
        Order order5 = new Order(459, 2324, "231213", "tre", "324324r");

        HashTestSet hashTestSet = new HashTestSet();
        hashTestSet.useHashSet(order1);
        hashTestSet.useHashSet(order2);
        hashTestSet.useHashSet(order3);
        hashTestSet.useHashSet(order4);
        hashTestSet.useHashSet(order5);
        System.out.println(hashTestSet);


    }

    private Set<Order> set = new HashSet<>();

    private Set<Order> useHashSet(Order order) throws Exception {
        if (order == null) throw new Exception("Order is null");
        for (int i = 0; i < 5; i++) {
            set.add(order);
        }
        Iterator<Order> orderIterator = set.iterator();
        while (orderIterator.hasNext())
            System.out.println(orderIterator.next().getId());
        set.add(order);
        set.remove(order);
        set.retainAll(set);
        set.toArray(new Object[set.size()]);
        set.size();
        return set;
    }
}
