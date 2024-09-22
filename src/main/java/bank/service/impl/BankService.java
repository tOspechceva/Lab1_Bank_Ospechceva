package bank.service.impl;

public interface BankService {

    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);

    int getOfficeCount();

    void addOffice();

    int getAtmCount();

    void addAtm();

    int getEmployeeCount();

    void addEmployee();

    int getClientCount();

    void addClient();

    int getRating();

    void setRating(int rating);

    double getTotalMoney();

    void setTotalMoney(int allMoney);

    double getInterestRate();

    void setInterestRate(int interestRate);

    void printBank();
}
