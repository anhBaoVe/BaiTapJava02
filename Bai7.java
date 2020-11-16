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
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=10;i<100;++i){
            if(i==2*((i/10)+(i%10))){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
    
}
