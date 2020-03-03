package lesson7;


import java.util.Date;

/**
 * Created by Паша on 01.08.2017.
 */


public class DemoHomeWork {
    public static void main(String[] args) {

    }

    public lesson7.Order createOrder() {

        lesson7.Order order = new Order(100, new Date(2017, 8, 2), false, null, "Dnepr", "Ukraine", "Buy"); // создать "ордер"
        return order;

    }


    public Order createOrderAndCallMethods() { // создать "ордер",и вызвать методы

        Order order = new Order(100, new Date(2017, 8, 2), true, new Date(2017, 8, 2), "Kiev", "Ukraine", "SomeValue");
        order.confirmOrder();
        order.checkPrice();
        order.isValidType();
        return order;

    }

}
