package se.timmi;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*

        Game plan

        Welcome text
        User input ( if else )

        A converter method
        Hold the currency math ( Sek can be the default )
        Pretty up formation

        Handle invalid input.
         */
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
                Converter(userInputAmount , 1);
                break;
            case "2":
                Converter(userInputAmount , 2);
                break;

            case "3":
                Converter(userInputAmount , 3);
                break;

            case "4":
                Converter(userInputAmount , 4);
                break;

            case "0":
                break;
        }
    }

    public static void  Converter(String amount , int math){

        System.out.println(amount + " " + math);

    }

}