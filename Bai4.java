/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;

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
        int a,b,c;
        Scanner ip = new Scanner(System.in);
        a= ip.nextInt();
        b= ip.nextInt();
        c= ip.nextInt();
        
        if(a>b&&a>c){
            System.out.printf("Max{%d,%d,%d}=%d",a,b,c,a);
        }
        else if(b>a&&b>c){
            System.out.printf("Max{%d,%d,%d}=%d",a,b,c,b);
        }
        else{
            System.out.printf("Max{%d,%d,%d}=%d",a,b,c,c);

        }
        System.out.println("");
    }
    
}
