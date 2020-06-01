package br.com.josielborges.designpatterns.observer.example2;

public class ConcreteObserverB implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println(subject.getData() + " + observer B implementation");
    }

}
