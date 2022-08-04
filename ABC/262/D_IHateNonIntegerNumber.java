import java.util.*;

public class D_IHateNonIntegerNumber {
    final static int MOD = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        long ans = 0;
        for(int x=1;x<=n;x++){
            long[][][] dp = new long[n+1][n+1][x];
            dp[0][0][0] = 1;
            for(int i=0;i<n;i++)for(int j=0;j<=i;j++)for(int k=0;k<x;k++){
                int tmp = (k+a[i])%x;
                dp[i+1][j+1][tmp] += dp[i][j][k];
                dp[i+1][j+1][tmp] %= MOD;
                dp[i+1][j][k] += dp[i][j][k];
                dp[i+1][j][k] %= MOD;
            }
            ans += dp[n][x][0];
            ans %= MOD;
        }
        System.out.println(ans);
    }
}
