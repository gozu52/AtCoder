import java.io.*;
import java.util.*;

public class C_ReorderCards {
    public static void main(String[] args) throws Exception {
        myScan sc = new myScan();
        int h = sc.nextInt(), w = sc.nextInt(),n=sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        TreeSet<Integer> atree = new TreeSet<>();
        TreeSet<Integer> btree = new TreeSet<>();
        for(int i=0;i<n;++i){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            atree.add(a[i]);
            btree.add(b[i]);
        }
        System.out.println(h+","+w);
        HashMap<Integer,Integer> amap = new HashMap<>();
        HashMap<Integer,Integer> bmap = new HashMap<>();
        for(int e: atree){
            amap.put(e, amap.size()+1);
        }
        for(int e: btree){
            bmap.put(e, bmap.size()+1);
        }
        for(int i=0;i<n;++i){
            System.out.println(amap.get(a[i])+" "+bmap.get(b[i]));
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
