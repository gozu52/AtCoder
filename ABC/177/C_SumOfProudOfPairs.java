import java.util.Scanner;

public class C_SumOfProudOfPairs {
    static final int mod = 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0, ans = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sc.close();
        for(int i=0;i<n;i++){
            sum -= a[i];
            ans = (ans+(((sum%mod)*a[i])%mod))%mod;
        }
        System.out.println(ans);
    }
}
