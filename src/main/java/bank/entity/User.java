package bank.entity;
import java.util.Date;
import java.util.List;
import java.util.Random;

//User – объект клиенты банка, содержит поля:
//• Id клиента
//• ФИО
//• Дата рождения
//• Место работы
//• Ежемесячный доход (генерируется рандомно, но не более 10 000)
//• Банки, которыми он пользуется
//• Кредитные счета (по умолчанию пусто)
//• Платежные счета (по умолчанию пусто)
//• Кредитный рейтинг для банка (генерируется рандомно исходя из
//ежемесячного дохода, от меньше 1 000 – 100, от 1 000 до 2 000 – 200 и т.д.
//вплоть до 10 000)

public class User {
    private Long id;

    private String fullName;  // ФИО
    private Date birthDate;  // Дата рождения
    private String workplace;  // Место работы
    private double monthlyIncome;  // Ежемесячный доход (рандомно, не более 10 000)
    private int creditRating;  // Кредитный рейтинг (исходя из дохода)


    private List<Bank> banks;  // Банки, которыми пользуется клиент


    private List<CreditAccount> creditAccounts;  // Кредитные счета (по умолчанию пусто)


    private List<PaymentAccount> paymentAccounts;  // Платежные счета (по умолчанию пусто)

    // Конструктор
    public User() {
        this.monthlyIncome = generateRandomIncome();
        this.creditRating = calculateCreditRating(this.monthlyIncome);
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

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
        this.creditRating = calculateCreditRating(monthlyIncome);
    }

    public int getCreditRating() {
        return creditRating;
    }

    public List<Bank> getBanks() {
        return banks;
    }

    public void setBanks(List<Bank> banks) {
        for (Bank bank : banks) {
            this.setBank(bank);
        }
    }

    public void setBank(Bank bank) {
        bank.addClient();
        this.banks.add(bank);
    }

    public List<CreditAccount> getCreditAccounts() {
        return creditAccounts;
    }

    public void setCreditAccounts(List<CreditAccount> creditAccounts) {
        this.creditAccounts = creditAccounts;
    }

    public List<PaymentAccount> getPaymentAccounts() {
        return paymentAccounts;
    }

    public void setPaymentAccounts(List<PaymentAccount> paymentAccounts) {
        this.paymentAccounts = paymentAccounts;
    }
}
