package br.com.josielborges.designpatterns.state.exemple1;

public class Budget {

    private double value;

    private State state = new Initial();

    public Budget(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void applyDiscount() {
        state.applyDiscount(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void approve() {
        this.state.approve(this);
    }

    public void deny() {
        this.state.deny(this);
    }

    public void finish() {
        this.state.finish(this);
    }

}
