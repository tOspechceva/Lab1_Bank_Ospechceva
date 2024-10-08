package bank.entity;


import java.util.List;
import java.util.Random;

import bank.service.impl.UserService;



public class User implements UserService {
    private Long id;
    private String fullName;  // ФИО
    private String birthDate;  // Дата рождения
    private String workplace;  // Место работы
    private double monthlyIncome;  // Ежемесячный доход (рандомно, не более 10 000)
    private int creditRating;  // Кредитный рейтинг (исходя из дохода)
    private List<Bank> banks;  // Банки, которыми пользуется клиент
    private List<CreditAccount> creditAccounts;  // Кредитные счета (по умолчанию пусто)
    private List<PaymentAccount> paymentAccounts;  // Платежные счета (по умолчанию пусто)

    // Конструктор
    public User(Long id, String fullName,
                String birthDate, String workplace) {
        this.setMonthlyIncome(generateRandomIncome());
        this.creditRating = calculateCreditRating(this.monthlyIncome);
        this.setId(id);
        this.setFullName(fullName);
        this.setBirthDate(birthDate);
        this.setWorkplace(workplace);
    }

    // Генерация рандомного дохода
    private double generateRandomIncome() {
        Random random = new Random();
        return random.nextInt(10000) + 1;  // Доход от 1 до 10 000
    }

    // Рассчет кредитного рейтинга
    private int calculateCreditRating(double monthlyIncome) {
        if (monthlyIncome < 1000) {
            return 100;
        } else if (monthlyIncome < 2000) {
            return 200;
        } else if (monthlyIncome < 3000) {
            return 300;
        } else if (monthlyIncome < 4000) {
            return 400;
        } else if (monthlyIncome < 5000) {
            return 500;
        } else if (monthlyIncome < 6000) {
            return 600;
        } else if (monthlyIncome < 7000) {
            return 700;
        } else if (monthlyIncome < 8000) {
            return 800;
        } else if (monthlyIncome < 9000) {
            return 900;
        } else {
            return 1000;
        }
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
    public String getWorkplace() {
        return workplace;
    }

    @Override
    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    @Override
    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    @Override
    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
        this.creditRating = calculateCreditRating(monthlyIncome);
    }

    @Override
    public int getCreditRating() {
        return creditRating;
    }

    @Override
    public List<Bank> getBanks() {
        return banks;
    }

    @Override
    public void setBanks(List<Bank> banks) {
        for (Bank bank : banks) {
            this.setBank(bank);
        }
    }

    @Override
    public void setBank(Bank bank) {
        bank.addClient();
        this.banks.add(bank);
    }

    @Override
    public List<CreditAccount> getCreditAccounts() {
        return creditAccounts;
    }

    @Override
    public void setCreditAccounts(List<CreditAccount> creditAccounts) {
        this.creditAccounts = creditAccounts;
    }

    @Override
    public List<PaymentAccount> getPaymentAccounts() {
        return paymentAccounts;
    }

    @Override
    public void setPaymentAccounts(List<PaymentAccount> paymentAccounts) {
        this.paymentAccounts = paymentAccounts;
    }

    @Override
    public void printUser() {
        System.out.println("User");
        System.out.println("id=" + id);
        System.out.println("full name=" + fullName);
        System.out.println("date of birth=" + birthDate);
        System.out.println("place of work=" + workplace);
        System.out.println("salary amount=" + monthlyIncome);
        System.out.println("credit rating for bank=" + creditRating);
        System.out.println();
    }
}
