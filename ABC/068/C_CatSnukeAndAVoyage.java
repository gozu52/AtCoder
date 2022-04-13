import java.util.*;

public class C_CatSnukeAndAVoyage {
    static boolean[] used;
    static List<List<Integer>> list = new ArrayList<List<Integer>>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        used = new boolean[n];
        for(int i=0;i<n;i++)list.add(new ArrayList<Integer>());
        for(int i=0;i<m;i++){
            int a = sc.nextInt()-1,b = sc.nextInt()-1;
            list.get(a).add(b);
            list.get(b).add(a);
        }
        sc.close();
        dfs(0);
        if(used[n-1])System.out.println("POSSIBLE");
        else System.out.println("IMPOSSIBLE");
    }
    static void dfs(int n){
        if(used[n])return;
        used[n] = true;
        for(int i=0;i<list.get(n).size();i++){
            int tmp = list.get(n).get(i);
            used[tmp] = true;
            for(int j=0;j<list.get(tmp).size();j++){
                int tmp2 = list.get(tmp).get(j);
                used[tmp2] = true;
            }
        }
    }
}
