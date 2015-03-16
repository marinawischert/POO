/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int opt = 0;
        do {
            System.out.println("Bem vindo aos exercicios da aula 2, por favor escolha o exercicio que quer testar!");

            do {
                menu();
                System.out.println("Opção? ");
                opt = sc.nextInt();
            } while (opt < 0 || opt > 9);
            switch (opt) {
                case 1:
                    ex1();
                    break;
                case 2:
                    ex2();
                    break;
                case 3:
                    ex3();
                    break;
                case 4:
                    ex4();
                    break;
                case 5:
                    ex5();
                    break;
                case 6:
                    ex6();
                    break;
                case 7:
                    ex7();
                    break;
                case 8:
                    ex8();
                    break;
                case 9:
                    ex9();
                    break;
                case 0:
                    System.exit(1);
            }
        } while (opt != 0);
    }

    private static void ex1() {
        double notap;
        double notat;

        System.out.println("Nota da prática: ");
        notap = sc.nextDouble();
        System.out.println("Nota da Teórica: ");
        notat = sc.nextDouble();

        if (notap < 7 || notat < 7) {
            System.out.println("Reprovado por nota minima!!");
        } else {
            int notaf = (int) (0.4 * notat + 0.6 * notap);
            System.out.println("Nota final: " + notaf);
        }

    }

    private static void ex2() {
        System.out.println("Valor positivo? ");
        int valor = sc.nextInt();

        while (valor >= 0) {
            System.out.println(valor);
            valor--;
        }
    }

    private static void ex3() {

    }

    private static void ex4() {

        System.out.println("Valor a ler? ");
        byte b = sc.nextByte();
        String s = ("0000000" + Integer.toBinaryString(0xFF & b)).replaceAll(".*(.{8})$", "$1");
        System.out.println(s);
    }

    private static void ex5() {
        int val;
        do {
            System.out.println("Valor a validar?");
            val = sc.nextInt();
            if (val < 1) {
                System.out.println("Valor inválido, o valor tem de ser positivo");
            }
        } while (val < 1);

        System.out.println(isPrime(val));
    }

    private static void ex6() {
        List<Integer> list = new ArrayList<>();
        int max = 0, min = Integer.MAX_VALUE;
        double media = 0;
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
                    media += c;
                }
                media = media / list.size();
                System.out.println("Média: " + media);
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

    private static void ex7() {
        int ano;
        int mes;
        do {
            System.out.println("Ano? ");
            ano = sc.nextInt();
            Data.validAno(ano);
            System.out.println("Mes? ");
            mes = sc.nextInt();
            Data.validMes(mes);
            if (!Data.validAno(ano)) {
                System.out.println("Ano Inválido");
            }
            if (!Data.validMes(mes)) {
                System.out.println("Mes Inválido");
            }

        } while (!Data.validDate(ano, mes));
        Data d = new Data(mes, ano);
        System.out.println("O mes tem: " + d.diasDoMes());

    }

    private static void ex8() {
        int resultval = (int) (Math.random() * (100 - 0) + 0);
        System.out.println(resultval);
        int val = 0;
        int count = 0;
        do {
            System.out.println("Valor? ");
            val = sc.nextInt();
            count++;
            if (val == resultval) {
                System.out.println("Adivinhou, Parabéns :)");
                System.out.println("Usou: " + count + " tentativas");
                System.out.println("Deseja começar um novo jogo? (Y/N)");
                String s = sc.next();
                char c = s.toUpperCase().charAt(0);
                if (c == 'Y') {
                    main.ex8();
                } else if (c == 'N') {
                    break;
                } else {
                    System.out.println("Resposta errada");
                }
            } else if (val < resultval) {
                System.out.println("Demasiado Baixo");
            } else if (val > resultval) {
                System.out.println("Demasiado Alto");
            }
        } while (val != resultval);
    }

    private static void ex9() {
        System.out.println("Quantos alunos quer que a turma tenha? ");
        int size = sc.nextInt();
        double[][] turma = new double[size][size];
        /*for (double[] turma1 : turma) {
            //double aux = (double) (Math.random() * (20 - 0) + 0);
            //Arrays.fill(turma1, aux);
            System.out.println("Nota? ");
            double aux1 = sc.nextDouble();
        }
         */

        randArray(turma);

        for (double[] turma1 : turma) {
            for (double x : turma1) {
                System.out.printf("%.2f\n", x);
                
            }
        }
    }

    static boolean isPrime(int n) {
        //Ver se n é um multiplo de 2
        if (n % 2 == 0) {
            return false;
        }
        //Caso não seja, verificar se é multiplo dos números ímpares restantes
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void menu() {
        System.out.println("Qual a opção que quer?");
        System.out.println("1- Média do Aluno");
        System.out.println("2- Contagem Decrescente");
        System.out.println("3- Número de bits num byte");
        System.out.println("4- Byte para bit");
        System.out.println("5- Número Primo");
        System.out.println("6- Lista de números reais");
        System.out.println("7- Validar a Data");
        System.out.println("8- Jogo do AltoBaixo");
        System.out.println("9- Média da Turma");
        System.out.println("0- Terminar o programa");
    }

    private static void randArray(double[][] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(20 - 0 + 1) + 0;
            }
        }
    }
}
