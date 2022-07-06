import java.util.*;

public class C_GetAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        char[] s = sc.next().toCharArray();
        StringBuilder sb = new StringBuilder();
        int[] dp = new int[n];
        for(int i=1;i<n;i++)dp[i] = dp[i-1]+(s[i-1]=='A'&&s[i]=='C'?1:0);
        while(q-->0){
            int l = sc.nextInt()-1, r = sc.nextInt()-1;
            sb.append(dp[r]-dp[l]+"\n");
        }
        sc.close();
        System.out.println(sb.toString());
    }
}
