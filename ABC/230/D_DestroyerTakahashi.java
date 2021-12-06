import java.io.*;
import java.util.*;

public class D_DestroyerTakahashi {
    public static void main(String[] args) throws Exception {
        myScan sc = new myScan();
        int n = sc.nextInt(), d = sc.nextInt();
        int[][] wall = new int[n][2];
        for(int i=0;i<n;i++){
            wall[i][0] = sc.nextInt();
            wall[i][1] = sc.nextInt();
        }
        Arrays.sort(wall,(x,y)->Long.compare(x[1], y[1]));
        long c = wall[0][1], ans = 1;
        for(int i=1;i<n;i++){
            if(wall[i][0] <=(d-1)+c)continue;
            c = wall[i][1];
            ans++;            
        }
        System.out.println(ans);
        //System.out.println(Arrays.deepToString(wall));
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