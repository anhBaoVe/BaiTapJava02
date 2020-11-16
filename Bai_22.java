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
public class Bai_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = new Scanner(System.in).nextInt();
        
        for(int i=n;i>=1;--i){
            int dem = n+1-i;
            int tang=-1;
            for(int j=1;j<=2*n-i;++j){
                if(j<i){
                    System.out.printf("%3s","");
                }
                else{
                    System.out.printf("%3d",dem);
                    if(dem==1){
                        tang=1;
                    }
                    dem+=tang;
                }
            }
            System.out.println("");
        }
    }
    
}
