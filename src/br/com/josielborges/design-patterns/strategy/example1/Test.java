package strategy.example1;

public class Test {

    public static void main(String[] args) {
        ICMS icms = new ICMS();
        ISS iss = new ISS();

        Budget budget = new Budget(100.0);

        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println(taxCalculator.calculate(budget, icms));
        System.out.println(taxCalculator.calculate(budget, iss));
    }

}
