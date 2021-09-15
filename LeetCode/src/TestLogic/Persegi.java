/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLogic;

/**
 *
 * @author muliana_ketut
 */
public class Persegi {

    public static void main(String[] args) {
        int p = 8;
        int l = 10;

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(" * ");
                if (j == 1 && i >= 2 && i <= 5) {
                    for (int k = 0; k < 3; k++) {
                        System.out.print(" #  # ");
                    }
                    j += 6;
                }
            }
            System.out.println();
        }
    }
}
