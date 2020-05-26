package br.com.josielborges.designpatterns.builder;

import java.time.LocalDate;

public class BuilderTest {

    public static void main(String[] args) {

        BillBuilder builder = new BillBuilder();
        Bill bill = builder.withClientName("Josiel Eliseu Borges")
                           .withDate(LocalDate.now())
                           .withItem(new Item("Item 1", 100.0))
                           .withItem(new Item("Item 2", 200.0))
                           .withItem(new Item("Item 3", 300.0))
                           .build();

        System.out.println(bill.getValue());

    }
}
