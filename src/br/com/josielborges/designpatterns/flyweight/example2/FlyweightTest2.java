package br.com.josielborges.designpatterns.flyweight.example2;

public class FlyweightTest2 {

    public static void main(String[] args) {
        CofeeShop shop = new CofeeShop();
        shop.takeOrder("Cappuccino", 2);
        shop.takeOrder("Frappe", 4);
        shop.takeOrder("Espresso", 5);
        shop.takeOrder("Cappuccino", 46);
        shop.takeOrder("Frappe", 76);
        shop.takeOrder("Cappuccino", 22);
        shop.takeOrder("Cappuccino", 1);
        shop.takeOrder("Espresso", 54);
        shop.takeOrder("Cappuccino", 9);
        shop.takeOrder("Cappuccino", 10);
        shop.takeOrder("Espresso", 82);
        shop.takeOrder("Frappe", 38);

        shop.service();
        System.out.println("CofeeFlavour objects in cache: " + CofeeFlavour.flavoursSize());
    }

}
