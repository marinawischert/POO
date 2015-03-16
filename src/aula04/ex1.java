package aula04;

import java.util.Scanner;

public class ex1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String matricula;
        String aux = "";
        char c1, c2;
        int digit = 0;

        do {
            System.out.print("Introduza a Matricula: ");
            matricula = sc.nextLine();

            if (matricula.length() != 8) {
                System.out.println("\nMatricula inválida! Introduza novamente.\n");
            }

        } while (matricula.length() != 8);

        String text = matricula.toUpperCase();
        if (!text.equals(matricula)) {
            System.out.println("Matricula inválida!");
            System.exit(1);
        }

        c1 = matricula.charAt(2);
        c2 = matricula.charAt(5);

        if (c1 != '-' && c2 != '-') {
            System.out.println("Matricula inválida!");
            System.exit(1);
        }

        for (int i = 0; i < matricula.length(); i += 3) {
            c1 = matricula.charAt(i);
            c2 = matricula.charAt(i + 1);

            if (Character.isDigit(c1) && Character.isDigit(c2)) {
                if (digit == 2) {
                    System.out.println("Matricula inválida !");
                    System.exit(1);
                } else {
                    digit++;
                    aux += c1 + c2;
                }
            }

        }

        if (aux.equals("0000")) {
            System.out.println("Matricula inválida !");
            System.exit(1);
        } else {
            System.out.println("Matricula Válida!");
        }

        sc.close();
    }

}
