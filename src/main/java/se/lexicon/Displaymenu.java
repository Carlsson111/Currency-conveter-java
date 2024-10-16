package se.lexicon;

import java.util.Scanner;
public class Displaymenu {
    public static void main(String[] args) {
        System.out.println("1 Sek");
        System.out.println("2 Euro" );
        System.out.println("3 Dollar");

        Scanner sc = new Scanner(System.in);
        System.out.println("Pick the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                Sek_to_other(amount);
                break;
            case 2:
                Euro_to_other(amount);
                break;
            case 3:
                Dollar_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");

    }
}
