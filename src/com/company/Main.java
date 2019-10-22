package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number:");

        int num1 = keyboard.nextInt();
        int product = 1;

        for(int i = num1; i > 0; i--){
            product = i * product;
        }
        System.out.println("Factorial of " + num1 + " is " + product );
    }
}
