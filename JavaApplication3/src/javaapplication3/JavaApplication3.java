/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author drop
 */
public class JavaApplication3 {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
       
       int n;
       int suma = 0;
            System.out.print("Digite un numero : ");
            n = entrada.nextInt();
       int n1=n+1;

            
                int [] impares= new int[n1];
                    
            for(int ia=1;ia<impares.length;ia=ia+2){
               
                
                impares[ia]=ia;
//               System.out.println("numero dentro "+impares[ia]);
                suma+=impares[ia];
                
             }

            
            System.out.println("la suma seria : "+suma);

              
            
    
    }
    
   
        
    }
    

