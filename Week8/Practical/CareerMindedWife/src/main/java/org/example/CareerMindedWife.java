package org.example;

public class CareerMindedWife extends Thread{
    private BankAccount bankAccount;

    public CareerMindedWife(BankAccount bankAccount, String name) {
        super(name);
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            bankAccount.deposit(5000);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bankAccount.getBalance();
        }
    }
}
