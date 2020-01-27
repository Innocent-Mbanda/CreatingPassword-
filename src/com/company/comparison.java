package com.company;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        System.out.println(" what is your name?");
        Scanner scanner = new Scanner(System.in);
       String guess = scanner.nextLine();
        System.out.println("how much do you have?");
        String money  = scanner.nextLine();
        System.out.println("dogs or cats?");
        String animals= scanner.nextLine();

        System.out.println("how old are you?");
        int age= scanner.nextInt();

        if (age >12 && !animals.equals("dogs")){

            System.out.println("Welcome");
        }





    }
}

