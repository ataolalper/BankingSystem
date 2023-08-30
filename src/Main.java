import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] userName = {};
        String[] userNameCheck;
        String[] passWord = {};
        String[] passWordCheck;
        double money = 0, amount, lastMoney;
        int selection;

        while (true) {
            System.out.println("\n1 - Log In\n2 - Sign Up\n0 - Exit");
            System.out.print("Please select: ");
            selection = input.nextInt();

            if (selection == 1) {
                while (true) {
                    System.out.print("\nUsername: ");
                    userNameCheck = new String[]{input.next()};

                    if (Arrays.equals(userNameCheck, userName)) {
                        System.out.print("\nPassword: ");
                        passWordCheck = new String[]{input.next()};

                        if (Arrays.equals(passWordCheck, passWord)) {
                            System.out.println("\nSuccessfully log in.");

                            while (true) {
                                System.out.println("\n1 - Withdraw\n2 - Deposit\n3 - Show account\n0 - Quit account");
                                System.out.print("Please select: ");
                                selection = input.nextInt();

                                if (selection == 1) {
                                    System.out.print("Enter the amount: ");
                                    amount = input.nextDouble();
                                    lastMoney = money + amount;
                                    money = lastMoney;
                                } else if (selection == 2) {
                                    System.out.print("Enter the amount: ");
                                    amount = input.nextDouble();
                                    lastMoney = money - amount;
                                    money = lastMoney;
                                } else if (selection == 3) {
                                    System.out.println("You have $" + money);
                                } else if (selection == 0) {
                                    break;
                                } else {
                                    System.out.println("Undefined action.");
                                }
                            }
                            break;
                        } else {
                            System.out.println("\nWrong password.");
                        }
                    } else if (Arrays.equals(userNameCheck, new String[]{"exit"})) {
                        System.out.println("Returning main menu...");
                        break;
                    } else {
                        System.out.println("\nWrong username.");
                    }
                }
            } else if (selection == 2) {
                System.out.print("Select username: ");
                userName = new String[]{input.next()};
                System.out.print("Select password: ");
                passWord = new String[]{input.next()};
                System.out.println("Successfully registered.");
            } else if (selection == 0) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Undefined action.");
            }
        }
    }
}