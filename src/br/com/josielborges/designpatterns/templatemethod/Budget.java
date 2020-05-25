package br.com.josielborges.designpatterns.templatemethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {

    private double value;

    private List<Item> items = new ArrayList<>();

    public Budget(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
