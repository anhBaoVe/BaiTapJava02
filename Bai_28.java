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
public class Bai_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int d,m,n,i;
        i=1;
        Scanner ip = new Scanner(System.in);
        
        d = ip.nextInt();
        m = ip.nextInt();
        n = ip.nextInt();
        
        System.out.println("\t\t\tTHANG "+m);
        System.out.printf("%4s\t%4s\t%4s\t%4s\t%4s\t%4s\t%s\n",
                "Thu2","Thu3","Thu4","Thu5","Thu6","Thu7","ChuNhat");
        for(int j=2;j<d;++j){
            System.out.printf("%4s\t","");
        }
        while(i<=n){
            System.out.printf("%4d\t",i);
            if((d-2+i)%7==0){
                System.out.println("");
            }
            ++i;
        }
        System.out.println("");
    }
    
}
