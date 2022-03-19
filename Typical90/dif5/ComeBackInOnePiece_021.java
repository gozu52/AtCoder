import java.util.*;

public class ComeBackInOnePiece_021 {
    //解説AC

    static boolean[] checked = null;
    static ArrayList<ArrayList<Integer>> edge = null;
    static ArrayList<ArrayList<Integer>> rEdge = null;
    static int cnt = 0;
    static int[] vr = null;
    static int[] group = null;
    static int groupNum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        edge = new ArrayList<>();rEdge = new ArrayList<>();
        vr = new int[n];
        for(int i=0;i<n;i++){edge.add(new ArrayList<>());rEdge.add(new ArrayList<>());}
        for(int i=0;i<m;i++){
            int a = sc.nextInt()-1, b = sc.nextInt()-1;
            edge.get(a).add(b);rEdge.get(b).add(a);
        }
        sc.close();
        checked = new boolean[n];
        for(int i=0;i<n;i++){
            if(!checked[i])dfs1(i);
        }
        Arrays.fill(checked, false);
        group = new int[n];
        for(int i=n-1;i>=0;i--){
            if(!checked[vr[i]])dfs2(vr[i], groupNum++);
        }
        long ans = 0;
        for (int e : group)ans += (long) e * (e - 1) / 2l;
        System.out.println(ans);
    }
    static void dfs1(int x){
        checked[x] = true;
        for(int e : edge.get(x)){
            if(!checked[e])dfs1(e);
        }
        vr[cnt++] = x;
    }
    static void dfs2(int x, int groupNum){
        checked[x] = true;
        group[groupNum]++;
        for(int e : rEdge.get(x)){
            if(!checked[e])dfs2(e, groupNum);
        }
    }
}
