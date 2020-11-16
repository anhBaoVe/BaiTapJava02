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
public class Bai_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,d,n0,S;
        
        Scanner ip = new Scanner(System.in);
        n = ip.nextInt();
        d = ip.nextInt();
        n0 = ip.nextInt();
        S=n0;
        System.out.print("S = "+n0);
        while(n>1){
            n0+=d;
            S+=n0;
            System.out.print(" + "+n0);
            n--;
        }
        System.out.println(" = "+S);
    }
    
}
