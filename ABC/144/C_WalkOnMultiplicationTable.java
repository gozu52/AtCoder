import java.util.Scanner;

public class C_WalkOnMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        System.out.println(isSet(n));
    }
    static long isSet(long n){
        long ans = Long.MAX_VALUE;
        for(long i=1;i*i<=n;i++){
            if(n%i==0)ans = Math.min(ans, i+(n/i)-2);
        }
        return ans;
    }
}
