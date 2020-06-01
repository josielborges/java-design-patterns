package br.com.josielborges.designpatterns.observer.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public abstract class Subject {

    private List<Observer> obsevers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.obsevers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.obsevers.remove(observer);
    }

    public abstract String getData();

    public void execute() {
        this.obsevers.forEach(o ->o.update(this));
    }

}
