package entities;

public class account {

    private int number;
    private String name;
    private double balance;

    public account(int number, String name) {
        this.name = name;
        this.number = number;
    }

    public account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double deposit(double amount) {
        return balance + amount;
    }

    public double withdraw(double amount) {
        return balance - amount;
    }

}
