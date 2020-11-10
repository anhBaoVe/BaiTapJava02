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
public class Bai_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int trongTai;
        int a,b,c,d;
        Scanner ip = new Scanner(System.in);
        do{
        trongTai=ip.nextInt();
        a=ip.nextInt();
        b=ip.nextInt();
        c=ip.nextInt();
        d=ip.nextInt();
        }while(trongTai<1||a<1||b<1||c<1||d<1);
        //thuyền nó ko tự về:))
        if(a<trongTai&&b<trongTai&&c<trongTai&&d<trongTai&&
           ((a+b)<trongTai||(a+c)<trongTai||(a+d)<trongTai||
                (b+c)<trongTai||(b+d)<trongTai||(c+d)<trongTai)){
            System.out.println("CO");
        }
        else{
            System.out.println("KHONG");
        }
    }
    
}
