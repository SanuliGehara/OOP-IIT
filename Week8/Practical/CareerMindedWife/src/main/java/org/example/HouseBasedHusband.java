package org.example;

public class HouseBasedHusband extends Thread{
    private BankAccount bankAccount;

    public HouseBasedHusband(BankAccount bankAccount, String name) {
        super(name);
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            bankAccount.withdraw(5000);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bankAccount.getBalance();
        }
    }
}
