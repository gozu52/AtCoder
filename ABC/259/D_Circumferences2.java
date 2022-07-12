import java.util.*;

public class D_Circumferences2 {
    static long[] x , y ,r;
    static int startc = 0, endc = 0; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sx = sc.nextInt(), sy = sc.nextInt();
        int ex = sc.nextInt(), ey = sc.nextInt();
        x = new long[n]; y = new long[n]; r = new long[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            r[i] = sc.nextLong();
            if((x[i]-sx)*(x[i]-sx)+(y[i]-sy)*(y[i]-sy)==r[i]*r[i])startc = i;
            if((x[i]-ex)*(x[i]-ex)+(y[i]-ey)*(y[i]-ey)==r[i]*r[i])endc = i;
        }
        sc.close();
        UnionFind uf = new UnionFind(n);
        for(int i=0;i<n;i++)for(int j=i+1;j<n;j++){
            if(circleMeet(i, j)){
                uf.merge(i, j);
            }
        }
        System.out.println(uf.same(startc, endc)?"Yes":"No");
    }
    static boolean circleMeet(int i, int j){
        long tmp = (x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]);
        if(tmp<(r[i]-r[j])*(r[i]-r[j]) || tmp>(r[i]+r[j])*(r[i]+r[j])){
            return false;
        }
        return true;
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
