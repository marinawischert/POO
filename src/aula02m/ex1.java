/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02m;

import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaP, notaT;
        int notaFinal;
        do {
            System.out.println("Insira a nota da componente teórica: ");
            notaT = sc.nextDouble();

            System.out.println("Insira a nota da componente prática: ");
            notaP = sc.nextDouble();

        } while (notaT < 0 || notaT > 20 || notaP < 0 || notaT > 20);
        notaFinal = (int) (0.4 * notaT + 0.6 * notaP);

        if (notaP < 7 || notaT < 7) {
            System.out.println("Reprovado por nota mínima!");
        } else {
            System.out.println("Nota final = " + notaFinal);
        }

    }
}
