package com.company;

import java.util.Scanner;

public class guessPassword {
    public static void main(String[] args) {
        String password = "let me in";
        System.out.println("guess a password");

        Scanner scanner=new Scanner(System.in);
        String guess = scanner.nextLine();
        System.out.println(password.equals(guess));

        if((password.equals(guess)))
        {
            System.out.println("your password is correct");
        } else{
            System.out.println("your password is incrrect");
        }



    }


}
