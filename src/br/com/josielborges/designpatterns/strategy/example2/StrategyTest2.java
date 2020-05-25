package br.com.josielborges.designpatterns.strategy.example2;

public class StrategyTest2 {

    public static void main(String[] args) {

        TaxStrategy icms = TaxStrategy.ICMS();
        TaxStrategy iss = TaxStrategy.ISS();

        Budget budget1 = new Budget(100.0, icms);
        System.out.println(budget1.getTaxValue());

        Budget budget2 = new Budget(100.0, iss);
        System.out.println(budget2.getTaxValue());

    }
}
