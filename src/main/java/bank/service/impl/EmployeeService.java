package bank.service.impl;

import bank.entity.Bank;
import bank.entity.BankOffice;

import java.util.Date;

public interface EmployeeService {
    public Long getId();

    public void setId(Long id);

    public String getFullName();

    public void setFullName(String fullName);

    public String getBirthDate();

    public void setBirthDate(String birthDate);

    public String getPosition();

    public void setPosition(String position);

    public boolean isWorksRemotely();

    public void setWorksRemotely(boolean worksRemotely);

    public boolean isCanIssueLoans();

    public void setCanIssueLoans(boolean canIssueLoans);

    public double getSalary();

    public void setSalary(double salary);

    public Bank getBank();

    public void setBank(Bank bank);

    public BankOffice getBankOffice();

    public void setBankOffice(BankOffice bankOffice);

    public void printEmployee();


}
