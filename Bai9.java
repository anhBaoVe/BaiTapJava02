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
public class Bai9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int d,m,y;
        int limit=-1;
        Scanner ip = new Scanner(System.in);
        d=ip.nextInt();
        m=ip.nextInt();
        y=ip.nextInt();
        
        if(y>0){
            switch(m){
                case 2:
                    if(y%4==0&&y%100!=0)
                    {
                        limit=29;
                    }
                    else
                    {
                        limit=28;
                    }
                    break;
                
                case 1 : case 3: case 5: case 7:case 8: case 10: case 12:
                    limit=31;
                    break;
                
                case 4: case 6: case 9: case 11:
                    limit=30;
                    break;
            }
        }
        
        if(d>0&&d<limit){
            System.out.printf("Ngay ke tiep la: %s%d/%s%d/%d\n",(d>9)?"":"0",d+1,(m>9)?"":"0",m,y);
        }
        else if(d>0&&d==limit){
            d=1;
            if(m<12){
                m++;
            }else{
                m=1;
                y++;
            }
            System.out.printf("Ngay ke tiep la: %s%d/%s%d/%d\n",(d>9)?"":"0",d,(m>9)?"":"0",m,y);

        }
        else{
            System.out.println("Ngay nhap khong hop le!");
        }
    }
    
}
