import java.util.*;

public class LongestCircularRoad_003 {
    //解説AC
    static int n,t;
    static int d = 0;
    static ArrayList<ArrayList<Integer>> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        list = new ArrayList<>();
        for(int i=0;i<n;i++)list.add(new ArrayList<>());
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            list.get(a).add(b);list.get(b).add(a);
        }
        sc.close();
        dfs(0,-1,0);
        dfs(t,-1,0);
        System.out.println(d+1);
    }
    static void dfs(int v, int p, int now){
        if(now>d){d=now;t=v;}
        for(int e : list.get(v)){
            if(e==p)continue;
            dfs(e,v,now+1);
        }
    }
}
