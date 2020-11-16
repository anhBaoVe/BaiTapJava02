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
public class Bai_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = new Scanner(System.in).nextInt();
        
        for(int i=n;i>=1;--i){
            for(int j=1;j<=i;++j){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        for(int i=n;i>=1;--i){
            for(int j=1;j<=i;++j){
                if(i==n||j==1||i==j){  
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
