package com.keyin;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account("1","Jordans Account",5000);
        Account account2 = new Account("2","Brandons Account",4000);

        System.out.println("Account 1 Balance "+ account.getBalance());
        System.out.println("Account 2 Balance " + account2.getBalance());

        System.out.println();
        System.out.println("Transfering Money...");
        account.transferToAccount(account2,1000);

        System.out.println();

        System.out.println("====After Transfer======");
        System.out.println("Account 1 Balance "+ account.getBalance());
        System.out.println("Account 2 Balance " + account2.getBalance());




    }
}
