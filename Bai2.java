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
public class Bai2 {

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
        
        int S=0;
        for (int i : a) {
            S+=i;
        }
        System.out.println("Tong cac phan tu trong mang = "+S);
        
        int SLe=0;
        for(int i=0;i<n;++i){
            if(a[i]%2==1){
                SLe+=a[i];
            }
        }
        System.out.println("Tong cac so le = "+SLe);
    }
    
}
