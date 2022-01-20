package MathAlgo.Chapter2;

import java.util.*;

public class q011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        List<Integer> ans = new ArrayList<>();
        ans = primeNum(n);
        for(int e:ans)System.out.print(e+" ");
    }
    static List<Integer> primeNum(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i<=n;i++){
            boolean flag = true;
            for(int j=2;j<i;j++)if(i%j==0)flag = false;
            if(flag)list.add(i);
        }
        Collections.sort(list);
        return list;
    }
}
