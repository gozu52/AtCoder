import java.util.Scanner;

public class A_SimpleMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
        sc.close();
        final long mod = 998244353;
        //a %= mod;b %= mod;c %= mod;
        long ans =(a*(a+1)/2%mod) * (((b*(b+1)/2%mod) * (c*(c+1)/2%mod))%mod);
        System.out.println(ans%mod);
    }
}
