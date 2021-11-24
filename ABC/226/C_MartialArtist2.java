import java.util.*;

public class C_MartialArtist2 {
    public static void main(String[] args) {
        //version which I changed a little bit after the contest
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long ans2=0;
        int[] t = new int[n];
        int[] k = new int[n];
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            t[i] = Integer.parseInt(sc.next());
            k[i] = Integer.parseInt(sc.next());
            List<Integer> tmp2 = new ArrayList<>();
            for(int j=0;j<k[i];j++){
                int tx = Integer.parseInt(sc.next());
                tmp2.add(tx);
            }
            map.put(i, tmp2);
        }
        sc.close();
        ans2+= check(map, t);
        System.out.println((ans2+t[n-1]));
    }

    public static long check(Map<Integer,List<Integer>> map,int[] t){
        long ans = 0;
        int num = map.keySet().size();
        for(int i=0;i<map.get(num-1).size();i++){
            int tmp = map.get(num-1).get(i);
            ans += t[tmp-1];
            if(map.get(tmp-1).size()!=0){
                ans+= check(map, t);
            }
        }
        return ans;
    }
}
