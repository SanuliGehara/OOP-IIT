package org.example;

public class BankAccount {
    private int accNo;
    private double balance;

    public BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " acquired the Lock");
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " has updated the balance successfully Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " acquired the Lock");
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " has updated the balance successfully Balance: "+ balance);
        }else {
            System.out.println("Insufficient balance. Transaction has been canceled!");
        }

    }

    public synchronized double getBalance() {
        System.out.println(Thread.currentThread().getName() + " has acquired the lock, View Balance = " + balance);
        return balance;
    }
}
