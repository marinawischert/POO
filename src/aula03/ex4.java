/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import aula02.Data;
import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes;
        int ano = 0;

        System.out.println("Mês: ");
        mes = sc.nextInt();

        System.out.println("Ano: ");
        ano = sc.nextInt();

        Data d = new Data(mes, ano);

        int inicio = day(mes, 1, ano);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < inicio; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= d.diasDoMes(); i++) {
            System.out.printf("%2d ", i);
            if (((i + inicio) % 7 == 0) || (i == d.diasDoMes())) {
                System.out.println();
            }
        }

    }

    public static int day(int mes, int dia, int ano) {
        int y = ano - (14 - mes) / 12;
        int x = y + y / 4 - ano / 100 + ano / 400;
        int m = mes + 12 * ((14 - mes) / 12) - 2;
        int d = (dia + x + (31 * mes) / 12) % 7;
        return d;
    }

}
