import java.util.*;

public class B_MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long ans = sc.nextLong();
        for(int i=1;i<n;i++)ans = gcd(ans, sc.nextLong());
        sc.close();
        System.out.println(ans);
    }
    static long gcd(long a,long b){
        a = a%b;
        if(a==0)return b;
        return gcd(b,a);
    }
}
