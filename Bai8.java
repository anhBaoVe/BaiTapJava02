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
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=100;i<1000;++i){
            if(i==Math.pow(i%10, 3)+Math.pow((i/10)%10, 3)+Math.pow(i/100,3)){
                System.out.print(i+" ");
            }
        }
    }
    
}
