// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int min = prices[0];
        int max = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            } 
            else {
                int profit = prices[i] - min;
                if(profit > max) {
                    max = profit;
                    
                }
            }
        }
        return max;
    }
}