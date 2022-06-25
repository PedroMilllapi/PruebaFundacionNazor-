/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author drop
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("ingrese valor : ");
        int n = entrada.nextInt();
        int s1=0;
        int s2=1;
        int s3=1;
        
        for(int i=0;i<=n;i++){
        
        System.out.print(s1+",");
        
        s3=s1+s2;
        s1=s2;
        s2=s3;

         
        }
    
    }
    
}
