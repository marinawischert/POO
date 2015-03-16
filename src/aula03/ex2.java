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
public class ex2 {
   
        
   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        
        System.out.println("Parágrafo : ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (c == '.' || c == '?' || c == '!') {
                count++;
            }
        }
        System.out.println(count);

        String[] aux = s.split("\\.|\\?|\\!");
        for (String s1 : aux) {
            System.out.println(s1);
        }
        
    }
}

/*
Than fly to others that we know not of? Thus conscience does make cowards of us all, and thus thenative hue of resolution is sicklied o'er with the pale cast of thought, and enterprise of great pitchand moment with this regard their currents turn awry and lose the name of action… Soft you now,the fair Ophelia! Nymph, in thy orisons be all my sins remembered. 
*/