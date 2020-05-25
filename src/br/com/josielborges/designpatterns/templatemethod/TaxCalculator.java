package br.com.josielborges.designpatterns.templatemethod;

public class TaxCalculator {

    public double calculate(Budget budget, Tax tax) {
        return tax.getValue(budget);
    }

}
