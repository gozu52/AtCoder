import java.util.*;

public class C_ColorfulCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] c = new int[n];
        for(int i=0;i<n;i++)c[i] = sc.nextInt();
        sc.close();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<k;i++){
            map.putIfAbsent(c[i], 0);
            map.put(c[i], map.get(c[i])+1);
        }
        int ans = map.size();
        for(int i=k;i<n;i++){
            map.putIfAbsent(c[i], 0);
            map.put(c[i], map.get(c[i])+1);
            map.put(c[i-k], map.get(c[i-k])-1);
            if(map.get(c[i-k])==0)map.remove(c[i-k]);
            ans = Math.max(ans, map.size());
        }
        System.out.println(ans);
    }
}
