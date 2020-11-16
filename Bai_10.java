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
public class Bai_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner ip = new Scanner(System.in);
        a=ip.nextInt();
        b=ip.nextInt();
        int BC=a*b;
        
        while(a!=b){
            if(a>b){
                a-=b;
            }
            else{
                b-=a;
            }
        }
        
        System.out.println("UCLN: "+a);
        System.out.println("BCNN: "+BC/a);
        
    }
    
}
