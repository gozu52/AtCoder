import java.util.*;

public class C_Coupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), x = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            while(a[i]>=x && k>0){
                k--;
                a[i] -= x;
            }            
        }
        sc.close();
        int cnt = n-1;long ans = 0;
        Arrays.sort(a);
        while(k>0 && cnt>=0){
            a[cnt] = Math.max(0, a[cnt]-x);
            cnt--;k--;
        }
        for(int e:a)ans += e;
        System.out.println(ans);
    }
}
