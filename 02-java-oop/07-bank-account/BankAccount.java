import java.util.Random;


public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingBalance;
    private static int totalAccounts = 0;
    private static double totalBalance = 0.00;


    public BankAccount(){
        this.accountNumber = this.randomAccountNumber();
        this.checkingBalance= 0;
        this.savingBalance=0;
        totalAccounts ++;
    }
    //get balance
    public double getCheckingBalance(){
        System.out.println(String.format("Checking Balance: %0.2f", this.checkingBalance));
        return checkingBalance;
    }
    //get savings
    public double getSavingBalance(){
        System.out.println(String.format("Savings Balance: %.2f", this.savingBalance));
        return savingBalance;
    }
    //account number
    public String accountNumber(){
        return accountNumber;
    }
    //add to checking
    public void depositChecking(double deposit){
        this.checkingBalance += deposit;
        
    }
    //add to savings
    public void depositSaving(double deposit){
        this.savingBalance += deposit;
        
    }
    //substract checking
    public void withdrawChecking(double withdraw){
        if (this.checkingBalance >= withdraw){
            this.checkingBalance -= withdraw;
        }
        else{//insufficient funds
            System.out.println("Insufficient funds");
        }
    }// withdraw from savings 
    public void withdrawSaving(double withdraw){
        if(this.savingBalance >= withdraw){
            this.savingBalance -= withdraw;
        }
        else {
            System.out.println("Insufficient funds");
        }
    }//use double for balances 
    //total balance
    public double totalBalance(){
        double total = this.checkingBalance + this.savingBalance;
        return total;
    }//number of accounts to person
    public int totalAccounts(){
        int person = this.totalAccounts();
        return person;
    }
//random number use random number from basic
    public String randomAccountNumber(){
        Random account = new Random();
        for (int i = 0; i<10; i++){
            accountNumber = accountNumber.concat(String.valueOf(account.nextInt(10)));
        }
        return accountNumber;

    }
}