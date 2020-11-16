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
public class Bai_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long tien= new Scanner(System.in).nextLong();
        
        for(int i = 0;i<=tien/10000;++i){
            for(int j=0;j<=tien/20000;++j){
                for(int k = 0;k<=tien/50000;++k){
                    if(i*10000+j*20000+k*50000==tien){
                        System.out.printf("%4d to 10000, %4d to 20000, %4d to 50000\n",i,j,k);
                    }
                }
            }
        }
    }
    
}
