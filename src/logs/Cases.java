package logs;

import java.util.Scanner;

public class Cases implements IArray {
    Scanner scanner = new Scanner(System.in);
    int selection;

    public void signIn() {
        Vault vault = new Vault();
        System.out.print("\nEnter username: ");
        usernameCheck.set(0, scanner.next());
        if (username.contains(usernameCheck.get(0))) {
            System.out.print("Enter password: ");
            passwordCheck.set(0, scanner.next());
            if (password.contains(passwordCheck.get(0))) {
                System.out.println("\nSuccessfully logged in.");

                label:
                while (true) {
                    System.out.println("\nSelect action\n1 - Deposit\n2 - Withdraw\n3 - Check your account\n0 - Quit account");
                    selection = scanner.nextInt();
                    switch (selection) {
                        case 1 -> vault.moneyAdd();
                        case 2 -> vault.moneySub();
                        case 3 -> vault.checkMoney();
                        case 0 -> {
                            break label;
                        }
                        default -> System.out.println("\nUndefined action.");
                    }
                }
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("Wrong username");
        }

    }

    public void signUp() {
        while (true) {
            username.add("A");
            usernameCheck.add("A");
            System.out.print("\nSelect username: ");
            usernameCheck.set(0, scanner.next());
            if (!username.contains(usernameCheck.get(0))) {
                username.add(usernameCheck.get(0));
                break;
            } else {
                System.out.println("\nUsername exist. Choose another one.");
            }
        }
        password.add("A");
        passwordCheck.add("A");
        System.out.print("Select password: ");
        password.add(scanner.next());
        System.out.println("\nSuccessfully sign up.");
    }
}