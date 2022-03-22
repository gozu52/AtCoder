import java.util.*;

public class IndependentSetOnATree_026 {
    static int[] color;
    static ArrayList<List<Integer>> tree;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        tree = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++)tree.add(new ArrayList<Integer>());
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            tree.get(a).add(b);
            tree.get(b).add(a);
        }
        sc.close();
        color = new int[n];
        dfs(0,1);
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(color[i]==1)ans1.add(i+1);
            else if(color[i]==2) ans2.add(i+1);
        }
        System.out.println(ans1);
        System.out.println(ans2);
        if(ans1.size()>ans2.size()){
            for(int i=0;i<(n/2);i++)System.out.print((ans1.get(i))+" ");
        }
        else{
            for(int i=0;i<(n/2);i++)System.out.print((ans2.get(i))+" ");
        }
        
    }
    static void dfs(int pos, int cur){
        color[pos] = cur;
        for(int i:tree.get(pos)){
            if(color[i]>=1)continue;
            dfs(i,3-cur);
        }
    }
}
