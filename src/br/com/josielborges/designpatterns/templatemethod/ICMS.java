package br.com.josielborges.designpatterns.templatemethod;

public class ICMS implements Tax {

    @Override
    public double getValue(Budget budget) {
        return budget.getValue() * 0.1;
    }
}
