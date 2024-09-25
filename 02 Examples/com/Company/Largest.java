package com.Company;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
//        double n1 = 4.5, n2 = 8.4, n3 = 2.4;

        Scanner input =  new Scanner(System.in);

        System.out.println("Enter first number: ");
        double n1 = input.nextDouble();

        System.out.println("Enter second number: ");
        double n2 = input.nextDouble();

        System.out.println("Enter third number: ");
        double n3 = input.nextDouble();

        if (n1>=n2 && n1>n3){
            System.out.println(n1 + " is the Largest number");
        }
        else if (n2 >= n1 && n2 >= n3){
            System.out.println(n2 + " is the Largest number");
        }

        else{
            System.out.println(n3 + " is the largest number");
        }
    }
}
