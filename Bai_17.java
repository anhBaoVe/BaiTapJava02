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
public class Bai_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nhiPhan = new Scanner(System.in).nextLine();
        int thapPhan=0;
        int mu=0;
        for(int i=nhiPhan.length()-1;i>=0;--i){
            thapPhan+=((nhiPhan.charAt(i)-'0'))*Math.pow(2, mu++);
        }
        System.out.println(thapPhan);
    }
    
}
