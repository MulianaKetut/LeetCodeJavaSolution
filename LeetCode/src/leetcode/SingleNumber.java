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
public class SingleNumber {

    public int singleNumber(int[] nums) {
//        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        
        SingleNumber s = new SingleNumber();
        int a = s.singleNumber(nums);
        System.out.println(a);
    }
}
