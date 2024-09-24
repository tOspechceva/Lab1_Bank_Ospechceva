package bank.service.impl;

import bank.entity.Bank;
import bank.entity.User;

public interface PaymentAccountService {
    Long getId();

    void setId(Long id);

    User getUser();

    void setUser(User user);

    Bank getBank();

    void setBank(Bank bank);

    double getBalance();

    void setBalance(double balance);

    void printPaymentAccount();

}
