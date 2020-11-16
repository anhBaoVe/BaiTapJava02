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
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n= new Scanner(System.in).nextInt();
        int dem=0;
        while(n>0){
            dem++;
            n/=10;
        }
        
        System.out.println(dem);
    }
    
}
