package BankMangementSystem;

public class BankAccount implements AtmOperation {
    private String name;
    private int pin;
    private long accountNumber;
    private double balance;

    public BankAccount(String name,int pin,long accountNumber,double balance){
        this.name = name;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    @Override
    public double checkBalance() {
        return getBalance();
    }
    @Override
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
        }else {
            System.out.println("Invalid amount");
        }
    }
    @Override
    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
        }else {
            System.out.println("Invalid amount");
        }
    }
    @Override
    public boolean checkPin(int enteredPin){
        if (enteredPin==pin){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public void changePin(int oldPin,int newPin){
        if (oldPin==pin) {
            if (newPin >= 1000 && newPin <= 9999) {
                pin = newPin;
                System.out.println("PIN changed successfully");
            } else {
                System.out.println("Pin must be 4 digit");
            }
        }else {
            System.out.println("Please enter valid pin");
        }
    }

}
