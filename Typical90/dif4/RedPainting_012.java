import java.util.*;
import java.awt.*;


public class RedPainting_012 {
    static boolean[][] red;
    static int h,w;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt(); w = sc.nextInt();
        red = new boolean[h][w];
        Point[] d4 = {new Point(0,1), new Point(0,-1), new Point(1,0), new Point(-1,0)};
        StringBuilder sb = new StringBuilder();
        UnionFind uf = new UnionFind(h*w);
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int t =sc.nextInt();
            if(t==1){
                int r = sc.nextInt()-1, c = sc.nextInt()-1;
                red[r][c] = true;
                for(int j=0;j<4;j++){
                    int x = r+d4[j].x, y = c+d4[j].y;
                    if(x>=h || x<0 || y>=w || y<0)continue;
                    if(red[x][y]){
                        uf.unite(r*w+c, x*w+y);
                    }
                }
            }else{
                int ra = sc.nextInt()-1, ca = sc.nextInt()-1;
                int rb = sc.nextInt()-1, cb = sc.nextInt()-1;
                if(!red[ra][ca] || !red[rb][cb]){
                    sb.append("No\n");
                    continue;
                }
                if(uf.isSame(ra*w+ca, rb*w+cb)){
                    sb.append("Yes\n");
                }else{
                    sb.append("No\n");
                }
            }
        }
        sc.close();
        System.out.println(sb);
    }
    static boolean bfs(int ra,int ca,int rb, int cb, Point[] d4){
        Point p = new Point(ra,ca);
        if((p.x==rb && p.y==cb)&&red[p.x][p.y])return true;
        for(int i=0;i<4;i++){
            int x = p.x+d4[i].x, y = p.y+d4[i].y;
            if(x>=h || x<0 || y>=w || y<0)continue;
            if(red[x][y])bfs(x,y,rb, cb, d4);
        } 
        return false;
    }
}
class UnionFind {
	private int[] parent;
	private int[] size;
	private int groups;

	public UnionFind(int N) {
		this.parent = new int[N + 1];
		this.size   = new int[N + 1];
		this.groups = N;

		for (int i = 0; i < N; i++) {
			this.parent[i] = i;
			this.size[i] = 1;
		}
	}

	public int root(int par) {
		if (this.parent[par] == par) return par;
		else return this.parent[par] = root(this.parent[par]);
	}

	public boolean isSame(int x, int y) {
		return root(x) == root(y);
	}

	public boolean unite(int x, int y) {
		x = root(x);
		y = root(y);

		if (x == y) return false;

		if (this.size[x] < this.size[y]) {
			int z = x;
			x = y;
			y = z;
		}

		this.parent[x] = y;
		this.size[x] += this.size[y];
		this.size[y] = this.size[x];
		this.groups--;
		return true;
	}

	public int getParent(int x) { return root(x); }
	public int getSize(int x) { return this.size[x]; }
	public int getGroups() { return this.groups; }
}