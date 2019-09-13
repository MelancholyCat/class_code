package xyz.lfans.solutions;

/**
 * @author MelancholyCat
 * @date Created in 14:55 2019-09-12
 * @description 硬币划分、动态规划
 */
public class CoinDivision {
    public static int solution(int n){
        int coins[]= {1,2,5,10};
        int [] dp=new int[100001];
        dp[0]=1;
        for(int i=0;i<4;i++) {
            for(int j=coins[i];j<=n;j++) {
                dp[j]=(dp[j]+dp[j-coins[i]])%1000000007;
            }
        }
        return dp[n];
    }
}
