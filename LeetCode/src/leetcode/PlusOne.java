/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 *
 * @author muliana_ketut
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
       for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] rst = new int[digits.length + 1];
            rst[0] = 1;
            return rst;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1,9};

        PlusOne p = new PlusOne();
        int[] r = p.plusOne(digits);
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + ", ");
        }
    }
}
