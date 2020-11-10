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
public class Bai_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r,c,tien;
        Scanner ip = new Scanner(System.in);
        r=ip.nextInt();
        c=ip.nextInt();
        tien=40*(((r+1)/2)*((c+1)/2))+10*r*c;
        System.out.println(tien+".000");
    }
    
}
