import java.util.*;
 
public class C_MartialArtist3 {

    public static void main(String[] args) {
        //during the contest
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long ans = 0;
        int[] t = new int[n];
        int[] k = new int[n];
        int[] padd = new int[n];
        Arrays.fill(padd, -1);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            t[i] = Integer.parseInt(sc.next());
            k[i] = Integer.parseInt(sc.next());
            List<Integer> tmp = new ArrayList<>();
            tmp.add(i);
            for(int j=0;j<k[i];j++){
                int tx = Integer.parseInt(sc.next());
                tmp.add(tx);
            }
            list.add(tmp);
        }
        sc.close();
        ans += solve(list, t);
        System.out.println((ans+t[list.get(list.size()-1).get(0)]));
    }
    
    public static long solve(List<List <Integer>> list,int[] t){
        long ans = 0;
        for(int i=1;i<list.get(list.size()-1).size();i++){
            int tmp = list.get(list.size()-1).get(i);
            ans += t[tmp-1];
            if(list.get(tmp-1).size()!=1){
                ans +=  solve(list, t);
            }
        }
        return ans;
    }
    
}

