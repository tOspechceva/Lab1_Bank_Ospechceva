package bank.entity;

//BankAtm – объект банкомат, содержит поля:
//• Id банкомата
//• Имя банкомата
//• Адрес (совпадает с адресом банковского офиса)
//• Статус (работает/не работает/нет денег)
//• Банк, которому принадлежит банкомат
//• Расположение банкомата (банкомат может быть расположен только в
//банковском офисе)
//• Обслуживающий сотрудник
//• Работает ли на выдачу денег? (да/нет)
//• Можно ли внести деньги? (да/нет)
//• Кол-во денег в банкомате (напрямую зависит от поля «Всего денег в банке)
//• Стоимость обслуживания банкомата

public class BankAtm {
    private Long id;
    private String name;

    private Bank bank;  // Банк, которому принадлежит банкомат
    private BankOffice bankOffice; // Офис, к которому принадлежит банкомат

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

    public BankAtm(Long id, String name, Bank bank, BankOffice bankOffice, String status,
                   String location,Employee servicingEmployee, boolean canDispenseMoney,
                   boolean canAcceptMoney, double moneyInAtm, double serviceCost) {
        this.setId(id);
        this.setName(name);
        this.setBank(bank);
        this.setBankOffice(bankOffice);
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

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
        this.bankOffice.addAtmCount();
    }

    public String getAddress() {
        return bankOffice.getAddress();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("Работает") || status.equals("Не работает") || status.equals("Нет денег"))
            this.status = status;
        else
            System.out.println("The status is not correct in the bank atm");
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee getServicingEmployee() {
        return servicingEmployee;
    }

    public void setServicingEmployee(Employee servicingEmployee) {
        this.servicingEmployee = servicingEmployee;
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

    public double getMoneyInAtm() {
        return moneyInAtm;
    }

    public void setMoneyInAtm(double moneyInAtm) {
        if (moneyInAtm <= this.bank.getTotalMoney()) {
            this.moneyInAtm = moneyInAtm;
        } else {
            System.out.println("Insufficient money. There is " + this.bank.getTotalMoney() + " money in the bank.");
        }
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void printBankAtm() {
        System.out.println("Bank ATM" + name);
        System.out.println("id: " + id);
        System.out.println("address: " + this.getAddress());
        System.out.println("work status: " + status);
        System.out.println("name Bank: " + bank.getName());
        System.out.println("name employee: " + servicingEmployee.getFullName());
        System.out.println("is dispensing cash: " + canDispenseMoney);
        System.out.println("can deposit allowed: " + canAcceptMoney);
        System.out.println("total money in the bank ATM: " + moneyInAtm);
        System.out.println("atm maintenance cost: " + serviceCost);
        System.out.println();
    }

}
