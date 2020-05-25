package br.com.josielborges.designpatterns.decorator.example1;

public class Aim extends DecoratorGun {

    public Aim(Gun gun) {
        super(gun);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding an aim to the gun");
    }
}
