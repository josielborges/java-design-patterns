package br.com.josielborges.designpatterns.chainofresponsability;

public class DiscountCalculator {

    public double calculate(Budget budget) {
        Discount d1 = new DiscountMoreThan5Items();
        Discount d2 = new DiscountMoreThan500Dollars();
        Discount d3 = new NoDiscount();

        d1.setNext(d2);
        d2.setNext(d3);

        return d1.getDiscount(budget);
    }

}
