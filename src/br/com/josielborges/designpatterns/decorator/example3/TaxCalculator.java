package br.com.josielborges.designpatterns.decorator.example3;

import br.com.josielborges.designpatterns.templatemethod.example1.Budget;

public class TaxCalculator {

    public double calculate(Budget budget, Tax tax) {
        return tax.getValue(budget);
    }

}
