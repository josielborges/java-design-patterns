package br.com.josielborges.designpatterns.strategy.example1;

public class ICMS implements Tax {


    @Override
    public double getValue(Budget budget) {
        return budget.getValue() * 0.1;
    }
}
