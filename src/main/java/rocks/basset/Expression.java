package rocks.basset;

public interface Expression {
    Money reduce(Bank bank, String to);
}
