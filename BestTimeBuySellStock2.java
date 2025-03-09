// In this problem, we are traversing through the prices array, and initially buying the stock on first day. Then loop starts from 
// second day, compare it with the price of previous day, if it is greater than sell the stock and accumulate the profit in maxProfit
// variable. Now buy the current day stock and move forward and check for a day to sell this current stock. If the previous day 
// stock was greater than don't accumulate it in profit. Just move forward. 

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
class Solution {
    public int maxProfit(int[] prices) {
        // Base case
        if (prices.length == 0 || prices.length == 1 || prices == null) {
            return 0;
        }
        int maxProfit = 0;
        // Loop
        for (int i = 1; i < prices.length; i++) {
            // Check if previous day stock is smaller the sell it and get profit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        // Return maxProfit
        return maxProfit;
    }
}