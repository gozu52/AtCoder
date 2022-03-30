import java.util.*;

public class C_ChooseElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n;i++)b[i]=sc.nextInt();
        sc.close();
        boolean[][] dp = new boolean[n][2];
        dp[0][0]=true;dp[0][1]=true;
        for(int i=1;i<n;i++){
            if(dp[i-1][0] && Math.abs(a[i-1]-a[i])<=k)dp[i][0]=true;
            if(dp[i-1][0] && Math.abs(a[i-1]-b[i])<=k)dp[i][1]=true;
            if(dp[i-1][1] && Math.abs(b[i-1]-a[i])<=k)dp[i][0]=true;
            if(dp[i-1][1] && Math.abs(b[i-1]-b[i])<=k)dp[i][1]=true;
        }
        System.out.println(dp[n-1][0]||dp[n-1][1]?"Yes":"No");
    }
}
