package entities;

public class Account {
    private int number;
    private String name;
    private double balance;

    public Account(int number, String name, double balance){
        this.number = number;
        this.name = name;
        this.balance = balance;
    }
    public Account(int number, String name){
        this.number = number;
        this.name = name;
        balance = 0;
    }

    public double deposit(double deposit){
        return balance += deposit;
    }
    public double withdraw(double withdraw){
        return balance -= withdraw + 5;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return  "Account "
                + number
                +", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
