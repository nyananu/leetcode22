// Approach 1: first found out the minNumber by setting it as first value of array because buy before sell,
// then compared minNumber with current value to check if its min. Then compared profit at each day to the max profit
// Time: O(n)
// Space: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int minNum = prices[0]; //need to buy before selling, so can start off minNum as the first value of array
        int maxProfit = 0;
        int profitToday = 0;

        for(int i = 1; i < prices.length; i++) {
            if (prices[i] < minNum) {
                minNum = prices[i];
            }
            profitToday = prices[i] - minNum;

            if(profitToday > maxProfit) {
                maxProfit = profitToday;
            }
        }
        return maxProfit;
    }
}