import bank.entity.*;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(134L,"сбеp");
        BankOffice office = new BankOffice(666L, "Lond", "Moscow","Работает",true,
                2,true,true,true, 400, 100,bank);
        BankAtm atm = new BankAtm(8745L, "r2d2", bank, office,"Нет денег","где-то",null, true,true,1000, 100);
        bank.printBank();
        office.printBankOffice();
        atm.printBankAtm();
    }
}
