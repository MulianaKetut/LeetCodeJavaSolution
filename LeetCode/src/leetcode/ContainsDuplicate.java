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
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        ContainsDuplicate c = new ContainsDuplicate();
        boolean a = c.containsDuplicate(nums);
        System.out.println(a);
    }
}
