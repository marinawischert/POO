/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02m;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ex6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         List<Integer> list = new ArrayList<>();
        int max = 0;
        int min = Integer.MAX_VALUE;
        double med = 0;
        while (true) {

            System.out.println("Valor a ler? ");
            int aux = sc.nextInt();
            if (list.isEmpty()) {
                list.add(aux);
                max = aux;
                min = max;
            } else if (aux == list.get(0)) {
                System.out.println("Valor máximo: " + max);
                System.out.println("Valor minimo: " + min);
                for (int c : list) {
                    med += c;
                }
                med = med / list.size();
                System.out.println("Média: " + med);
                break;
            } else {
                list.add(aux);
                if (aux > max) {
                    max = aux;
                } else if (aux < min) {
                    min = aux;
                }

            }
        }
    }
}
