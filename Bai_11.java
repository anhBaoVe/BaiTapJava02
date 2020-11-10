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
public class Bai_11 {

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
        
        if(a==0){
            if(b==0&&c==0){
                System.out.println("Phuong trinh co vo so nghiem!");
            }
            else if(b==0&&c!=0){
                System.out.println("Phuong trinh vo nghiem!");
            }
            else{
                System.out.println("Phuong trinh co nghiem x= "+(-c/b));
            }
        }else{
            double delta=b*b-4*a*c;
            if(delta>0){
                double x1= (-b+Math.sqrt(delta))/(2*a);
                double x2= (-b-Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co hai nghiem phan biet: x1= "+x1+"  x2= "+x2);
            }else if(delta<0){
                System.out.println("Phuong trinh vo nghiem!");               
            }
            else{
                System.out.println("Phuong trinh co nghiem duy nhat x= "+(-b/(2*a)));
            }
        }
    }
    
}
