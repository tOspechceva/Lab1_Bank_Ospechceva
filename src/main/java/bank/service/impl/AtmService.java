package bank.service.impl;

import bank.entity.Bank;
import bank.entity.BankOffice;
import bank.entity.Employee;

public interface AtmService {
    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);

    BankOffice getOffice();

    void setOffice(BankOffice office);

    String getAddress();

    String getStatus();

    void setStatus(String status);

    String getLocation();

    void setLocation(String location);

    Employee getServicingEmployee();

    void setServicingEmployee(Employee servicingEmployee);

    boolean isCanDispenseMoney();

    void setCanDispenseMoney(boolean canDispenseMoney);

    boolean isCanAcceptMoney();

    void setCanAcceptMoney(boolean canAcceptMoney);

    double getMoneyInAtm();

    void setMoneyInAtm(double moneyInAtm);

    double getServiceCost();

    void setServiceCost(double serviceCost);

    Bank getBank();

    void printBankAtm();
}
