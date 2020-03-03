package src.lesson10.Homework10;

import java.util.Date;


public abstract class Order {


    private String itemName;
    private Date dateCreated;
    private Date dateConfirmed;
    private Date dateShipped;
    private String shipFromCity;
    private String shipToCity;
    private int basePrice;
    private double totalPrice;
    private Customer customerOwned;

    public Order(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned) {
        this.itemName = itemName;
        this.dateCreated = dateCreated;
        this.shipFromCity = shipFromCity;
        this.shipToCity = shipToCity;
        this.basePrice = basePrice;
        this.customerOwned = customerOwned;
    }

    public void setDateConfirmed(Date dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    public String getShipFromCity() {
        return shipFromCity;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public String getItemName() {
        return itemName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public Customer getCustomerOwned() {
        return customerOwned;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getBasePrice() {
        return basePrice;
    }


    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public abstract void validateOrder();

    public abstract void calculatePrice();

    public void confirmShipping() {
        //   который проставляет дату доставки в текущую, если она еще не проставлена

        if (getDateShipped() == null) {
            setDateShipped(new Date());
        }


    }


}
