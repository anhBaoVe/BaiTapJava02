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
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        a= new Scanner(System.in).nextInt();
        if(Math.pow(Math.sqrt(a),2)==a){
            System.out.println("CO");
        }
        else{
            System.out.println("KHONG");
        }
    }
    
}
