package bank.entity;
import java.math.BigDecimal;
import java.time.LocalDate;
//CreditAccount – объект кредитный счет, содержит поля:
//• Id кредитного счета
//• Пользователь, за которым закреплен этот кредитный счет
//• Название банка, где взят кредит
//• Дата начала кредита
//• Дата окончания кредита
//• Кол-во месяцев, на которые взят кредит
//• Сумма кредита
//• Ежемесячный платеж
//• Процентная ставка (должна быть равной процентной ставке банка, в
//котором взят кредит или ниже)
//• Сотрудник, который выдал кредит
//• Платежный счет в банке с которого будет осуществляться погашение
//данного кредита

public class CreditAccount {

    private Long id;


    private User user;  // Пользователь, за которым закреплен этот кредитный счет


    private Bank bank;  // Банк, где взят кредит

    private LocalDate startDate;  // Дата начала кредита
    private LocalDate endDate;    // Дата окончания кредита
    private int loanMonths;       // Количество месяцев, на которые взят кредит

    private BigDecimal loanAmount;        // Сумма кредита
    private BigDecimal monthlyPayment;    // Ежемесячный платеж

    private double interestRate;  // Процентная ставка, должна быть равна ставке банка или ниже

    private Employee issuingEmployee;  // Сотрудник, который выдал кредит

    private PaymentAccount paymentAccount;  // Платежный счет для погашения кредита

    // Конструкторы
    public CreditAccount() {}

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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getLoanMonths() {
        return loanMonths;
    }

    public void setLoanMonths(int loanMonths) {
        this.loanMonths = loanMonths;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(BigDecimal monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Employee getIssuingEmployee() {
        return issuingEmployee;
    }

    public void setIssuingEmployee(Employee issuingEmployee) {
        this.issuingEmployee = issuingEmployee;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }
}
