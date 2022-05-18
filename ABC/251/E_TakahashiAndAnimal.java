import java.util.Scanner;

public class E_TakahashiAndAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        sc.close();
        long[][] dp = new long[n][2];
        long ans = Long.MAX_VALUE;
        for(int i=0;i<2;i++){
            dp[0][i] = a[0]*i; dp[0][1-i] = Long.MAX_VALUE;
            for(int j=1;j<n;j++){
                dp[j][0] = dp[j-1][1];
                dp[j][1] = Math.min(dp[j-1][0],dp[j-1][1])+a[j];
            }
            if(i==0) ans = Math.min(ans, dp[n-1][1]);
            else ans = Math.min(ans, Math.min(dp[n-1][0], dp[n-1][1]));
        }
        System.out.println(ans);
    }
}
