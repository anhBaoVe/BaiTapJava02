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
public class Bai_21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x1, y1, x2, y2, x3, y3, x4, y4;
        Scanner ip = new Scanner(System.in);
        do{
            x1=ip.nextInt();
            y1=ip.nextInt();
            x2=ip.nextInt();
            y2=ip.nextInt();
            x3=ip.nextInt();
            y3=ip.nextInt();
            x4=ip.nextInt();
            y4=ip.nextInt();            
        }while(x1<=0||x1>=11||y1<=0||y1>=11||x2<=0||x2>=11||y2<=0||y2>=11||
                x3<=0||x3>=11||y3<=0||y3>=11||x4<=0||x4>=11||y4<=0||y4>=11);
        if(x1<x2){
            x1--;
        }
        else{
            x2--;
        }
        if(y1<y2){
            y1--;
        }
        else{
            y2--;
        }
        if(x3<x4){
            x3--;
        }
        else{
            x4--;
        }
        if(y3<y4){
            y3--;
        }
        else{
            y4--;
        }
        int s1=(Math.abs(x2-x1))*(Math.abs(y2-y1));
        int s2=(Math.abs(x3-x4))*(Math.abs(y3-y4));
        
        int x5,y5,x6,y6;
        if(x1<=x3&&x1>=x4||x1<=x4&&x1>=x3){
            x5=x1;
        }
        else{
            x5=(Math.abs(x1-x4)<Math.abs(x1-x3))?x4:x3;
        }
        
        if(y1<=y3&&y1>=y4||y1<=y4&&y1>=y3){
            y5=y1;
        }
        else{
            y5=(Math.abs(y1-y4)<Math.abs(y1-y4))?y4:y3;
        }
        
        if(x2<=x3&&x2>=x4||x2<=x4&&x2>=x3){
            x6=x2;
        }
        else{
            x6=(Math.abs(x2-x4)<Math.abs(x2-x3))?x4:x3;
        }
        
        if(y2<=y3&&y2>=y4||y2<=y4&&y2>=y3){
            y6=y2;
        }
        else{
            y6=(Math.abs(y2-y4)<Math.abs(y2-y3))?y4:y3;
        }
        int s3;
            s3=(Math.abs(x5-x6))*(Math.abs(y5-y6)); 
        
        System.out.println(s1+s2-s3);
    }
    
}
