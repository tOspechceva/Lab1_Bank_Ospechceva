package bank.service.impl;

import bank.entity.Bank;
import bank.entity.CreditAccount;
import bank.entity.PaymentAccount;

import java.util.Date;
import java.util.List;

public interface UserService {
    Long getId();

    void setId(Long id);

    String getFullName();

    void setFullName(String fullName);

    Date getBirthDate();

    void setBirthDate(Date birthDate);

    String getWorkplace();

    void setWorkplace(String workplace);

    double getMonthlyIncome();

    void setMonthlyIncome(double monthlyIncome);

    List<Bank> getBanks();

    void setBanks(List<Bank> banks);

    void setBank(Bank bank);

    List<CreditAccount> getCreditAccounts();

    void setCreditAccounts(List<CreditAccount> creditAccounts);

    List<PaymentAccount> getPaymentAccounts();

    void setPaymentAccounts(List<PaymentAccount> paymentAccounts);

    void printUser();

     int getCreditRating();
}
