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
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float f,tien;
        tien=0;
        f=new Scanner(System.in).nextFloat();
        if(f<0.8){
            tien=f*10;
        }
        else if(f>=0.8&&f<30){
            tien=(float) (0.8*10+(f-0.8)*9);
        }
        else{
            tien=(float) (0.8*10+(30)*9+(f-30.8)*8);
        }
        System.out.printf("%.0f.000\n",tien);
    }
    
}
