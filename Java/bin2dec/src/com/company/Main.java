package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String txtBinary = "0";
        int numDecimal = 0;
        boolean isBinary = false;
        int c;

        do {
            c = 0;
            System.out.println("Write the binary code");
            Scanner read = new Scanner(System.in);
            txtBinary = read.next();

            for (int i = 0; i < txtBinary.length(); i++) {
                if (txtBinary.charAt(i) != '1' && txtBinary.charAt(i) != '0') {
                    c++;
                }
            }
            if (c > 0) {
                System.out.println("Error: please use a binary format");
                isBinary = false;
            } else if (c < 1){
                isBinary = true;
            }
        } while (isBinary == false);

            if (isBinary == true){
                for (int i = txtBinary.length()-1; i >= 0; i--){
                    numDecimal += Character.getNumericValue(txtBinary.charAt(i)) * Math.pow(2, txtBinary.length() - 1 - i);
                }
                System.out.print("The decimal version of ");
                System.out.print(txtBinary);
                System.out.print(" is ");
                System.out.print(numDecimal);
            }



    }
}
