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
public class Km2Miles {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double km, miles;
        System.out.println("Insira a distancia em kms: ");
        km = sc.nextDouble();

        miles = km / 1.609;

        System.out.println("A distancia em milhas é: " + miles);
        sc.close();
    }
}
