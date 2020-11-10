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
public class Bai_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t,sTho;
        do{
            t=new Scanner(System.in).nextInt();
        }while(t<0);
        
        System.out.println("Rua chay duoc "+t+"m");
        
        sTho=0;
        sTho=(t/15)*10;
        if(t%15>=5){
            sTho+=10;
        }
        else{
            sTho+=(t%15)*2;
        }
        System.out.println("Tho chay duoc "+sTho+"m");
        if(sTho>t){
            System.out.println("Tho thang cuoc");
        }
        else if(sTho<t){
            System.out.println("Rua thang cuoc");
        }
        else{
            System.out.println("HOA");
        }
    }
    
}
