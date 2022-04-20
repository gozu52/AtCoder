import java.util.*;

public class C_DiceSum {
    static long mod = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        sc.close();
        long[][] dp = new long[n+1][k+1];
        dp[0][0] = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                for(int l=1;l<=m;l++){
                    if(j+l<=k){
                        dp[i+1][j+l] += dp[i][j];
                        dp[i+1][j+l] %= mod; 
                    }
                }
            }
        }
        long ans = 0;
        for(int i=1;i<=k;i++){
            ans+=dp[n][i];
            ans%=mod;
        }
        System.out.println(ans);
    }
}
