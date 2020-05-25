package br.com.josielborges.designpatterns.decorator.example3;

import br.com.josielborges.designpatterns.templatemethod.example1.Budget;

public abstract class TaxDecorator implements Tax {

    private Tax otherTax;

    public TaxDecorator(Tax otherTax) {
        this.otherTax = otherTax;
    }

    @Override
    public double getValue(Budget budget) {
        return otherTax.getValue(budget);
    }

}
