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
public class Fibonacci {

    static void FibonacciNumber(int N) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < N) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;

            counter++;
        }
    }

    public static void main(String[] args) {
        // Given Number N
        int N = 10;

        // Function Call
        FibonacciNumber(N);
    }
}
