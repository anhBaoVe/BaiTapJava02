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
public class Bai_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int xh,yh,xm,ym;
        Scanner ip = new Scanner(System.in);
        do{
            xh=ip.nextInt();
            yh=ip.nextInt();
            xm=ip.nextInt();
            ym=ip.nextInt();
        }while((xh==xm&&yh==ym)||xh<1||xh>8||yh<1||yh>8||xm<1||xm>8||ym<1||ym>8);
        
        
        if(xh==xm||yh==ym||Math.abs(xh-xm)==Math.abs(yh-ym)){
            System.out.println("Hau an duoc Ma.");
        }
        else{
            System.out.println("Hau khong an duoc Ma.");
        }
        
        if((Math.abs(xh-xm)==2&&Math.abs(yh-ym)==1)||(Math.abs(xh-xm)==1&&Math.abs(yh-ym)==2)){
            System.out.println("Ma an duoc Hau.");
        }
        else{
            System.out.println("Ma khong an duoc Hau.");
        }
    }
    
}
