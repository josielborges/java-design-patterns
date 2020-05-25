package br.com.josielborges.designpatterns.templatemethod.example1;

public class Item {

    double value;

    public Item(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
