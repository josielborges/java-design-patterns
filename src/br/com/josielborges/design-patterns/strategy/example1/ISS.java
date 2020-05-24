package strategy.example1;

public class ISS implements Tax {

    @Override
    public double getValue(Budget budget) {
        return budget.getValue() * 0.3;
    }
}
