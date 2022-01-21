package MathAlgo.Chapter3;

import java.util.*;

public class q021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),  r = sc.nextInt();
        sc.close();
        System.out.println(calc(n, r));
    }
    static long calc(int a, int b){
        long ans = 1;
        for(int i=a;i>(a-b);i--)ans *= i;
        for(int i=1;i<=b;i++)ans /= i;
        return ans;
    }
}
