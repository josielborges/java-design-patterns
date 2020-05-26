package br.com.josielborges.designpatterns.state.exemple1;

public class Denied implements State {

    @Override
    public void applyDiscount(Budget budget) {
        throw new RuntimeException("Cannot apply discount");
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("The budget state is denied.");
    }

    @Override
    public void deny(Budget budget) {
        throw new RuntimeException("The budget state is already denied.");
    }

    @Override
    public void finish(Budget budget) {
        throw new RuntimeException("The budget state is denied.");
    }

}
