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
public class Bai_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = new Scanner(System.in).nextInt();
        System.out.print(n+ " = ");
        while(n>1){
            for(int i=2;;++i){
                if(n%i==0){
                    System.out.print(i);
                    n/=i;
                    if(n>1){
                        System.out.print(" x ");
                    }
                    break;
                }
            }
        }
        System.out.println("");
    }
    
}
