package br.com.josielborges.designpatterns.decorator.example3;

import br.com.josielborges.designpatterns.templatemethod.example1.Budget;

public class ICMS extends TaxDecorator {

    public ICMS(Tax otherTax) {
        super(otherTax);
    }

    @Override
    public double getValue(Budget budget) {
        return budget.getValue() * 0.1 + super.getValue(budget);
    }
}
