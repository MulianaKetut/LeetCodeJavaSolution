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
public class LogicPrint {

    public void printInt(int n) {
        int pointer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 3; j++) {
                System.out.print(j + 1);
                if (j == pointer) {
                    System.out.print("**");
                    j += 2;
                }
            }
            pointer++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        LogicPrint l = new LogicPrint();
        l.printInt(n);
    }

//    input n = 5
//1**45678
//12**5678
//123**678
//1234**78
//12345**8
}
