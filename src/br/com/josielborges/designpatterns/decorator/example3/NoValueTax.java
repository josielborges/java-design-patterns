package br.com.josielborges.designpatterns.decorator.example3;

import br.com.josielborges.designpatterns.templatemethod.example1.Budget;

public class NoValueTax implements Tax {

    @Override
    public double getValue(Budget budget) {
        return 0;
    }
}
