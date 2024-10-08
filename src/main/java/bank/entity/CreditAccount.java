package bank.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import bank.service.impl.CreditAccountService;



public class CreditAccount implements CreditAccountService {

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
    public CreditAccount(Long id, User user, Bank bank , LocalDate startDate, LocalDate endDate, int loanMonths,
                         BigDecimal loanAmount, BigDecimal monthlyPayment, double interestRate,
                         Employee issuingEmployee, PaymentAccount paymentAccount) {
        this.setId(id);
        this.setUser(user);
        this.setBank(bank);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.setLoanMonths(loanMonths);
        this.setLoanAmount(loanAmount);
        this.setMonthlyPayment(monthlyPayment);
        this.setInterestRate(interestRate);
        this.setIssuingEmployee(issuingEmployee);
        this.setPaymentAccount(paymentAccount);
    }

    // Геттеры и сеттеры
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
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public void setEndDate(LocalDate endDate) {
        if (endDate.isAfter(this.startDate))
            this.endDate = endDate;
        else {
            System.out.println("End date is before start date");
        }
    }

    @Override
    public int getLoanMonths() {
        return loanMonths;
    }

    @Override
    public void setLoanMonths(int loanMonths) {
        if (loanMonths > 0)
            this.loanMonths = loanMonths;
        else
            System.out.println("Loan Months is invalid");
    }

    @Override
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    @Override
    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Override
    public BigDecimal getMonthlyPayment() {
        return monthlyPayment;
    }

    @Override
    public void setMonthlyPayment(BigDecimal monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        if (interestRate <= this.bank.getInterestRate())
            this.interestRate = interestRate;
        else
            System.out.println("Interest rate is invalid");
    }

    @Override
    public Employee getIssuingEmployee() {
        return issuingEmployee;
    }

    @Override
    public void setIssuingEmployee(Employee issuingEmployee) {
        this.issuingEmployee = issuingEmployee;
    }

    @Override
    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    @Override
    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    @Override
    public void printCreditAccount() {
        System.out.println("CreditAccount");
        System.out.println("id=" + id);
        System.out.println("User=" + user.getFullName());
        System.out.println("Bank=" + bank.getName());
        System.out.println("loanStartDate='" + startDate + '\'');
        System.out.println("loanEndDate='" + endDate + '\'');
        System.out.println("loanLongInMonths= " + loanMonths);
        System.out.println("creditAmount= " + loanAmount);
        System.out.println("monthlyPayment= " + monthlyPayment);
        System.out.println("interestRate= " + interestRate);
        System.out.println("Employee= " + issuingEmployee.getFullName());
        System.out.println("PaymentAccount=" + paymentAccount.getId());
        System.out.println();
    }
}
