import java.util.*;

public class b {
    static long mod = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long tmp = n%mod;
        if(tmp>=0){
            System.out.println(tmp);
        }else{
            System.out.println(mod+tmp);
        }
    }
}
