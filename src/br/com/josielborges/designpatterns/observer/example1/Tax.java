package br.com.josielborges.designpatterns.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class Tax {

    private double value;

    private final List<TaxObserver> actions = new ArrayList<>();

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
        executeActions();
    }

    public void addAction(TaxObserver action) {
        actions.add(action);
    }

    private void executeActions() {
        actions.forEach(a -> a.execute(this));
    }

}
