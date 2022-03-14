import java.util.*;

public class AtCounter_004 {
    static final long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        long[] dp = new long[7];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a')dp[0]++;
            if(s.charAt(i)=='t'){dp[1]+=dp[0];dp[1]%=mod;}
            if(s.charAt(i)=='c'){dp[2]+=dp[1];dp[2]%=mod;}
            if(s.charAt(i)=='o'){dp[3]+=dp[2];dp[3]%=mod;}
            if(s.charAt(i)=='d'){dp[4]+=dp[3];dp[4]%=mod;}
            if(s.charAt(i)=='e'){dp[5]+=dp[4];dp[5]%=mod;}
            if(s.charAt(i)=='r'){dp[6]+=dp[5];dp[6]%=mod;}
        }
        System.out.println(dp[6]);
    }
}
