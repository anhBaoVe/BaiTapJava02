/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

import java.util.Scanner;

/**
 *
 * @author PKrew
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n= new Scanner(System.in).nextInt();
        int m =new Scanner(System.in).nextInt(); 
        while(n>0){
            System.out.print("*");
            n--;
        }
        System.out.println("");
        while(m>0){
            if(m%2==0){
                System.out.print("+");
            }
            else{
                System.out.print("-");
            }
            m--;
        }
        
        
    }
    
}
