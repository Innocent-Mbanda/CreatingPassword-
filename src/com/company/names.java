package com.company;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class names {

    public static void main(String[]args){
        System.out.println("what is your name?");
        Scanner scanner=new Scanner(System.in);
        String name = scanner.nextLine();
        switch (name){
            case "Caleb":
                System.out.println("welcome ");
                break;

            case  "Mbanda":
                System.out.println(" go away!");
                break;
            default:
                System.out.println("try it agin later!");

        }



    }

}
