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
public class PohonNatal {

    public static void main(String[] args) {
        int a, b, c, d, e;

        for (a = 1; a <= 9; a++) {
            //outerloop
            for (b = 8; b >= a; b--) {
                //inner loop no 1
                System.out.print(" ");
                //Untuk memberikan spasi ke samping
            }

            for (c = 1; c <= a; c++) {
                //inner loop no 2
                System.out.print("*");
                //menampilkan bintang dari kanan ke kiri
            }
            for (d = 1; d <= a - 1; d++) {
                //inner loop no 3
                System.out.print("*");
                //menampilkan bintang dari kiri ke kanan
            }

            System.out.println();
            //Memberikan baris baru atau enter pada 
        }

        for (int i = 0; i < 4; i++) {
            for (e = 5; e >= 0; e--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
