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
public class Bai_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double chuyenCan,dieuKien,cuoiKy,TB;
        Scanner ip =new Scanner(System.in);
        chuyenCan=ip.nextDouble();
        dieuKien=ip.nextDouble();
        cuoiKy=ip.nextDouble();
        
        TB=chuyenCan*0.1+dieuKien*0.2+cuoiKy*0.7;
        System.out.printf("Dat %.2f diem, xep loai ",TB);
        if(TB>=8.5){
            System.out.println("A");
        }
        else if(TB>=7&&TB<8.5){
            System.out.println("B");
        }
        else if(TB>=6&&TB<7){
            System.out.println("C");
        }
        else if(TB>=5&&TB<6){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
    
}
