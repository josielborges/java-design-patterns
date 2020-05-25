package br.com.josielborges.designpatterns.strategy.example2;

public class Budget {

    private double value;

    private TaxStrategy strategy;

    public Budget(double value, TaxStrategy strategy) {
        this.value = value;
        this.strategy = strategy;
    }

    public double getTaxValue() {
        return strategy.getValue(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}


