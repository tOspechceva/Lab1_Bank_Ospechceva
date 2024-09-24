package bank.service.impl;

import bank.entity.Bank;

public interface BankOfficeService {
     Long getId();

     void setId(Long id);

     String getName();

     void setName(String name);

     String getAddress();

     void setAddress(String address);

     String getStatus();

     void setStatus(String status);

     boolean isCanPlaceAtm();

     void setCanPlaceAtm(boolean canPlaceAtm);

     int getAtmCount();

     void setAtmCount(int atmCount);

     void addAtmCount();

     boolean isCanProvideLoan();

     void setCanProvideLoan(boolean canProvideLoan);

     boolean isCanDispenseMoney();

     void setCanDispenseMoney(boolean canDispenseMoney);

     boolean isCanAcceptMoney();

     void setCanAcceptMoney(boolean canAcceptMoney);

     double getMoneyInOffice();

     void setMoneyInOffice(double moneyInOffice);

     double getRentCost();

     void setRentCost(double rentCost);

     Bank getBank();

     void setBank(Bank bank);

     void printBankOffice();


}
