package com.company;


import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;

        do {
            System.out.println("Enter the name:");
            name = scanner.nextLine();
        }

        while (name.isEmpty());


    }
}