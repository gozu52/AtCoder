package tmp_folder;

import java.util.*;

public class C_238 {
    static long mod = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long len = String.valueOf(n).length();
        System.out.println(len);
        
        long ans = 0;
        ans += calc2(len-1)%mod;
        System.out.println(ans);
        ans += calc(n-(((long)Math.pow(10, len-1)-1)))%mod;
        System.out.println(ans%mod);
    }
    static long calc(long n){
        n%=mod;
        //return (((n*(n+1))%mod)/2)%mod;
        return ((((n*n))%mod + n%mod) / 2 )%mod;
    }
    static long calc2(long len){
        long ans =0;
        long basic = (long)Math.pow(10, len)-1 - ((long)Math.pow(10, len-1)-1);
        System.out.println("basic "+basic);
        while(basic>0){
            ans += calc(basic)%mod;basic/=10;
            System.out.println("ans "+ans);
        }
        return ans%mod;
    }
}