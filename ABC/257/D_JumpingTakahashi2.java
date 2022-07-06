import java.util.*;

public class D_JumpingTakahashi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        sc.close();
        long[][] dist = new long[n][n];
        for(int i=0;i<n;i++)for(int j=0;j<n;j++){
            dist[i][j] = ((long)Math.abs(x[i]-x[j])+(long)Math.abs(y[i]-y[j])+p[i]-1)/p[i];
        }
        for(int k=0;k<n;k++)for(int i=0;i<n;i++)for(int j=0;j<n;j++){
            dist[i][j] = Math.min(dist[i][j], Math.max(dist[i][k], dist[k][j]));
        }
        long ans = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            long tmp = 0;
            for(int j=0;j<n;j++)tmp = Math.max(tmp,dist[i][j]);
            ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
    }
}
