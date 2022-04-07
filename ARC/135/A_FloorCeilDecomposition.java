import java.util.*;

public class A_FloorCeilDecomposition {
    static HashMap<Long, Long> map = new HashMap<>();
    static final long mod =998244353;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        sc.close();
        System.out.println(calc(x));
    }
    static long calc(long x){
        if(map.containsKey(x)) return map.get(x);
        if(x<=4){
            map.put(x, x);
            return x;
        }
        long tmp = (calc(x/2) * calc((x+1)/2))%mod;
        map.put(x, tmp);
        return tmp;
    }
}
