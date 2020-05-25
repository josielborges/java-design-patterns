package br.com.josielborges.designpatterns.chainofresponsability;

public class DiscountMoreThan5Items implements Discount {

    private Discount discount;

    @Override
    public double getDiscount(Budget budget) {
        return budget.getItems().size() > 5 ? budget.getValue() * 0.1 : discount.getDiscount(budget);
    }

    @Override
    public void setNext(Discount discount) {
        this.discount = discount;
    }
}
