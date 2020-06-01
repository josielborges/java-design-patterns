package br.com.josielborges.designpatterns.observer.example1;

public class DatabaseObserver implements TaxObserver {

    @Override
    public void execute(Tax tax) {
        System.out.println("Tax saved in database. Value: " + tax.getValue());
    }

}
