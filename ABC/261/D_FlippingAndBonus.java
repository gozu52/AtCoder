import java.util.*;

public class D_FlippingAndBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n+1];
        for(int i=0;i<n;i++) x[i] = sc.nextInt();
        for(int i=0;i<m;i++){
            int c = sc.nextInt();
            y[c] = sc.nextInt();
        }
        sc.close();
        long ans = 0;
        long[][] dp = new long[n+1][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                dp[i+1][0] = Math.max(dp[i+1][0], dp[i][j]);
                dp[i+1][j+1] = Math.max(dp[i+1][j+1], dp[i][j] + x[i]+y[j+1]);
            }
        }
        for(int i=0;i<=n;i++)ans = Math.max(ans, dp[n][i]);
        System.out.println(ans);
        // System.out.println(Arrays.deepToString(dp));
    }
}
