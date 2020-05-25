package br.com.josielborges.designpatterns.decorator.example1;

public class BaseGun implements Gun {

    @Override
    public void assemble() {
        System.out.println("This is a base gun");
    }

}
