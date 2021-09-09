/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author muliana_ketut
 */
public class ReverseStringArray {

    public void reverseString(String[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            String tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
        for (int k = 0; k < s.length; k++) {
            System.out.print(s[k] + ", ");
        }
    }

    public static void main(String[] args) {
        String[] s = {"H", "a", "n", "n", "a", "h"};

        ReverseStringArray r = new ReverseStringArray();
        r.reverseString(s);
    }
}
