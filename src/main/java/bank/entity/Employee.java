package bank.entity;

import java.util.Date;

import bank.service.impl.EmployeeService;

//Employee – объект сотрудник, содержит поля:
//• Id сотрудника.
//• ФИО.
//• Дата рождения.
//• Должность.
//• В каком банке работает.
//• Работает ли в банковском офисе или удаленно? (да/нет)
//• Банковский офис, в котором работает.
//• Может ли выдавать кредиты? (да/нет)
//• Размер зарплаты.
public class Employee implements EmployeeService {
    private Long id;
    private String fullName;  // ФИО
    private String birthDate;  // Дата рождения
    private String position;  // Должность
    private boolean worksRemotely;  // Работает ли удаленно (да/нет)
    private boolean canIssueLoans;  // Может ли выдавать кредиты (да/нет)
    private double salary;  // Размер зарплаты
    private Bank bank;  // В каком банке работает
    private BankOffice bankOffice;  // В каком офисе работает (если не удаленно)

    // Конструктор
    public Employee(Long id, String fullName, String birthDate, String position,
                    boolean worksRemotely, boolean canIssueLoans, double salary,
                    Bank bank, BankOffice bankOffice) {
        this.setId(id);
        this.setFullName(fullName);
        this.setBirthDate(birthDate);
        this.setPosition(position);
        this.setWorksRemotely(worksRemotely);
        this.setCanIssueLoans(canIssueLoans);
        this.setSalary(salary);
        this.setBank(bank);
        this.setBankOffice(bankOffice);
    }

    // Геттеры и сеттеры
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean isWorksRemotely() {
        return worksRemotely;
    }

    @Override
    public void setWorksRemotely(boolean worksRemotely) {
        this.worksRemotely = worksRemotely;
    }

    @Override
    public boolean isCanIssueLoans() {
        return canIssueLoans;
    }

    @Override
    public void setCanIssueLoans(boolean canIssueLoans) {
        this.canIssueLoans = canIssueLoans;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public Bank getBank() {
        return bank;
    }

    @Override
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public BankOffice getBankOffice() {
        return bankOffice;
    }

    @Override
    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    @Override
    public void printEmployee() {
        System.out.println("Employee ");
        System.out.println("id=" + id);
        System.out.println("fullName='" + fullName + '\'');
        System.out.println("dateOfBirth='" + birthDate + '\'');
        System.out.println("position='" + position + '\'');
        System.out.println("idBank=" + bank.getId());
        System.out.println("isOfficeJob=" + worksRemotely);
        System.out.println("idBankOffice=" + bankOffice.getId());
        System.out.println("canGiveLoan=" + canIssueLoans);
        System.out.println("salaryAmount=" + salary);
        System.out.println();
    }
}
