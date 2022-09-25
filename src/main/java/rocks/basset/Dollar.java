package rocks.basset;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;

        return amount == dollar.amount;
    }
}
