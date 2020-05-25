package br.com.josielborges.designpatterns.decorator.example1;

public abstract class DecoratorGun implements Gun {

    public Gun gun;

    public DecoratorGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void assemble() {
        this.gun.assemble();
    }

}
