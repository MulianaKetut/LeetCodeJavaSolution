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
public class RemoveDuplicateArray {

    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums.length == 1) {
                break;
            } else if (nums[i] == nums[i + 1]) {
                index++;
                for (int j = i + 1; j < nums.length - 1; j++) {
                    nums[i] = nums[j + 1];
                }
            }
        }
        Arrays.sort(nums);
        k = (nums.length - index);
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums1 = {1, 2};

        RemoveDuplicateArray l = new RemoveDuplicateArray();
        int k = l.removeDuplicates(nums);
        Arrays.sort(nums);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }

}
