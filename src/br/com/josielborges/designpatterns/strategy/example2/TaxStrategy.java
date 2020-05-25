package br.com.josielborges.designpatterns.strategy.example2;

public interface TaxStrategy {

    double getValue(double value);

    static TaxStrategy ICMS() {
        return value -> value * 0.1;
    }

    static TaxStrategy ISS() {
        return value -> value * 0.3;
    }

}
