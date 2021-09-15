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
public class SegitigaSikuSiku {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");

//                if(i <= j){
//                    System.out.print(" * ");
//                }
//                if(i >= j){
//                    System.out.print(" * ");
//                }
            }
            System.out.println();
        }
    }
}
