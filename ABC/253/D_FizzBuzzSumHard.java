import java.util.*;

public class D_FizzBuzzSumHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        long sum = 0;
        if(n%2==0) sum = (n/2)*(n+1);
        else sum = (n+1)/2*n;
        long lcm = lcm(a, b);
        long aSum = calc(n, a);
        long bSum = calc(n, b);
        long lcmSum = calc(n, lcm);
        System.out.println(sum-aSum-bSum+lcmSum);
    }
    static long calc(long n, long a) {
        long N = n/a;
        return N*(N+1)/2*a;
    }
    static long gcd(long a, long b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    static long lcm(long a, long b) {
        return a*b/gcd(a,b);
    }
}
