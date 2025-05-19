//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000,500);
        account1.displayInfo();
        account2.displayInfo();
        account1.deposit(600,BankAccount.DepositType.CHECKING);
        account1.deposit(200,BankAccount.DepositType.SAVINGS);
        account1.displayInfo();
        account2.deposit(100,BankAccount.DepositType.SAVINGS);
        account2.withdraw(400,BankAccount.DepositType.CHECKING);
        account2.displayInfo();
    }
}