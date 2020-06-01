package br.com.josielborges.designpatterns.observer.example1;

public class ObserverTest1 {

    public static void main(String[] args) {
        Tax tax = new Tax();
        tax.addAction(new EmailSenderObserver());
        tax.addAction(new DatabaseObserver());

        tax.setValue(100.0);
        tax.setValue(200.0);
    }
}
