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
public class SegitigaAngkaTerbalik {
    public static void main(String[] args) {
        int a,b,c;
        for (a = 4; a >= 1; a--) {
            for (b = 4; b > a; b--) {
                System.out.print(" ");
            }
            for (c = 1; c < (a * 2); c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
