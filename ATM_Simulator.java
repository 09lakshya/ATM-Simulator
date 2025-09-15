import java.util.Scanner;
class ATM_Simulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE ATM");
        double balance = 10000;
        int pin;
        do {
            System.out.print("Enter your pin: ");
            pin = sc.nextInt();
            if (pin != 1234) {
                System.out.println("INCORRECT PIN, PLEASE TRY AGAIN");
            }
        }while (pin != 1234);
            System.out.println("CORRECT PIN!");

        int choice;
        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Deposit successful. Balance is: " + balance);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double amount1 = sc.nextDouble();
                    if (amount1 <= balance) {
                        balance -= amount1;
                        System.out.println("Withdraw successful. Balance is: " + balance);
                    } else {
                        System.out.println("INSUFFICIENT BALANCE");
                    }
                    break;
                case 4:
                    System.out.print("Thank you for visiting");
                    break;
            }
        } while (choice != 4);
    }
}