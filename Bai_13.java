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
public class Bai_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c;
        Scanner ip = new Scanner(System.in);
        a=ip.nextDouble();
        b=ip.nextDouble();
        c=ip.nextDouble();
        
        if(a<b+c&&b<a+c&&c<b+a){
            if(a==b&&b==c){
            System.out.printf("{%.2f,%.2f,%.2f} La tam giac deu",a,b,c);                
            }
            else if((a==b||b==c||c==a)&&(a*a+b*b==c*c||b*b+c*c==a*a||a*a+c*c==b*b)){
            System.out.printf("{%.2f,%.2f,%.2f} La tam giac vuong can",a,b,c);                                
            }
            else if(a==b||b==c||c==a){
            System.out.printf("{%.2f,%.2f,%.2f} La tam giac can",a,b,c);                
            }
            else if(a*a+b*b==c*c||b*b+c*c==a*a||a*a+c*c==b*b){
            System.out.printf("{%.2f,%.2f,%.2f} La tam giac vuong",a,b,c);                
            }
            else{
                System.out.printf("{%.2f,%.2f,%.2f} La tam giac thuong",a,b,c);
            }
            
        }
        else{
            System.out.printf("{%.2f,%.2f,%.2f} Khong phai tam giac",a,b,c);
        }
        System.out.println("");
    }
    
}
