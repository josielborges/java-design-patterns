package br.com.josielborges.designpatterns.templatemethod;

public class TemplateMethodTest {

    public static void main(String[] args) {

        Tax icms = new ICMS();
        Tax iss = new ISS();
        Tax iop = new IOP(); // Uses Teḿplate Method
        Tax iopd = new IOPD(); // Uses Teḿplate Method

        Budget budget = new Budget(100.0);

        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println(taxCalculator.calculate(budget, icms));
        System.out.println(taxCalculator.calculate(budget, iss));

        budget.addItem(new Item(90.0));
        System.out.println(taxCalculator.calculate(budget, iopd));

        budget = new Budget(900.0);
        System.out.println(taxCalculator.calculate(budget, iop));

    }

}
