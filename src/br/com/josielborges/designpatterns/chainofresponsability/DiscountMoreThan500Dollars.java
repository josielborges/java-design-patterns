package br.com.josielborges.designpatterns.chainofresponsability;

public class DiscountMoreThan500Dollars implements Discount {

    private Discount discount;

    @Override
    public double getDiscount(Budget budget) {
        return budget.getValue() > 500.0 ? budget.getValue() * 0.15 : discount.getDiscount(budget);
    }

    @Override
    public void setNext(Discount discount) {
        this.discount = discount;
    }
}
