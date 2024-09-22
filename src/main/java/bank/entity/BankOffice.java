package bank.entity;

//BankOffice – объект офис банка, содержит поля:
//• Id банковского офиса
//• Название офиса
//• Адрес банковского офиса
//• Статус (работает/не работает)
//• Можно ли разместить банкомат? (да/нет)
//• Кол-во банкоматов в данном офисе (напрямую зависит от общего числа
//банкоматов у банка)
//• Можно ли оформить кредит в данном офисе? (да/нет)
//• Работает ли на выдачу денег? (да/нет)
//• Можно ли внести деньги? (да/нет)
//• Кол-во денег в банковском офисе (напрямую зависит от поля «Всего денег
//в банке)
//• Стоимость аренды банковского офиса

public class BankOffice {
    private Long id;

    private String name;  // Название офиса
    private String address;  // Адрес офиса
    private String status;  // Статус (работает/не работает)

    private boolean canPlaceAtm;  // Можно ли разместить банкомат?
    private int atmCount;  // Количество банкоматов в данном офисе
    private boolean canProvideLoan;  // Можно ли оформить кредит?
    private boolean canDispenseMoney;  // Работает ли на выдачу денег?
    private boolean canAcceptMoney;  // Можно ли внести деньги?

    private double moneyInOffice;  // Количество денег в офисе
    private double rentCost;  // Стоимость аренды офиса
    private Bank bank;  // Связь с банком

    // Конструктор
    public BankOffice() {
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCanPlaceAtm() {
        return canPlaceAtm;
    }

    public void setCanPlaceAtm(boolean canPlaceAtm) {
        this.canPlaceAtm = canPlaceAtm;
    }

    public int getAtmCount() {
        return atmCount;
    }

    public void setAtmCount(int atmCount) {
        this.atmCount = atmCount;
    }

    public boolean isCanProvideLoan() {
        return canProvideLoan;
    }

    public void setCanProvideLoan(boolean canProvideLoan) {
        this.canProvideLoan = canProvideLoan;
    }

    public boolean isCanDispenseMoney() {
        return canDispenseMoney;
    }

    public void setCanDispenseMoney(boolean canDispenseMoney) {
        this.canDispenseMoney = canDispenseMoney;
    }

    public boolean isCanAcceptMoney() {
        return canAcceptMoney;
    }

    public void setCanAcceptMoney(boolean canAcceptMoney) {
        this.canAcceptMoney = canAcceptMoney;
    }

    public double getMoneyInOffice() {
        return moneyInOffice;
    }

    public void setMoneyInOffice(double moneyInOffice) {
        this.moneyInOffice = moneyInOffice;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
