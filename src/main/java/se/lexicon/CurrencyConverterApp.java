package se.lexicon;

import java.util.Scanner;
public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();
        boolean exit = false;

        while (!exit) {
            System.out.println("Currency Converter Menu:");
            System.out.println("1. Convert SEK to USD");
            System.out.println("2. Convert USD to SEK");
            System.out.println("3. Convert SEK to Euro");
            System.out.println("4. Convert Euro to SEK");
            System.out.println("5. Convert USD to Euro");
            System.out.println("6. Convert Euro to USD");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount in SEK: ");
                    double sekToUsd = scanner.nextDouble();
                    System.out.println("Converted amount: " + converter.convertSEKtoUSD(sekToUsd) + " USD");
                    System.out.println("Date and Time: " + converter.getCurrentDateTime());
                    break;
                case 2:
                    System.out.print("Enter amount in USD: ");
                    double usdToSek = scanner.nextDouble();
                    System.out.println("Converted amount: " + converter.convertUSDtoSEK(usdToSek) + " SEK");
                    System.out.println("Date and Time: " + converter.getCurrentDateTime());
                    break;
                case 3:
                    System.out.print("Enter amount in SEK: ");
                    double sekToEuro = scanner.nextDouble();
                    System.out.println("Converted amount: " + converter.convertSEKtoEuro(sekToEuro) + " Euro");
                    System.out.println("Date and Time: " + converter.getCurrentDateTime());
                    break;
                case 4:
                    System.out.print("Enter amount in Euro: ");
                    double euroToSek = scanner.nextDouble();
                    System.out.println("Converted amount: " + converter.convertEuroToSEK(euroToSek) + " SEK");
                    System.out.println("Date and Time: " + converter.getCurrentDateTime());
                    break;
                case 5:
                    System.out.print("Enter amount in USD: ");
                    double usdToEuro = scanner.nextDouble();
                    System.out.println("Converted amount: " + converter.convertUSDtoEuro(usdToEuro) + " Euro");
                    System.out.println("Date and Time: " + converter.getCurrentDateTime());
                    break;
                case 6:
                    System.out.print("Enter amount in Euro: ");
                    double euroToUsd = scanner.nextDouble();
                    System.out.println("Converted amount: " + converter.convertEuroToUSD(euroToUsd) + " USD");
                    System.out.println("Date and Time: " + converter.getCurrentDateTime());
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}




