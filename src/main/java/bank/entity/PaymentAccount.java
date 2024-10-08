package bank.entity;

import bank.service.impl.PaymentAccountService;



public class PaymentAccount implements PaymentAccountService {

    private Long id;
    private User user;           // Пользователь, за которым закреплен платежный счет
    private Bank bank;           // Название банка, в котором открыт счет
    private double balance = 0.0;// Сумма на счету (по умолчанию 0)

    // Конструктор
    public PaymentAccount(Long id, User user, Bank bank, double balance ) {
        this.setId(id);
        this.setUser(user);
        this.setBank(bank);
        this.setBalance(balance);
    }

    public PaymentAccount(User user, Bank bank, double balance) {
        this.user = user;
        this.bank = bank;
        this.balance = balance;
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
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
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
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void printPaymentAccount() {
        System.out.println("PaymentAccount");
        System.out.println("id=" + id);
        System.out.println("idUser=" + user.getId());
        System.out.println("idBank=" + bank.getId());
        System.out.println("sum=" + balance);
        System.out.println();
    }
}
