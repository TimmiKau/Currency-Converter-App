package se.timmi;

public class Converter {

    public double Converter(String amount , double math, boolean multiply){

        try {

            double amountValue = Double.parseDouble(amount );
            amountValue = Math.abs (amountValue);
            double result = 0;


            if ( multiply ) {

                result = amountValue * math;


            } else {
                result = amountValue / math;
            }

            return result;

        } catch (NumberFormatException e) {
            System.out.println("Invalid Number. Please try again");
            return 0; // Error
        }

    }
}
