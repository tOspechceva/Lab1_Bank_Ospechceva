package bank.entity;

import bank.service.impl.BankOfficeService;
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

public class BankOffice implements BankOfficeService {
    private Long id;
    private String name;  // Название офиса

    private Bank bank;  // Связь с банком

    private String address;  // Адрес офиса
    private String status;  // Статус (работает/не работает)

    private boolean canPlaceAtm;  // Можно ли разместить банкомат?
    private int atmCount;  // Количество банкоматов в данном офисе
    private boolean canProvideLoan;  // Можно ли оформить кредит?
    private boolean canDispenseMoney;  // Работает ли на выдачу денег?
    private boolean canAcceptMoney;  // Можно ли внести деньги?

    private double moneyInOffice;  // Количество денег в офисе
    private double rentCost;  // Стоимость аренды офиса


    // Конструктор
    public BankOffice() {
    }

    public BankOffice(Long id, String name, String address, String status, boolean canPlaceAtm,
                      int atmCount, boolean canProvideLoan, boolean canDispenseMoney, boolean canAcceptMoney,
                      double moneyInOffice, double rentCost, Bank bank) {
        this.setBank(bank);
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setStatus(status);
        this.setCanPlaceAtm(canPlaceAtm);
        this.setAtmCount(atmCount);
        this.setCanProvideLoan(canProvideLoan);
        this.setCanDispenseMoney(canDispenseMoney);
        this.setCanAcceptMoney(canAcceptMoney);
        this.setMoneyInOffice(moneyInOffice);
        this.setRentCost(rentCost);
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
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        if (status.equals("Работает") || status.equals("Не работает"))
            this.status = status;
        else
            System.out.println("The status is not correct in the office.");
    }

    @Override
    public boolean isCanPlaceAtm() {
        return canPlaceAtm;
    }

    @Override
    public void setCanPlaceAtm(boolean canPlaceAtm) {
        this.canPlaceAtm = canPlaceAtm;
        if (!canPlaceAtm)
            this.atmCount = 0;
    }

    @Override
    public int getAtmCount() {
        return atmCount;
    }

    @Override
    public void setAtmCount(int atmCount) {
        if (this.isCanPlaceAtm()) {
            if (atmCount <= this.bank.getAtmCount())
                this.atmCount = atmCount;
            else
                System.out.println("The bank doesn't have that many vending machines");
        } else {
            this.atmCount = 0;
            if (atmCount != 0)
                System.out.println("You cannot place a bank in this office");
        }
    }

    @Override
    public void addAtmCount() {
        this.atmCount++;
        this.bank.addAtm();
    }

    @Override
    public boolean isCanProvideLoan() {
        return canProvideLoan;
    }

    @Override
    public void setCanProvideLoan(boolean canProvideLoan) {
        this.canProvideLoan = canProvideLoan;
    }

    @Override
    public boolean isCanDispenseMoney() {
        return canDispenseMoney;
    }

    @Override
    public void setCanDispenseMoney(boolean canDispenseMoney) {
        this.canDispenseMoney = canDispenseMoney;
    }

    @Override
    public boolean isCanAcceptMoney() {
        return canAcceptMoney;
    }

    @Override
    public void setCanAcceptMoney(boolean canAcceptMoney) {
        this.canAcceptMoney = canAcceptMoney;
    }

    @Override
    public double getMoneyInOffice() {
        return moneyInOffice;
    }

    @Override
    public void setMoneyInOffice(double moneyInOffice) {
        if (moneyInOffice <= this.bank.getTotalMoney())
            this.moneyInOffice = moneyInOffice;
        else
            System.out.println("There is not that much money in the bank");
    }

    @Override
    public double getRentCost() {
        return rentCost;
    }

    @Override
    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    @Override
    public Bank getBank() {
        return bank;
    }

    @Override
    public void setBank(Bank bank) {
        bank.addOffice();
        this.bank = bank;
    }

    @Override
    public void printBankOffice() {
        System.out.println("Bank office " + name);
        System.out.println("id: " + id);
        System.out.println("address: " + address);
        System.out.println("is status of job: " + status);
        System.out.println("can Atm placement: " + canPlaceAtm);
        System.out.println("number of Atm: " + atmCount);
        System.out.println("can get loan: " + canProvideLoan);
        System.out.println("can take money: " + canAcceptMoney);
        System.out.println("can deposit allowed: " + canDispenseMoney);
        System.out.println("total money in the bank office: " + moneyInOffice);
        System.out.println("cost of rent: " + rentCost);
        System.out.println("bank: " + bank.getName());
        System.out.println();
    }


}
