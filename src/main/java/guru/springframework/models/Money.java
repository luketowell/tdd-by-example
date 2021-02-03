package guru.springframework.models;

public class Money {
    protected int amount;

    Money(){};

    Money(int value) {
        this.amount = value;
    }

    public boolean equals(Object o) {
        Money money = (Money) o;

        return amount == money.amount
                && this.getClass().equals(o.getClass());
    }

    public Money times(int factor) {
        return new Money (amount *factor);
    }

}
