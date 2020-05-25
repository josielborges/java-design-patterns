package br.com.josielborges.designpatterns.templatemethod;

public class IOP extends ConditionalTaxTemplate {

    @Override
    protected boolean shouldUseMaxTax(Budget budget) {
        return budget.getValue() > 800.0;
    }

    @Override
    protected double getMaxTax(Budget budget) {
        return budget.getValue() * 0.2;
    }

    @Override
    protected double getMinTax(Budget budget) {
        return budget.getValue() * 0.05;
    }

}
