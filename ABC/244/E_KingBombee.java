import java.util.*;

public class E_KingBombee {
    final static int MOD = 998244353;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        int s = sc.nextInt()-1, t = sc.nextInt()-1, x = sc.nextInt()-1;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++)list.add(new ArrayList<Integer>());
        for(int i=0;i<m;i++){
            int u = sc.nextInt()-1, v = sc.nextInt()-1;
            list.get(u).add(v);list.get(v).add(u);
        }
        sc.close();
        int[][][] dp = new int[k+1][n][2];
        dp[0][s][0] = 1;
        for(int i=1;i<k+1;i++){
            for(int j=0;j<n;j++){
                int a = 0, b = 0;
                for(int e: list.get(j)){
                    a = (a+dp[i-1][e][0])%MOD;
                    b = (b+dp[i-1][e][1])%MOD;
                }
                if(j==x){
                    dp[i][j][0] = b;dp[i][j][1] = a;
                }else{
                    dp[i][j][0] = a;dp[i][j][1] = b;
                }
            }
        }
        System.out.println(dp[k][t][0]);
    }
}
