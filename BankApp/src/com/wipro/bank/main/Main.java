package com.wipro.bank.main;

import java.util.Scanner;
import com.wipro.bank.service.Bankservice;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tenure (5 or 10): ");
        int tenure = sc.nextInt();
        System.out.print("Enter principal: ");
        float principal = sc.nextFloat(); 
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender (male/female): ");
        String gender = sc.next();
        Bankservice bank = new Bankservice();
        bank.calculate(principal, tenure, age, gender);

        sc.close();
    }
}
