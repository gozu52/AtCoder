import java.util.*;

public class C_JumpingTakahashi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        boolean[][] dp = new boolean[n+1][x+1];
        dp[0][0] = true;
        for(int i=1;i<=n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j=0;j<=x;j++){
                if(j>=a)dp[i][j] |= dp[i-1][j-a];
                if(j>=b)dp[i][j] |= dp[i-1][j-b];
            }
        }
        sc.close();
        if(dp[n][x])System.out.println("Yes");
        else System.out.println("No");
    }
}
