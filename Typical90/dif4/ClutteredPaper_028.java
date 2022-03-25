import java.util.*;

public class ClutteredPaper_028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cnt = new int[10000][10000];
        int[] ans = new int[n+1];
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            int lx = sc.nextInt(),ly = sc.nextInt();
            int rx = sc.nextInt(),ry = sc.nextInt();
            cnt[ly][lx]++;cnt[ly][rx]--;cnt[ry][lx]--;cnt[ry][rx]++;
        }
        sc.close();
        for(int i=0;i<=1000;i++){
            int cur = 0;
            for(int j=0;j<=1000;j++){
                cur += cnt[i][j];
                cnt[i][j] = cur;
            }
        }
        for(int i=0;i<1000;i++){
            int cur = 0;
            for(int j=0;j<1000;j++){
                cur += cnt[j][i];
                ans[cur]++;
            }
        }
        for(int k=1;k<=n;k++)sb.append(ans[k]+"\n");
        System.out.println(sb);
    }
}
