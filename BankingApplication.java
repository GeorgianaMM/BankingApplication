import java.util.Scanner;

public class BankingApplication {

    public static void main(String args[]){
        BankAccount person1 = new BankAccount("G","G0001");
        person1.showMenu();
    }

}

class BankAccount{

    int money;
    int previousTransaction;
    String customerName;
    String customerID;

    BankAccount(String cName, String cID) {
        customerName = cName;
        customerID = cID;
    }

    void deposit(int amount){

        if(amount > 0 ){
            money += amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){

        if(amount > 0 ){
            money -= amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        
        if(previousTransaction > 0) System.out.println("The amount deposited during the previous transaction is: " + previousTransaction);
        else if(previousTransaction < 0) System.out.println("The amount withdrawn during the previous transaction is: " + Math.abs(previousTransaction));
        else System.out.println("There is no previous transaction.");
    }

    void showMenu(){

        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome " + customerName);
        System.out.println("Your ID is: " + customerID + "\n");
        System.out.println("Available options:");
        System.out.println("A. Check balance.");
        System.out.println("B. Deposit money.");
        System.out.println("C. Withdaw money.");
        System.out.println("D. Check previous transaction.");
        System.out.println("E. Exit.");

        do { 
            System.out.println("\nEnter your option here: ");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':

                    System.out.println("You chose A. Check balance.");
                    System.out.println("Your balance is: " + money);
                    break;

                case 'B':

                    System.out.println("You chose B. Deposit money.");
                    System.out.println("Enter the amount you want to deposit: ");
                    int moneyDeposited = scanner.nextInt();
                    deposit(moneyDeposited);
                    break;

                case 'C':

                    System.out.println("You chose C. Withdaw money.");
                    System.out.println("Enter the amount you want to withdraw: ");
                    int moneyWithdrawn = scanner.nextInt();
                    withdraw(moneyWithdrawn);
                    break;

                case 'D':

                    System.out.println("You chose D. Check previous transaction.");
                    getPreviousTransaction();
                    break;

                case 'E':

                    System.out.println("You chose E. Exit.");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }

        } while (option != 'E');

        System.out.println("Thank you for using our services!");
    }
}