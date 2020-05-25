package br.com.josielborges.designpatterns.decorator.example1;

public class DecoratorTest1 {

    public static void main(String[] args) {
        // Gun with all components
        Gun completeGun = new Silencer(new Aim(new BaseGun()));
        completeGun.assemble();

        // Gun with no one components
        Gun gun = new BaseGun();
        gun.assemble();

        // Adding the silencer to the gun
        Gun gunWithSilencer = new Silencer(gun);
        gunWithSilencer.assemble();

        // Adding the aim to the gun
        Gun gunWithAim = new Aim(gun);
        gunWithAim.assemble();
    }

}
