package src.lesson10.Homework10;

import java.util.Date;


public class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        //валидация
        //  Заказ возможен с городов: Киев, Львов и в любой город. Минимальная цена заказа 500. Так же имя клиента который делает заказ не может быть "Тест", а пол может быть любым
        String cityFrom = getShipFromCity(); // getCustomerOwned().getCity() - вот это убрал(точнее заменил) ,и появилась ошибка
        String name = getCustomerOwned().getName();
        if (cityFrom == null || name == null)
            return;
            if (cityFrom == "Киев" || cityFrom == "Львов" && getBasePrice() >= 500 && name != "Тест") {
                setDateConfirmed(new Date());


            }
        }



    @Override
    public void calculatePrice() {
        // расчет цены
        // Коммисия за доставку - 5% от суммы заказа если сумма меньше 5000 и 2% в других случаях
        if (getBasePrice() <= 5000)
            setTotalPrice(getBasePrice() + getBasePrice() * 0.05);

        else
            setTotalPrice(getBasePrice() + getBasePrice() * 0.02);

    }


}
