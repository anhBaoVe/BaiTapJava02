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
public class Bai_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        Scanner ip = new Scanner(System.in);
        a = ip.nextInt();
        b = ip.nextInt();

        for (int i = a; i <= b; ++i) {
            boolean laSNT = true;
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    laSNT = false;
                    break;
                }
            }
            if (laSNT && i > 1) {
                System.out.print(i + " ");
            }
        }
    }

}
