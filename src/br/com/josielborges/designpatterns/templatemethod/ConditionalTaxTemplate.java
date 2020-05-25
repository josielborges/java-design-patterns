package br.com.josielborges.designpatterns.templatemethod;

public abstract class ConditionalTaxTemplate implements Tax {

    @Override
    public double getValue(Budget budget) {
        if (shouldUseMaxTax(budget)) {
            return getMaxTax(budget);
        }
        return getMinTax(budget);
    }

    protected abstract boolean shouldUseMaxTax(Budget budget);

    protected abstract double getMaxTax(Budget budget);

    protected abstract double getMinTax(Budget budget);


}
