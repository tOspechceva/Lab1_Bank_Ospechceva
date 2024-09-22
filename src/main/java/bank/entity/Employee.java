package bank.entity;
import java.util.Date;

//Employee – объект сотрудник, содержит поля:
//• Id сотрудника
//• ФИО
//• Дата рождения
//• Должность
//• В каком банке работает
//• Работает ли в банковском офисе или удаленно? (да/нет)
//• Банковский офис, в котором работает
//• Может ли выдавать кредиты? (да/нет)
//• Размер зарплаты
public class Employee {
    private Long id;
    private String fullName;  // ФИО
    private Date birthDate;  // Дата рождения
    private String position;  // Должность
    private boolean worksRemotely;  // Работает ли удаленно (да/нет)
    private boolean canIssueLoans;  // Может ли выдавать кредиты (да/нет)
    private double salary;  // Размер зарплаты
    private Bank bank;  // В каком банке работает
    private BankOffice bankOffice;  // В каком офисе работает (если не удаленно)

    // Конструктор
    public Employee() {
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isWorksRemotely() {
        return worksRemotely;
    }

    public void setWorksRemotely(boolean worksRemotely) {
        this.worksRemotely = worksRemotely;
    }

    public boolean isCanIssueLoans() {
        return canIssueLoans;
    }

    public void setCanIssueLoans(boolean canIssueLoans) {
        this.canIssueLoans = canIssueLoans;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }
}
