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
public class Bai_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = new Scanner(System.in).nextInt();

        for(int i=2;i<=n/2;++i){
            if(laSNT(i)&&laSNT(n-i)){
                System.out.printf("%d = %d + %d\n",n,i,n-i);
            }
        }
    }
    public static boolean laSNT(int a){
        if(a<2){
            return false;
        }
        for(int i=2;i<a;++i){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    
}
