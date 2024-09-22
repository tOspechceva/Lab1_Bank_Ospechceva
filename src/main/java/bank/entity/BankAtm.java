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
    private String address;  // Адрес банкомата совпадает с адресом офиса банка
    private String status;  // Возможные значения: "Работает", "Не работает", "Нет денег"
    private String location;  // Локация (внутри банковского офиса)
    private Employee servicingEmployee;  // Обслуживающий сотрудник

    private boolean canDispenseMoney;  // Работает ли на выдачу денег?
    private boolean canAcceptMoney;    // Можно ли внести деньги?
    private double moneyInAtm;         // Количество денег в банкомате
    private double serviceCost;        // Стоимость обслуживания банкомата
    private Bank bank;  // Банк, которому принадлежит банкомат

    // Конструктор
    public BankAtm() {
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
        if (status.equals("Работает") || status.equals("Не работает") || status.equals("Нет денег"))
            this.status = status;
        else
            System.out.println("The status is not correct");
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
}
