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
public class Bai_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int so[]= new int[5];
        Scanner ip = new Scanner(System.in);
        for(int i=0;i<4;++i){
            so[i]=ip.nextInt();
        }
        for(int i=0;i<4;++i){
            if(so[i]%2!=0){
                System.out.printf("Trong Thuy di duoc %dkm va khong duoi kip My Chau\n",i*10);
                System.exit(0);
            }
        }
        System.out.printf("Trong Thuy di duoc %dkm va duoi kip My Chau\n",50);
        
    }
    
}
