package br.com.josielborges.designpatterns.strategy.example1;

public class StrategyTest1 {

    public static void main(String[] args) {
        Tax icms = new ICMS();
        Tax iss = new ISS();

        Budget budget = new Budget(100.0);

        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println(taxCalculator.calculate(budget, icms));
        System.out.println(taxCalculator.calculate(budget, iss));
    }

}
