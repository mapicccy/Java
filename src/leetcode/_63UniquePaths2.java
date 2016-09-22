package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/22.
 */
public class _63UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            if(obstacleGrid[i][0] == 0)
                dp[i][0] = 1;
            else
                break;
        }
        for(int i = 0; i < n; i++) {
            if(obstacleGrid[0][i] == 0)
                dp[0][i] = 1;
            else
                break;
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
