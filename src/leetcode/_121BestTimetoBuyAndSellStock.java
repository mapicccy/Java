package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/13.
 */
public class _121BestTimetoBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ret = 0;
        int i = 0;
        while (i < prices.length - 1) {
            if(prices[i] > prices[i + 1]) {
                i++;
            }else {
                min = Math.min(min, prices[i]);
                max = prices[i + 1];
                ret = Math.max(ret, max - min);
                i++;
            }
        }
        return ret;
    }
}
