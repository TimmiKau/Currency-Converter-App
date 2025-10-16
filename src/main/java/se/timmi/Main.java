package se.timmi;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double sekToUsd = 0.10524;
        double sekToEuro = 0.09061;
        boolean runLoop = true;
        double result = 0.0;
        String fromCurrency="";
        String toCurrency="";

        while (runLoop) {
            //Welcome text
            System.out.println(" ");
            System.out.println("Currency Converter App");
            System.out.println("1. Convert SEK to USD");
            System.out.println("2. Convert SEK to Euro");
            System.out.println("3. Convert USD to SEK");
            System.out.println("4. Convert Euro to SEK");
            System.out.println("0. Exit");
            System.out.println("Enter Your Choice:");

            Scanner scanner = new Scanner(System.in);
            String userInputChoice = scanner.nextLine();

            if (userInputChoice.equals("0")) {
                runLoop = false;
                continue;
            }

            System.out.println("Enter Amount to Convert:");
            String userInputAmount = scanner.nextLine();

            Converter converter = new Converter();



            switch (userInputChoice) {
                case "1":
                    result = converter.Converter(userInputAmount, sekToUsd, true);
                    fromCurrency = "SEK";
                    toCurrency = "USD";
                    break;
                case "2":
                    result =converter.Converter(userInputAmount, sekToEuro, true);
                    fromCurrency = "SEK";
                    toCurrency = "EURO";
                    break;
                case "3":
                    result =converter.Converter(userInputAmount, sekToUsd, false);
                    fromCurrency = "USD";
                    toCurrency = "SEK";
                    break;
                case "4":
                    result =converter.Converter(userInputAmount, sekToEuro, false);
                    fromCurrency = "EURO";
                    toCurrency = "SEK";
                    break;
                default:
                    System.out.println("Incorrect Currency - Try again");
                    break;
            }

            if ( result!= 0) {
                NumberFormat numberFormat = new DecimalFormat("0.00");

                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                String formattedDate = now.format(formatter);

                System.out.println(
                        fromCurrency + " " + userInputAmount + " to "
                        + toCurrency + " " + numberFormat.format(result) +
                        " (Created " +  formattedDate + ")");
            }
        }
    }
}