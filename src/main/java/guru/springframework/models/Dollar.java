package guru.springframework.models;

public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int factor) {
        amount *= factor;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}


