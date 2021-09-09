/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Arrays;

/**
 *
 * @author muliana_ketut
 */
public class ReverseInteger {

    public int reverse(int x) {
        int i = 0, z = 0;
        String temp = Integer.toString(x);
        char[] a = temp.toCharArray();
        if (x < 0) {
            try {
                i = 1;
                reverseString(a, i);
                z = Integer.parseInt(String.valueOf(a));
                return z;
            } catch (NumberFormatException e) {
                System.out.println("This is not an integer");
                return 0;
            }
        }
        try {
            reverseString(a, i);
            z = Integer.parseInt(String.valueOf(a));
        } catch (NumberFormatException e) {
            System.out.println("This is not an integer");
            return 0;
        }
        return z;
    }

    public void reverseString(char[] s, int i) {
        int j = s.length - 1;
        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int x = 1534236469;

        ReverseInteger r = new ReverseInteger();

        r.reverse(x);

    }
}
