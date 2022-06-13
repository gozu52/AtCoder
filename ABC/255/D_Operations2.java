import java.util.*;

public class D_Operations2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        Arrays.sort(a);
        long[] sum = new long[n+1];
        for(int i=1;i<=n;i++)sum[i] = sum[i-1] + a[i-1];
        StringBuilder sb = new StringBuilder();
        while(q-->0){
            int x = sc.nextInt();
            long ans  = 0;
            int l = 0, r = n-1;
            while(l<=r){
                int m = (l+r)/2;
                if(a[m]<x)l = m+1;
                else r = m-1;
            }
            System.out.println("l "+l+" r "+r);
            ans += (long)x*(long)l;
            ans -= sum[r+1];
            ans += (sum[n]-sum[l]);
            ans -= (long)x*(long)(n-l);
            sb.append(ans+"\n");
        }
        sc.close();
        System.out.println(sb);
    }
}
