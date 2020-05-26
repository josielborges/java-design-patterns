package br.com.josielborges.designpatterns.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BillBuilder {

    private String clientName;

    private LocalDate date;

    private List<Item> items = new ArrayList<>();

    private String details;

    private double value = 0;

    public BillBuilder withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public BillBuilder withDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public BillBuilder withItem(Item item) {
        this.items.add(item);
        value += item.getValue();
        return this;
    }

    public BillBuilder withDetails(String details) {
        this.details = details;
        return this;
    }

    public Bill build() {
        return new Bill(clientName, date, items, details, value);
    }

}
