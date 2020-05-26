package br.com.josielborges.designpatterns.state.exemple1;

public class Finished implements State {

    @Override
    public void applyDiscount(Budget budget) {
        throw new RuntimeException("Cannot apply discount");
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("Budget is already Finished");
    }

    @Override
    public void deny(Budget budget) {
        throw new RuntimeException("Budget is already Finished");
    }

    @Override
    public void finish(Budget budget) {
        throw new RuntimeException("Budget is already Finished");
    }
}
