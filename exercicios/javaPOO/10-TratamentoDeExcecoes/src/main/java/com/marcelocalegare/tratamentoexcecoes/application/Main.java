package com.marcelocalegare.tratamentoexcecoes.application;

import com.marcelocalegare.tratamentoexcecoes.entities.Account;
import com.marcelocalegare.tratamentoexcecoes.exceptions.WhithdrawException;

public class Main {
    public static void main(String[] args) throws WhithdrawException {
        Account account = new Account();

        account = account.registerAccount();
        try {
            System.out.println("Balance: " + account.getBalance());
            account.withdraw();
            System.out.println("New Balance: " + account.getBalance());
        }
        catch (WhithdrawException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
