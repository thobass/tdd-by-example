package rocks.basset;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    protected String currency() {
        return this.currency;
    }

    @Override
    public Money times(int multiplier){
        return Money.franc(this.amount * multiplier);
    }

}
