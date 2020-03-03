package src.lesson10.Homework10;


import java.util.Date;


public class ElectronicsOrder extends Order {

    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        //заказ возможен с городов: Киев, Одесса, Днепр, Харьков и в один из этих городов. Минимальная цена заказа 100.
        // Так же имя клиента который делает заказ может быть любым, а пол только женским
        String cityFrom = getShipFromCity(); // было видимо когда-то так  getCustomerOwned().getCity()
        String cityTo = getShipToCity();
        String gender = getCustomerOwned().getGender();


        if (cityFrom == null || gender == null || cityTo == null)
            return;
        if (cityFrom == "Киев" || cityFrom == "Харьков" || cityFrom == "Одесса" || cityFrom == "Днепр") {
            if (cityTo == "Киев" || cityTo == "Харьков" || cityTo == "Одесса" || cityTo == "Днепр") {
                if (gender == "Женский") {
                    if (getBasePrice() >= 100) {

                        setDateConfirmed(new Date());
                    }
                }
            }
        }
    }

    @Override
    public void calculatePrice() {

        // Цена может состоит из цены товара и цены за доставку. Так же могут быть скидки.
        // Если доставка производится в любой город, кроме Киева и Одессы, то цена за доставку - 15% от суммы заказа.
        // В других случаях 10%. Так же если цена больше 1000 то скидка на заказ 5% после оплаты комиссии за доставку
        if (getShipToCity() == null)
            return;
        if (getShipToCity() == "Киев" || getShipToCity() == "Одесса")
            setTotalPrice(getBasePrice() + getBasePrice() * 0.1);
        else
            setTotalPrice(getBasePrice() + getBasePrice() * 0.15);

        if (getBasePrice() >= 1000) {
            setTotalPrice(getTotalPrice() - getTotalPrice() * 0.05);

        }
    }


}