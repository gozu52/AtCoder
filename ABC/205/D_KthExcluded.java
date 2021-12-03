import java.io.*;
import java.util.*;

public class D_KthExcluded {
    public static void main(String[] args) throws Exception {
        myScan sc = new myScan();
        int n = sc.nextInt(), q = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
        }
        long[] c = new long[n];
        c[0]=a[0]-1;
        for(int i=1;i<n;i++){
            c[i]=c[i-1]+a[i]-(a[i-1]+1);
        }
        //System.out.println(Arrays.toString(c));
        for(int i=0;i<q;i++){
            long k = sc.nextLong();
            long ans = 0;
            if(c[n-1]<k){
                ans = a[n-1]+(k-c[n-1]);
            }else{
                int l = 0,r=n-1;
                boolean flag = true;
                while(flag){
                    int mid = (r+l)/2;
                    if(c[mid]>=k){
                        r=mid;
                    }else{
                        l=mid;
                    }
                    if(r-l<=1){
                        if(c[l]>=k)ans = (a[l]-1)-(c[l]-k);
                        else ans = (a[r]-1)-(c[r]-k);
                        flag=false;
                    }
                }
            }
            System.out.println(ans);
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
