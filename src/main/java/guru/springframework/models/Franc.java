package guru.springframework.models;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }



    @Override
    public int hashCode() {
        return amount;
    }
}
