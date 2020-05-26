package br.com.josielborges.designpatterns.state.exemple1;

public class StateTest1 {

    public static void main(String[] args) {

        Budget budget = new Budget(100.0);
        budget.applyDiscount();
        System.out.println(budget.getValue());

        budget.approve();
        budget.applyDiscount();
        System.out.println(budget.getValue());

        // Should throws an exception
        budget.deny();

    }

}
