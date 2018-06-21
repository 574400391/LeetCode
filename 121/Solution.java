class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length; i++){
            if(prices[i] < minValue){
                minValue = prices[i];
            } else if(prices[i] - minValue > maxValue){
                maxValue = prices[i] - minValue;
            }
        }
        return maxValue;
    }
}