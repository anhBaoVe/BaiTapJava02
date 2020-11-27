/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4;

import java.util.Scanner;

/**
 *
 * @author PKrew
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner ip = new Scanner(System.in);
        n = ip.nextInt();
        int[] a = new int [n];
        
        for(int i=0;i<n;++i){
            a[i]= ip.nextInt();
        }
        
        int dem = 0;
        for (int i : a) {
            if(isSNT(i)){
                dem++;
            }
        }
        System.out.println("Co "+ dem +" so nguyen to.");
        
    }
    
    public static boolean isSNT(int a){
        for(int i=2;i<a;++i){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    
}
