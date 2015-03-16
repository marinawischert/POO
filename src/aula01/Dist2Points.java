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
public class Dist2Points {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int p1x, p2x, p1y, p2y;
        double dist;
        System.out.println("Valor para o p1.x: ");
        p1x = sc.nextInt();
        System.out.println("Valor para o p1.y: ");
        p1y = sc.nextInt();
        System.out.println("Valor para o p2.x: ");
        p2x = sc.nextInt();
        System.out.println("Valor para o p2.y: ");
        p2y = sc.nextInt();

        Ponto a = new Ponto(p1x, p1y);
        Ponto b = new Ponto(p2x, p2y);

        dist = Math.sqrt((p2x - p1x) ^ 2 + (p2y - p1y) ^ 2);

        System.out.println("A distancia entre os 2 pontos é: " + dist);

        System.out.println("Estruturado \n");

        double dist1 = Math.sqrt((b.getX() - a.getX()) ^ 2 + (b.getY() - b.getX()) ^ 2);
    }
}
