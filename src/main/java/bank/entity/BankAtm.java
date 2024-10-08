package bank.entity;

import bank.service.impl.AtmService;


public class BankAtm implements AtmService {
    private Long id;
    private String name;
    private BankOffice office; // Офис, к которому принадлежит банкомат
    private String status;  // Возможные значения: "Работает", "Не работает", "Нет денег"
    private String location;  // Локация (внутри банковского офиса)
    private Employee servicingEmployee;  // Обслуживающий сотрудник
    private boolean canDispenseMoney;  // Работает ли на выдачу денег?
    private boolean canAcceptMoney;    // Можно ли внести деньги?
    private double moneyInAtm;         // Количество денег в банкомате
    private double serviceCost;        // Стоимость обслуживания банкомата


    // Конструктор
    public BankAtm() {
    }

    public BankAtm(Long id, String name, BankOffice bankOffice, String status,
                   String location, Employee servicingEmployee, boolean canDispenseMoney,
                   boolean canAcceptMoney, double moneyInAtm, double serviceCost) {
        this.setId(id);
        this.setName(name);
        this.setOffice(bankOffice);
        this.setServiceCost(serviceCost);
        this.setStatus(status);
        this.setServicingEmployee(servicingEmployee);
        this.setCanAcceptMoney(canAcceptMoney);
        this.setCanDispenseMoney(canDispenseMoney);
        this.setServiceCost(serviceCost);
        this.setMoneyInAtm(moneyInAtm);
        this.setLocation(location);
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
    public BankOffice getOffice() {
        return office;
    }

    @Override
    public void setOffice(BankOffice office) {
        this.office = office;
        this.office.addAtmCount();
    }

    @Override
    public String getAddress() {
        return office.getAddress();
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        if (status.equals("Работает") || status.equals("Не работает") || status.equals("Нет денег")) {
            this.status = status;
            if (status.equals("Нет денег"))
                this.moneyInAtm = 0;
        } else
            System.out.println("The status is not correct in the bank atm");
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public Employee getServicingEmployee() {
        return servicingEmployee;
    }

    @Override
    public void setServicingEmployee(Employee servicingEmployee) {
        this.servicingEmployee = servicingEmployee;
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
    public double getMoneyInAtm() {
        return moneyInAtm;
    }

    @Override
    public void setMoneyInAtm(double moneyInAtm) {
        if (this.status.equals("Нет денег")) {
            if (moneyInAtm == 0)
                this.moneyInAtm = 0;
            else
                this.setStatus("Работает");
        }

        if (moneyInAtm == 0) {
            System.out.println();
        }
        if (moneyInAtm <= this.office.getBank().getTotalMoney()) {
            this.moneyInAtm = moneyInAtm;
        } else {
            System.out.println("Insufficient money. There is " + this.office.getBank().getTotalMoney() + " money in the bank.");
        }
    }

    @Override
    public double getServiceCost() {
        return serviceCost;
    }

    @Override
    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    @Override
    public Bank getBank() {
        return this.office.getBank();
    }

    @Override
    public void printBankAtm() {
        System.out.println("Bank ATM" + name);
        System.out.println("id: " + id);
        System.out.println("address: " + this.getAddress());
        System.out.println("work status: " + status);
        System.out.println("name Bank: " + this.office.getBank().getName());
        // System.out.println("name employee: " + servicingEmployee.getFullName());
        System.out.println("is dispensing cash: " + canDispenseMoney);
        System.out.println("can deposit allowed: " + canAcceptMoney);
        System.out.println("total money in the bank ATM: " + moneyInAtm);
        System.out.println("atm maintenance cost: " + serviceCost);
        System.out.println();
    }

}
