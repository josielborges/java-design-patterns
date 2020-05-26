package br.com.josielborges.designpatterns.state.exemple1;

public class Initial implements State {

    @Override
    public void applyDiscount(Budget budget) {
        budget.setValue(budget.getValue() - budget.getValue() * 0.05);
    }

    @Override
    public void approve(Budget budget) {
        budget.setState(new Approved());
    }

    @Override
    public void deny(Budget budget) {
        budget.setState(new Denied());
    }

    @Override
    public void finish(Budget budget) {
        throw new RuntimeException("The budge state cannot change from Initial to Finish");
    }

}
