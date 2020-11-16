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
public class Bai_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = new Scanner(System.in).nextInt();
        
        int nT,nS;
        nT=nS=1;
        System.out.print("1 1 ");
        while(n>2){
            int t=nT+nS;
            nT=nS;
            nS=t;
            System.out.print(t+" ");
            n--;
        }
        System.out.println("");
    }
    
}
