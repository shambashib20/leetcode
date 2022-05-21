class Solution {
public int coinChange(int[] coins, int amount) {
	int x = amount+1;
	int y = coins.length+1;
	int[][] dp = new int[x][y];
	for(int i = 0; i<x; i++) {
		for(int j = 0; j<y; j++) {
			if(i == 0 ) {
				dp[i][j] = 0;
			} else {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
	}

	for(int i = 1; i<x; i++) {
		for(int j = 1; j<y; j++) {
			if(i<coins[j-1] || dp[i-coins[j-1]][j] == Integer.MAX_VALUE) {
				dp[i][j] = dp[i][j-1];
			} else {
				dp[i][j] = Math.min(dp[i][j-1], dp[i-coins[j-1]][j] + 1);
			}
		}
	}
	return dp[x-1][y-1] == Integer.MAX_VALUE ? -1 : dp[x-1][y-1];
}
}