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
public class BestTimeBuyAndSell {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit += Math.max(0, prices[i] - prices[i - 1]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {10, 7, 5, 8, 11, 9, 1};

        BestTimeBuyAndSell b = new BestTimeBuyAndSell();
        int h = b.maxProfit(prices);
        System.out.println("Hasil Profit = " + h);
    }
}
