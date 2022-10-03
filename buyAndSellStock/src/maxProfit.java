public class maxProfit {

    //return the max profit able to be made by buying and then selling in the future
    public static void main(String args[]){

        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = 0;
        int minVal = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if (prices[i] < minVal)
                    minVal = prices[i];
            else if(prices[i] - minVal > maxProfit)
                maxProfit = prices[i] - minVal;
        }
        System.out.println(maxProfit);
    }
}
