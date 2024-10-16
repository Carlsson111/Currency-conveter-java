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

    private static void Sek_to_other(double amt) {
        System.out.println("1 Sek = " + 0.1 + " Dollar");
        System.out.println();

        System.out.println(amt+" Sek = " + (amt*0.1) + " Dollar");
        System.out.println();

        System.out.println("1 Sek = " + 0.09 + " Euro");
        System.out.println();
        System.out.println(amt+" Sek = " + (amt*0.09) + " Euro");
        System.out.println();

    }


    public static void Dollar_to_other(double amt) {
        System.out.println("1 Dollar = " + 9.96 + " Sek");
        System.out.println();
        System.out.println(amt+" Dollar = " + (amt*9.96) + " Sek");
        System.out.println();

        System.out.println("1 Dollar= " + 0.91 + " Euro");
        System.out.println();

        System.out.println(amt+" Dollar = " + (amt*0.91) + " Euro");
    }

    public static void Euro_to_other(double amt){
        System.out.println("1 Euro = " + 10.98 + " Sek");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*10.98) + " Sek");
        System.out.println();

        System.out.println("1 Euro = " + 1.1+ " Dollar");
        System.out.println();

        System.out.println(amt+" Euro = " + (amt*1.1)+ " Dollar");
    }
}




