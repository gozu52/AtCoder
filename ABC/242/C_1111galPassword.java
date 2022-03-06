import java.util.Scanner;

public class C_1111galPassword {
    static long mod = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long[][] dp = new long[n+1][10];
        for(int i=1;i<=9;i++)dp[1][i] = 1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=9;j++){
                if(j==9){
                    dp[i][j] = (dp[i-1][j-1]+dp[i-1][j])%mod;
                }else{
                    dp[i][j] = (dp[i-1][j-1]+dp[i-1][j]+dp[i-1][j+1])%mod;
                }
            }
        }
        long ans =0;
        for(long e: dp[n]){
            ans += e;
            ans %= mod;
        }
        System.out.println(ans);
    }
}
