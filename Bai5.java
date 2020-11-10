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
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        a = new Scanner(System.in).nextInt();
        switch(a){
            case 2: 
                System.out.println("Thu Hai");
                break;
            case 3: 
                System.out.println("Thu Ba");
                break;
            case 4: 
                System.out.println("Thu Tu");
                break;
            case 5: 
                System.out.println("Thu Nam");
                break;
            case 6: 
                System.out.println("Thu Sau");
                break;
            case 7: 
                System.out.println("Thu Bay");
                break;
            case 8: 
                System.out.println("Chu Nhat");
                break;
            default: 
                System.out.println("Khong hop le!");
        }
    }
    
}
