package br.com.josielborges.designpatterns.state.exemple1;

public interface State {

    void applyDiscount(Budget budget);

    void approve(Budget budget);

    void deny(Budget budget);

    void finish(Budget budget);

}
