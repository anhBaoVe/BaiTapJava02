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
public class Bai_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x1,x2,y1,y2;
        Scanner ip = new Scanner(System.in);
        do{
            x1=ip.nextInt();
            y1=ip.nextInt();
            x2=ip.nextInt();
            y2=ip.nextInt();
        }while((x1==x2&&y1==y1)||x1<1||x1>8||y1<1||y1>8||x2<1||x2>8||y2<1||y2>8);
        
        
        if(x1==x2||y1==y2){
            System.out.printf("Xe 1 (%d,%d) xe 2 (%d,%d) co the an nhau.",x1,y1,x2,y2);
        }
        else{
            System.out.printf("Xe 1 (%d,%d) xe 2 (%d,%d) khong the an nhau.",x1,y1,x2,y2);            
        }
    }
    
}
