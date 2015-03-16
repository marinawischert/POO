/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ex1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String palavra1;
        String palavra2;
        System.out.println("Escreva uma palavra: ");
        palavra1=sc.nextLine();
        System.out.println("Escreva a segunda palavra: ");
        palavra2=sc.nextLine();
        System.out.println("A primeira palavra tem "+palavra1.length());
        System.out.println("A segunda palavra tem "+palavra2.length());
        System.out.println("A última letra da primeira palavra é "+palavra1.charAt(palavra1.length()-1));
        
        if(palavra1.compareTo(palavra2)==0){
            System.out.println("As duas palavras são iguais");
        }else{
            System.out.println("As duas palavras são diferentes");
        }
        
        if(palavra2.charAt(palavra2.length()-1)=='.'){
            System.out.println("A segunda palavra acaba num ponto");
        }
        
        String palavra3=palavra2.toLowerCase();
        System.out.println("Palavra 2 "+palavra3);
        
        if(palavra2==palavra3){
            System.out.println("A segunda palavra só tem letras minúsculas");
        }
        
        String ns1= palavra1.trim().replace(" +", " ");
        String ns2= palavra2.trim().replace(" +", " ");
        
        System.out.println(ns1);
        System.out.println(ns2);
    }
}
