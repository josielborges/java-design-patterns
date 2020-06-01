package br.com.josielborges.designpatterns.observer.example1;

public class EmailSenderObserver implements TaxObserver{
    @Override
    public void execute(Tax tax) {
        System.out.println("Email sent. Value: " + tax.getValue());
    }
}
