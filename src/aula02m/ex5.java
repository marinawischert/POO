/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Escreva um programa que leia do teclado um número inteiro positivo e determine se o
número introduzido é um número primo. Um número natural é um número primo quando
tem exatamente dois divisores naturais distintos: o número 1 e ele mesmo. Repare que
deve validar o valor de entrada repetindo a leitura se o valor não for válido (positivo).
 */
package aula02m;

import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        do {
            System.out.println("Insira um número: ");
            num = sc.nextInt();

        } while (num < 0);

        if (num == 2 || num == 1) {
            System.out.println("Número é primo");
            System.exit(1);
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                System.out.println("Não é primo!");
                System.exit(1);
            } 
            
        }
        System.out.println("É primo !");
    }

}

