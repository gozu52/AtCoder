import java.util.*;

public class C_Xdrawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long p = Long.parseLong(sc.next());
        long q = Long.parseLong(sc.next());
        long r = Long.parseLong(sc.next());
        long s = Long.parseLong(sc.next());
        sc.close();
        int tate = (int)(q-p+1),yoko = (int)(s-r+1);
        String[][] ans = new String[(int)tate][(int)yoko];
        for(String[] e : ans){
            Arrays.fill(e,".");
        }
        for(int i=0;i<tate;i++){
            for(int j=0;j<yoko;j++){             
                if(p+i-a==r+j-b)ans[i][j]="#";        
                if(p+i-a==b-r-j)ans[i][j]="#";
            }  
        }
        for(int i=0;i<tate;i++){
            for(int j=0;j<yoko;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
