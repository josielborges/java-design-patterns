package br.com.josielborges.designpatterns.state.exemple1;

public class Approved implements State {

    @Override
    public void applyDiscount(Budget budget) {
        budget.setValue(budget.getValue() - budget.getValue() * 0.1);
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("The budget state is already approved");
    }

    @Override
    public void deny(Budget budget) {
        throw new RuntimeException("The budget state cannot change from approved to denied");
    }

    @Override
    public void finish(Budget budget) {
        budget.setState(new Finished());
    }

}
