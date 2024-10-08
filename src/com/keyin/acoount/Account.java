package com.keyin;

public class Account {
    // POJO
    // Fields
    private String id;
    private String name;

    private int balance = 0;

    // Constructor
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    // Getters and setters
    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // Methods
    public int credit(int amount) {
        return balance += amount;
    }

    public int debit(int amount) {
        if(amount <= balance){
            balance -= amount;
        } else{
            System.out.println("Amount Exceeds Balance");
        }
        return balance;
    }

    public int transferToAccount(Account anotherAccount, int amount) {
        if(amount <= balance){
            this.balance -= amount;
            anotherAccount.credit(amount);
        } else{
            System.out.println("Amount Exceeds Balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
