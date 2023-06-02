package mx.Post.Server.Center;

import mx.Post.Server.Entities.Account;
import mx.Post.Server.Entities.Mail;

import java.util.ArrayList;

public class PostalCenter {
    AccountVault accountVault;
    MailVault mailVault;
    public PostalCenter() {
        accountVault = new AccountVault();
        mailVault = new MailVault();
    }

    public Account getAccountByEmail(String email){
        for (Account account : accountVault.getAccounts()) {
            if (account.getEmail().equals(email)) {
                return account;
            }
        }
        return null;
    }
    public boolean isAccountValid(Account account){
        return accountVault.getAccounts().contains(account);
    }
    public MailBox getMailBoxOf(String mail){
        Account account = accountVault.getAccountByEmail(mail);
        return new MailBox(mailVault.getMailSentTo(account), mailVault.getMailSentBy(account), mailVault.getMailCCedTo(account));
    }
    public MailBox getMailBoxOf(Account account){
        return new MailBox(mailVault.getMailSentTo(account), mailVault.getMailSentBy(account), mailVault.getMailCCedTo(account));
    }
    public ArrayList<Mail> getMailSentBy(Account account){
        return mailVault.getMailSentBy(account);
    }
    public ArrayList<Mail> getMailSentBy(String mail){
        return mailVault.getMailSentBy(accountVault.getAccountByEmail(mail));
    }


}
