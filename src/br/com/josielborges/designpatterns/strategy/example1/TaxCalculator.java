package br.com.josielborges.designpatterns.strategy.example1;

public class TaxCalculator {

    public double calculate(Budget budget, Tax tax) {
        return tax.getValue(budget);
    }

}
