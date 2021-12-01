import java.io.*;
import java.util.*;

public class C_chokudai {
    public static void main(String[] args) throws Exception{
        myScan sc = new myScan();
        char[] s = sc.next().toCharArray();
        final long mod = (long)Math.pow(10, 9)+7;
        String tmp = "chokudai";
        int n = s.length;
        char[] t = tmp.toCharArray();
        long[][] dp = new long[n+1][9];
        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<8;j++){
                if(s[i]!=t[j]){
                    dp[i+1][j+1] = dp[i][j+1];
                }else{
                    dp[i+1][j+1] = (dp[i][j+1]+dp[i][j])%mod;
                }
            }
        }
        System.out.println(dp[n][8]);
    }
}
class myScan{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    public myScan() throws Exception{

    }
    public int nextInt() throws Exception {
        return Integer.parseInt(next());
    }
    
    public long nextLong() throws Exception {
        return Long.parseLong(next());
    }
    
    public double nextDouble() throws Exception {
        return Double.parseDouble(next());
    }
    
    public String next() throws Exception {
        if (!st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}
