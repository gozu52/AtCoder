import java.util.*;

public class E_TakahashisAnguish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++) x[i] = sc.nextInt()-1;
        int[] c = new int[n];
        for(int i=0;i<n;i++) c[i] = sc.nextInt();
        sc.close();
        long ans = 0;
        UnionFind uf = new UnionFind(n);
        for(int i=0;i<n;i++){
            if(!uf.same(i, x[i])){uf.merge(i, x[i]);continue;}
            int pos = c[i], val = i;
            do{
                val = x[val];
                pos = Math.min(pos, c[val]);
            }while(val != i);
            ans += pos;
        }
        System.out.println(ans);
    }    
}
class UnionFind {
    int[] parents, root;
    public UnionFind(int n) {
        this.parents = new int[n];
        this.root = new int[n];
        for (int i = 0; i < n; i++) {
            parents[i] = i;
            root[i] = 0;
        }
    }
    public int find(int x) {
        if (x == parents[x]) {
            return x;
        }else{
            parents[x] = find(parents[x]);
            return parents[x];
        }
    }
    public boolean same(int x, int y){
        return find(x) == find(y);
    }
    public void merge(int x, int y) {
        int xRoot = find(x),yRoot = find(y);
        if (xRoot == yRoot)return;
        if (root[xRoot] > root[yRoot]) {
            parents[yRoot] = xRoot;
        } else if (root[xRoot] < root[yRoot]) {
            parents[xRoot] = yRoot;
        } else {
            parents[xRoot] = yRoot;
            root[xRoot]++;
        }
    }
}
