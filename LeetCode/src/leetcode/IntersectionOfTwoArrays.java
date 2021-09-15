/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author muliana_ketut
 */
public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    temp.add(nums1[i]);
                    nums1[i] = Integer.MAX_VALUE - 1;
                    nums2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }

        int[] temp1 = new int[temp.size()];
        for (int i = 0; i < temp1.length; i++) {
            temp1[i] = temp.get(i);
        }
        return temp1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1, 2}, nums2 = {1, 2};

        IntersectionOfTwoArrays i = new IntersectionOfTwoArrays();
        int[] temp = i.intersect(nums1, nums2);

        for (int j = 0; j < temp.length; j++) {
            System.out.println(temp[j] + ", ");
        }
    }
}
