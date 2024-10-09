package ua.com.kisit_course.groupe373.unit6.association.one_to_one;

public class Account {

    private Long id;
    private int number;
    private double balance;
    private boolean active;

    private Client client;


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", number=" + number +
                ", balance=" + balance +
                ", active=" + active +
                '}';
    }

    public Account() {
    }

    public Account(Long id, int number, double balance, boolean active) {
        this.id = id;
        this.number = number;
        this.balance = balance;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
