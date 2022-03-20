import java.util.*;

public class A_CoprimePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong(), r = sc.nextLong();
        sc.close();
        long ans = Long.MIN_VALUE;
        for(long i=l;i<=l+1000;i++){
            for(long j=r-1000;j<=r;j++){
                if(i<j && gcd(i,j)==1){
                    ans = Math.max(ans,j-i);
                }
            }
        }
        System.out.println(ans);
    }
    static long gcd(long a, long b){
        if(b==0)return a;
        else return gcd(b,a%b);
    }
}
