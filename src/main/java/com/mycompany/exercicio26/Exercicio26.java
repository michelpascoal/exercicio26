package com.mycompany.exercicio26;

import java.util.Scanner;
import java.util.Arrays;

/*
 * Escreva um algoritmo que faça a leitura de 20 números inteiros quaisquer e
 * armazene em um vetor. Após a leitura mostre todos os números ordenados
 * crescentemente.
 */

public class Exercicio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

        // Leitura dos 20 números inteiros
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenação em ordem crescente
        Arrays.sort(numeros);

        // Exibição dos números ordenados
        System.out.println("\nNúmeros em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}