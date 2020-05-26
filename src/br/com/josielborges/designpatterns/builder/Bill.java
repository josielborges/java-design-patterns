package br.com.josielborges.designpatterns.builder;

import java.time.LocalDate;
import java.util.List;

public class Bill {

    private String clientName;

    private LocalDate date;

    private List<Item> items;

    private String details;

    private double value;

    public Bill(String clientName, LocalDate date, List<Item> items, String details, double value) {
        this.clientName = clientName;
        this.date = date;
        this.items = items;
        this.details = details;
        this.value = value;
    }

    public String getClientName() {
        return clientName;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getDetails() {
        return details;
    }

    public double getValue() {
        return value;
    }

}
