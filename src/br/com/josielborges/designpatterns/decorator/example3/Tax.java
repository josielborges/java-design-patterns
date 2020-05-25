package br.com.josielborges.designpatterns.decorator.example3;

import br.com.josielborges.designpatterns.templatemethod.example1.Budget;

public interface Tax {

    double getValue(Budget budget);

}
