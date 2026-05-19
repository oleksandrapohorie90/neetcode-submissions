class Solution {
    public int maxProfit(int[] prices) {
        //with 2 pointers sliding window, you would use while loop; you can control 2 diff pointers 
        //at different rates

        int sell = 1;
        int buy = 0;
        int maxProfit = 0;

        /**
        prices=[7,1,5,3,6,4]
        Your Output:4
        Expected: 5
        **/

       while(sell < prices.length){

        if((prices[sell] - prices[buy]) > maxProfit){
            maxProfit = prices[sell] - prices[buy];

        }

        if (prices[sell] < prices[buy]) {
            buy = sell;
            
            }

        sell++;
       }
        
        return maxProfit;
        
    }
}
