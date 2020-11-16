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
public class Bai_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int d,c;
        Scanner ip = new Scanner(System.in);
        d = ip.nextInt();
        c = ip.nextInt();
        //đặc
        for(int i=0;i<d;++i){
            for(int j=0;j<c;++j){
                System.out.print("* ");
            }
            System.out.println("");
        }
        //rỗng
        System.out.println("\n");
        for(int i=0;i<d;++i){
            for(int j=0;j<c;++j){
                if(i==0||i==d-1||j==0||j==c-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
        //trên dòng
        for(int i=1;i<=d;++i){
            for(int j=1;j<=2*c;++j){
                if(i==1||i==d||j<=c+1||j==2*c){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                if(j==c){
                    System.out.print("\t\t");
                }
            }
            System.out.println("");
        }
    }
    
}
