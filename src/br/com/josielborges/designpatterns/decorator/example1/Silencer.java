package br.com.josielborges.designpatterns.decorator.example1;

public class Silencer extends DecoratorGun {

    public Silencer(Gun gun) {
        super(gun);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding a silencer to the Gun");
    }

}
