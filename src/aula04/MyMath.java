/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author Marina
 */
public class MyMath {
   
    
    public static int MDC(int a, int b){
         if(b==0){
            return a;
        }
         else{
            return MDC(b,a%b);
         }
         
       
        
    }
}
