package br.com.josielborges.designpatterns.chainofresponsability;

public class ChainOfResponsabilityTest {

    public static void main(String[] args) {

        Budget budget = new Budget(400.0);
        budget.addItem(new Item());
        budget.addItem(new Item());

        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println(calculator.calculate(budget));

        Budget budget2 = new Budget(600.0);
        budget2.addItem(new Item());
        budget2.addItem(new Item());

        System.out.println(calculator.calculate(budget2));

        Budget budget3 = new Budget(600.0);
        budget3.addItem(new Item());
        budget3.addItem(new Item());
        budget3.addItem(new Item());
        budget3.addItem(new Item());
        budget3.addItem(new Item());
        budget3.addItem(new Item());

        System.out.println(calculator.calculate(budget3));

    }

}
