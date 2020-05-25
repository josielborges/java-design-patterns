package br.com.josielborges.designpatterns.chainofresponsability;

public interface Discount {

    double getDiscount(Budget budget);

    void setNext(Discount discount);

}
