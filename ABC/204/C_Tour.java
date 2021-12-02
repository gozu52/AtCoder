import java.io.*;
import java.util.*;

public class C_Tour {
    static int ans = 0;
    static ArrayList<ArrayList<Integer>> list;
    public static void main(String[] args) throws Exception{
        myScan sc = new myScan();
        int n = sc.nextInt(),m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt()-1;
            b[i]=sc.nextInt()-1;
        }
        list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            list.get(a[i]).add(b[i]);
        }
        for(int i=0;i<n;i++){
            boolean[] check = new boolean[n];
            check[i] = true;
            ans++;
            dfs(i,check);
        }
        System.out.println(ans);
    }
    public static void dfs(int now,boolean[] check){
        for(int e:list.get(now)){
            if(!check[e]){
                check[e]=true;
                ans++;
                dfs(e,check);
            }
        }
    }
}
class myScan{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    public myScan() throws Exception{

    }
    public int nextInt() throws Exception {
        return Integer.parseInt(next());
    }
    
    public long nextLong() throws Exception {
        return Long.parseLong(next());
    }
    
    public double nextDouble() throws Exception {
        return Double.parseDouble(next());
    }
    
    public String next() throws Exception {
        if (!st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}
