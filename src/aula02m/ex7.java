/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02m;

import aula02.Data;
import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ex7 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int ano;
        int mes;
        do {
            System.out.println("Ano: ");
            ano = sc.nextInt();
            Data.validAno(ano);
            System.out.println("Mes: ");
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
}
