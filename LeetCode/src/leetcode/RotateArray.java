/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author muliana_ketut
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        // if arr is rotated n times then
        // you get the same array
        int d =k;
        int n =nums.length;
        while (d > n) {
            d = d - n;
        }
 
        // create temp array of size d
        int temp[] = new int[n - d];
 
        // copy first N-D element in array temp
        for (int i = 0; i < n - d; i++)
            temp[i] = nums[i];
 
        // move the rest element to index
        // zero to D
        for (int i = n - d; i < n; i++) {
            nums[i - n + d] = nums[i];
        }
 
        // copy the temp array element
        // in origninal array
        for (int i = 0; i < n - d; i++) {
            nums[i + d] = temp[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums1 = {-1, -100, 3, 99};
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        RotateArray r = new RotateArray();
        r.rotate(nums, k);
    }
}
