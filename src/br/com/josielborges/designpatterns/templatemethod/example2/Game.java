package br.com.josielborges.designpatterns.templatemethod.example2;

public abstract class Game {

    protected abstract void initialize();

    protected abstract void startPlay();

    protected abstract void endPlay();

    /* Template Method */
    void play () {
        initialize();
        startPlay();
        endPlay();
    }

}
