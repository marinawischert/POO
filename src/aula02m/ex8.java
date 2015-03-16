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
public class ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int num;
        int random = (int) (Math.random() * (100 - 0) + 0); //Numero random de 0 a 100
        //System.out.println(random);
        do{ 
            cont++;
            System.out.println("Tentativa número " + cont + ":");
            num = sc.nextInt();
            if (num == random) {
                System.out.println("Advinhou o número em " + cont + " jogadas!");
                System.out.println("Quer jogar novamente? (Sim/Não)");
                String resposta = sc.next().toLowerCase();
                if (resposta.equals("sim")) {
                    main(args);
                } else if (resposta.equals("nao")) {
                    System.exit(1);
                }
            } else if (num > random) {
                System.out.println("O número que inseriu é maior");
            } else if (num < random) {
                System.out.println("O número que inseriu é menor");
            }

        } while (num != random);
    }
}
