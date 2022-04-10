package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String txtBinary = "0";
        int numDecimal = 0;
        boolean isBinary = false;

        while (isBinary != true){
            System.out.println("Write the binary code");
            Scanner read = new Scanner(System.in);
            txtBinary = read.nextLine();

            for (int i = txtBinary.length()-1; i >= 0; i--){
                if (txtBinary.charAt(i) == '1' || txtBinary.charAt(i) == '0'){
                    isBinary = true;
                }
            }
            if (isBinary == false) {
                System.out.println("Error: please use a binary format");
            }
        }

        for (int i = txtBinary.length()-1; i >= 0; i--){
                numDecimal += Character.getNumericValue(txtBinary.charAt(i)) * Math.pow(2, txtBinary.length() - 1 - i);
        }

        System.out.print("The decimal version of ");
        System.out.print(txtBinary);
        System.out.print(" is ");
        System.out.print(numDecimal);
    }
}
