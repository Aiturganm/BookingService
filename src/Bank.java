import java.math.BigDecimal;

public class Bank {
    private BigDecimal balance;

    public Bank(){}
    public Bank(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                '}';
    }
}
