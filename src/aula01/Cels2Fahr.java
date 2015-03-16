/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class Cels2Fahr {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cels;
        double fahr;
        System.out.println("Insira a temperatura em graus Celsius: ");
        cels = sc.nextInt();

        fahr = cels * 1.8 + 32;
        System.out.println("Celsius: " + cels + " = Fahr: " + fahr);
        sc.close();
    }
}
