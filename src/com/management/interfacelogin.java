package com.management;

import java.util.Scanner;

public class interfacelogin  extends components{
    public void welcome(){
        System.out.println("Welcome to library Management System");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        studentID = scanner.nextLine();

    }
}
