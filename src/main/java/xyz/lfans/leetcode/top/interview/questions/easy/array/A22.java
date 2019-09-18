package xyz.lfans.leetcode.top.interview.questions.easy.array;

/**
 * @author MelancholyCat
 * @date Created in 17:58 2019-09-17
 * @description 买卖股票的最佳时机 II
 * 时间复杂度:O(N) 空间复杂度:O(1)
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class A22 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        int min = 0, max = 0, get = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[min]) {
                min = max = i;
            }else if (prices[i] > prices[max]) {
                max = i;
                get += prices[max] - prices[min];
                if (i<prices.length-1)
                    min = max = i;
                else break;
            }
        }
        return get;

        /* 执行用时为 1 ms 的范例
        if(prices==null||prices.length<=1){
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                sum+=prices[i]-prices[i-1];
            }
        }
        return sum;
        */


    }
}
