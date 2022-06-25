/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author drop
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
       
       int suma = 0;
       int min;
       int max;
            System.out.print("Digite un numero minimo : ");
            min = entrada.nextInt();
            System.out.print("Digite un numero maximo : ");
            max = entrada.nextInt();
            
       int n1=max;
       
            int [] impares= new int[n1];
            
             if(min<max){
             
                 for(int ia=min;ia<impares.length;ia=ia+2){
               
                
                impares[ia]=ia+1;
               System.out.println("numero dentro "+impares[ia]);
                suma+=impares[ia];
                
             }
             
             }
       
            System.out.println("la suma seria : "+suma);

    }
    
}
