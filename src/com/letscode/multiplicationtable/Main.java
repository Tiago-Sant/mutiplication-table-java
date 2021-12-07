package com.letscode.multiplicationtable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int number =sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d %n", number, i, (number * i));
        }
    }
}
