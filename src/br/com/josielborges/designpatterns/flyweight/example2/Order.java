package br.com.josielborges.designpatterns.flyweight.example2;

@FunctionalInterface
public interface Order {

    void serve();

    static Order of(String flavourName, int tableNumber) {
        CofeeFlavour flavour = CofeeFlavour.intern(flavourName);
        return () -> System.out.println("Serving " + flavour + " to table " + tableNumber);
    }

}
