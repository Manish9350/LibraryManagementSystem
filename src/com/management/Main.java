package com.management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        interfacelogin interfacelogin = new interfacelogin();
        interfacelogin.welcome();
        System.out.print("1. Issue Book       2. Return Book      9. Login       0.  Quit");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int a=scanner.nextInt();
            if (a == 1) {
                issuedbook issuedbook = new issuedbook();
                issuedbook.issue();
                System.out.print("1. Issue Book       2. Return Book     9.  Login     0. Quit");

            } else if (a == 2) {
                returnedat returnedat = new returnedat();
                returnedat.returned();
                System.out.print("1. Issue Book       2. Return Book     9.  Login       0. Quit");
                }
                else if(a==9){
                interfacelogin.welcome();
                System.out.print("1. Issue Book       2. Return Book     9.  Login      0. Quit");
                }
                else if(a==0){
                    break;
            }

            else {
                System.out.println("Invalid Input!!");
                System.out.print("1. Issue Book       2. Return Book     9. Login       0. Quit");
            }
        }
    }
}