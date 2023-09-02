import logs.Cases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cases cases = new Cases();

        int select;

        label:
        while (true) {
            System.out.println("\nWelcome to the banking system.\n1 - Sign In\n2 - Sign Up\n0 - Exit");
            System.out.print("Select: ");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    cases.signIn();
                    break;
                case 2:
                    cases.signUp();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break label;
                default:
                    System.out.println("Undefined action.");
            }
        }
    }
}