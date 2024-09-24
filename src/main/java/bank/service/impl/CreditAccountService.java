package bank.service.impl;

import bank.entity.Bank;
import bank.entity.Employee;
import bank.entity.PaymentAccount;
import bank.entity.User;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface CreditAccountService {
    Long getId();

    void setId(Long id);

    User getUser();

    void setUser(User user);

    Bank getBank();

    void setBank(Bank bank);

    LocalDate getStartDate();

    void setStartDate(LocalDate startDate);

    LocalDate getEndDate();

    void setEndDate(LocalDate endDate);

    int getLoanMonths();

    void setLoanMonths(int loanMonths);

    BigDecimal getLoanAmount();

    void setLoanAmount(BigDecimal loanAmount);

    BigDecimal getMonthlyPayment();

    void setMonthlyPayment(BigDecimal monthlyPayment);

    double getInterestRate();

    void setInterestRate(double interestRate);

    Employee getIssuingEmployee();

    void setIssuingEmployee(Employee issuingEmployee);

    PaymentAccount getPaymentAccount();

    void setPaymentAccount(PaymentAccount paymentAccount);

    void printCreditAccount();
}
