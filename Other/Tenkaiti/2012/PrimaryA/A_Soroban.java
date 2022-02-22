import java.util.*;

public class A_Soroban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fib(n));
    }
    static long fib(int n){
        long[] ans = new long[n+1];
        if(n==0 || n==1)return 1;
        ans[0] = 1; ans[1] = 1;
        for(int i=2;i<=n;i++){
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans[n];
    }
}
