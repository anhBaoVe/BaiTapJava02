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
public class Bai_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = new Scanner(System.in).nextInt();
        boolean laSNT = true;
        
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                laSNT = false;
                break;
            }
        }

        if (laSNT&&n!=1) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong la so nguyen to.");
        }
    }

}
