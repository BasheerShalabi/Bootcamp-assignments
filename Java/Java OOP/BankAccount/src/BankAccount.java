public class BankAccount {
    // MEMBER VARIABLES
    private int accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts=0;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    public static enum DepositType {
        SAVINGS("savings"),
        CHECKING("checking");
        public final String val;
        private DepositType(String val) {
            this.val = val;
        }
    }

    private int generateAccountNumber(){
        return (int)(Math.random()*999999999);
    }
    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(double checkingBalance){
        this.accountNumber = generateAccountNumber();
        this.checkingBalance = checkingBalance;
        this.savingsBalance = 0;
        accounts++;
        totalMoney += checkingBalance;
    }
    public BankAccount(double checkingBalance,double savingsBalance){
        this.accountNumber = generateAccountNumber();
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts++;
        totalMoney += checkingBalance+savingsBalance;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }
    public double getTotalMoney(){
        return savingsBalance+checkingBalance;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    // withdraw
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account

    public void deposit(double amount,DepositType type){
        if(type.val.equals("checking")){
            checkingBalance+=amount;
        }
        else if(type.val.equals("savings")){
            savingsBalance+=amount;
        }
        totalMoney+=amount;
    }

    public void withdraw(double amount,DepositType type){
        if(type.val.equals("checking")){
            if(checkingBalance-amount>=0){
                checkingBalance-=amount;
            }
        }
        else if(type.val.equals("savings")){
            if(savingsBalance-amount>=0){}
        }
        totalMoney-=amount;
    }

    public void displayInfo(){
        System.out.println("Account number: "+accountNumber);
        System.out.println("Checking balance: "+checkingBalance);
        System.out.println("Savings balance: "+savingsBalance);
    }
}
