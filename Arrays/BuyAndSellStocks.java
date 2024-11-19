package Arrays;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int maxProfit = calcMaxProfit(prices);
        System.out.println("Maximum profit possible : " + maxProfit);
    }

    public static int calcMaxProfit(int prices[]) {
        int maxProfit = 0;
        int profit = 0;
        int cp = Integer.MAX_VALUE, sp = 0;

        for (int i = 1; i < prices.length; i++) {
            cp = Math.min(cp, prices[i - 1]);
            sp = prices[i];
            profit = sp - cp;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
