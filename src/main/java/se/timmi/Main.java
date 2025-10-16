package se.timmi;

import java.sql.PreparedStatement;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*

        Game plan



        A converter method
        Hold the currency math ( Sek can be the default )
        Pretty up formation

        Handle invalid input.
        add the date and time
         */


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
            double result = 0;

            if ( multiply == true ) {

                result = amountValue * math;
                System.out.printf("Result: %.2f" , result);

            } else {
                result = amountValue / math;
                System.out.printf("Result: %.2f" , result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number. Please try again");
        }
    }

}