package bank.entity;

import java.util.Random;

import bank.service.impl.BankService;


public class Bank implements BankService {
    private Long id;
    private String name;
    private int officeCount = 0;
    private int atmCount = 0;
    private int employeeCount = 0;
    private int clientCount = 0;
    private int rating;
    private double totalMoney;
    private double interestRate;


    // Конструктор

    public Bank() {
        Random random = new Random();
        this.rating = random.nextInt(101);  // Рейтинг от 0 до 100
        this.totalMoney = random.nextDouble() * 1_000_000;  // Деньги в банке до 1 000 000
        this.interestRate = calculateInterestRate(this.rating);  // Процентная ставка
    }

    public Bank(Long id, String name) {
        this.id = id;
        this.name = name;

        Random random = new Random();
        this.rating = random.nextInt(101);  // Рейтинг от 0 до 100
        this.totalMoney = random.nextDouble() * 1_000_000;  // Деньги в банке до 1 000 000
        this.interestRate = calculateInterestRate(this.rating);  // Процентная ставка
    }

    // Логика для подсчета процентной ставки
    private double calculateInterestRate(int rating) {
        return 20 - (rating / 5.0);  // Чем выше рейтинг, тем меньше процент
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getOfficeCount() {
        return officeCount;
    }

    @Override
    public void addOffice() {
        this.officeCount++;
    }

    @Override
    public int getAtmCount() {
        return atmCount;
    }

    @Override
    public void addAtm() {
        this.atmCount++;
    }

    @Override
    public int getEmployeeCount() {
        return employeeCount;
    }

    @Override
    public void addEmployee() {
        this.employeeCount++;
    }

    @Override
    public int getClientCount() {
        return clientCount;
    }

    @Override
    public void addClient() {
        this.clientCount++;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int rating) {
        if (rating >= 0 && rating <= 100) {
            this.rating = rating;
            this.interestRate = calculateInterestRate(this.rating);
        } else
            System.out.println("Enter a rating from 0 to 100 inclusive");
    }

    @Override
    public double getTotalMoney() {
        return totalMoney;
    }

    @Override
    public void setTotalMoney(int totalMoney) {
        if (totalMoney >= 0 && totalMoney <= 1000000)
            this.totalMoney = totalMoney;
        else
            System.out.println("Enter a amount of money from 0 to 100 inclusive");
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(int interestRate) {
        if (interestRate >= 0 && interestRate <= 20)
            this.interestRate = interestRate;
        else
            System.out.println("Enter the interest rate from 0 to 20 inclusive without indicating the sign %");
    }

    @Override
    public void printBank() {
        System.out.println("Bank " + name);
        System.out.println("id: " + id);
        System.out.println("number of office: " + officeCount);
        System.out.println("number of bankAtm: " + atmCount);
        System.out.println("number of employee: " + employeeCount);
        System.out.println("number of user: " + clientCount);
        System.out.println("rating: " + rating);
        System.out.println("total money in the bank: " + totalMoney);
        System.out.println("interest rate: " + interestRate);
        System.out.println();
    }
}


