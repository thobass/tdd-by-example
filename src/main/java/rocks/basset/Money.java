package rocks.basset;

public abstract class Money {

    protected int amount;

    public static Money dollar(int amount){
        return new Dollar(amount);
    }

    public static Money franc(int amount){
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object object){
        Money money = (Money) object;

        return this.amount == money.amount
                && this.getClass().equals(object.getClass());
    }

    public abstract Money times(int multiplier);
}
