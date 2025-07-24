package com.management;

import java.util.Scanner;

public class returnedat extends components{
    public void returned(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        bookName = scanner.nextLine();
        System.out.print("Returned at(dd-MM-yyyy): ");
        returnAt = scanner.nextLine();
    }
}
