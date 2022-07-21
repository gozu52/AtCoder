import java.util.*;

public class D_DrawYourCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] p = new int[n];
        int[] ans = new int[n+1];
        Arrays.fill(ans, -1);
        for(int i=0;i<n;i++)p[i] = sc.nextInt();
        sc.close();
        int[] tmp = new int[n+1];
        tmp[p[0]]++;
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(tm.higherKey(p[i])!=null){
                tm.put(p[i],tm.get(tm.higherKey(p[i]))+1);
                hm.put(p[i],tm.higherKey(p[i]));
                tm.remove(tm.higherKey(p[i]));
            }else{
                tm.put(p[i],1);
            }
            if(tm.get(p[i])>=k){
                int pos = p[i];
                ans[pos] = i+1;
                while(hm.containsKey(pos)){
                    pos = hm.get(pos);
                    ans[pos] = i+1;
                }
                tm.remove(p[i]);
            }
        }
        for(int i=1;i<=n;i++){
            System.out.println(ans[i]);
        }
    }
}
