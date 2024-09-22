package bank.entity;
//PaymentAccount – объект платежный счет, содержит поля:
//• Id платёжного счета
//• Пользователь, за которым закреплен этот платежный счет
//• Название банка, в котором открыт этот счет
//• Сумма, которая лежит в данный момент на счету (по умолчанию 0)

public class PaymentAccount {

    private Long id;

    private User user;  // Пользователь, за которым закреплен платежный счет

    private Bank bank;  // Название банка, в котором открыт счет

    private double balance = 0.0;  // Сумма на счету (по умолчанию 0)

    // Конструктор
    public PaymentAccount() {
    }

    public PaymentAccount(User user, Bank bank, double balance) {
        this.user = user;
        this.bank = bank;
        this.balance = balance;
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
