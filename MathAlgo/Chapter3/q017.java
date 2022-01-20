package MathAlgo.Chapter3;

import java.util.*;

public class q017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++)a[i] = sc.nextLong();
        sc.close();
        long ans=lcm(a[0], a[1]);
        for(int i=2;i<n;i++)ans = lcm(ans, a[i]);
        System.out.println(ans);
    }
    static long gcd(long x, long y){
        while(x>0 && y>0){
            if(x>y)x%=y;
            else y%=x;
        }
        if(x>0)return x;
        return y;
    }
    static long lcm(long x, long y){
        return (x/gcd(x,y))*y;
    }
}
