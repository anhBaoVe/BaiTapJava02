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
public class Bai9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //cách 1
        for (int i = 20000; i < 90000; i += 2) {
            int tmp = i;
            boolean toanChan = true;
            while (tmp > 0) {
                if (tmp % 10 % 2 != 0) {
                    toanChan = false;
                    break;
                }
                tmp /= 10;
            }

            if (toanChan) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        //cách 2
        int soChan[] = {0, 2, 4, 6, 8};
        for (int i = 1; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                for (int k = 0; k < 5; ++k) {
                    for (int m = 0; m < 5; ++m) {
                        for (int n = 0; n < 5; ++n) {
                            System.out.print(soChan[i]);
                            System.out.print(soChan[j]);
                            System.out.print(soChan[k]);
                            System.out.print(soChan[m]);
                            System.out.print(soChan[n] + " ");
                        }
                    }
                }
            }
        }

    }

}
