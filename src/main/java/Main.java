import bank.entity.*;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank(134L,"сбеp");

        BankOffice office = new BankOffice(666L, "Lond", "Moscow","Работает",true,
                2,true,true,true, 400, 100,bank);

        Employee employee = new Employee(126L, "Tatiana Ospichcava", "12.03.2024", "Кассир", true,
                                       true,1000, bank, office);

        BankAtm atm = new BankAtm(8745L, "r2d2", office,"Нет денег","где-то",employee,
                  true,true,1000, 100);

        User user = new User(1236L, "Alex", "15.2.2000", "Рынок");

        PaymentAccount paymentAccount = new PaymentAccount(4563L, user, bank, 10);


        bank.printBank();

        office.printBankOffice();

        employee.printEmployee();
        atm.printBankAtm();
        user.printUser();
        paymentAccount.printPaymentAccount();


    }
}
