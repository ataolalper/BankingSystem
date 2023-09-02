package logs;

import java.util.Scanner;

public class Vault extends Cases {
    double initialMoney, lastMoney;
    int indexNumber;
    Scanner scanner = new Scanner(System.in);

    public void moneyAdd() {
        vault.add(0.0);
        vault.add(0.0);
        indexNumber = username.indexOf(usernameCheck.get(0));
        initialMoney = Double.parseDouble(String.valueOf(vault.get(indexNumber)));
        System.out.print("\nAmount: ");
        lastMoney = initialMoney + scanner.nextDouble();
        initialMoney = lastMoney;
        vault.set(indexNumber, initialMoney);
        System.out.println("\nYou have $" + initialMoney);
    }

    public void moneySub() {
        indexNumber = username.indexOf(usernameCheck.get(0));
        initialMoney = Double.parseDouble(String.valueOf(vault.get(indexNumber)));
        System.out.print("\nAmount: ");
        lastMoney = initialMoney - scanner.nextDouble();
        initialMoney = lastMoney;
        vault.set(indexNumber, initialMoney);
        System.out.println("\nYou have $" + initialMoney);
    }

    public void checkMoney() {
        System.out.println("\nYou have $" + initialMoney);
    }
}
