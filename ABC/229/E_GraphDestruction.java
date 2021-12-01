import java.util.*;

public class E_GraphDestruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        //to manage child
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            graph.get(sc.nextInt()-1).add(sc.nextInt()-1);
        }
        sc.close();
        //System.out.println(graph);

        UnionFind uf = new UnionFind(n);
        int cnt = 0;
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            ans[i] = cnt;
            cnt++;
            for(int e : graph.get(i)){
                if(!uf.same(i, e)){
                    uf.unite(i, e);
                    cnt--;
                }
            }
        }
        for(int e: ans)System.out.println(e);
    }
}
class UnionFind{
    int[] parents;
    public UnionFind(int size){
        parents = new int[size];
        for(int i=0;i<size;i++){
            parents[i]=i;
        }
    }
    //trace back to one's parents
    public int find(int x){
        if(x==parents[x])return x;
        else return parents[x]=find(parents[x]);
    }
    //to judge each parents are same
    public boolean same(int x,int y){
        return find(x)==find(y);
    }
    //change y's parents to x
    public void unite(int x, int y){
        parents[find(y)]=find(x);
    }
}