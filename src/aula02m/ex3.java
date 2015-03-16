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
public class ex3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Byte a ler? ");
        byte val = sc.nextByte();
        int count = 0;
        for (int i = 0; i < 7; i++) {
            count = count + (val >> i & 1);
        }
        
        System.out.println(count);
    }
}
