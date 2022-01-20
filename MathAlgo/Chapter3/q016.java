package MathAlgo.Chapter3;

import java.util.Scanner;

public class q016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++)a[i] = sc.nextLong();
        sc.close();
        long ans = a[0];
        for(int i=1;i<n;i++)ans = euclidean(a[i], ans);
        System.out.println(ans);
    }
    static long euclidean(long x, long y){
        while(x>0 && y>0){
            if(x>y)x%=y;
            else y%=x;
        }
        if(x>0)return x;
        return y;
    }
}
