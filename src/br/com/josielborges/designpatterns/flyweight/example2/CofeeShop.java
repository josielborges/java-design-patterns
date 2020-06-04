package br.com.josielborges.designpatterns.flyweight.example2;

import java.util.ArrayList;
import java.util.List;

public class CofeeShop {

    private final List<Order> orders = new ArrayList<>();

    public void takeOrder(String flavour, int tableName) {
        orders.add(Order.of(flavour, tableName));
    }

    public void service() {
        orders.forEach(Order::serve);
    }

}
