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
public class ex9 {

    //nao escrevas pera
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        double turma[][];

        System.out.println("Tamanho da turma: ");
        size = sc.nextInt();

        turma = new double[size][3];

        double notaT, notaP;
        for (int i = 0; i < size; i++) {
            do {
                System.out.println("Aluno nº " + i);
                System.out.println("Nota prática: ");
                notaP = sc.nextDouble();

                System.out.println("Nota teórica: ");
                notaT = sc.nextDouble();
            } while (notaP < 0 || notaP > 20 || notaT < 0 || notaP > 20);

            turma[i][0] = notaT;
            turma[i][1] = notaP;
            turma[i][2] = 0.4 * turma[i][0] + 0.6 * turma[i][1];
        }
        System.out.println("Nota T  NotaP  NotaF");
        for (int i = 0; i < size; i++) {
            System.out.printf("%.2f %.2f  %d\n", turma[i][0], turma[i][1], (int) (turma[i][2] + 0.5));

        }

    }
}
