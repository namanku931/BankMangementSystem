package BankMangementSystem;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //BankAccount bank = new BankAccount("Naman",1234,8756297965L,5000.00);
        AtmOperation ba = new BankAccount("Naman",1234,8756297965L,5000.00);
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean pinVerified = false;
        int attemt = 0;
    do {
        System.out.println("enter pin");
        int enteredPin = sc.nextInt();

        if (ba.checkPin(enteredPin)){
            pinVerified = true;
            System.out.println("pin coorect");
            break;
        }else {
            attemt++;
            System.out.println("please enter valid pin");
        }
    }while (attemt<3);

if (pinVerified) {
    do {
        System.out.println("1. checkbalance");
        System.out.println("2. deposit");
        System.out.println("3.withdraw");
        System.out.println("4.changepin");
        System.out.println("5.exit");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(ba.checkBalance());
                break;
            case 2:
                System.out.println("deposit your amount");
                double deposit = sc.nextDouble();
                ba.deposit(deposit);
                break;
            case 3:
                System.out.println("withdraw your amount");
                double withdraw = sc.nextDouble();
                ba.withdraw(withdraw);
                break;
            case 4:
                System.out.println("enter old pin");
                int oldPin = sc.nextInt();
                System.out.println("enter new pin");
                int newPin = sc.nextInt();
                ba.changePin(oldPin, newPin);
                break;
            case 5:
                System.out.println("Thank you for using ATM");
                break;
            default:
                System.out.println("Invalid input");

        }
    } while (choice != 5);
}else {
    System.out.println("enter correct pin" );
}
    }
}
