package MathAlgo.Chapter2;

import java.util.*;

public class q007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        sc.close();
        Set<Integer> set = new HashSet<>();
        int init = Math.min(x, y);
        for(int i=init;i<=n;i++){
            if(i%x==0 || i%y==0)set.add(i);
        }
        System.out.println(set.size());
    }
}
