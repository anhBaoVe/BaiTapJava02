/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

/**
 *
 * @author PKrew
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1000;i<10000;++i){
            int t=(int)Math.sqrt(i);
            if(t*t==i){
                System.out.println(i+" ");
            }
        }
    }
    
}
