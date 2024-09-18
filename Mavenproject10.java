package com.mycompany.mavenproject10;

import java.util.Scanner;

public class Mavenproject10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número para ver a tabuada: ");
        int x = sc.nextInt();
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
        sc.close();
    }
}
    

