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
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int am, duong, a;
        Scanner ip = new Scanner(System.in);
        am = duong = 0;
        do {
            a = ip.nextInt();
            if (a > 0) {
                duong++;
            } else if (a < 0) {
                am++;
            }

        } while (a != 0);

        System.out.println("AM: " + am);
        System.out.println("DUONG: " + duong);
    }

}
