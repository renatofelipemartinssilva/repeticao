package com.mycompany.mavenproject13;

import java.util.Scanner;

public class Mavenproject13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        int x = sc.nextInt();
        System.out.print("Informe o segundo número: ");
        int y = sc.nextInt();
        
        if (x > y) {
            int z = x;
            x = y;
            y = z;
        }
        
        System.out.println("Números ímpares entre " + x + " e " + y + ":");
        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
