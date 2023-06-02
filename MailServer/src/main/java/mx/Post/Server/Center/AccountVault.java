package mx.Post.Server.Center;

import mx.Post.Server.Entities.Account;

import java.util.ArrayList;

public class AccountVault {
    private ArrayList<Account> accounts;
    AccountVault() {
        accounts = new ArrayList<Account>();
        accounts.add(new Account("hiitsmax@post.com", "1234"));
    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public Account getAccountByEmail(String email){
        for (Account account : accounts) {
            if (account.getEmail().equals(email)) {
                return account;
            }
        }
        return null;
    }
}
