package br.com.josielborges.designpatterns.chainofresponsability;

public class NoDiscount implements Discount {

    @Override
    public double getDiscount(Budget budget) {
        return 0;
    }

    @Override
    public void setNext(Discount discount) {
        // Last discount
    }

}
