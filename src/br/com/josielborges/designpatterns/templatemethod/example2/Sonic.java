package br.com.josielborges.designpatterns.templatemethod.example2;

public class Sonic extends Game {

    @Override
    protected void initialize() {
        System.out.println("Initializing Sonic Game");
    }

    @Override
    protected void startPlay() {
        System.out.println("Paying Sonic Game");
    }

    @Override
    protected void endPlay() {
        System.out.println("Ending Sonic Game");
    }

}
