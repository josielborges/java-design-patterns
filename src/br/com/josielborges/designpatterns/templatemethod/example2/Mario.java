package br.com.josielborges.designpatterns.templatemethod.example2;

public class Mario extends Game {

    @Override
    protected void initialize() {
        System.out.println("Initializing Mario Game");
    }

    @Override
    protected void startPlay() {
        System.out.println("Paying Mario Game");
    }

    @Override
    protected void endPlay() {
        System.out.println("Ending Mario Game");
    }
}
