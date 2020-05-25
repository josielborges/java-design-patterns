package br.com.josielborges.designpatterns.decorator.example3;

import br.com.josielborges.designpatterns.templatemethod.example1.Budget;

public class DecoratorTest3 {

    public static void main(String[] args) {

        Tax tax = new NoValueTax();
        Tax icms = new ICMS(tax);
        Tax icmsAndIss = new ICMS(new ISS(tax));

        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println(taxCalculator.calculate(new Budget(100.0), tax));
        System.out.println(taxCalculator.calculate(new Budget(100.0), icms));
        System.out.println(taxCalculator.calculate(new Budget(100.0), icmsAndIss));

    }

}
