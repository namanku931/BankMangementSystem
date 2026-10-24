package BankMangementSystem;

interface AtmOperation {
   double checkBalance();
   void deposit(double amount);
   void withdraw(double amount);
   boolean checkPin(int enteredPin);
   void changePin(int oldPin,int newPin);

}
