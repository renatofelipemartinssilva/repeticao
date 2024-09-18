package com.mycompany.mavenproject12;

import java.util.Scanner;

public class Mavenproject12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor inicial: ");
        int x = sc.nextInt();
        System.out.print("Informe o valor final: ");
        int y = sc.nextInt();
        
        int z = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                z += i;
            }
        }
        
        System.out.println("A soma dos números ímpares no intervalo é: " + z);
        sc.close();
    }
}
    
