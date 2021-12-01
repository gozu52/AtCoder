import java.util.*;

public class C_Cheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long w = Long.parseLong(sc.next());
        long[][] ab = new long[n][2];
        for(int i=0;i<n;i++){
            ab[i][0] = Long.parseLong(sc.next());
            ab[i][1] = Long.parseLong(sc.next());
        }
        sc.close();
        //collections sort 2 param
        Arrays.sort(ab,(x,y)->Long.compare(x[0], y[0]));
        long ans = 0;
        long cnt = 0;
        for(int i=n-1;i>=0;i--){
            if(w-ab[i][1] >=0 ){
                ans += (ab[i][0]*ab[i][1]);
                w-=ab[i][1];
            }else{
                while(w-1>=0 && cnt<=ab[i][1]){
                    ans += ab[i][0];
                    cnt++;
                    w--;
                }
            }
        }
        System.out.println(ans);
    }
}
