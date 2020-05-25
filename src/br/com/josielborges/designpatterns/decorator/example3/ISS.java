package br.com.josielborges.designpatterns.decorator.example3;

import br.com.josielborges.designpatterns.templatemethod.example1.Budget;

public class ISS extends TaxDecorator {

    public ISS(Tax otherTax) {
        super(otherTax);
    }

    @Override
    public double getValue(Budget budget) {
        return budget.getValue() * 0.3 + super.getValue(budget);
    }
}
