package br.com.josielborges.designpatterns.observer.example2;

import java.util.Observable;

public interface Observer {
    void update(Subject subject);
}
