package se.timmi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double sekToUsd = 0.10524;
        double sekToEuro = 0.09061;

        //Welcome text
        System.out.println("Currency Converter App");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert SEK to Euro");
        System.out.println("3. Convert USD to SEK");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("0. Exit");
        System.out.println("Enter Your Choice:");

        Scanner scanner = new Scanner(System.in);
        String userInputChoice = scanner.nextLine();

        System.out.println("Enter Amount to Convert:");
        String userInputAmount = scanner.nextLine();



        switch (userInputChoice) {
            case "1":
                Converter(userInputAmount , sekToUsd , true);
                break;
            case "2":
                Converter(userInputAmount , sekToEuro  ,  true);
                break;
            case "3":
                Converter(userInputAmount , sekToUsd , false);
                break;
            case "4":
                Converter(userInputAmount , sekToEuro , false);
                break;
            case "0":
                break;
        }
    }

    public static void  Converter(String amount , double math, boolean multiply){

        try {

            double amountValue = Double.parseDouble(amount );
            amountValue = Math.abs (amountValue);
            double result = 0;
            LocalDateTime now = LocalDateTime.now();


            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDate = now.format(formatter);

            if ( multiply ) {

                result = amountValue * math;
                System.out.printf("Result: %.2f (Form %s)%n" , result , formattedDate);

            } else {
                result = amountValue / math;
                System.out.printf("Result: %.2f (Form %s)%n" , result , formattedDate);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number. Please try again");
        }
    }

}