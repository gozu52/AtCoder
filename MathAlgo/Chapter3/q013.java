package MathAlgo.Chapter3;

import java.util.*;

public class q013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        Set<Long> ans = new HashSet<>();
        ans = divNum(n);
        for(long e: ans)System.out.println(e);
    }
    static Set<Long> divNum(long n){
        Set<Long> set = new HashSet<>();
        for(long i=1;i*i<=n;i++){
            if(n%i==0){
                set.add(i);
                set.add(n/i);
            }
        }
        return set;
    }
}
