import java.util.*;

public class D_DistinctTrio {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        sc.close();
        int m  = 200001;
        int[] cnt = new int[m];
        for(int i=0;i<n;i++)cnt[a[i]]++;
        long ans = calc(n,3);
        for(int i=1;i<m;i++){
            if(cnt[i]>=3)ans -= calc(cnt[i],3);
            if(cnt[i]>=2)ans -= calc(cnt[i],2)*(n-cnt[i]);
        }
        System.out.println(ans);
    }
    static long calc(int x, int y){
        long num = 1;
        for(int i=0;i<=y;i++)num = num * (x-i+1) / i;
        return num;
    }
}
