package br.com.josielborges.designpatterns.templatemethod;

public class ISS implements Tax {

    @Override
    public double getValue(Budget budget) {
        return budget.getValue() * 0.3;
    }
}
