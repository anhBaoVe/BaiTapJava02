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
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a;
        Scanner ip = new Scanner(System.in);
        a=ip.nextFloat();
        if(a<0){
            System.out.printf("%.2f",-a);
        }
        else{
            System.out.printf("%.2f",a);
        }
        System.out.println("");
    }
    
}
