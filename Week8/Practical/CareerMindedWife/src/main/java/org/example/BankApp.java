package org.example;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(29008310, 5000);
        CareerMindedWife careerMindedWife = new CareerMindedWife(bankAccount, "Career Minded Wife");
        HouseBasedHusband houseBasedHusband = new HouseBasedHusband(bankAccount, "House Based Husband");

        careerMindedWife.start();
        houseBasedHusband.start();
    }
}