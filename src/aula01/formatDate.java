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
public class formatDate {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int totalSec, min, hour, sec;
        System.out.println("Tempo em segundos? ");
        totalSec = sc.nextInt();
        hour = totalSec / 3600;
        min = (totalSec % 3600) / 60;
        sec = totalSec % 60;

        System.out.printf("Secs: %02d -> %02d:%02d:%02d\n", totalSec, hour, min, sec);
    }
}
