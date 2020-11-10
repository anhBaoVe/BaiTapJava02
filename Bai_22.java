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
public class Bai_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        a= new Scanner(System.in).nextInt();
        switch(a){
            case 1: 
                System.out.println("Nhom mau: O");
                System.out.println("Nhan duoc: O");
                System.out.println("Truyen duoc: O,A,B,AB");
                break;
            case 2:
                System.out.println("Nhom mau: A");
                System.out.println("Nhan duoc: O,A");
                System.out.println("Truyen duoc: A,AB");
                break;
            case 3:
                System.out.println("Nhom mau: B");
                System.out.println("Nhan duoc: O,B");
                System.out.println("Truyen duoc: B,AB");
                break;
            case 4:
                System.out.println("Nhom mau: AB");
                System.out.println("Nhan duoc: O,A,B,AB");
                System.out.println("Truyen duoc: AB");
                break;
            default:
                System.out.println("Ma mau khong hop le!");
        }
    }
    
}
