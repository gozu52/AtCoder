import java.io.*;
import java.util.*;

public class C_SecretNumber{
    public static void main(String[] args) throws Exception{
        myScan sc = new myScan();
        String s = sc.next();
        int ans = 0;
        for(int i=0;i<=9999;i++){
            boolean[] check = new boolean[10];
            int tmp = i;
            for(int j=0;j<4;j++){
                check[tmp%10]=true;
                tmp /= 10;
            }
            boolean flag = true;
            for(int j=0;j<10;j++){
                if(s.charAt(j)=='o'&&check[j]==false){
                    flag = false;
                    break;
                }
                if(s.charAt(j)=='x'&&check[j]==true){
                    flag = false;
                    break;
                }
            }
            if(flag)ans++;
        }
        System.out.println(ans);
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
