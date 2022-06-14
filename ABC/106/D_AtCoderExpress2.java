import java.util.*;

public class D_AtCoderExpress2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), query = sc.nextInt();
        int[][] map = new int[n+1][n+1];
        for(int i=0;i<m;i++){
            int l = sc.nextInt(), r = sc.nextInt();
            map[l][r]++;
        }
        for(int i=1;i<=n;i++)for(int j=2;j<=n;j++)map[i][j] += map[i][j-1];
        System.out.println(Arrays.deepToString(map));
        StringBuilder sb = new StringBuilder();
        while(query-->0){
            long ans = 0;
            int p = sc.nextInt(), q = sc.nextInt();
            for(int i=p;i<=q;i++)ans += map[i][q];
            sb.append(ans).append("\n");
        }
        sc.close();
        System.out.println(sb.toString());
    }
}
