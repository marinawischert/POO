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
public class ex4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Insira um valor ! ");
        byte b = sc.nextByte();
        String s = ("0000000" + Integer.toBinaryString(0xFF & b)).replaceAll(".*(.{8})$", "$1");
        System.out.println(s);
    }
}
