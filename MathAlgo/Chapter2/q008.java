package MathAlgo.Chapter2;

import java.util.*;

public class q008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        sc.close();
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j<=s){
                    map.putIfAbsent(i, new ArrayList<>());
                    map.get(i).add(j);
                }
            }
        }
        int cnt =0;
        for(int i=1;i<=map.size();i++){
            cnt += map.get(i).size();
        }
        System.out.println(cnt);
    }
}
