/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author drop
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
       
       int n;
       int n1=0;
       
            System.out.print("Digite un numero : ");
            n = entrada.nextInt();
            
            
            if (n1 <=n ){
            
            for(int i=0;i<=n;i=i+2){
               
               if (i!=0){
               
               System.out.println(" par sin cero "+i);
               }          
               }
               }
    
}

}
