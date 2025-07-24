package com.management;

import java.util.Scanner;

public class issuedbook extends components {
    public void issue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        bookName = scanner.nextLine();
        System.out.print("Issued On(dd-MM-yyyy): ");
        issuedOn = scanner.nextLine();
    }

}
