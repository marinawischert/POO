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
public class velzMedia {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double v1media, v2media, vfmedia;
        System.out.println("Velocidade média da 1º etapa? ");
        v1media = sc.nextDouble();

        System.out.println("Velocidade média da 2º etapa? ");
        v2media = sc.nextDouble();

        vfmedia = 2/(1/v1media + 1/v2media);

        System.out.println("A velocidade média final é " + vfmedia);
    }
}
