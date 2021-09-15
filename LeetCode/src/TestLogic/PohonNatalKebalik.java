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
public class PohonNatalKebalik {
    public static void main(String[] args) {
        int a,b;
        for (int i = 0; i < 4; i++) {
            for (a = 7; a >= 1; a--) {
                System.out.print(" ");
            }
            for (b = 0; b < 3; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 9; i > 0; i--) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
