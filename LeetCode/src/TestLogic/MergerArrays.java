/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLogic;

import java.util.Arrays;

/**
 *
 * @author muliana_ketut
 */
public class MergerArrays {

    public int[] meger(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int pointer = 0;
        for (int i = 0; i < temp.length;) {
            temp[i] = arr1[pointer];
            temp[(i + 1)] = arr2[pointer];
            i += 2;
            pointer++;
        }

        //sort
        for (int i = 1; i < temp.length; i++) {
            for (int j = i; j > 0; j--) {
                if (temp[j] < temp[j - 1]) {
                    int x = temp[j];
                    temp[j] = temp[j - 1];
                    temp[j - 1] = x;
                }
            }
        }
        //Arrays.sort(temp);
        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 6, 10, 11, 15};
        int[] arr2 = {1, 5, 8, 12, 14, 19};

        MergerArrays m = new MergerArrays();
        int[] temp = m.meger(arr1, arr2);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ", ");
        }
//        prints [1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]
    }
}
