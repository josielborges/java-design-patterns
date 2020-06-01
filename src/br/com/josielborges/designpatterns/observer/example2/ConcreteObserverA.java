package br.com.josielborges.designpatterns.observer.example2;

public class ConcreteObserverA implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println(subject.getData() + " + observer A implementation");
    }

}
